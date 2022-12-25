package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import androidx.core.util.Consumer;

public interface ILocationServiceProvider {
    public static final int PRIORITY_BALANCED_POWER_ACCURACY = 1;
    public static final int PRIORITY_HIGH_ACCURACY = 0;
    public static final int PRIORITY_LOW_POWER = 2;
    public static final int PRIORITY_NO_POWER = 3;
    public static final int STATUS_RESOLUTION_REQUIRED = 1;
    public static final int STATUS_SETTINGS_CHANGE_UNAVAILABLE = 2;
    public static final int STATUS_SUCCESS = 0;

    public interface IAPIConnectionCallbacks {
        void onConnected(Bundle bundle);

        void onConnectionSuspended(int i);
    }

    public interface IAPIOnConnectionFailedListener {
        void onConnectionFailed();
    }

    public interface ILocationListener {
        void onLocationChanged(Location location);
    }

    public interface ILocationRequest {
        void setFastestInterval(long j);

        void setInterval(long j);

        void setPriority(int i);
    }

    public interface IMapApiClient {
        void connect();

        void disconnect();
    }

    void checkLocationSettings(ILocationRequest iLocationRequest, Consumer<Integer> consumer);

    boolean checkServices();

    void getLastLocation(Consumer<Location> consumer);

    void init(Context context);

    ILocationRequest onCreateLocationRequest();

    IMapApiClient onCreateLocationServicesAPI(Context context, IAPIConnectionCallbacks iAPIConnectionCallbacks, IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener);

    void removeLocationUpdates(ILocationListener iLocationListener);

    void requestLocationUpdates(ILocationRequest iLocationRequest, ILocationListener iLocationListener);
}
