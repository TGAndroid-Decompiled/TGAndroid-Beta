package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.WorkSource;
import androidx.appcompat.widget.TooltipPopup;
import androidx.collection.ArrayMap;
import androidx.core.util.Consumer;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import com.android.billingclient.api.zzct;
import com.android.billingclient.api.zzcu;
import com.google.android.exoplayer2.text.ExoplayerCuesDecoder;
import com.google.android.gms.cast.zze;
import com.google.android.gms.cast.zzw;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.api.internal.zabe;
import com.google.android.gms.common.api.internal.zat;
import com.google.android.gms.common.internal.zzah;
import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.location.zzax;
import com.google.android.gms.internal.location.zzbk;
import com.google.android.gms.internal.location.zzbp;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SettingsClient;
import com.google.android.gms.signin.SignInOptions;
import com.google.android.gms.signin.zad;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.ui.Stars.BagRandomizer;

public class GoogleLocationProvider implements ILocationServiceProvider {
    private FusedLocationProviderClient locationProviderClient;
    private SettingsClient settingsClient;

    public static final class GoogleApiClientImpl implements ILocationServiceProvider.IMapApiClient {
        private GoogleApiClient apiClient;

        @Override
        public void connect() {
            this.apiClient.connect();
        }

        @Override
        public void disconnect() {
            this.apiClient.disconnect();
        }

        private GoogleApiClientImpl(GoogleApiClient googleApiClient) {
            this.apiClient = googleApiClient;
        }
    }

    public static final class GoogleLocationRequest implements ILocationServiceProvider.ILocationRequest {
        private LocationRequest request;

        @Override
        public void setFastestInterval(long j) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            zzah.checkArgument(j >= 0, "illegal fastest interval: %d", Long.valueOf(j));
            locationRequest.zzc = j;
        }

        @Override
        public void setInterval(long j) {
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            zzah.checkArgument("intervalMillis must be greater than or equal to 0", j >= 0);
            long j2 = locationRequest.zzc;
            long j3 = locationRequest.zzb;
            if (j2 == j3 / 6) {
                locationRequest.zzc = j / 6;
            }
            if (locationRequest.zzi == j3) {
                locationRequest.zzi = j;
            }
            locationRequest.zzb = j;
        }

        @Override
        public void setPriority(int i) {
            int i2;
            boolean z;
            int i3 = 105;
            if (i == 1) {
                i2 = 102;
            } else if (i != 2) {
                i2 = i != 3 ? 100 : 105;
            } else {
                i2 = 104;
            }
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (i2 != 100 && i2 != 102 && i2 != 104) {
                if (i2 != 105) {
                    i3 = i2;
                    z = false;
                }
                zzah.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i3));
                locationRequest.zza = i2;
            }
            i3 = i2;
            z = true;
            zzah.checkArgument(z, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i3));
            locationRequest.zza = i2;
        }

        private GoogleLocationRequest(LocationRequest locationRequest) {
            this.request = locationRequest;
        }
    }

    public static void lambda$checkLocationSettings$1(Consumer consumer, Task task) {
        try {
            task.getResult(ApiException.class);
            consumer.accept(0);
        } catch (ApiException e) {
            int statusCode = e.getStatusCode();
            if (statusCode == 6) {
                consumer.accept(1);
            } else {
                if (statusCode != 8502) {
                    return;
                }
                consumer.accept(2);
            }
        }
    }

    public static void lambda$getLastLocation$0(Consumer consumer, Task task) {
        if (task.getException() != null) {
            return;
        }
        consumer.accept((Location) task.getResult());
    }

    @Override
    public void checkLocationSettings(ILocationServiceProvider.ILocationRequest iLocationRequest, Consumer consumer) {
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        if (locationRequest != null) {
            arrayList.add(locationRequest);
        }
        SettingsClient settingsClient = this.settingsClient;
        LocationSettingsRequest locationSettingsRequest = new LocationSettingsRequest(arrayList, false, false);
        zzbp zzbpVar = (zzbp) settingsClient;
        zzbpVar.getClass();
        ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
        exoplayerCuesDecoderBuilder.inputBuffer = new zzcu(locationSettingsRequest, 25);
        exoplayerCuesDecoderBuilder.inputBufferState = 2426;
        zzbpVar.zae(0, exoplayerCuesDecoderBuilder.build()).addOnCompleteListener(new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0(consumer, 2));
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override
    public void getLastLocation(Consumer consumer) {
        zzbp zzbpVar = (zzbp) this.locationProviderClient;
        zzbpVar.getClass();
        ExoplayerCuesDecoder exoplayerCuesDecoderBuilder = TaskApiCall.builder();
        exoplayerCuesDecoderBuilder.inputBuffer = zzax.zza$2;
        exoplayerCuesDecoderBuilder.inputBufferState = 2414;
        zzbpVar.zae(0, exoplayerCuesDecoderBuilder.build()).addOnCompleteListener(new GoogleMapsProvider$GoogleMapImpl$$ExternalSyntheticLambda0(consumer, 1));
    }

    @Override
    public void init(Context context) {
        Api api = LocationServices.API;
        Api.ApiOptions.NoOptions noOptions = Api.ApiOptions.NO_OPTIONS;
        GoogleApi.Settings settings = GoogleApi.Settings.DEFAULT_SETTINGS;
        Api api2 = zzbp.zzb;
        this.locationProviderClient = new zzbp(context, api2, noOptions, settings);
        this.settingsClient = new zzbp(context, api2, noOptions, settings);
    }

    @Override
    public ILocationServiceProvider.ILocationRequest onCreateLocationRequest() {
        return new GoogleLocationRequest(new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null));
    }

    @Override
    public ILocationServiceProvider.IMapApiClient onCreateLocationServicesAPI(Context context, final ILocationServiceProvider.IAPIConnectionCallbacks iAPIConnectionCallbacks, final ILocationServiceProvider.IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener) {
        List list;
        Context context2 = ApplicationLoader.applicationContext;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ArrayMap arrayMap = new ArrayMap(0);
        ArrayMap arrayMap2 = new ArrayMap(0);
        Object obj = GoogleApiAvailability.zaa;
        zze zzeVar = zad.zac;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        Api api = LocationServices.API;
        zzah.checkNotNull(api, "Api must not be null");
        arrayMap2.put(api, null);
        zze zzeVar2 = api.zaa;
        zzah.checkNotNull(zzeVar2, "Base client builder must not be null");
        switch (zzeVar2.$r8$classId) {
            case 3:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new GoogleApiClient.ConnectionCallbacks() {
            @Override
            public void onConnected(Bundle bundle) {
                iAPIConnectionCallbacks.onConnected(bundle);
            }

            @Override
            public void onConnectionSuspended(int i) {
                iAPIConnectionCallbacks.onConnectionSuspended(i);
            }
        });
        arrayList2.add(new GoogleApiClient.OnConnectionFailedListener() {
            @Override
            public final void onConnectionFailed(ConnectionResult connectionResult) {
                iAPIOnConnectionFailedListener.onConnectionFailed();
            }
        });
        zzah.checkArgument("must call addApi() to add at least one API", !arrayMap2.isEmpty());
        SignInOptions signInOptions = SignInOptions.zaa;
        Api api2 = zad.zag;
        if (arrayMap2.containsKey(api2)) {
            signInOptions = (SignInOptions) arrayMap2.get(api2);
        }
        TooltipPopup tooltipPopup = new TooltipPopup(hashSet, arrayMap, packageName, name, signInOptions);
        Map map = (Map) tooltipPopup.mMessageView;
        ArrayMap arrayMap3 = new ArrayMap(0);
        ArrayMap arrayMap4 = new ArrayMap(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((ArrayMap.KeySet) arrayMap2.keySet()).iterator();
        Api api3 = null;
        while (true) {
            ArrayMap.KeyIterator keyIterator = (ArrayMap.KeyIterator) it;
            if (!keyIterator.hasNext()) {
                TooltipPopup tooltipPopup2 = tooltipPopup;
                ArrayMap arrayMap5 = arrayMap3;
                ArrayMap arrayMap6 = arrayMap4;
                ArrayList arrayList4 = arrayList3;
                Looper looper = mainLooper;
                if (api3 != null) {
                    boolean zEquals = hashSet.equals(hashSet2);
                    String str = api3.zac;
                    if (!zEquals) {
                        throw new IllegalStateException(Fragment$$ExternalSyntheticOutline0.m("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                zabe zabeVar = new zabe(context2, new ReentrantLock(), looper, tooltipPopup2, arrayMap5, arrayList, arrayList2, arrayMap6, zabe.zad(arrayMap6.values(), true), arrayList4);
                Set set = GoogleApiClient.zaa;
                synchronized (set) {
                    set.add(zabeVar);
                }
                return new GoogleApiClientImpl(zabeVar);
            }
            Api api4 = (Api) keyIterator.next();
            Object obj2 = arrayMap2.get(api4);
            boolean z = map.get(api4) != null;
            Looper looper2 = mainLooper;
            arrayMap3.put(api4, Boolean.valueOf(z));
            ArrayMap arrayMap7 = arrayMap4;
            zat zatVar = new zat(api4, z);
            arrayList3.add(zatVar);
            zze zzeVar3 = api4.zaa;
            zzah.checkNotNull(zzeVar3);
            ArrayList arrayList5 = arrayList3;
            Map map2 = map;
            tooltipPopup = tooltipPopup;
            mainLooper = looper2;
            ArrayMap arrayMap8 = arrayMap3;
            ArrayMap arrayMap9 = arrayMap2;
            arrayMap4 = arrayMap7;
            Api.Client clientBuildClient = zzeVar3.buildClient(context2, mainLooper, tooltipPopup, obj2, zatVar, zatVar);
            arrayMap4.put(api4.zab, clientBuildClient);
            if (clientBuildClient.providesSignIn()) {
                if (api3 != null) {
                    throw new IllegalStateException(Fragment$$ExternalSyntheticOutline0.m$1(api4.zac, " cannot be used with ", api3.zac));
                }
                api3 = api4;
            }
            map = map2;
            arrayMap3 = arrayMap8;
            arrayMap2 = arrayMap9;
            arrayList3 = arrayList5;
        }
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        FusedLocationProviderClient fusedLocationProviderClient = this.locationProviderClient;
        LocationCallback locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.zzb;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        zzbp zzbpVar = (zzbp) fusedLocationProviderClient;
        zzbpVar.getClass();
        zzah.checkNotEmpty("LocationCallback", "Listener type must not be empty");
        zzbpVar.doUnregisterEventListener(new ListenerHolder.ListenerKey(locationCallback, "LocationCallback"), 2418).continueWith(zzbk.zza, zzax.zza$1);
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        FusedLocationProviderClient fusedLocationProviderClient = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        LocationCallback locationCallback = new LocationCallback() {
            @Override
            public void onLocationResult(LocationResult locationResult) {
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.zzb;
                int size = list.size();
                iLocationListener2.onLocationChanged(size == 0 ? null : (Location) list.get(size - 1));
            }
        };
        Looper mainLooper = Looper.getMainLooper();
        zzbp zzbpVar = (zzbp) fusedLocationProviderClient;
        zzbpVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            zzah.checkNotNull(mainLooper, "invalid null looper");
        }
        ListenerHolder listenerHolderCreateListenerHolder = zzct.createListenerHolder(mainLooper, locationCallback, "LocationCallback");
        zzv zzvVar = new zzv();
        zzvVar.zzb = zzbpVar;
        zzvVar.zzc = true;
        zzvVar.zza = listenerHolderCreateListenerHolder;
        zzw zzwVar = new zzw(zzvVar, locationRequest, false, 15);
        BagRandomizer bagRandomizer = new BagRandomizer();
        bagRandomizer.reshuffleIfEnd = true;
        bagRandomizer.bag = zzwVar;
        bagRandomizer.shuffledBag = zzvVar;
        bagRandomizer.random = listenerHolderCreateListenerHolder;
        bagRandomizer.currentIndex = 2436;
        zzbpVar.doRegisterEventListener(bagRandomizer.build());
    }
}
