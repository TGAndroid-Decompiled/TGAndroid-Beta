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

    void checkLocationSettings(nj5 nj5Var, gu2 gu2Var);

    boolean checkServices();

    void getLastLocation(gu2 gu2Var);

    void init(Context context);

    nj5 onCreateLocationRequest();

    oj5 onCreateLocationServicesAPI(Context context, kj5 kj5Var, lj5 lj5Var);

    void removeLocationUpdates(mj5 mj5Var);

    void requestLocationUpdates(nj5 nj5Var, mj5 mj5Var);
}
