package org.telegram.messenger;

import android.content.Context;
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    tj5 loadRawResourceStyle(Context context, int i);

    pj5 newCameraUpdateLatLng(xj5 xj5Var);

    pj5 newCameraUpdateLatLngBounds(rj5 rj5Var, int i);

    pj5 newCameraUpdateLatLngZoom(xj5 xj5Var, float f);

    qj5 onCreateCircleOptions();

    sj5 onCreateLatLngBoundsBuilder();

    uj5 onCreateMapView(Context context);

    vj5 onCreateMarkerOptions();
}
