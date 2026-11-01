package org.telegram.messenger;

import android.content.Context;
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    za loadRawResourceStyle(Context context, int i10);

    va newCameraUpdateLatLng(db dbVar);

    va newCameraUpdateLatLngBounds(xa xaVar, int i10);

    va newCameraUpdateLatLngZoom(db dbVar, float f7);

    wa onCreateCircleOptions();

    ya onCreateLatLngBoundsBuilder();

    ab onCreateMapView(Context context);

    bb onCreateMarkerOptions();
}
