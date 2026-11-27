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
public final class kfd extends ew6 {
    public static final he6 f = new he6("MRDiscoveryCallback", null);
    public final k7b e;
    public final Map c = DesugarCollections.synchronizedMap(new HashMap());
    public final LinkedHashSet d = new LinkedHashSet();
    public final Set b = DesugarCollections.synchronizedSet(new LinkedHashSet());
    public final hfd a = new hfd(this);

    public kfd(Context context) {
        this.e = new k7b(context);
    }

    @Override
    public final void d(jw6 jw6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteAdded.", new Object[0]);
        o(jw6Var, true);
    }

    @Override
    public final void e(jw6 jw6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteChanged.", new Object[0]);
        o(jw6Var, true);
    }

    @Override
    public final void f(jw6 jw6Var) {
        f.b("MediaRouterDiscoveryCallback.onRouteRemoved.", new Object[0]);
        o(jw6Var, false);
    }

    public final void m() {
        he6 he6Var = f;
        he6Var.b(qd4.n(this.d.size(), "Starting RouteDiscovery with ", " IDs"), new Object[0]);
        he6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
        if (Looper.myLooper() == Looper.getMainLooper()) {
            n();
        } else {
            new b99(Looper.getMainLooper(), (byte) 3).post(new oed(this, (byte) 1));
        }
    }

    public final void n() {
        k7b k7bVar = this.e;
        lw6 lw6Var = (lw6) k7bVar.c;
        if (lw6Var == null) {
            lw6Var = lw6.d((Context) k7bVar.b);
            k7bVar.c = lw6Var;
        }
        lw6Var.h(this);
        synchronized (this.d) {
            Iterator it = this.d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                String a = bvd.a(str);
                ArrayList<String> arrayList = new ArrayList<>();
                if (!arrayList.contains(a)) {
                    arrayList.add(a);
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("controlCategories", arrayList);
                dw6 dw6Var = new dw6(bundle, arrayList);
                if (((bfd) this.c.get(str)) == null) {
                    this.c.put(str, new bfd(dw6Var));
                }
                he6 he6Var = f;
                String a2 = bvd.a(str);
                he6Var.b("Adding mediaRouter callback for control category " + a2, new Object[0]);
                k7b k7bVar2 = this.e;
                lw6 lw6Var2 = (lw6) k7bVar2.c;
                if (lw6Var2 == null) {
                    lw6Var2 = lw6.d((Context) k7bVar2.b);
                    k7bVar2.c = lw6Var2;
                }
                lw6Var2.a(dw6Var, this, 4);
            }
        }
        Map map = this.c;
        f.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(map.keySet())), new Object[0]);
    }

    public final void o(jw6 jw6Var, boolean z) {
        boolean z2;
        Set z3;
        boolean remove;
        he6 he6Var = f;
        he6Var.b("MediaRouterDiscoveryCallback.updateRouteToAppIds (add=%b) route %s", Boolean.valueOf(z), jw6Var);
        synchronized (this.c) {
            he6Var.b("appIdToRouteInfo has these appId route keys: ".concat(String.valueOf(this.c.keySet())), new Object[0]);
            z2 = false;
            for (Map.Entry entry : this.c.entrySet()) {
                String str = (String) entry.getKey();
                bfd bfdVar = (bfd) entry.getValue();
                if (jw6Var.h(bfdVar.b)) {
                    he6 he6Var2 = f;
                    if (z) {
                        he6Var2.b("Adding/updating route for appId " + str, new Object[0]);
                        remove = bfdVar.a.add(jw6Var);
                        if (!remove) {
                            Log.w(he6Var2.a, he6Var2.d("Route " + String.valueOf(jw6Var) + " already exists for appId " + str, new Object[0]));
                        }
                    } else {
                        he6Var2.b("Removing route for appId " + str, new Object[0]);
                        remove = bfdVar.a.remove(jw6Var);
                        if (!remove) {
                            Log.w(he6Var2.a, he6Var2.d("Route " + String.valueOf(jw6Var) + " already removed from appId " + str, new Object[0]));
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
                        bfd bfdVar2 = (bfd) this.c.get(f6f.a(str2));
                        if (bfdVar2 == null) {
                            int i = g9e.r;
                            z3 = wbe.G;
                        } else {
                            LinkedHashSet linkedHashSet = bfdVar2.a;
                            int i2 = g9e.r;
                            Object[] array = linkedHashSet.toArray();
                            z3 = g9e.z(array.length, array);
                        }
                        if (!z3.isEmpty()) {
                            hashMap.put(str2, z3);
                        }
                    }
                }
                ybd.b(hashMap.entrySet());
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
