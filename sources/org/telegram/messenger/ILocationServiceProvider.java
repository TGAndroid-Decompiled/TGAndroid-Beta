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

    void checkLocationSettings(oh5 oh5Var, vs2 vs2Var);

    boolean checkServices();

    void getLastLocation(vs2 vs2Var);

    void init(Context context);

    oh5 onCreateLocationRequest();

    ph5 onCreateLocationServicesAPI(Context context, lh5 lh5Var, mh5 mh5Var);

    void removeLocationUpdates(nh5 nh5Var);

    void requestLocationUpdates(oh5 oh5Var, nh5 nh5Var);
}
