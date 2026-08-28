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
import org.telegram.ui.Cells.j2;
public final class e {
    public static final int F = 0;
    public o A;
    public int B;
    public a5.m C;
    public android.support.v4.media.session.d0 D;
    public final xa.c E;
    public final a1 f2136c;
    public a0 d;
    public r f2137e;
    public com.google.android.gms.internal.cast.p f2138f;
    public y f2139g;
    public final Context h;
    public final b1 f2145n;
    public final k5.i f2146o;
    public final boolean f2147p;
    public final boolean f2148q;
    public l f2149r;
    public final p0 f2150s;
    public final d0 f2151t;
    public f0 f2152u;
    public a0 v;
    public a0 f2153w;
    public a0 f2154x;
    public q f2155y;
    public o f2156z;
    public final b f2134a = new b(this);
    public final HashMap f2135b = new HashMap();
    public final ArrayList f2140i = new ArrayList();
    public final ArrayList f2141j = new ArrayList();
    public final HashMap f2142k = new HashMap();
    public final ArrayList f2143l = new ArrayList();
    public final ArrayList f2144m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.<init>(android.content.Context):void");
    }

    public final void a(s sVar, boolean z10) {
        if (d(sVar) == null) {
            z zVar = new z(sVar, z10);
            this.f2143l.add(zVar);
            this.f2134a.b(513, zVar);
            m(zVar, (t) sVar.f2224n);
            c0.b();
            sVar.f2223f = this.f2146o;
            sVar.h(this.f2156z);
        }
    }

    public final String b(z zVar, String str) {
        String z10;
        String flattenToShortString = ((ComponentName) zVar.d.f281b).flattenToShortString();
        boolean z11 = zVar.f2271c;
        if (z11) {
            z10 = str;
        } else {
            z10 = aa.d.z(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f2142k;
        if (!z11) {
            ArrayList arrayList = this.f2141j;
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 < size) {
                    if (((a0) arrayList.get(i9)).f2092c.equals(z10)) {
                        break;
                    }
                    i9++;
                } else {
                    i9 = -1;
                    break;
                }
            }
            if (i9 >= 0) {
                Log.w("GlobalMediaRouter", j2.h("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i10 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = z10 + "_" + i10;
                    int size2 = arrayList.size();
                    int i11 = 0;
                    while (true) {
                        if (i11 < size2) {
                            if (((a0) arrayList.get(i11)).f2092c.equals(str2)) {
                                break;
                            }
                            i11++;
                        } else {
                            i11 = -1;
                            break;
                        }
                    }
                    if (i11 < 0) {
                        hashMap.put(new q0.b(flattenToShortString, str), str2);
                        return str2;
                    }
                    i10++;
                }
            }
        }
        hashMap.put(new q0.b(flattenToShortString, str), z10);
        return z10;
    }

    public final a0 c() {
        ArrayList arrayList = this.f2141j;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            a0 a0Var = (a0) obj;
            if (a0Var != this.v && a0Var.c() == this.f2150s && a0Var.m("android.media.intent.category.LIVE_AUDIO") && !a0Var.m("android.media.intent.category.LIVE_VIDEO") && a0Var.f()) {
                return a0Var;
            }
        }
        return this.v;
    }

    public final z d(s sVar) {
        ArrayList arrayList = this.f2143l;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            z zVar = (z) obj;
            if (zVar.f2269a == sVar) {
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
        if (this.f2148q) {
            f0 f0Var = this.f2152u;
            if (f0Var == null || f0Var.f2164b) {
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
                hashSet.add(a0Var.f2092c);
            }
            HashMap hashMap = this.f2135b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    r rVar = (r) entry.getValue();
                    rVar.h(0);
                    rVar.d();
                    it.remove();
                }
            }
            for (a0 a0Var2 : unmodifiableList) {
                if (!hashMap.containsKey(a0Var2.f2092c)) {
                    r e10 = a0Var2.c().e(a0Var2.f2091b, this.d.f2091b);
                    e10.e();
                    hashMap.put(a0Var2.f2092c, e10);
                }
            }
        }
    }

    public final void h(e eVar, a0 a0Var, r rVar, int i9, a0 a0Var2, Collection collection) {
        com.google.android.gms.internal.cast.p pVar;
        y yVar = this.f2139g;
        if (yVar != null) {
            yVar.a();
            this.f2139g = null;
        }
        y yVar2 = new y(eVar, a0Var, rVar, i9, a0Var2, collection);
        this.f2139g = yVar2;
        if (yVar2.f2255b == 3 && (pVar = this.f2138f) != null) {
            a0 a0Var3 = this.d;
            a0 a0Var4 = (a0) yVar2.f2259g;
            com.google.android.gms.internal.cast.p.f3179c.b("Prepare transfer from Route(%s) to Route(%s)", a0Var3, a0Var4);
            ?? obj = new Object();
            obj.f2074c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f2077b;
            obj.f2073b = kVar;
            obj.f2072a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f2072a = Boolean.valueOf(pVar.f3181b.post(new af.f(pVar, a0Var3, a0Var4, obj, false, 3)));
            } catch (Exception e10) {
                jVar.l(e10);
            }
            y yVar3 = this.f2139g;
            e eVar2 = (e) ((WeakReference) yVar3.f2261j).get();
            if (eVar2 != null && eVar2.f2139g == yVar3) {
                if (((c0.k) yVar3.f2262k) == null) {
                    yVar3.f2262k = kVar;
                    af.e eVar3 = new af.e(yVar3, 18);
                    b bVar = eVar2.f2134a;
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

    public final void i(a0 a0Var, int i9) {
        if (!this.f2141j.contains(a0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a0Var);
        } else if (!a0Var.f2095g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                s c10 = a0Var.c();
                l lVar = this.f2149r;
                if (c10 == lVar && this.d != a0Var) {
                    lVar.s(a0Var.f2091b);
                    return;
                }
            }
            j(a0Var, i9);
        }
    }

    public final void j(a0 a0Var, int i9) {
        t tVar;
        if (this.d == a0Var) {
            return;
        }
        if (this.f2154x != null) {
            this.f2154x = null;
            q qVar = this.f2155y;
            if (qVar != null) {
                qVar.h(3);
                this.f2155y.d();
                this.f2155y = null;
            }
        }
        if (f() && (tVar = a0Var.f2090a.f2272e) != null && tVar.f2233b) {
            q c10 = a0Var.c().c(a0Var.f2091b);
            if (c10 != null) {
                Executor e10 = f0.e.e(this.h);
                xa.c cVar = this.E;
                synchronized (c10.f2213a) {
                    try {
                        if (e10 != null) {
                            if (cVar != null) {
                                c10.f2214b = e10;
                                c10.f2215c = cVar;
                                ArrayList arrayList = c10.f2216e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    n nVar = c10.d;
                                    ArrayList arrayList2 = c10.f2216e;
                                    c10.d = null;
                                    c10.f2216e = null;
                                    c10.f2214b.execute(new af.f(c10, cVar, nVar, arrayList2, 1));
                                }
                            } else {
                                throw new NullPointerException("Listener shouldn't be null");
                            }
                        } else {
                            throw new NullPointerException("Executor shouldn't be null");
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                this.f2154x = a0Var;
                this.f2155y = c10;
                c10.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a0Var);
        }
        r d = a0Var.c().d(a0Var.f2091b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = a0Var;
            this.f2137e = d;
            Message obtainMessage = this.f2134a.obtainMessage(262, new q0.b(null, a0Var));
            obtainMessage.arg1 = i9;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, a0Var, d, i9, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.k():void");
    }

    public final void l() {
        int i9;
        a0 a0Var = this.d;
        if (a0Var != null) {
            int i10 = a0Var.f2103p;
            b1 b1Var = this.f2145n;
            b1Var.f2119a = i10;
            b1Var.f2120b = a0Var.f2104q;
            int i11 = 0;
            if (a0Var.e() && !c0.g()) {
                i9 = 0;
            } else {
                i9 = a0Var.f2102o;
            }
            b1Var.f2121c = i9;
            b1Var.d = this.d.f2100m;
            if (f() && this.d.c() == this.f2149r) {
                b1Var.f2122e = l.p(this.f2137e);
            } else {
                b1Var.f2122e = null;
            }
            ArrayList arrayList = this.f2144m;
            if (arrayList.size() <= 0) {
                a5.m mVar = this.C;
                if (mVar != null) {
                    a0 a0Var2 = this.d;
                    a0 a0Var3 = this.v;
                    if (a0Var3 != null) {
                        if (a0Var2 != a0Var3 && a0Var2 != this.f2153w) {
                            if (b1Var.f2121c == 1) {
                                i11 = 2;
                            }
                            int i12 = b1Var.f2120b;
                            int i13 = b1Var.f2119a;
                            String str = (String) b1Var.f2122e;
                            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) mVar.f98b;
                            if (d0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) mVar.f99c;
                                if (oVar != null && i11 == 0 && i12 == 0) {
                                    oVar.f871c = i13;
                                    y1.g.a(oVar.c(), i13);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f873f = mVar;
                                obj.f869a = i11;
                                obj.f870b = i12;
                                obj.f871c = i13;
                                obj.d = str;
                                mVar.f99c = obj;
                                d0Var.f310a.f335a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        mVar.g();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        a5.m mVar2 = this.C;
        if (mVar2 != null) {
            mVar2.g();
        }
    }

    public final void m(c2.z r20, c2.t r21) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.m(c2.z, c2.t):void");
    }

    public final int n(a0 a0Var, n nVar) {
        int i9 = a0Var.i(nVar);
        if (i9 != 0) {
            int i10 = i9 & 1;
            b bVar = this.f2134a;
            if (i10 != 0) {
                bVar.b(259, a0Var);
            }
            if ((i9 & 2) != 0) {
                bVar.b(260, a0Var);
            }
            if ((i9 & 4) != 0) {
                bVar.b(261, a0Var);
            }
        }
        return i9;
    }

    public final void o(boolean z10) {
        a0 a0Var = this.v;
        if (a0Var != null && !a0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        a0 a0Var2 = this.v;
        p0 p0Var = this.f2150s;
        ArrayList arrayList = this.f2141j;
        if (a0Var2 == null) {
            int size = arrayList.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    break;
                }
                Object obj = arrayList.get(i9);
                i9++;
                a0 a0Var3 = (a0) obj;
                if (a0Var3.c() == p0Var && a0Var3.f2091b.equals("DEFAULT_ROUTE") && a0Var3.f()) {
                    this.v = a0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        a0 a0Var4 = this.f2153w;
        if (a0Var4 != null && !a0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f2153w);
            this.f2153w = null;
        }
        if (this.f2153w == null) {
            int size2 = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i10);
                i10++;
                a0 a0Var5 = (a0) obj2;
                if (a0Var5.c() == p0Var && a0Var5.m("android.media.intent.category.LIVE_AUDIO") && !a0Var5.m("android.media.intent.category.LIVE_VIDEO") && a0Var5.f()) {
                    this.f2153w = a0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f2153w);
                    break;
                }
            }
        }
        a0 a0Var6 = this.d;
        if (a0Var6 != null && a0Var6.f2095g) {
            if (z10) {
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
