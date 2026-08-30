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
    public final z0 f1913c;
    public a0 d;
    public s e;
    public com.google.android.gms.internal.cast.o f1914f;
    public y f1915g;
    public final Context h;
    public final a1 f1921n;
    public final ja.c f1922o;
    public final boolean f1923p;
    public final boolean f1924q;
    public l f1925r;
    public final p0 f1926s;
    public final d0 f1927t;
    public f0 f1928u;
    public a0 v;
    public a0 f1929w;
    public a0 f1930x;
    public r f1931y;
    public o f1932z;
    public final b f1911a = new b(this);
    public final HashMap f1912b = new HashMap();
    public final ArrayList f1916i = new ArrayList();
    public final ArrayList f1917j = new ArrayList();
    public final HashMap f1918k = new HashMap();
    public final ArrayList f1919l = new ArrayList();
    public final ArrayList f1920m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public e(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.<init>(android.content.Context):void");
    }

    public final void a(t tVar, boolean z4) {
        if (d(tVar) == null) {
            z zVar = new z(tVar, z4);
            this.f1919l.add(zVar);
            this.f1911a.b(513, zVar);
            m(zVar, (u) tVar.f2004n);
            c0.b();
            tVar.f2003f = this.f1922o;
            tVar.h(this.f1932z);
        }
    }

    public final String b(z zVar, String str) {
        String z4;
        String flattenToShortString = ((ComponentName) zVar.d.f16457b).flattenToShortString();
        boolean z10 = zVar.f2045c;
        if (z10) {
            z4 = str;
        } else {
            z4 = android.support.v4.media.a.z(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.f1918k;
        if (!z10) {
            ArrayList arrayList = this.f1917j;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    if (((a0) arrayList.get(i10)).f1878c.equals(z4)) {
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
                            if (((a0) arrayList.get(i12)).f1878c.equals(str2)) {
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
        ArrayList arrayList = this.f1917j;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            a0 a0Var = (a0) obj;
            if (a0Var != this.v && a0Var.c() == this.f1926s && a0Var.m("android.media.intent.category.LIVE_AUDIO") && !a0Var.m("android.media.intent.category.LIVE_VIDEO") && a0Var.f()) {
                return a0Var;
            }
        }
        return this.v;
    }

    public final z d(t tVar) {
        ArrayList arrayList = this.f1919l;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z zVar = (z) obj;
            if (zVar.f2043a == tVar) {
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
        if (this.f1924q) {
            f0 f0Var = this.f1928u;
            if (f0Var == null || f0Var.f1939b) {
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
                hashSet.add(a0Var.f1878c);
            }
            HashMap hashMap = this.f1912b;
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
                if (!hashMap.containsKey(a0Var2.f1878c)) {
                    s e = a0Var2.c().e(a0Var2.f1877b, this.d.f1877b);
                    e.e();
                    hashMap.put(a0Var2.f1878c, e);
                }
            }
        }
    }

    public final void h(e eVar, a0 a0Var, s sVar, int i10, a0 a0Var2, Collection collection) {
        com.google.android.gms.internal.cast.o oVar;
        y yVar = this.f1915g;
        if (yVar != null) {
            yVar.a();
            this.f1915g = null;
        }
        y yVar2 = new y(eVar, a0Var, sVar, i10, a0Var2, collection);
        this.f1915g = yVar2;
        if (yVar2.f2031b == 3 && (oVar = this.f1914f) != null) {
            a0 a0Var3 = this.d;
            a0 a0Var4 = (a0) yVar2.f2034g;
            com.google.android.gms.internal.cast.o.f3111c.b("Prepare transfer from Route(%s) to Route(%s)", a0Var3, a0Var4);
            ?? obj = new Object();
            obj.f1858c = new Object();
            c0.k kVar = new c0.k(obj);
            c0.j jVar = kVar.f1861b;
            obj.f1857b = kVar;
            obj.f1856a = com.google.android.gms.internal.cast.n.class;
            try {
                obj.f1856a = Boolean.valueOf(oVar.f3113b.post(new p(oVar, a0Var3, a0Var4, obj, false, 2)));
            } catch (Exception e) {
                jVar.l(e);
            }
            y yVar3 = this.f1915g;
            e eVar2 = (e) ((WeakReference) yVar3.f2036j).get();
            if (eVar2 != null && eVar2.f1915g == yVar3) {
                if (((c0.k) yVar3.f2037k) == null) {
                    yVar3.f2037k = kVar;
                    ag.d dVar = new ag.d(yVar3, 11);
                    b bVar = eVar2.f1911a;
                    Objects.requireNonNull(bVar);
                    jVar.c(dVar, new f(bVar, 1));
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
        if (!this.f1917j.contains(a0Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + a0Var);
        } else if (!a0Var.f1880g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + a0Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                t c3 = a0Var.c();
                l lVar = this.f1925r;
                if (c3 == lVar && this.d != a0Var) {
                    lVar.s(a0Var.f1877b);
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
        if (this.f1930x != null) {
            this.f1930x = null;
            r rVar = this.f1931y;
            if (rVar != null) {
                rVar.h(3);
                this.f1931y.d();
                this.f1931y = null;
            }
        }
        if (f() && (uVar = a0Var.f1876a.e) != null && uVar.f2006b) {
            r c3 = a0Var.c().c(a0Var.f1877b);
            if (c3 != null) {
                Executor e = f0.f.e(this.h);
                androidx.biometric.f0 f0Var = this.E;
                synchronized (c3.f1989a) {
                    try {
                        if (e != null) {
                            if (f0Var != null) {
                                c3.f1990b = e;
                                c3.f1991c = f0Var;
                                ArrayList arrayList = c3.e;
                                if (arrayList != null && !arrayList.isEmpty()) {
                                    n nVar = c3.d;
                                    ArrayList arrayList2 = c3.e;
                                    c3.d = null;
                                    c3.e = null;
                                    c3.f1990b.execute(new p(c3, f0Var, nVar, arrayList2, 0));
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
                this.f1930x = a0Var;
                this.f1931y = c3;
                c3.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + a0Var);
        }
        s d = a0Var.c().d(a0Var.f1877b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = a0Var;
            this.e = d;
            Message obtainMessage = this.f1911a.obtainMessage(262, new q0.b(null, a0Var));
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
            int i11 = a0Var.f1888p;
            a1 a1Var = this.f1921n;
            a1Var.f1895a = i11;
            a1Var.f1896b = a0Var.f1889q;
            int i12 = 0;
            if (a0Var.e() && !c0.g()) {
                i10 = 0;
            } else {
                i10 = a0Var.f1887o;
            }
            a1Var.f1897c = i10;
            a1Var.d = this.d.f1885m;
            if (f() && this.d.c() == this.f1925r) {
                a1Var.e = l.p(this.e);
            } else {
                a1Var.e = null;
            }
            ArrayList arrayList = this.f1920m;
            if (arrayList.size() <= 0) {
                androidx.biometric.e eVar = this.C;
                if (eVar != null) {
                    a0 a0Var2 = this.d;
                    a0 a0Var3 = this.v;
                    if (a0Var3 != null) {
                        if (a0Var2 != a0Var3 && a0Var2 != this.f1929w) {
                            if (a1Var.f1897c == 1) {
                                i12 = 2;
                            }
                            int i13 = a1Var.f1896b;
                            int i14 = a1Var.f1895a;
                            String str = (String) a1Var.e;
                            android.support.v4.media.session.c0 c0Var = (android.support.v4.media.session.c0) eVar.f478b;
                            if (c0Var != null) {
                                androidx.emoji2.text.p pVar = (androidx.emoji2.text.p) eVar.f479c;
                                if (pVar != null && i12 == 0 && i13 == 0) {
                                    pVar.f781c = i14;
                                    y1.g.a(pVar.c(), i14);
                                    return;
                                }
                                ?? obj = new Object();
                                obj.f782f = eVar;
                                obj.f779a = i12;
                                obj.f780b = i13;
                                obj.f781c = i14;
                                obj.d = str;
                                eVar.f479c = obj;
                                c0Var.f246a.f268a.setPlaybackToRemote(obj.c());
                                return;
                            }
                            return;
                        }
                        eVar.k();
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
            eVar2.k();
        }
    }

    public final void m(c2.z r20, c2.u r21) {
        throw new UnsupportedOperationException("Method not decompiled: c2.e.m(c2.z, c2.u):void");
    }

    public final int n(a0 a0Var, n nVar) {
        int i10 = a0Var.i(nVar);
        if (i10 != 0) {
            int i11 = i10 & 1;
            b bVar = this.f1911a;
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
        p0 p0Var = this.f1926s;
        ArrayList arrayList = this.f1917j;
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
                if (a0Var3.c() == p0Var && a0Var3.f1877b.equals("DEFAULT_ROUTE") && a0Var3.f()) {
                    this.v = a0Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        a0 a0Var4 = this.f1929w;
        if (a0Var4 != null && !a0Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.f1929w);
            this.f1929w = null;
        }
        if (this.f1929w == null) {
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
                    this.f1929w = a0Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.f1929w);
                    break;
                }
            }
        }
        a0 a0Var6 = this.d;
        if (a0Var6 != null && a0Var6.f1880g) {
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
