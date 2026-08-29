package c2;

import ag.o1;
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
import org.telegram.ui.th;
public final class e {
    public static final int F = 0;
    public o A;
    public int B;
    public androidx.biometric.e C;
    public android.support.v4.media.session.d0 D;
    public final o1 E;
    public final b1 f2806c;
    public b0 d;
    public s f2807e;
    public com.google.android.gms.internal.cast.p f2808f;
    public z f2809g;
    public final Context h;
    public final a4.k f2815n;
    public final ha.c f2816o;
    public final boolean f2817p;
    public final boolean f2818q;
    public l f2819r;
    public final q0 f2820s;
    public final e0 f2821t;
    public g0 f2822u;
    public b0 v;
    public b0 f2823w;
    public b0 f2824x;
    public r f2825y;
    public o f2826z;
    public final b f2804a = new b(this);
    public final HashMap f2805b = new HashMap();
    public final ArrayList f2810i = new ArrayList();
    public final ArrayList f2811j = new ArrayList();
    public final HashMap f2812k = new HashMap();
    public final ArrayList f2813l = new ArrayList();
    public final ArrayList f2814m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.<init>(android.content.Context):void");
    }

    public final void a(t tVar, boolean z10) {
        if (d(tVar) == null) {
            a0 a0Var = new a0(tVar, z10);
            this.f2813l.add(a0Var);
            this.f2804a.b(513, a0Var);
            m(a0Var, (u) tVar.f2902n);
            d0.b();
            tVar.f2901f = this.f2816o;
            tVar.h(this.f2826z);
        }
    }

    public final String b(a0 a0Var, String str) {
        String y8;
        String flattenToShortString = ((ComponentName) a0Var.d.f16880b).flattenToShortString();
        boolean z10 = a0Var.f2761c;
        if (z10) {
            y8 = str;
        } else {
            y8 = a4.w.y(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f2812k;
        if (!z10) {
            ArrayList arrayList = this.f2811j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((b0) arrayList.get(i10)).f2773c.equals(y8)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", th.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = y8 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((b0) arrayList.get(i12)).f2773c.equals(str2)) {
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
        hashMap.put(new q0.b(flattenToShortString, str), y8);
        return y8;
    }

    public final b0 c() {
        ArrayList arrayList = this.f2811j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var != this.v && b0Var.c() == this.f2820s && b0Var.m("android.media.intent.category.LIVE_AUDIO") && !b0Var.m("android.media.intent.category.LIVE_VIDEO") && b0Var.f()) {
                return b0Var;
            }
        }
        return this.v;
    }

    public final a0 d(t tVar) {
        ArrayList arrayList = this.f2813l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.f2759a == tVar) {
                return a0Var;
            }
        }
        return null;
    }

    public final b0 e() {
        b0 b0Var = this.d;
        if (b0Var != null) {
            return b0Var;
        }
        throw new IllegalStateException("There is no currently selected route.  The media router has not yet been fully initialized.");
    }

    public final boolean f() {
        if (this.f2818q) {
            g0 g0Var = this.f2822u;
            if (g0Var == null || g0Var.f2839b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<b0> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (b0 b0Var : unmodifiableList) {
                hashSet.add(b0Var.f2773c);
            }
            HashMap hashMap = this.f2805b;
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
            for (b0 b0Var2 : unmodifiableList) {
                if (!hashMap.containsKey(b0Var2.f2773c)) {
                    s e10 = b0Var2.c().e(b0Var2.f2772b, this.d.f2772b);
                    e10.e();
                    hashMap.put(b0Var2.f2773c, e10);
                }
            }
        }
    }

    public final void h(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        com.google.android.gms.internal.cast.p pVar;
        z zVar = this.f2809g;
        if (zVar != null) {
            zVar.a();
            this.f2809g = null;
        }
        z zVar2 = new z(eVar, b0Var, sVar, i10, b0Var2, collection);
        this.f2809g = zVar2;
        if (zVar2.f2933b == 3 && (pVar = this.f2808f) != null) {
            b0 b0Var3 = this.d;
            b0 b0Var4 = (b0) zVar2.f2937g;
            com.google.android.gms.internal.cast.p.f4221c.b("Prepare transfer from Route(%s) to Route(%s)", b0Var3, b0Var4);
            ?? obj = new Object();
            obj.f2743c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f2746b;
            obj.f2742b = kVar;
            obj.f2741a = com.google.android.gms.internal.cast.o.class;
            try {
                obj.f2741a = Boolean.valueOf(pVar.f4223b.post(new p(pVar, b0Var3, b0Var4, obj, false, 2)));
            } catch (Exception e10) {
                jVar.l(e10);
            }
            z zVar3 = this.f2809g;
            e eVar2 = (e) ((WeakReference) zVar3.f2939j).get();
            if (eVar2 != null && eVar2.f2809g == zVar3) {
                if (((c0.k) zVar3.f2940k) == null) {
                    zVar3.f2940k = kVar;
                    a4.g gVar = new a4.g(zVar3, 24);
                    b bVar = eVar2.f2804a;
                    Objects.requireNonNull(bVar);
                    jVar.c(gVar, new f(bVar, 1));
                    return;
                }
                throw new IllegalStateException("future is already set");
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            zVar3.a();
            return;
        }
        zVar2.b();
    }

    public final void i(b0 b0Var, int i10) {
        if (!this.f2811j.contains(b0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + b0Var);
        } else if (!b0Var.f2776g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + b0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = b0Var.c();
                l lVar = this.f2819r;
                if (c3 == lVar && this.d != b0Var) {
                    lVar.s(b0Var.f2772b);
                    return;
                }
            }
            j(b0Var, i10);
        }
    }

    public final void j(b0 b0Var, int i10) {
        u uVar;
        if (this.d == b0Var) {
            return;
        }
        if (this.f2824x != null) {
            this.f2824x = null;
            r rVar = this.f2825y;
            if (rVar != null) {
                rVar.h(3);
                this.f2825y.d();
                this.f2825y = null;
            }
        }
        if (f() && (uVar = b0Var.f2771a.f2762e) != null && uVar.f2911b) {
            r c3 = b0Var.c().c(b0Var.f2772b);
            if (c3 != null) {
                Executor e10 = f0.e.e(this.h);
                o1 o1Var = this.E;
                synchronized (c3.f2891a) {
                    try {
                        if (e10 != null) {
                            if (o1Var != null) {
                                c3.f2892b = e10;
                                c3.f2893c = o1Var;
                                ArrayList arrayList = c3.f2894e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    n nVar = c3.d;
                                    ArrayList arrayList2 = c3.f2894e;
                                    c3.d = null;
                                    c3.f2894e = null;
                                    c3.f2892b.execute(new p(c3, o1Var, nVar, arrayList2, 0));
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
                this.f2824x = b0Var;
                this.f2825y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + b0Var);
        }
        s d = b0Var.c().d(b0Var.f2772b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = b0Var;
            this.f2807e = d;
            Message obtainMessage = this.f2804a.obtainMessage(262, new q0.b(null, b0Var));
            obtainMessage.arg1 = i10;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, b0Var, d, i10, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.k():void");
    }

    public final void l() {
        int i10;
        b0 b0Var = this.d;
        if (b0Var != null) {
            int i11 = b0Var.f2784p;
            a4.k kVar = this.f2815n;
            kVar.f95a = i11;
            kVar.f96b = b0Var.f2785q;
            int i12 = 0;
            if (b0Var.e() && !d0.g()) {
                i10 = 0;
            } else {
                i10 = b0Var.f2783o;
            }
            kVar.f97c = i10;
            kVar.d = this.d.f2781m;
            if (f() && this.d.c() == this.f2819r) {
                kVar.f98e = l.p(this.f2807e);
            } else {
                kVar.f98e = null;
            }
            ArrayList arrayList = this.f2814m;
            if (arrayList.size() <= 0) {
                androidx.biometric.e eVar = this.C;
                if (eVar != null) {
                    b0 b0Var2 = this.d;
                    b0 b0Var3 = this.v;
                    if (b0Var3 != null) {
                        if (b0Var2 != b0Var3 && b0Var2 != this.f2823w) {
                            if (kVar.f97c == 1) {
                                i12 = 2;
                            }
                            int i13 = kVar.f96b;
                            int i14 = kVar.f95a;
                            String str = (String) kVar.f98e;
                            android.support.v4.media.session.d0 d0Var = (android.support.v4.media.session.d0) eVar.f1030b;
                            if (d0Var != null) {
                                androidx.emoji2.text.o oVar = (androidx.emoji2.text.o) eVar.f1031c;
                                if (oVar != null && i12 == 0 && i13 == 0) {
                                    oVar.f1367c = i14;
                                    y1.g.a(oVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f1369f = eVar;
                                obj.f1365a = i12;
                                obj.f1366b = i13;
                                obj.f1367c = i14;
                                obj.d = str;
                                eVar.f1031c = obj;
                                d0Var.f805a.f830a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        eVar.g();
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
            eVar2.g();
        }
    }

    public final void m(c2.a0 r20, c2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.m(c2.a0, c2.u):void");
    }

    public final int n(b0 b0Var, n nVar) {
        int i10 = b0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f2804a;
            if (i11 != 0) {
                bVar.b(259, b0Var);
            }
            if ((i10 & 2) != 0) {
                bVar.b(260, b0Var);
            }
            if ((i10 & 4) != 0) {
                bVar.b(261, b0Var);
            }
        }
        return i10;
    }

    public final void o(boolean z10) {
        b0 b0Var = this.v;
        if (b0Var != null && !b0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        b0 b0Var2 = this.v;
        q0 q0Var = this.f2820s;
        ArrayList arrayList = this.f2811j;
        if (b0Var2 == null) {
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                b0 b0Var3 = (b0) obj;
                if (b0Var3.c() == q0Var && b0Var3.f2772b.equals("DEFAULT_ROUTE") && b0Var3.f()) {
                    this.v = b0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        b0 b0Var4 = this.f2823w;
        if (b0Var4 != null && !b0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f2823w);
            this.f2823w = null;
        }
        if (this.f2823w == null) {
            int size2 = arrayList.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i11);
                i11++;
                b0 b0Var5 = (b0) obj2;
                if (b0Var5.c() == q0Var && b0Var5.m("android.media.intent.category.LIVE_AUDIO") && !b0Var5.m("android.media.intent.category.LIVE_VIDEO") && b0Var5.f()) {
                    this.f2823w = b0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f2823w);
                    break;
                }
            }
        }
        b0 b0Var6 = this.d;
        if (b0Var6 != null && b0Var6.f2776g) {
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
