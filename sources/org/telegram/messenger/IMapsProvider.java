package org.telegram.messenger;

import android.content.Context;
public interface IMapsProvider {
    public static final int MAP_TYPE_HYBRID = 2;
    public static final int MAP_TYPE_NORMAL = 0;
    public static final int MAP_TYPE_SATELLITE = 1;

    int getInstallMapsString();

    String getMapsAppPackageName();

    void initializeMaps(Context context);

    uh5 loadRawResourceStyle(Context context, int i);

    qh5 newCameraUpdateLatLng(yh5 yh5Var);

    qh5 newCameraUpdateLatLngBounds(sh5 sh5Var, int i);

    qh5 newCameraUpdateLatLngZoom(yh5 yh5Var, float f);

    rh5 onCreateCircleOptions();

    th5 onCreateLatLngBoundsBuilder();

    vh5 onCreateMapView(Context context);

    wh5 onCreateMarkerOptions();
}
