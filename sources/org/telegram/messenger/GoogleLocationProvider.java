package org.telegram.messenger;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import androidx.core.util.Consumer;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.PushListenerController;
@SuppressLint({"MissingPermission"})
public class GoogleLocationProvider implements ILocationServiceProvider {
    private FusedLocationProviderClient locationProviderClient;
    private SettingsClient settingsClient;

    @Override
    public void init(Context context) {
        this.locationProviderClient = LocationServices.getFusedLocationProviderClient(context);
        this.settingsClient = LocationServices.getSettingsClient(context);
    }

    @Override
    public ILocationServiceProvider.ILocationRequest onCreateLocationRequest() {
        return new GoogleLocationRequest(LocationRequest.create());
    }

    @Override
    public void getLastLocation(final Consumer<Location> consumer) {
        this.locationProviderClient.getLastLocation().addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                GoogleLocationProvider.lambda$getLastLocation$0(Consumer.this, task);
            }
        });
    }

    public static void lambda$getLastLocation$0(Consumer consumer, Task task) {
        if (task.getException() != null) {
            return;
        }
        consumer.accept((Location) task.getResult());
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        this.locationProviderClient.requestLocationUpdates(((GoogleLocationRequest) iLocationRequest).request, new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                iLocationListener.onLocationChanged(locationResult.getLastLocation());
            }
        }, Looper.getMainLooper());
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        this.locationProviderClient.removeLocationUpdates(new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                iLocationListener.onLocationChanged(locationResult.getLastLocation());
            }
        });
    }

    @Override
    public void checkLocationSettings(ILocationServiceProvider.ILocationRequest iLocationRequest, final Consumer<Integer> consumer) {
        this.settingsClient.checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(((GoogleLocationRequest) iLocationRequest).request).build()).addOnCompleteListener(new OnCompleteListener() {
            @Override
            public final void onComplete(Task task) {
                GoogleLocationProvider.lambda$checkLocationSettings$1(Consumer.this, task);
            }
        });
    }

    public static void lambda$checkLocationSettings$1(Consumer consumer, Task task) {
        try {
            task.getResult(ApiException.class);
            consumer.accept(0);
        } catch (ApiException e) {
            int statusCode = e.getStatusCode();
            if (statusCode == 6) {
                consumer.accept(1);
            } else if (statusCode != 8502) {
            } else {
                consumer.accept(2);
            }
        }
    }

    @Override
    public ILocationServiceProvider.IMapApiClient onCreateLocationServicesAPI(Context context, final ILocationServiceProvider.IAPIConnectionCallbacks iAPIConnectionCallbacks, final ILocationServiceProvider.IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener) {
        return new GoogleApiClientImpl(new GoogleApiClient.Builder(ApplicationLoader.applicationContext).addApi(LocationServices.API).addConnectionCallbacks(new GoogleApiClient.ConnectionCallbacks() {
            @Override
            public void onConnected(Bundle bundle) {
                iAPIConnectionCallbacks.onConnected(bundle);
            }

            @Override
            public void onConnectionSuspended(int i) {
                iAPIConnectionCallbacks.onConnectionSuspended(i);
            }
        }).addOnConnectionFailedListener(new GoogleApiClient.OnConnectionFailedListener() {
            @Override
            public final void onConnectionFailed(ConnectionResult connectionResult) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        }).build());
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    public static final class GoogleLocationRequest implements ILocationServiceProvider.ILocationRequest {
        private LocationRequest request;

        private GoogleLocationRequest(LocationRequest locationRequest) {
            this.request = locationRequest;
        }

        @Override
        public void setPriority(int i) {
            this.request.setPriority(i != 1 ? i != 2 ? i != 3 ? 100 : R.styleable.AppCompatTheme_textAppearanceListItemSmall : R.styleable.AppCompatTheme_textAppearanceListItemSecondary : R.styleable.AppCompatTheme_textAppearanceLargePopupMenu);
        }

        @Override
        public void setInterval(long j) {
            this.request.setInterval(j);
        }

        @Override
        public void setFastestInterval(long j) {
            this.request.setFastestInterval(j);
        }
    }

    public static final class GoogleApiClientImpl implements ILocationServiceProvider.IMapApiClient {
        private GoogleApiClient apiClient;

        private GoogleApiClientImpl(GoogleApiClient googleApiClient) {
            this.apiClient = googleApiClient;
        }

        @Override
        public void connect() {
            this.apiClient.connect();
        }

        @Override
        public void disconnect() {
            this.apiClient.disconnect();
        }
    }
}
