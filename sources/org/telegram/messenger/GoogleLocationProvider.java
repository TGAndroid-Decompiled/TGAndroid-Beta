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
    private s7.a locationProviderClient;
    private s7.i settingsClient;

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
            boolean z10;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            z5.l.c(z10, "illegal fastest interval: %d", Long.valueOf(j10));
            locationRequest.f4911c = j10;
        }

        @Override
        public void setInterval(long j10) {
            boolean z10;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j10 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            z5.l.a("intervalMillis must be greater than or equal to 0", z10);
            long j11 = locationRequest.f4911c;
            long j12 = locationRequest.f4910b;
            if (j11 == j12 / 6) {
                locationRequest.f4911c = j10 / 6;
            }
            if (locationRequest.f4915r == j12) {
                locationRequest.f4915r = j10;
            }
            locationRequest.f4910b = j10;
        }

        @Override
        public void setPriority(int i10) {
            int i11;
            boolean z10;
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
                    z10 = false;
                    z5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
                    locationRequest.f4909a = i11;
                }
            } else {
                i12 = i11;
            }
            z10 = true;
            z5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
            locationRequest.f4909a = i11;
        }

        private GoogleLocationRequest(LocationRequest locationRequest) {
            this.request = locationRequest;
        }
    }

    public static void lambda$checkLocationSettings$1(q0.a aVar, Task task) {
        try {
            task.getResult(com.google.android.gms.common.api.f.class);
            aVar.accept(0);
        } catch (com.google.android.gms.common.api.f e10) {
            int statusCode = e10.getStatusCode();
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
        s7.i iVar = this.settingsClient;
        s7.e eVar = new s7.e(arrayList, false, false);
        d7.c cVar = (d7.c) iVar;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f3928c = new ag.o1(eVar, 9);
        b10.f3926a = 2426;
        cVar.e(0, b10.b()).addOnCompleteListener(new h4(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        d7.c cVar = (d7.c) this.locationProviderClient;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f3928c = d7.a.f5429c;
        b10.f3926a = 2414;
        cVar.e(0, b10.b()).addOnCompleteListener(new h4(aVar, 0));
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = s7.d.f47670a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f3767c;
        com.google.android.gms.common.api.e eVar2 = d7.c.f5431k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f3758i;
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
        boolean z10;
        Context context2 = ApplicationLoader.applicationContext;
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        ?? kVar = new a0.k(0);
        ?? kVar2 = new a0.k(0);
        Object obj = w5.d.f49767c;
        b6.b bVar = z7.b.f50782a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = s7.d.f47670a;
        z5.l.i(eVar, "Api must not be null");
        kVar2.put(eVar, null);
        b6.b bVar2 = eVar.f3759a;
        z5.l.i(bVar2, "Base client builder must not be null");
        switch (bVar2.f1938a) {
            case 6:
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
            public final void onConnectionFailed(w5.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        z5.l.a("must call addApi() to add at least one API", !kVar2.isEmpty());
        z7.a aVar = z7.a.f50781a;
        com.google.android.gms.common.api.e eVar2 = z7.b.f50783b;
        if (kVar2.containsKey(eVar2)) {
            aVar = (z7.a) kVar2.get(eVar2);
        }
        m.s3 s3Var = new m.s3(hashSet, kVar, packageName, name, aVar);
        Map map = (Map) s3Var.f16690c;
        a0.k kVar3 = new a0.k(0);
        a0.k kVar4 = new a0.k(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) kVar2.keySet()).iterator();
        com.google.android.gms.common.api.e eVar3 = null;
        a0.k kVar5 = kVar2;
        while (true) {
            a0.b bVar3 = (a0.b) it;
            if (bVar3.hasNext()) {
                com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar3.next();
                Object obj2 = kVar5.get(eVar4);
                if (map.get(eVar4) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Looper looper = mainLooper;
                kVar3.put(eVar4, Boolean.valueOf(z10));
                a0.k kVar6 = kVar4;
                com.google.android.gms.common.api.internal.o1 o1Var = new com.google.android.gms.common.api.internal.o1(eVar4, z10);
                arrayList3.add(o1Var);
                b6.b bVar4 = eVar4.f3759a;
                z5.l.h(bVar4);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                m.s3 s3Var2 = s3Var;
                a0.k kVar7 = kVar3;
                a0.k kVar8 = kVar5;
                com.google.android.gms.common.api.c a2 = bVar4.a(context2, looper, s3Var2, obj2, o1Var, o1Var);
                kVar6.put(eVar4.f3760b, a2);
                if (a2.a()) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        s3Var = s3Var2;
                        kVar4 = kVar6;
                        eVar3 = eVar4;
                    } else {
                        throw new IllegalStateException(a4.w.y(eVar4.f3761c, " cannot be used with ", eVar3.f3761c));
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
                    String str = eVar3.f3761c;
                    if (!equals) {
                        throw new IllegalStateException(a4.w.n("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper2, s3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.j0.g(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f3964a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
        }
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        s7.a aVar = this.locationProviderClient;
        s7.c cVar = new s7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f4921a;
                int size = list.size();
                if (size == 0) {
                    location = null;
                } else {
                    location = (Location) list.get(size - 1);
                }
                iLocationListener2.onLocationChanged(location);
            }
        };
        d7.c cVar2 = (d7.c) aVar;
        cVar2.getClass();
        String simpleName = s7.c.class.getSimpleName();
        z5.l.g(simpleName, "Listener type must not be empty");
        cVar2.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(d7.b.f5430a, d7.a.f5428b);
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        s7.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        s7.c cVar = new s7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f4921a;
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
        d7.c cVar2 = (d7.c) aVar;
        cVar2.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            z5.l.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p i10 = za.c.i(mainLooper, cVar, s7.c.class.getSimpleName());
        ?? obj = new Object();
        obj.f882c = cVar2;
        obj.f880a = true;
        obj.f881b = i10;
        ze.b bVar = new ze.b((Object) obj, locationRequest);
        ?? obj2 = new Object();
        obj2.f3908b = true;
        obj2.f3909c = bVar;
        obj2.d = obj;
        obj2.f3910e = i10;
        obj2.f3907a = 2436;
        cVar2.b(obj2.a());
    }
}
