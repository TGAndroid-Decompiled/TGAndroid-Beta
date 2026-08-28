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
    private q7.a locationProviderClient;
    private q7.i settingsClient;

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
            x5.l.c(z10, "illegal fastest interval: %d", Long.valueOf(j10));
            locationRequest.f3897c = j10;
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
            x5.l.a("intervalMillis must be greater than or equal to 0", z10);
            long j11 = locationRequest.f3897c;
            long j12 = locationRequest.f3896b;
            if (j11 == j12 / 6) {
                locationRequest.f3897c = j10 / 6;
            }
            if (locationRequest.f3901r == j12) {
                locationRequest.f3901r = j10;
            }
            locationRequest.f3896b = j10;
        }

        @Override
        public void setPriority(int i9) {
            int i10;
            boolean z10;
            int i11 = 105;
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 3) {
                        i10 = 100;
                    } else {
                        i10 = 105;
                    }
                } else {
                    i10 = 104;
                }
            } else {
                i10 = 102;
            }
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (i10 != 100 && i10 != 102 && i10 != 104) {
                if (i10 != 105) {
                    i11 = i10;
                    z10 = false;
                    x5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
                    locationRequest.f3895a = i10;
                }
            } else {
                i11 = i10;
            }
            z10 = true;
            x5.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i11));
            locationRequest.f3895a = i10;
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
        q7.i iVar = this.settingsClient;
        q7.e eVar = new q7.e(arrayList, false, false);
        b7.e eVar2 = (b7.e) iVar;
        eVar2.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f2914c = new android.support.v4.media.c(eVar, 3);
        b10.f2912a = 2426;
        eVar2.e(0, b10.b()).addOnCompleteListener(new f4(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        b7.e eVar = (b7.e) this.locationProviderClient;
        eVar.getClass();
        com.google.android.gms.common.api.internal.v b10 = com.google.android.gms.common.api.internal.w.b();
        b10.f2914c = b7.b.f1553c;
        b10.f2912a = 2414;
        eVar.e(0, b10.b()).addOnCompleteListener(new f4(aVar, 0));
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = q7.d.f46098a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f2753c;
        com.google.android.gms.common.api.e eVar2 = b7.e.f1556k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f2744g;
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
        Object obj = u5.d.f48108c;
        b7.d dVar = x7.b.f49082a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = q7.d.f46098a;
        x5.l.i(eVar, "Api must not be null");
        kVar2.put(eVar, null);
        b7.d dVar2 = eVar.f2745a;
        x5.l.i(dVar2, "Base client builder must not be null");
        switch (dVar2.f1555a) {
            case 4:
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
            public void onConnectionSuspended(int i9) {
                iAPIConnectionCallbacks.onConnectionSuspended(i9);
            }
        });
        arrayList2.add(new com.google.android.gms.common.api.l() {
            @Override
            public final void onConnectionFailed(u5.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        x5.l.a("must call addApi() to add at least one API", !kVar2.isEmpty());
        x7.a aVar = x7.a.f49081a;
        com.google.android.gms.common.api.e eVar2 = x7.b.f49083b;
        if (kVar2.containsKey(eVar2)) {
            aVar = (x7.a) kVar2.get(eVar2);
        }
        m.t3 t3Var = new m.t3(hashSet, kVar, packageName, name, aVar);
        Map map = (Map) t3Var.f17100c;
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
                    z10 = true;
                } else {
                    z10 = false;
                }
                Looper looper = mainLooper;
                kVar3.put(eVar4, Boolean.valueOf(z10));
                a0.k kVar6 = kVar4;
                com.google.android.gms.common.api.internal.o1 o1Var = new com.google.android.gms.common.api.internal.o1(eVar4, z10);
                arrayList3.add(o1Var);
                b7.d dVar3 = eVar4.f2745a;
                x5.l.h(dVar3);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                m.t3 t3Var2 = t3Var;
                a0.k kVar7 = kVar3;
                a0.k kVar8 = kVar5;
                com.google.android.gms.common.api.c a2 = dVar3.a(context2, looper, t3Var2, obj2, o1Var, o1Var);
                kVar6.put(eVar4.f2746b, a2);
                if (a2.a()) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        t3Var = t3Var2;
                        kVar4 = kVar6;
                        eVar3 = eVar4;
                    } else {
                        throw new IllegalStateException(aa.d.z(eVar4.f2747c, " cannot be used with ", eVar3.f2747c));
                    }
                } else {
                    mainLooper = looper;
                    t3Var = t3Var2;
                    kVar4 = kVar6;
                }
                map = map2;
                kVar3 = kVar7;
                kVar5 = kVar8;
                arrayList3 = arrayList4;
            } else {
                m.t3 t3Var3 = t3Var;
                a0.f fVar = kVar3;
                a0.f fVar2 = kVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.f2747c;
                    if (!equals) {
                        throw new IllegalStateException(aa.d.o("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper2, t3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.j0.f(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f2950a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
        }
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        q7.a aVar = this.locationProviderClient;
        q7.c cVar = new q7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f3907a;
                int size = list.size();
                if (size == 0) {
                    location = null;
                } else {
                    location = (Location) list.get(size - 1);
                }
                iLocationListener2.onLocationChanged(location);
            }
        };
        b7.e eVar = (b7.e) aVar;
        eVar.getClass();
        String simpleName = q7.c.class.getSimpleName();
        x5.l.g(simpleName, "Listener type must not be empty");
        eVar.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(b7.c.f1554a, b7.b.f1552b);
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        q7.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        q7.c cVar = new q7.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f3907a;
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
        b7.e eVar = (b7.e) aVar;
        eVar.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            x5.l.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p D = fa.c.D(mainLooper, cVar, q7.c.class.getSimpleName());
        ?? obj = new Object();
        obj.f389c = eVar;
        obj.f387a = true;
        obj.f388b = D;
        we.b bVar = new we.b(obj, locationRequest, false, 7);
        ?? obj2 = new Object();
        obj2.f2894b = true;
        obj2.f2895c = bVar;
        obj2.d = obj;
        obj2.f2896e = D;
        obj2.f2893a = 2436;
        eVar.b(obj2.a());
    }
}
