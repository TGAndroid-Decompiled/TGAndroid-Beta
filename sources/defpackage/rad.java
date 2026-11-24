package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
public final class rad extends zt6 {
    public static final dc6 f = new dc6("MRDiscoveryCallback", null);
    public final v8b e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final oad a = new oad(this);

    public rad(Context context) {
        this.e = new v8b(context);
    }

    @Override
    public final void d(eu6 eu6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(eu6Var, true);
    }

    @Override
    public final void e(eu6 eu6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(eu6Var, true);
    }

    @Override
    public final void f(eu6 eu6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(eu6Var, false);
    }

    public final void m() {
        dc6 dc6Var = f;
        dc6Var.b(tb4.n(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        dc6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new o59(Looper.getMainLooper(), (byte) 3).post(new v9d(this, (byte) 1));
        }
    }

    public final void n() {
        v8b v8bVar = this.e;
        gu6 gu6Var = (gu6) v8bVar.c;
        if (gu6Var == null) {
            gu6Var = gu6.d((Context) v8bVar.b);
            v8bVar.c = gu6Var;
        }
        gu6Var.h(this);
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String a = lqd.a(str);
                ArrayList<String> arrayList = new ArrayList<>();
                if (!arrayList.contains(a)) {
                    arrayList.add(a);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                yt6 yt6Var = new yt6(bundle, arrayList);
                if (((iad) this.c.get(str)) == null) {
                    this.c.put(str, new iad(yt6Var));
                }
                dc6 dc6Var = f;
                String a2 = lqd.a(str);
                dc6Var.b("Adding mediaRouter callback for control category " + a2, new Object[0]);
                v8b v8bVar2 = this.e;
                gu6 gu6Var2 = (gu6) v8bVar2.c;
                if (gu6Var2 == null) {
                    gu6Var2 = gu6.d((Context) v8bVar2.b);
                    v8bVar2.c = gu6Var2;
                }
                gu6Var2.a(yt6Var, this, 4);
            }
        }
        Map map = this.c;
        f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
    }

    public final void o(eu6 eu6Var, boolean z) {
        boolean z2;
        Set z3;
        boolean remove;
        dc6 dc6Var = f;
        dc6Var.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), eu6Var);
        synchronized (this.c) {
            dc6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.c.entrySet()) {
                String str = (String) entry.getKey();
                iad iadVar = (iad) entry.getValue();
                if (eu6Var.h(iadVar.b)) {
                    dc6 dc6Var2 = f;
                    if (z) {
                        dc6Var2.b("Adding/updating route for appId " + str, new Object[0]);
                        remove = iadVar.a.add(eu6Var);
                        if (!remove) {
                            Log.w(dc6Var2.a, dc6Var2.d("Route " + String.valueOf(eu6Var) + " already exists for appId " + str, new Object[0]));
                        }
                    } else {
                        dc6Var2.b("Removing route for appId " + str, new Object[0]);
                        remove = iadVar.a.remove(eu6Var);
                        if (!remove) {
                            Log.w(dc6Var2.a, dc6Var2.d("Route " + String.valueOf(eu6Var) + " already removed from appId " + str, new Object[0]));
                        }
                    }
                    z2 = remove;
                }
            }
        }
        if (z2) {
            f.b("Invoking callback.onRouteUpdated.", new Object[0]);
            synchronized (this.b) {
                HashMap hashMap = new HashMap();
                synchronized (this.c) {
                    for (String str2 : this.c.keySet()) {
                        iad iadVar2 = (iad) this.c.get(n1f.a(str2));
                        if (iadVar2 == null) {
                            int i = q4e.r;
                            z3 = g7e.G;
                        } else {
                            LinkedHashSet linkedHashSet = iadVar2.a;
                            int i2 = q4e.r;
                            Object[] array = linkedHashSet.toArray();
                            z3 = q4e.z(array.length, array);
                        }
                        if (!z3.isEmpty()) {
                            hashMap.put(str2, z3);
                        }
                    }
                }
                f7d.b(hashMap.entrySet());
                Iterator it = this.b.iterator();
                if (it.hasNext()) {
                    if (it.next() == null) {
                        throw null;
                    }
                    throw new ClassCastException();
                }
            }
        }
    }
}
