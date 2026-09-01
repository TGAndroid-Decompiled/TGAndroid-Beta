package c2;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import org.telegram.ui.yh;
public final class e {
    public static final int F = 0;
    public o A;
    public int B;
    public androidx.biometric.e C;
    public android.support.v4.media.session.c0 D;
    public final androidx.biometric.f0 E;
    public final z0 f2078c;
    public a0 d;
    public s f2079e;
    public com.google.android.gms.internal.cast.n f2080f;
    public y f2081g;
    public final Context h;
    public final a1 f2087n;
    public final o5.i f2088o;
    public final boolean f2089p;
    public final boolean f2090q;
    public l f2091r;
    public final p0 f2092s;
    public final d0 f2093t;
    public f0 f2094u;
    public a0 v;
    public a0 f2095w;
    public a0 f2096x;
    public r f2097y;
    public o f2098z;
    public final b f2076a = new b(this);
    public final HashMap f2077b = new HashMap();
    public final ArrayList f2082i = new ArrayList();
    public final ArrayList f2083j = new ArrayList();
    public final HashMap f2084k = new HashMap();
    public final ArrayList f2085l = new ArrayList();
    public final ArrayList f2086m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.<init>(android.content.Context):void");
    }

    public final void a(t tVar, boolean z4) {
        if (d(tVar) == null) {
            z zVar = new z(tVar, z4);
            this.f2085l.add(zVar);
            this.f2076a.b(513, zVar);
            m(zVar, (u) tVar.f2177n);
            c0.b();
            tVar.f2176f = this.f2088o;
            tVar.h(this.f2098z);
        }
    }

    public final String b(z zVar, String str) {
        String z4;
        String flattenToShortString = ((ComponentName) zVar.d.f50777b).flattenToShortString();
        boolean z10 = zVar.f2221c;
        if (z10) {
            z4 = str;
        } else {
            z4 = android.support.v4.media.a.z(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f2084k;
        if (!z10) {
            ArrayList arrayList = this.f2083j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((a0) arrayList.get(i10)).f2040c.equals(z4)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", yh.l("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = z4 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((a0) arrayList.get(i12)).f2040c.equals(str2)) {
                                break;
                            }
                            i12++;
                        } else {
                            i12 = -1;
                            break;
                        }
                    }
                    if (i12 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i11++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), z4);
        return z4;
    }

    public final a0 c() {
        ArrayList arrayList = this.f2083j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var != this.v && a0Var.c() == this.f2092s && a0Var.m("android.media.intent.category.LIVE_AUDIO") && !a0Var.m("android.media.intent.category.LIVE_VIDEO") && a0Var.f()) {
                return a0Var;
            }
        }
        return this.v;
    }

    public final z d(t tVar) {
        ArrayList arrayList = this.f2085l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar.f2219a == tVar) {
                return zVar;
            }
        }
        return null;
    }

    public final a0 e() {
        a0 a0Var = this.d;
        if (a0Var != null) {
            return a0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (this.f2090q) {
            f0 f0Var = this.f2094u;
            if (f0Var == null || f0Var.f2106b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<a0> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (a0 a0Var : unmodifiableList) {
                hashSet.add(a0Var.f2040c);
            }
            HashMap hashMap = this.f2077b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    s sVar = (s) entry.getValue();
                    sVar.h(0);
                    sVar.d();
                    it.remove();
                }
            }
            for (a0 a0Var2 : unmodifiableList) {
                if (!hashMap.containsKey(a0Var2.f2040c)) {
                    s e6 = a0Var2.c().e(a0Var2.f2039b, this.d.f2039b);
                    e6.e();
                    hashMap.put(a0Var2.f2040c, e6);
                }
            }
        }
    }

    public final void h(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        com.google.android.gms.internal.cast.n nVar;
        y yVar = this.f2081g;
        if (yVar != null) {
            yVar.a();
            this.f2081g = null;
        }
        y yVar2 = new y(eVar, a0Var, sVar, i10, a0Var2, collection);
        this.f2081g = yVar2;
        if (yVar2.f2206b == 3 && (nVar = this.f2080f) != null) {
            a0 a0Var3 = this.d;
            a0 a0Var4 = (a0) yVar2.f2210g;
            com.google.android.gms.internal.cast.n.f3059c.b("Prepare transfer from Route(%s) to Route(%s)", a0Var3, a0Var4);
            ?? obj = new Object();
            obj.f2019c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f2022b;
            obj.f2018b = kVar;
            obj.f2017a = androidx.activity.result.c.class;
            try {
                obj.f2017a = Boolean.valueOf(nVar.f3061b.post(new p(nVar, a0Var3, a0Var4, obj, false, 2)));
            } catch (Exception e6) {
                jVar.l(e6);
            }
            y yVar3 = this.f2081g;
            e eVar2 = (e) ((WeakReference) yVar3.f2212j).get();
            if (eVar2 != null && eVar2.f2081g == yVar3) {
                if (((c0.k) yVar3.f2213k) == null) {
                    yVar3.f2213k = kVar;
                    ag.e eVar3 = new ag.e(yVar3, 12);
                    b bVar = eVar2.f2076a;
                    Objects.requireNonNull(bVar);
                    jVar.c(eVar3, new f(bVar, 1));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            yVar3.a();
            return;
        }
        yVar2.b();
    }

    public final void i(a0 a0Var, int i10) {
        if (!this.f2083j.contains(a0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a0Var);
        } else if (!a0Var.f2043g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = a0Var.c();
                l lVar = this.f2091r;
                if (c3 == lVar && this.d != a0Var) {
                    lVar.s(a0Var.f2039b);
                    return;
                }
            }
            j(a0Var, i10);
        }
    }

    public final void j(a0 a0Var, int i10) {
        u uVar;
        if (this.d == a0Var) {
            return;
        }
        if (this.f2096x != null) {
            this.f2096x = null;
            r rVar = this.f2097y;
            if (rVar != null) {
                rVar.h(3);
                this.f2097y.d();
                this.f2097y = null;
            }
        }
        if (f() && (uVar = a0Var.f2038a.f2222e) != null && uVar.f2179b) {
            r c3 = a0Var.c().c(a0Var.f2039b);
            if (c3 != null) {
                Executor e6 = f0.e.e(this.h);
                androidx.biometric.f0 f0Var = this.E;
                synchronized (c3.f2159a) {
                    try {
                        if (e6 != null) {
                            if (f0Var != null) {
                                c3.f2160b = e6;
                                c3.f2161c = f0Var;
                                ArrayList arrayList = c3.f2162e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    n nVar = c3.d;
                                    ArrayList arrayList2 = c3.f2162e;
                                    c3.d = null;
                                    c3.f2162e = null;
                                    c3.f2160b.execute(new p(c3, f0Var, nVar, arrayList2, 0));
                                }
                            } else {
                                throw new NullPointerException("Listener shouldn't be null");
                            }
                        } else {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                this.f2096x = a0Var;
                this.f2097y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a0Var);
        }
        s d = a0Var.c().d(a0Var.f2039b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = a0Var;
            this.f2079e = d;
            Message obtainMessage = this.f2076a.obtainMessage(262, new q0.b(null, a0Var));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, a0Var, d, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.k():void");
    }

    public final void l() {
        int i10;
        a0 a0Var = this.d;
        if (a0Var != null) {
            int i11 = a0Var.f2051p;
            a1 a1Var = this.f2087n;
            a1Var.f2058a = i11;
            a1Var.f2059b = a0Var.f2052q;
            int i12 = 0;
            if (a0Var.e() && !c0.g()) {
                i10 = 0;
            } else {
                i10 = a0Var.f2050o;
            }
            a1Var.f2060c = i10;
            a1Var.d = this.d.f2048m;
            if (f() && this.d.c() == this.f2091r) {
                a1Var.f2061e = l.p(this.f2079e);
            } else {
                a1Var.f2061e = null;
            }
            ArrayList arrayList = this.f2086m;
            if (arrayList.size() <= 0) {
                androidx.biometric.e eVar = this.C;
                if (eVar != null) {
                    a0 a0Var2 = this.d;
                    a0 a0Var3 = this.v;
                    if (a0Var3 != null) {
                        if (a0Var2 != a0Var3 && a0Var2 != this.f2095w) {
                            if (a1Var.f2060c == 1) {
                                i12 = 2;
                            }
                            int i13 = a1Var.f2059b;
                            int i14 = a1Var.f2058a;
                            String str = (String) a1Var.f2061e;
                            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) eVar.f527b;
                            if (c0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) eVar.f528c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f849c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f851f = eVar;
                                obj.f847a = i12;
                                obj.f848b = i13;
                                obj.f849c = i14;
                                obj.d = str;
                                eVar.f528c = obj;
                                c0Var.f279a.f303a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        eVar.j();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        androidx.biometric.e eVar2 = this.C;
        if (eVar2 != null) {
            eVar2.j();
        }
    }

    public final void m(c2.z r20, c2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.m(c2.z, c2.u):void");
    }

    public final int n(a0 a0Var, n nVar) {
        int i10 = a0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f2076a;
            if (i11 != 0) {
                bVar.b(259, a0Var);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, a0Var);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, a0Var);
            }
        }
        return i10;
    }

    public final void o(boolean z4) {
        a0 a0Var = this.v;
        if (a0Var != null && !a0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        a0 a0Var2 = this.v;
        p0 p0Var = this.f2092s;
        ArrayList arrayList = this.f2083j;
        if (a0Var2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                a0 a0Var3 = (a0) obj;
                if (a0Var3.c() == p0Var && a0Var3.f2039b.equals("DEFAULT_ROUTE") && a0Var3.f()) {
                    this.v = a0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        a0 a0Var4 = this.f2095w;
        if (a0Var4 != null && !a0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f2095w);
            this.f2095w = null;
        }
        if (this.f2095w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                a0 a0Var5 = (a0) obj2;
                if (a0Var5.c() == p0Var && a0Var5.m("android.media.intent.category.LIVE_AUDIO") && !a0Var5.m("android.media.intent.category.LIVE_VIDEO") && a0Var5.f()) {
                    this.f2095w = a0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f2095w);
                    break;
                }
            }
        }
        a0 a0Var6 = this.d;
        if (a0Var6 != null && a0Var6.f2043g) {
            if (z4) {
                g();
                l();
                return;
            }
            return;
        }
        Log.i("GlobalMediaRouter", "Unselecting the current route because it is no longer selectable: " + this.d);
        j(c(), 0);
    }
}
