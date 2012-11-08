package org.lightadmin.demo.config;

import org.lightadmin.core.annotation.Administration;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnit;
import org.lightadmin.core.config.domain.context.ScreenContextConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.filter.FiltersConfigurationUnit;
import org.lightadmin.core.config.domain.filter.FiltersConfigurationUnitBuilder;
import org.lightadmin.core.config.domain.fragment.ListViewConfigurationUnit;
import org.lightadmin.core.config.domain.fragment.ListViewConfigurationUnitBuilder;
import org.lightadmin.demo.model.FilterTestEntity;

@SuppressWarnings( "unused" )
@Administration( FilterTestEntity.class )
public class FilterTestEntityConfiguration {

	public static ScreenContextConfigurationUnit screenContext( final ScreenContextConfigurationUnitBuilder screenContextBuilder ) {
		return screenContextBuilder
				.screenName( "FilterTest Domain Administration" )
				.menuName( "FilterTest Domain" ).build();
	}

	public static ListViewConfigurationUnit listView( final ListViewConfigurationUnitBuilder listViewBuilder ) {
		return listViewBuilder
				.field( "textfield" ).alias( "Text Field" )
				.field( "integerfield" ).alias( "Integer Field" )
				.field( "decimalfield" ).alias( "Decimal Field" ).build();
	}

	public static FiltersConfigurationUnit filters( final FiltersConfigurationUnitBuilder filterBuilder ) {
		return filterBuilder
				.field( "textfield" )
				.field( "integerfield" )
				.field( "decimalfield" ).build();
	}
}
