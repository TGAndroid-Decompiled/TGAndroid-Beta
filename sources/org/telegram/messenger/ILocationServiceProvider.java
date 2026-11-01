package org.telegram.messenger;

import android.content.Context;
public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    void checkLocationSettings(ta taVar, q0.a aVar);

    boolean checkServices();

    void getLastLocation(q0.a aVar);

    void init(Context context);

    ta onCreateLocationRequest();

    ua onCreateLocationServicesAPI(Context context, qa qaVar, ra raVar);

    void removeLocationUpdates(sa saVar);

    void requestLocationUpdates(ta taVar, sa saVar);
}
