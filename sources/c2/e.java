package c2;

import ag.h1;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.Cells.pa;

public final class e {
    public static final int F = 0;
    public o A;
    public int B;
    public a5.n C;
    public android.support.v4.media.session.d0 D;
    public final a9.i E;

    public final z0 f2253c;
    public z d;

    public r f2254e;

    public com.google.android.gms.internal.cast.o f2255f;

    public x f2256g;
    public final Context h;

    public final a1 f2262n;

    public final ga.c f2263o;

    public final boolean f2264p;

    public final boolean f2265q;

    public l f2266r;

    public final o0 f2267s;

    public final c0 f2268t;

    public e0 f2269u;
    public z v;

    public z f2270w;

    public z f2271x;

    public q f2272y;

    public o f2273z;

    public final b f2251a = new b(this);

    public final HashMap f2252b = new HashMap();

    public final ArrayList f2257i = new ArrayList();

    public final ArrayList f2258j = new ArrayList();

    public final HashMap f2259k = new HashMap();

    public final ArrayList f2260l = new ArrayList();

    public final ArrayList f2261m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(Context context) {
        boolean z10;
        a1 a1Var = new a1();
        a1Var.f2231c = 0;
        a1Var.d = 3;
        this.f2262n = a1Var;
        this.f2263o = new ga.c(this, 5);
        this.E = new a9.i(this, 6);
        this.h = context;
        this.f2264p = ((ActivityManager) context.getSystemService("activity")).isLowRamDevice();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            int i11 = j0.f2297a;
            Intent intent = new Intent(context, (Class<?>) j0.class);
            intent.setPackage(context.getPackageName());
            if (context.getPackageManager().queryBroadcastReceivers(intent, 0).size() > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.f2265q = z10;
        int i12 = b1.f2239a;
        Intent intent2 = new Intent(context, (Class<?>) b1.class);
        intent2.setPackage(context.getPackageName());
        context.getPackageManager().queryBroadcastReceivers(intent2, 0).size();
        this.f2266r = (i10 < 30 || !z10) ? null : new l(context, new ae.b(this, 4));
        o0 k0Var = i10 >= 24 ? new k0(context, this) : new o0(context, this);
        this.f2267s = k0Var;
        this.f2268t = new c0(new af.e(this, 16));
        a(k0Var, true);
        s sVar = this.f2266r;
        if (sVar != null) {
            a(sVar, true);
        }
        z0 z0Var = new z0(context, this);
        this.f2253c = z0Var;
        Handler handler = (Handler) z0Var.d;
        if (z0Var.f2410a) {
            return;
        }
        z0Var.f2410a = true;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter.addAction("android.intent.action.PACKAGE_RESTARTED");
        intentFilter.addDataScheme("package");
        ((Context) z0Var.f2411b).registerReceiver((androidx.mediarouter.app.f) z0Var.f2415g, intentFilter, null, handler);
        handler.post((a8.b) z0Var.h);
    }

    public final void a(s sVar, boolean z10) {
        if (d(sVar) == null) {
            y yVar = new y(sVar, z10);
            this.f2260l.add(yVar);
            this.f2251a.b(513, yVar);
            m(yVar, (t) sVar.f2344n);
            b0.b();
            sVar.f2343f = this.f2263o;
            sVar.h(this.f2273z);
        }
    }

    public final String b(y yVar, String str) {
        String strFlattenToShortString = ((ComponentName) yVar.d.f14480b).flattenToShortString();
        boolean z10 = yVar.f2383c;
        String strW = z10 ? str : a9.p.w(strFlattenToShortString, ":", str);
        HashMap map = this.f2259k;
        if (!z10) {
            ArrayList arrayList = this.f2258j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    i10 = -1;
                    break;
                }
                if (((z) arrayList.get(i10)).f2392c.equals(strW)) {
                    break;
                }
                i10++;
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", pa.j("Either ", str, " isn't unique in ", strFlattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = strW + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 >= size2) {
                            i12 = -1;
                            break;
                        }
                        if (((z) arrayList.get(i12)).f2392c.equals(str2)) {
                            break;
                        }
                        i12++;
                    }
                    if (i12 < 0) {
                        map.put(new q0.b(strFlattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        map.put(new q0.b(strFlattenToShortString, str), strW);
        return strW;
    }

    public final z c() {
        ArrayList arrayList = this.f2258j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar != this.v && zVar.c() == this.f2267s && zVar.m("android.media.intent.category.LIVE_AUDIO") && !zVar.m("android.media.intent.category.LIVE_VIDEO") && zVar.f()) {
                return zVar;
            }
        }
        return this.v;
    }

    public final y d(s sVar) {
        ArrayList arrayList = this.f2260l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            y yVar = (y) obj;
            if (yVar.f2381a == sVar) {
                return yVar;
            }
        }
        return null;
    }

    public final z e() {
        z zVar = this.d;
        if (zVar != null) {
            return zVar;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (!this.f2265q) {
            return false;
        }
        e0 e0Var = this.f2269u;
        return e0Var == null || e0Var.f2275b;
    }

    public final void g() {
        if (this.d.e()) {
            List<z> listUnmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                hashSet.add(((z) it.next()).f2392c);
            }
            HashMap map = this.f2252b;
            Iterator it2 = map.entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                if (!hashSet.contains(entry.getKey())) {
                    r rVar = (r) entry.getValue();
                    rVar.h(0);
                    rVar.d();
                    it2.remove();
                }
            }
            for (z zVar : listUnmodifiableList) {
                if (!map.containsKey(zVar.f2392c)) {
                    r rVarE = zVar.c().e(zVar.f2391b, this.d.f2391b);
                    rVarE.e();
                    map.put(zVar.f2392c, rVarE);
                }
            }
        }
    }

    public final void h(e eVar, z zVar, r rVar, int i10, z zVar2, Collection collection) {
        com.google.android.gms.internal.cast.o oVar;
        x xVar = this.f2256g;
        if (xVar != null) {
            xVar.a();
            this.f2256g = null;
        }
        x xVar2 = new x(eVar, zVar, rVar, i10, zVar2, collection);
        this.f2256g = xVar2;
        if (xVar2.f2367b != 3 || (oVar = this.f2255f) == null) {
            xVar2.b();
            return;
        }
        z zVar3 = this.d;
        z zVar4 = (z) xVar2.f2371g;
        int i11 = 1;
        com.google.android.gms.internal.cast.o.f3598c.b("Prepare transfer from Route(%s) to Route(%s)", zVar3, zVar4);
        c0.i iVar = new c0.i();
        iVar.f2213c = new c0.l();
        c0.k kVar = new c0.k(iVar);
        c0.j jVar = kVar.f2216b;
        iVar.f2212b = kVar;
        iVar.f2211a = androidx.activity.result.c.class;
        try {
            iVar.f2211a = Boolean.valueOf(oVar.f3600b.post(new bf.e(oVar, zVar3, zVar4, iVar, false, 3)));
        } catch (Exception e9) {
            jVar.l(e9);
        }
        x xVar3 = this.f2256g;
        e eVar2 = (e) ((WeakReference) xVar3.f2373j).get();
        if (eVar2 == null || eVar2.f2256g != xVar3) {
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            xVar3.a();
        } else {
            if (((c0.k) xVar3.f2374k) != null) {
                throw new IllegalStateException("future is already set");
            }
            xVar3.f2374k = kVar;
            af.e eVar3 = new af.e(xVar3, 18);
            b bVar = eVar2.f2251a;
            Objects.requireNonNull(bVar);
            jVar.c(eVar3, new f(bVar, i11));
        }
    }

    public final void i(z zVar, int i10) {
        if (!this.f2258j.contains(zVar)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + zVar);
        } else {
            if (!zVar.f2395g) {
                Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + zVar);
                return;
            }
            if (Build.VERSION.SDK_INT >= 30) {
                s sVarC = zVar.c();
                l lVar = this.f2266r;
                if (sVarC == lVar && this.d != zVar) {
                    lVar.s(zVar.f2391b);
                    return;
                }
            }
            j(zVar, i10);
        }
    }

    public final void j(z zVar, int i10) {
        t tVar;
        if (this.d == zVar) {
            return;
        }
        if (this.f2271x != null) {
            this.f2271x = null;
            q qVar = this.f2272y;
            if (qVar != null) {
                qVar.h(3);
                this.f2272y.d();
                this.f2272y = null;
            }
        }
        if (f() && (tVar = zVar.f2390a.f2384e) != null && tVar.f2346b) {
            q qVarC = zVar.c().c(zVar.f2391b);
            if (qVarC != null) {
                Executor executorE = f0.e.e(this.h);
                a9.i iVar = this.E;
                synchronized (qVarC.f2326a) {
                    try {
                        if (executorE == null) {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                        if (iVar == null) {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                        qVarC.f2327b = executorE;
                        qVarC.f2328c = iVar;
                        ArrayList arrayList = qVarC.f2329e;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            n nVar = qVarC.d;
                            ArrayList arrayList2 = qVarC.f2329e;
                            qVarC.d = null;
                            qVarC.f2329e = null;
                            qVarC.f2327b.execute(new bf.e(qVarC, iVar, nVar, arrayList2, 1));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2271x = zVar;
                this.f2272y = qVarC;
                qVarC.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + zVar);
        }
        r rVarD = zVar.c().d(zVar.f2391b);
        if (rVarD != null) {
            rVarD.e();
        }
        if (this.d != null) {
            h(this, zVar, rVarD, i10, null, null);
            return;
        }
        this.d = zVar;
        this.f2254e = rVarD;
        Message messageObtainMessage = this.f2251a.obtainMessage(262, new q0.b(null, zVar));
        messageObtainMessage.arg1 = i10;
        messageObtainMessage.sendToTarget();
    }

    public final void k() {
        a9.i iVar;
        ArrayList arrayList;
        a9.i iVar2 = new a9.i(7, false);
        c0 c0Var = this.f2268t;
        long j10 = 0;
        c0Var.f2244b = 0L;
        c0Var.f2243a = false;
        c0Var.f2245c = SystemClock.elapsedRealtime();
        ((Handler) c0Var.d).removeCallbacks((af.e) c0Var.f2246e);
        ArrayList arrayList2 = this.f2257i;
        int size = arrayList2.size();
        int i10 = 0;
        boolean z10 = false;
        while (true) {
            size--;
            boolean z11 = this.f2264p;
            if (size < 0) {
                a9.i iVar3 = iVar2;
                long j11 = j10;
                c0 c0Var2 = this.f2268t;
                if (c0Var2.f2243a) {
                    long j12 = c0Var2.f2244b;
                    if (j12 > j11) {
                        ((Handler) c0Var2.d).postDelayed((af.e) c0Var2.f2246e, j12);
                    }
                }
                boolean z12 = c0Var2.f2243a;
                this.B = i10;
                u uVarM = z10 ? iVar3.M() : u.f2348c;
                u uVarM2 = iVar3.M();
                if (f()) {
                    o oVar = this.A;
                    if (oVar != null) {
                        oVar.a();
                        if (!oVar.f2316b.equals(uVarM2) || this.A.b() != z12) {
                            if (uVarM2.d() || z12) {
                                this.A = new o(uVarM2, z12);
                            } else if (this.A != null) {
                                this.A = null;
                            }
                            this.f2266r.h(this.A);
                        }
                    } else if (uVarM2.d()) {
                        this.A = new o(uVarM2, z12);
                        this.f2266r.h(this.A);
                    } else {
                        this.A = new o(uVarM2, z12);
                        this.f2266r.h(this.A);
                    }
                }
                o oVar2 = this.f2273z;
                if (oVar2 != null) {
                    oVar2.a();
                    if (oVar2.f2316b.equals(uVarM) && this.f2273z.b() == z12) {
                        return;
                    }
                }
                if (!uVarM.d() || z12) {
                    this.f2273z = new o(uVarM, z12);
                } else if (this.f2273z == null) {
                    return;
                } else {
                    this.f2273z = null;
                }
                if (z10 && !z12 && z11) {
                    Log.i("GlobalMediaRouter", "Forcing passive route discovery on a low-RAM device, system performance may be affected.  Please consider using CALLBACK_FLAG_REQUEST_DISCOVERY instead of CALLBACK_FLAG_FORCE_DISCOVERY.");
                }
                ArrayList arrayList3 = this.f2260l;
                int size2 = arrayList3.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj = arrayList3.get(i11);
                    i11++;
                    s sVar = ((y) obj).f2381a;
                    if (sVar != this.f2266r) {
                        sVar.h(this.f2273z);
                    }
                }
                return;
            }
            b0 b0Var = (b0) ((WeakReference) arrayList2.get(size)).get();
            if (b0Var == null) {
                arrayList2.remove(size);
            } else {
                ArrayList arrayList4 = b0Var.f2238b;
                int size3 = arrayList4.size();
                i10 += size3;
                int i12 = 0;
                while (i12 < size3) {
                    w wVar = (w) arrayList4.get(i12);
                    u uVar = wVar.f2356c;
                    if (uVar == null) {
                        throw new IllegalArgumentException("selector must not be null");
                    }
                    ArrayList arrayListC = uVar.c();
                    if (!arrayListC.isEmpty()) {
                        int size4 = arrayListC.size();
                        int i13 = 0;
                        while (i13 < size4) {
                            Object obj2 = arrayListC.get(i13);
                            i13++;
                            String str = (String) obj2;
                            if (str == null) {
                                throw new IllegalArgumentException("category must not be null");
                            }
                            if (((ArrayList) iVar2.f181b) == null) {
                                iVar2.f181b = new ArrayList();
                            }
                            if (!((ArrayList) iVar2.f181b).contains(str)) {
                                ((ArrayList) iVar2.f181b).add(str);
                            }
                        }
                    }
                    boolean z13 = (wVar.d & 1) != 0;
                    long j13 = wVar.f2357e;
                    c0 c0Var3 = this.f2268t;
                    if (z13) {
                        iVar = iVar2;
                        arrayList = arrayList2;
                        long j14 = c0Var3.f2245c;
                        if (j14 - j13 < 30000) {
                            c0Var3.f2244b = Math.max(c0Var3.f2244b, (j13 + 30000) - j14);
                            c0Var3.f2243a = true;
                        }
                    } else {
                        c0Var3.getClass();
                        iVar = iVar2;
                        arrayList = arrayList2;
                    }
                    if (z13) {
                        z10 = true;
                    }
                    int i14 = wVar.d;
                    if ((i14 & 4) != 0 && !z11) {
                        z10 = true;
                    }
                    if ((i14 & 8) != 0) {
                        z10 = true;
                    }
                    i12++;
                    j10 = j10;
                    iVar2 = iVar;
                    arrayList2 = arrayList;
                }
            }
            j10 = j10;
            iVar2 = iVar2;
            arrayList2 = arrayList2;
        }
    }

    public final void l() {
        z zVar = this.d;
        if (zVar == null) {
            a5.n nVar = this.C;
            if (nVar != null) {
                nVar.j();
                return;
            }
            return;
        }
        int i10 = zVar.f2403p;
        a1 a1Var = this.f2262n;
        a1Var.f2229a = i10;
        a1Var.f2230b = zVar.f2404q;
        a1Var.f2231c = (!zVar.e() || b0.g()) ? zVar.f2402o : 0;
        a1Var.d = this.d.f2400m;
        if (f() && this.d.c() == this.f2266r) {
            a1Var.f2232e = l.p(this.f2254e);
        } else {
            a1Var.f2232e = null;
        }
        ArrayList arrayList = this.f2261m;
        if (arrayList.size() > 0) {
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        a5.n nVar2 = this.C;
        if (nVar2 != null) {
            z zVar2 = this.d;
            z zVar3 = this.v;
            if (zVar3 == null) {
                throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
            }
            if (zVar2 == zVar3 || zVar2 == this.f2270w) {
                nVar2.j();
                return;
            }
            int i11 = a1Var.f2231c == 1 ? 2 : 0;
            int i12 = a1Var.f2230b;
            int i13 = a1Var.f2229a;
            String str = (String) a1Var.f2232e;
            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) nVar2.f100b;
            if (d0Var != null) {
                h1 h1Var = (h1) nVar2.f101c;
                if (h1Var != null && i11 == 0 && i12 == 0) {
                    h1Var.f413c = i13;
                    y1.g.a(h1Var.c(), i13);
                    return;
                }
                h1 h1Var2 = new h1();
                h1Var2.f415f = nVar2;
                h1Var2.f411a = i11;
                h1Var2.f412b = i12;
                h1Var2.f413c = i13;
                h1Var2.d = str;
                nVar2.f101c = h1Var2;
                d0Var.f818a.f843a.setPlaybackToRemote(h1Var2.c());
            }
        }
    }

    public final void m(y yVar, t tVar) {
        boolean z10;
        int i10;
        Iterator it;
        boolean z11;
        t tVar2 = yVar.f2384e;
        ArrayList arrayList = yVar.f2382b;
        if (tVar2 != tVar) {
            yVar.f2384e = tVar;
            ArrayList arrayList2 = this.f2258j;
            b bVar = this.f2251a;
            if (tVar != null) {
                List list = (List) tVar.f2347c;
                int size = list.size();
                int i11 = 0;
                while (true) {
                    if (i11 < size) {
                        n nVar = (n) list.get(i11);
                        if (nVar != null && nVar.e()) {
                            i11++;
                        } else if (tVar != ((t) this.f2267s.f2344n)) {
                            z10 = false;
                            Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + tVar);
                            i10 = 0;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    Iterator it2 = list.iterator();
                    int i12 = 0;
                    boolean z12 = false;
                    while (it2.hasNext()) {
                        n nVar2 = (n) it2.next();
                        if (nVar2 == null || !nVar2.e()) {
                            it = it2;
                            z11 = z12;
                            Log.w("GlobalMediaRouter", "Ignoring invalid route descriptor: " + nVar2);
                        } else {
                            String strD = nVar2.d();
                            int size2 = arrayList.size();
                            int i13 = 0;
                            while (true) {
                                if (i13 >= size2) {
                                    i13 = -1;
                                    break;
                                } else if (((z) arrayList.get(i13)).f2391b.equals(strD)) {
                                    break;
                                } else {
                                    i13++;
                                }
                            }
                            if (i13 < 0) {
                                it = it2;
                                z11 = z12;
                                z zVar = new z(yVar, strD, b(yVar, strD), nVar2.f2312a.getBoolean("isSystemRoute", false));
                                int i14 = i12 + 1;
                                arrayList.add(i12, zVar);
                                arrayList2.add(zVar);
                                if (nVar2.c().isEmpty()) {
                                    zVar.i(nVar2);
                                    bVar.b(257, zVar);
                                } else {
                                    arrayList3.add(new q0.b(zVar, nVar2));
                                }
                                i12 = i14;
                            } else {
                                it = it2;
                                z11 = z12;
                                if (i13 < i12) {
                                    Log.w("GlobalMediaRouter", "Ignoring route descriptor with duplicate id: " + nVar2);
                                } else {
                                    z zVar2 = (z) arrayList.get(i13);
                                    int i15 = i12 + 1;
                                    Collections.swap(arrayList, i13, i12);
                                    if (!nVar2.c().isEmpty()) {
                                        arrayList4.add(new q0.b(zVar2, nVar2));
                                    } else if (n(zVar2, nVar2) != 0 && zVar2 == this.d) {
                                        i12 = i15;
                                        z11 = true;
                                    }
                                    i12 = i15;
                                }
                            }
                        }
                        it2 = it;
                        z12 = z11;
                    }
                    boolean z13 = z12;
                    int i16 = 0;
                    int size3 = arrayList3.size();
                    int i17 = 0;
                    while (i17 < size3) {
                        Object obj = arrayList3.get(i17);
                        i17++;
                        q0.b bVar2 = (q0.b) obj;
                        z zVar3 = (z) bVar2.f46057a;
                        zVar3.i((n) bVar2.f46058b);
                        bVar.b(257, zVar3);
                    }
                    int size4 = arrayList4.size();
                    boolean z14 = z13;
                    while (i16 < size4) {
                        Object obj2 = arrayList4.get(i16);
                        i16++;
                        q0.b bVar3 = (q0.b) obj2;
                        z zVar4 = (z) bVar3.f46057a;
                        if (n(zVar4, (n) bVar3.f46058b) != 0 && zVar4 == this.d) {
                            z14 = true;
                        }
                    }
                    z10 = z14;
                    i10 = i12;
                }
            } else {
                z10 = false;
                Log.w("GlobalMediaRouter", "Ignoring invalid provider descriptor: " + tVar);
                i10 = 0;
            }
            for (int size5 = arrayList.size() - 1; size5 >= i10; size5--) {
                z zVar5 = (z) arrayList.get(size5);
                zVar5.i(null);
                arrayList2.remove(zVar5);
            }
            o(z10);
            for (int size6 = arrayList.size() - 1; size6 >= i10; size6--) {
                bVar.b(258, (z) arrayList.remove(size6));
            }
            bVar.b(515, yVar);
        }
    }

    public final int n(z zVar, n nVar) {
        int i10 = zVar.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f2251a;
            if (i11 != 0) {
                bVar.b(259, zVar);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, zVar);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, zVar);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        z zVar = this.v;
        if (zVar != null && !zVar.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        z zVar2 = this.v;
        o0 o0Var = this.f2267s;
        ArrayList arrayList = this.f2258j;
        if (zVar2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                z zVar3 = (z) obj;
                if (zVar3.c() == o0Var && zVar3.f2391b.equals("DEFAULT_ROUTE") && zVar3.f()) {
                    this.v = zVar3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        z zVar4 = this.f2270w;
        if (zVar4 != null && !zVar4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f2270w);
            this.f2270w = null;
        }
        if (this.f2270w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = arrayList.get(i11);
                i11++;
                z zVar5 = (z) obj2;
                if (zVar5.c() == o0Var && zVar5.m("android.media.intent.category.LIVE_AUDIO") && !zVar5.m("android.media.intent.category.LIVE_VIDEO") && zVar5.f()) {
                    this.f2270w = zVar5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f2270w);
                    break;
                }
            }
        }
        z zVar6 = this.d;
        if (zVar6 == null || !zVar6.f2395g) {
            Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
            j(c(), 0);
            return;
        }
        if (z10) {
            g();
            l();
        }
    }
}
