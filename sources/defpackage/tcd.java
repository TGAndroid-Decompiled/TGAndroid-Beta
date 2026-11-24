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
public final class tcd extends zv6 {
    public static final ce6 f = new ce6("MRDiscoveryCallback", null);
    public final xab e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final qcd a = new qcd(this);

    public tcd(Context context) {
        this.e = new xab(context);
    }

    @Override
    public final void d(ew6 ew6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(ew6Var, true);
    }

    @Override
    public final void e(ew6 ew6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(ew6Var, true);
    }

    @Override
    public final void f(ew6 ew6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(ew6Var, false);
    }

    public final void m() {
        ce6 ce6Var = f;
        ce6Var.b(td4.o(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        ce6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new q79(Looper.getMainLooper(), (byte) 3).post(new xbd(this, (byte) 1));
        }
    }

    public final void n() {
        xab xabVar = this.e;
        gw6 gw6Var = (gw6) xabVar.c;
        if (gw6Var == null) {
            gw6Var = gw6.d((Context) xabVar.b);
            xabVar.c = gw6Var;
        }
        gw6Var.h(this);
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String a = osd.a(str);
                ArrayList<String> arrayList = new ArrayList<>();
                if (!arrayList.contains(a)) {
                    arrayList.add(a);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                yv6 yv6Var = new yv6(bundle, arrayList);
                if (((kcd) this.c.get(str)) == null) {
                    this.c.put(str, new kcd(yv6Var));
                }
                ce6 ce6Var = f;
                String a2 = osd.a(str);
                ce6Var.b("Adding mediaRouter callback for control category " + a2, new Object[0]);
                xab xabVar2 = this.e;
                gw6 gw6Var2 = (gw6) xabVar2.c;
                if (gw6Var2 == null) {
                    gw6Var2 = gw6.d((Context) xabVar2.b);
                    xabVar2.c = gw6Var2;
                }
                gw6Var2.a(yv6Var, this, 4);
            }
        }
        Map map = this.c;
        f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
    }

    public final void o(ew6 ew6Var, boolean z) {
        boolean z2;
        Set z3;
        boolean remove;
        ce6 ce6Var = f;
        ce6Var.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), ew6Var);
        synchronized (this.c) {
            ce6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.c.entrySet()) {
                String str = (String) entry.getKey();
                kcd kcdVar = (kcd) entry.getValue();
                if (ew6Var.h(kcdVar.b)) {
                    ce6 ce6Var2 = f;
                    if (z) {
                        ce6Var2.b("Adding/updating route for appId " + str, new Object[0]);
                        remove = kcdVar.a.add(ew6Var);
                        if (!remove) {
                            Log.w(ce6Var2.a, ce6Var2.d("Route " + String.valueOf(ew6Var) + " already exists for appId " + str, new Object[0]));
                        }
                    } else {
                        ce6Var2.b("Removing route for appId " + str, new Object[0]);
                        remove = kcdVar.a.remove(ew6Var);
                        if (!remove) {
                            Log.w(ce6Var2.a, ce6Var2.d("Route " + String.valueOf(ew6Var) + " already removed from appId " + str, new Object[0]));
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
                        kcd kcdVar2 = (kcd) this.c.get(p3f.a(str2));
                        if (kcdVar2 == null) {
                            int i = t6e.r;
                            z3 = h9e.G;
                        } else {
                            LinkedHashSet linkedHashSet = kcdVar2.a;
                            int i2 = t6e.r;
                            Object[] array = linkedHashSet.toArray();
                            z3 = t6e.z(array.length, array);
                        }
                        if (!z3.isEmpty()) {
                            hashMap.put(str2, z3);
                        }
                    }
                }
                h9d.b(hashMap.entrySet());
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
