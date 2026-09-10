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
    private g8.a locationProviderClient;
    private g8.i settingsClient;

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
        public void setFastestInterval(long j3) {
            boolean z10;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.c(z10, "illegal fastest interval: %d", Long.valueOf(j3));
            locationRequest.f5859c = j3;
        }

        @Override
        public void setInterval(long j3) {
            boolean z10;
            LocationRequest locationRequest = this.request;
            locationRequest.getClass();
            if (j3 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            n6.l.a("intervalMillis must be greater than or equal to 0", z10);
            long j10 = locationRequest.f5859c;
            long j11 = locationRequest.f5858b;
            if (j10 == j11 / 6) {
                locationRequest.f5859c = j3 / 6;
            }
            if (locationRequest.f5862r == j11) {
                locationRequest.f5862r = j3;
            }
            locationRequest.f5858b = j3;
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
                    n6.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
                    locationRequest.f5857a = i11;
                }
            } else {
                i12 = i11;
            }
            z10 = true;
            n6.l.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i12));
            locationRequest.f5857a = i11;
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
        g8.i iVar = this.settingsClient;
        g8.e eVar = new g8.e(arrayList, false, false);
        r7.c cVar = (r7.c) iVar;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.f4957c = new l2.h(eVar, 17);
        e.f4955a = 2426;
        cVar.e(0, e.a()).addOnCompleteListener(new l4(aVar, 1));
    }

    @Override
    public boolean checkServices() {
        return PushListenerController.GooglePushListenerServiceProvider.INSTANCE.hasServices();
    }

    @Override
    public void getLastLocation(q0.a aVar) {
        r7.c cVar = (r7.c) this.locationProviderClient;
        cVar.getClass();
        com.google.android.gms.common.api.internal.v e = com.google.android.gms.common.api.internal.w.e();
        e.f4957c = r7.a.f41277c;
        e.f4955a = 2414;
        cVar.e(0, e.a()).addOnCompleteListener(new l4(aVar, 0));
    }

    @Override
    public void init(Context context) {
        com.google.android.gms.common.api.e eVar = g8.d.f8640a;
        com.google.android.gms.common.api.i iVar = com.google.android.gms.common.api.i.f4808c;
        com.google.android.gms.common.api.e eVar2 = r7.c.f41279k;
        com.google.android.gms.common.api.a aVar = com.google.android.gms.common.api.b.f4799t;
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
        ?? lVar = new a0.l(0);
        ?? lVar2 = new a0.l(0);
        Object obj = k6.d.f12353c;
        a8.d dVar = n8.b.f14016a;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Looper mainLooper = context2.getMainLooper();
        String packageName = context2.getPackageName();
        String name = context2.getClass().getName();
        com.google.android.gms.common.api.e eVar = g8.d.f8640a;
        n6.l.i(eVar, "Api must not be null");
        lVar2.put(eVar, null);
        a8.d dVar2 = eVar.f4800a;
        n6.l.i(dVar2, "Base client builder must not be null");
        switch (dVar2.f306a) {
            case 17:
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
            public final void onConnectionFailed(k6.a aVar) {
                ILocationServiceProvider.IAPIOnConnectionFailedListener.this.onConnectionFailed();
            }
        });
        n6.l.a("must call addApi() to add at least one API", !lVar2.isEmpty());
        n8.a aVar = n8.a.f14015a;
        com.google.android.gms.common.api.e eVar2 = n8.b.f14017b;
        if (lVar2.containsKey(eVar2)) {
            aVar = (n8.a) lVar2.get(eVar2);
        }
        m.r3 r3Var = new m.r3(hashSet, lVar, packageName, name, aVar);
        Map map = (Map) r3Var.f13139c;
        a0.l lVar3 = new a0.l(0);
        a0.l lVar4 = new a0.l(0);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = ((a0.c) lVar2.keySet()).iterator();
        com.google.android.gms.common.api.e eVar3 = null;
        a0.l lVar5 = lVar2;
        while (true) {
            a0.b bVar = (a0.b) it;
            if (bVar.hasNext()) {
                com.google.android.gms.common.api.e eVar4 = (com.google.android.gms.common.api.e) bVar.next();
                Object obj2 = lVar5.get(eVar4);
                if (map.get(eVar4) != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                Looper looper = mainLooper;
                lVar3.put(eVar4, Boolean.valueOf(z10));
                a0.l lVar6 = lVar4;
                com.google.android.gms.common.api.internal.p1 p1Var = new com.google.android.gms.common.api.internal.p1(eVar4, z10);
                arrayList3.add(p1Var);
                a8.d dVar3 = eVar4.f4800a;
                n6.l.h(dVar3);
                ArrayList arrayList4 = arrayList3;
                Map map2 = map;
                m.r3 r3Var2 = r3Var;
                a0.l lVar7 = lVar3;
                a0.l lVar8 = lVar5;
                com.google.android.gms.common.api.c a2 = dVar3.a(context2, looper, r3Var2, obj2, p1Var, p1Var);
                lVar6.put(eVar4.f4801b, a2);
                if (a2.a()) {
                    if (eVar3 == null) {
                        mainLooper = looper;
                        r3Var = r3Var2;
                        lVar4 = lVar6;
                        eVar3 = eVar4;
                    } else {
                        throw new IllegalStateException(a4.a.C(eVar4.f4802c, " cannot be used with ", eVar3.f4802c));
                    }
                } else {
                    mainLooper = looper;
                    r3Var = r3Var2;
                    lVar4 = lVar6;
                }
                map = map2;
                lVar3 = lVar7;
                lVar5 = lVar8;
                arrayList3 = arrayList4;
            } else {
                m.r3 r3Var3 = r3Var;
                a0.f fVar = lVar3;
                a0.f fVar2 = lVar4;
                ArrayList arrayList5 = arrayList3;
                Looper looper2 = mainLooper;
                if (eVar3 != null) {
                    boolean equals = hashSet.equals(hashSet2);
                    String str = eVar3.f4802c;
                    if (!equals) {
                        throw new IllegalStateException(a4.a.p("Must not set scopes in GoogleApiClient.Builder when using ", str, ". Set account in GoogleSignInOptions.Builder instead."));
                    }
                }
                com.google.android.gms.common.api.internal.j0 j0Var = new com.google.android.gms.common.api.internal.j0(context2, new ReentrantLock(), looper2, r3Var3, fVar, arrayList, arrayList2, fVar2, com.google.android.gms.common.api.internal.j0.f(fVar2.values(), true), arrayList5);
                Set set = com.google.android.gms.common.api.m.f4990a;
                synchronized (set) {
                    set.add(j0Var);
                }
                return new GoogleApiClientImpl(j0Var);
            }
        }
    }

    @Override
    public void removeLocationUpdates(final ILocationServiceProvider.ILocationListener iLocationListener) {
        g8.a aVar = this.locationProviderClient;
        g8.c cVar = new g8.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f5868a;
                int size = list.size();
                if (size == 0) {
                    location = null;
                } else {
                    location = (Location) list.get(size - 1);
                }
                iLocationListener2.onLocationChanged(location);
            }
        };
        r7.c cVar2 = (r7.c) aVar;
        cVar2.getClass();
        String simpleName = g8.c.class.getSimpleName();
        n6.l.g(simpleName, "Listener type must not be empty");
        cVar2.c(new com.google.android.gms.common.api.internal.n(cVar, simpleName), 2418).continueWith(r7.b.f41278a, r7.a.f41276b);
    }

    @Override
    public void requestLocationUpdates(ILocationServiceProvider.ILocationRequest iLocationRequest, final ILocationServiceProvider.ILocationListener iLocationListener) {
        g8.a aVar = this.locationProviderClient;
        LocationRequest locationRequest = ((GoogleLocationRequest) iLocationRequest).request;
        g8.c cVar = new g8.c() {
            {
                GoogleLocationProvider.this = this;
            }

            @Override
            public void onLocationResult(LocationResult locationResult) {
                Location location;
                ILocationServiceProvider.ILocationListener iLocationListener2 = iLocationListener;
                List list = locationResult.f5868a;
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
        r7.c cVar2 = (r7.c) aVar;
        cVar2.getClass();
        if (mainLooper == null) {
            mainLooper = Looper.myLooper();
            n6.l.i(mainLooper, "invalid null looper");
        }
        com.google.android.gms.common.api.internal.p Q = a4.m.Q(mainLooper, cVar, g8.c.class.getSimpleName());
        androidx.activity.o oVar = new androidx.activity.o(cVar2, Q);
        og.u0 u0Var = new og.u0(13, oVar, locationRequest);
        ?? obj = new Object();
        obj.f4939b = true;
        obj.f4940c = u0Var;
        obj.d = oVar;
        obj.e = Q;
        obj.f4938a = 2436;
        cVar2.b(obj.a());
    }
}
