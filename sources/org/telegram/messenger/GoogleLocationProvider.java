package org.telegram.messenger;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import android.os.WorkSource;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ILocationServiceProvider;
import org.telegram.messenger.PushListenerController;
public class GoogleLocationProvider implements ILocationServiceProvider {
    private u7.a locationProviderClient;
    private u7.i settingsClient;

    public static final class GoogleApiClientImpl implements ILocationServiceProvider.IMapApiClient {
        private com.google.android.gms.common.api.m apiClient;

        @Override
        public void connect() {
            this.apiClient.a();
        }

        @Override
        public void disconnect() {
            this.apiClient.b();
        }

        private GoogleApiClientImpl(com.google.android.gms.common.api.m mVar) {
            this.apiClient = mVar;
        }
    }

    public static final class GoogleLocationRequest implements ILocationServiceProvider.ILocationRequest {
        private LocationRequest request;

        @Override
        public void setFastestInterval(long j10) {
            boolean z4;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j10 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.c(z4, "illegal fastest interval: %d", Long.valueOf(j10));
            locationRequest.f3778c = j10;
        }

        @Override
        public void setInterval(long j10) {
            boolean z4;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j10 >= 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            b6.m.a("intervalMillis must be greater than or equal to 0", z4);
            long j11 = locationRequest.f3778c;
            long j12 = locationRequest.f3777b;
            if (j11 == j12 / 6) {
                locationRequest.f3778c = j10 / 6;
            }
            if (locationRequest.f3781r == j12) {
                locationRequest.f3781r = j10;
            }
            locationRequest.f3777b = j10;
        }

        @Override
        public void setPriority(int i10) {
            int i11;
            boolean z4;
            int i12 = 105;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        i11 = 100;
                    } else {
                        i11 = 105;
                    }
                } else {
                    i11 = 104;
                }
            } else {
                i11 = 102;
            }
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (i11 != 100 && i11 != 102 && i11 != 104) {
                if (i11 != 105) {
                    i12 = i11;
                    z4 = false;
                    b6.m.c(z4, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
                    locationRequest.f3776a = i11;
                }
            } else {
                i12 = i11;
            }
            z4 = true;
            b6.m.c(z4, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
            locationRequest.f3776a = i11;
        }

        private GoogleLocationRequest(LocationRequest locationRequest) {
            this.request = locationRequest;
        }
    }

    public static void lambda$checkLocationSettings$1(q0.a aVar, Task task) {
        try {
            task.getResult(com.google.android.gms.common.api.f.class);
            aVar.accept(0);
        } catch (com.google.android.gms.common.api.f e) {
            int statusCode = e.getStatusCode();
            if (statusCode != 6) {
                if (statusCode == 8502) {
                    aVar.accept(2);
                    return;
                }
                return;
            }
            aVar.accept(1);
        }
    }

    public static void lambda$getLastLocation$0(q0.a aVar, Task task) {
        if (task.getException() != null) {
            return;
        }
        aVar.accept((Location) task.getResult());
    }

    @Override
    public void checkLocationSettings(ILocationServiceProvider.ILocationRequest iLocationRequest, q0.a aVar) {
        ArrayList arrayList = new ArrayList();
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        if (locationRequest != null) {
            arrayList.add(locationRequest);
        }
        u7.i iVar = this.settingsClient;
        u7.e eVar = new u7.e(arrayList, false, false);
        f7.d dVar = (f7.d) iVar;
        dVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.f2885c = new androidx.biometric.f0(eVar, 12);
        e.f2883a = 2426;
        dVar.e(0, e.e()).addOnCompleteListener(new i4(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        f7.d dVar = (f7.d) this.locationProviderClient;
        dVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.f2885c = f7.a.f6010c;
        e.f2883a = 2414;
        dVar.e(0, e.e()).addOnCompleteListener(new i4(aVar, 0));
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = u7.d.f45181a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f2730c;
        com.google.android.gms.common.api.e eVar2 = f7.d.f6015k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f2721i;
        this.locationProviderClient = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
        this.settingsClient = new com.google.android.gms.common.api.j(context, eVar2, aVar, iVar);
    }

    @Override
    public ILocationServiceProvider.ILocationRequest onCreateLocationRequest() {
        return new GoogleLocationRequest(new LocationRequest(102, 3600000L, 600000L, 0L, Long.MAX_VALUE, Long.MAX_VALUE, Integer.MAX_VALUE, 0.0f, true, 3600000L, 0, 0, null, false, new WorkSource(), null));
    }

    @Override
    public ILocationServiceProvider.IMapApiClient onCreateLocationServicesAPI(Context context, final ILocationServiceProvider.IAPIConnectionCallbacks iAPIConnectionCallbacks, final ILocationServiceProvider.IAPIOnConnectionFailedListener iAPIOnConnectionFailedListener) {
        List list;
        boolean z4;
        Context context2 = ApplicationLoader.applicationContext;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? kVar = new a0.k(0);
        ?? kVar2 = new a0.k(0);
        Object obj = y5.d.f47080c;
        a8.j jVar = b8.b.f1746a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = u7.d.f45181a;
        b6.m.i(eVar, "Api must not be null");
        kVar2.put(eVar, null);
        a8.j jVar2 = eVar.f2722a;
        b6.m.i(jVar2, "Base client builder must not be null");
        switch (jVar2.f142a) {
            case 10:
                list = Collections.EMPTY_LIST;
                break;
            default:
                list = Collections.EMPTY_LIST;
                break;
        }
        hashSet2.addAll(list);
        hashSet.addAll(list);
        arrayList.add(new com.google.android.gms.common.api.k() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onConnected(Bundle bundle) {
                iAPIConnectionCallbacks.onConnected(bundle);
            }

            @Override
            public void onConnectionSuspended(int i10) {
                iAPIConnectionCallbacks.onConnectionSuspended(i10);
            }
        });
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(y5.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        b6.m.a("must call addApi() to add at least one API", !kVar2.isEmpty());
        b8.a aVar = b8.a.f1745a;
        com.google.android.gms.common.api.e eVar2 = b8.b.f1747b;
        if (kVar2.containsKey(eVar2)) {
            aVar = (b8.a) kVar2.get(eVar2);
        }
        m.s3 s3Var = new m.s3(hashSet, kVar, packageName, name, aVar);
        Map map = (Map) s3Var.f13643c;
        a0.k kVar3 = new a0.k(0);
        a0.k kVar4 = new a0.k(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) kVar2.keySet()).iterator();
        com.google.android.gms.common.api.e eVar3 = null;
        a0.k kVar5 = kVar2;
        while (true) {
            a0.b bVar = (a0.b) it;
            if (bVar.hasNext()) {
                com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar.next();
                Object obj2 = kVar5.get(eVar4);
                if (map.get(eVar4) != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                Looper looper = mainLooper;
                kVar3.put(eVar4, Boolean.valueOf(z4));
                a0.k kVar6 = kVar4;
                com.google.android.gms.common.api.internal.q1 q1Var = new com.google.android.gms.common.api.internal.q1(eVar4, z4);
                arrayList3.add(q1Var);
                a8.j jVar3 = eVar4.f2722a;
                b6.m.h(jVar3);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                m.s3 s3Var2 = s3Var;
                a0.k kVar7 = kVar3;
                a0.k kVar8 = kVar5;
                com.google.android.gms.common.api.c a2 = jVar3.a(context2, looper, s3Var2, obj2, q1Var, q1Var);
                kVar6.put(eVar4.f2723b, a2);
                if (a2.a()) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        s3Var = s3Var2;
                        kVar4 = kVar6;
                        eVar3 = eVar4;
                    } else {
                        throw new IllegalStateException(android.support.v4.media.a.z(eVar4.f2724c, " cannot be used with ", eVar3.f2724c));
                    }
                } else {
                    mainLooper = looper;
                    s3Var = s3Var2;
                    kVar4 = kVar6;
                }
                map = map2;
                kVar3 = kVar7;
                kVar5 = kVar8;
                arrayList3 = arrayList4;
            } else {
                m.s3 s3Var3 = s3Var;
                a0.f fVar = kVar3;
                a0.f fVar2 = kVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.f2724c;
                    if (!equals) {
                        throw new IllegalStateException(android.support.v4.media.a.o("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper2, s3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.j0.f(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f2918a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
        }
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        u7.a aVar = this.locationProviderClient;
        u7.c cVar = new u7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f3787a;
                int size = list.size();
                if (size == 0) {
                    location = null;
                } else {
                    location = (Location) list.get(size - 1);
                }
                iLocationListener2.onLocationChanged(location);
            }
        };
        f7.d dVar = (f7.d) aVar;
        dVar.getClass();
        String simpleName = u7.c.class.getSimpleName();
        b6.m.g(simpleName, "Listener type must not be empty");
        dVar.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(f7.c.f6014a, f7.a.f6009b);
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        u7.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        u7.c cVar = new u7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f3787a;
                int size = list.size();
                if (size == 0) {
                    location = null;
                } else {
                    location = (Location) list.get(size - 1);
                }
                iLocationListener2.onLocationChanged(location);
            }
        };
        Looper mainLooper = Looper.getMainLooper();
        f7.d dVar = (f7.d) aVar;
        dVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            b6.m.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p f10 = androidx.biometric.f0.f(mainLooper, cVar, u7.c.class.getSimpleName());
        ?? obj = new Object();
        obj.f319c = dVar;
        obj.f317a = true;
        obj.f318b = f10;
        f7.b bVar = new f7.b(0, (Object) obj, locationRequest);
        ?? obj2 = new Object();
        obj2.f2862b = true;
        obj2.f2863c = bVar;
        obj2.d = obj;
        obj2.e = f10;
        obj2.f2861a = 2436;
        dVar.b(obj2.a());
    }
}
