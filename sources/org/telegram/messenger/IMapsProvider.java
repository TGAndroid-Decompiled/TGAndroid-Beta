package org.telegram.messenger;

import android.content.Context;
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    ya loadRawResourceStyle(Context context, int i10);

    ua newCameraUpdateLatLng(cb cbVar);

    ua newCameraUpdateLatLngBounds(wa waVar, int i10);

    ua newCameraUpdateLatLngZoom(cb cbVar, float f7);

    va onCreateCircleOptions();

    xa onCreateLatLngBoundsBuilder();

    za onCreateMapView(Context context);

    ab onCreateMarkerOptions();
}
