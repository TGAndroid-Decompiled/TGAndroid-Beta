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
import org.telegram.ui.ai;
public final class e {
    public static final int F = 0;
    public o A;
    public int B;
    public af.d C;
    public android.support.v4.media.session.c0 D;
    public final androidx.biometric.e0 E;
    public final a1 f1940c;
    public b0 d;
    public s e;
    public com.google.android.gms.internal.cast.o f1941f;
    public z f1942g;
    public final Context h;
    public final b1 f1948n;
    public final ja.c f1949o;
    public final boolean f1950p;
    public final boolean f1951q;
    public l f1952r;
    public final q0 f1953s;
    public final e0 f1954t;
    public g0 f1955u;
    public b0 v;
    public b0 f1956w;
    public b0 f1957x;
    public r f1958y;
    public o f1959z;
    public final b f1938a = new b(this);
    public final HashMap f1939b = new HashMap();
    public final ArrayList f1943i = new ArrayList();
    public final ArrayList f1944j = new ArrayList();
    public final HashMap f1945k = new HashMap();
    public final ArrayList f1946l = new ArrayList();
    public final ArrayList f1947m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.<init>(android.content.Context):void");
    }

    public final void a(t tVar, boolean z4) {
        if (d(tVar) == null) {
            a0 a0Var = new a0(tVar, z4);
            this.f1946l.add(a0Var);
            this.f1938a.b(513, a0Var);
            m(a0Var, (u) tVar.f2028n);
            d0.b();
            tVar.f2027f = this.f1949o;
            tVar.h(this.f1959z);
        }
    }

    public final String b(a0 a0Var, String str) {
        String z4;
        String flattenToShortString = ((ComponentName) a0Var.d.f16439b).flattenToShortString();
        boolean z10 = a0Var.f1900c;
        if (z10) {
            z4 = str;
        } else {
            z4 = android.support.v4.media.a.z(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f1945k;
        if (!z10) {
            ArrayList arrayList = this.f1944j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((b0) arrayList.get(i10)).f1911c.equals(z4)) {
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    break;
                }
            }
            if (i10 >= 0) {
                Log.w("GlobalMediaRouter", ai.k("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i11 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = z4 + "_" + i11;
                    int size2 = arrayList.size();
                    int i12 = 0;
                    while (true) {
                        if (i12 < size2) {
                            if (((b0) arrayList.get(i12)).f1911c.equals(str2)) {
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

    public final b0 c() {
        ArrayList arrayList = this.f1944j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            b0 b0Var = (b0) obj;
            if (b0Var != this.v && b0Var.c() == this.f1953s && b0Var.m("android.media.intent.category.LIVE_AUDIO") && !b0Var.m("android.media.intent.category.LIVE_VIDEO") && b0Var.f()) {
                return b0Var;
            }
        }
        return this.v;
    }

    public final a0 d(t tVar) {
        ArrayList arrayList = this.f1946l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var.f1898a == tVar) {
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
        if (this.f1951q) {
            g0 g0Var = this.f1955u;
            if (g0Var == null || g0Var.f1970b) {
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
                hashSet.add(b0Var.f1911c);
            }
            HashMap hashMap = this.f1939b;
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
                if (!hashMap.containsKey(b0Var2.f1911c)) {
                    s e = b0Var2.c().e(b0Var2.f1910b, this.d.f1910b);
                    e.e();
                    hashMap.put(b0Var2.f1911c, e);
                }
            }
        }
    }

    public final void h(e eVar, b0 b0Var, s sVar, int i10, b0 b0Var2, Collection collection) {
        com.google.android.gms.internal.cast.o oVar;
        z zVar = this.f1942g;
        if (zVar != null) {
            zVar.a();
            this.f1942g = null;
        }
        z zVar2 = new z(eVar, b0Var, sVar, i10, b0Var2, collection);
        this.f1942g = zVar2;
        if (zVar2.f2062b == 3 && (oVar = this.f1941f) != null) {
            b0 b0Var3 = this.d;
            b0 b0Var4 = (b0) zVar2.f2065g;
            com.google.android.gms.internal.cast.o.f3094c.b("Prepare transfer from Route(%s) to Route(%s)", b0Var3, b0Var4);
            ?? obj = new Object();
            obj.f1880c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f1883b;
            obj.f1879b = kVar;
            obj.f1878a = com.google.android.gms.internal.cast.n.class;
            try {
                obj.f1878a = Boolean.valueOf(oVar.f3096b.post(new p(oVar, b0Var3, b0Var4, obj, false, 2)));
            } catch (Exception e) {
                jVar.l(e);
            }
            z zVar3 = this.f1942g;
            e eVar2 = (e) ((WeakReference) zVar3.f2067j).get();
            if (eVar2 != null && eVar2.f1942g == zVar3) {
                if (((c0.k) zVar3.f2068k) == null) {
                    zVar3.f2068k = kVar;
                    ag.d dVar = new ag.d(zVar3, 11);
                    b bVar = eVar2.f1938a;
                    Objects.requireNonNull(bVar);
                    jVar.c(dVar, new f(bVar, 1));
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
        if (!this.f1944j.contains(b0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + b0Var);
        } else if (!b0Var.f1913g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + b0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = b0Var.c();
                l lVar = this.f1952r;
                if (c3 == lVar && this.d != b0Var) {
                    lVar.s(b0Var.f1910b);
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
        if (this.f1957x != null) {
            this.f1957x = null;
            r rVar = this.f1958y;
            if (rVar != null) {
                rVar.h(3);
                this.f1958y.d();
                this.f1958y = null;
            }
        }
        if (f() && (uVar = b0Var.f1909a.e) != null && uVar.f2036b) {
            r c3 = b0Var.c().c(b0Var.f1910b);
            if (c3 != null) {
                Executor e = f0.f.e(this.h);
                androidx.biometric.e0 e0Var = this.E;
                synchronized (c3.f2019a) {
                    try {
                        if (e != null) {
                            if (e0Var != null) {
                                c3.f2020b = e;
                                c3.f2021c = e0Var;
                                ArrayList arrayList = c3.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    n nVar = c3.d;
                                    ArrayList arrayList2 = c3.e;
                                    c3.d = null;
                                    c3.e = null;
                                    c3.f2020b.execute(new p(c3, e0Var, nVar, arrayList2, 0));
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
                this.f1957x = b0Var;
                this.f1958y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + b0Var);
        }
        s d = b0Var.c().d(b0Var.f1910b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = b0Var;
            this.e = d;
            Message obtainMessage = this.f1938a.obtainMessage(262, new q0.b(null, b0Var));
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
            int i11 = b0Var.f1921p;
            b1 b1Var = this.f1948n;
            b1Var.f1928a = i11;
            b1Var.f1929b = b0Var.f1922q;
            int i12 = 0;
            if (b0Var.e() && !d0.g()) {
                i10 = 0;
            } else {
                i10 = b0Var.f1920o;
            }
            b1Var.f1930c = i10;
            b1Var.d = this.d.f1918m;
            if (f() && this.d.c() == this.f1952r) {
                b1Var.e = l.p(this.e);
            } else {
                b1Var.e = null;
            }
            ArrayList arrayList = this.f1947m;
            if (arrayList.size() <= 0) {
                af.d dVar = this.C;
                if (dVar != null) {
                    b0 b0Var2 = this.d;
                    b0 b0Var3 = this.v;
                    if (b0Var3 != null) {
                        if (b0Var2 != b0Var3 && b0Var2 != this.f1956w) {
                            if (b1Var.f1930c == 1) {
                                i12 = 2;
                            }
                            int i13 = b1Var.f1929b;
                            int i14 = b1Var.f1928a;
                            String str = (String) b1Var.e;
                            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) dVar.f159b;
                            if (c0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) dVar.f160c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f793c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f794f = dVar;
                                obj.f791a = i12;
                                obj.f792b = i13;
                                obj.f793c = i14;
                                obj.d = str;
                                dVar.f160c = obj;
                                c0Var.f261a.f283a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        dVar.k();
                        return;
                    }
                    throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
                }
                return;
            }
            ((d) arrayList.get(0)).getClass();
            throw null;
        }
        af.d dVar2 = this.C;
        if (dVar2 != null) {
            dVar2.k();
        }
    }

    public final void m(c2.a0 r20, c2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.m(c2.a0, c2.u):void");
    }

    public final int n(b0 b0Var, n nVar) {
        int i10 = b0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f1938a;
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

    public final void o(boolean z4) {
        b0 b0Var = this.v;
        if (b0Var != null && !b0Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        b0 b0Var2 = this.v;
        q0 q0Var = this.f1953s;
        ArrayList arrayList = this.f1944j;
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
                if (b0Var3.c() == q0Var && b0Var3.f1910b.equals("DEFAULT_ROUTE") && b0Var3.f()) {
                    this.v = b0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        b0 b0Var4 = this.f1956w;
        if (b0Var4 != null && !b0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f1956w);
            this.f1956w = null;
        }
        if (this.f1956w == null) {
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
                    this.f1956w = b0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f1956w);
                    break;
                }
            }
        }
        b0 b0Var6 = this.d;
        if (b0Var6 != null && b0Var6.f1913g) {
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
