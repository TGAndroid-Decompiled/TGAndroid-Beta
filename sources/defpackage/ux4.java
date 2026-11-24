package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
public final class ux4 {
    public static final int F = 0;
    public bt6 A;
    public int B;
    public xl3 C;
    public mv6 D;
    public final pj4 E;
    public final ee3 c;
    public eu6 d;
    public vt6 e;
    public vbd f;
    public cu6 g;
    public final Context h;
    public final rf6 n;
    public final z24 o;
    public final boolean p;
    public final boolean q;
    public fs6 r;
    public final vb8 s;
    public final ie2 t;
    public iu6 u;
    public eu6 v;
    public eu6 w;
    public eu6 x;
    public ut6 y;
    public bt6 z;
    public final rx4 a = new rx4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public ux4(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux4.<init>(android.content.Context):void");
    }

    public final void a(wt6 wt6Var, boolean z) {
        if (d(wt6Var) == null) {
            du6 du6Var = new du6(wt6Var, z);
            this.l.add(du6Var);
            this.a.b(513, du6Var);
            m(du6Var, (am4) wt6Var.n);
            gu6.b();
            wt6Var.f = this.o;
            wt6Var.h(this.z);
        }
    }

    public final String b(du6 du6Var, String str) {
        String p;
        String flattenToShortString = ((ComponentName) du6Var.d.b).flattenToShortString();
        boolean z = du6Var.c;
        if (z) {
            p = str;
        } else {
            p = tb4.p(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((eu6) arrayList.get(i)).c.equals(p)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", b00.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = p + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (((eu6) arrayList.get(i3)).c.equals(str2)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 < 0) {
                        hashMap.put(new lu7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new lu7(flattenToShortString, str), p);
        return p;
    }

    public final eu6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            eu6 eu6Var = (eu6) obj;
            if (eu6Var != this.v && eu6Var.c() == this.s && eu6Var.m("android.media.intent.category.LIVE_AUDIO") && !eu6Var.m("android.media.intent.category.LIVE_VIDEO") && eu6Var.f()) {
                return eu6Var;
            }
        }
        return this.v;
    }

    public final du6 d(wt6 wt6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            du6 du6Var = (du6) obj;
            if (du6Var.a == wt6Var) {
                return du6Var;
            }
        }
        return null;
    }

    public final eu6 e() {
        eu6 eu6Var = this.d;
        if (eu6Var != null) {
            return eu6Var;
        }
        sc8.j("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (this.q) {
            iu6 iu6Var = this.u;
            if (iu6Var == null || iu6Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<eu6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (eu6 eu6Var : unmodifiableList) {
                hashSet.add(eu6Var.c);
            }
            HashMap hashMap = this.b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    vt6 vt6Var = (vt6) entry.getValue();
                    vt6Var.h(0);
                    vt6Var.d();
                    it.remove();
                }
            }
            for (eu6 eu6Var2 : unmodifiableList) {
                if (!hashMap.containsKey(eu6Var2.c)) {
                    vt6 e = eu6Var2.c().e(eu6Var2.b, this.d.b);
                    e.e();
                    hashMap.put(eu6Var2.c, e);
                }
            }
        }
    }

    public final void h(ux4 ux4Var, eu6 eu6Var, vt6 vt6Var, int i, eu6 eu6Var2, ArrayList arrayList) {
        vbd vbdVar;
        cu6 cu6Var = this.g;
        if (cu6Var != null) {
            cu6Var.d();
            this.g = null;
        }
        cu6 cu6Var2 = new cu6(ux4Var, eu6Var, vt6Var, i, eu6Var2, arrayList);
        this.g = cu6Var2;
        if (cu6Var2.b == 3 && (vbdVar = this.f) != null) {
            eu6 eu6Var3 = this.d;
            eu6 eu6Var4 = (eu6) cu6Var2.h;
            vbd.c.b("Prepare transfer from Route(%s) to Route(%s)", eu6Var3, eu6Var4);
            ?? obj = new Object();
            obj.c = new Object();
            m91 m91Var = new m91(obj);
            l91 l91Var = m91Var.b;
            obj.b = m91Var;
            obj.a = wad.class;
            try {
                obj.a = Boolean.valueOf(vbdVar.b.post(new vc1(vbdVar, eu6Var3, eu6Var4, obj, (byte) 1)));
            } catch (Exception e) {
                l91Var.l(e);
            }
            cu6 cu6Var3 = this.g;
            ux4 ux4Var2 = (ux4) ((WeakReference) cu6Var3.s).get();
            if (ux4Var2 != null && ux4Var2.g == cu6Var3) {
                if (((m91) cu6Var3.w) == null) {
                    cu6Var3.w = m91Var;
                    bu6 bu6Var = new bu6(cu6Var3, (byte) 0);
                    rx4 rx4Var = ux4Var2.a;
                    Objects.requireNonNull(rx4Var);
                    l91Var.b(bu6Var, new ge2(rx4Var, (byte) 2));
                    return;
                }
                sc8.j("future is already set");
                return;
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            cu6Var3.d();
            return;
        }
        cu6Var2.i();
    }

    public final void i(eu6 eu6Var, int i) {
        if (!this.j.contains(eu6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + eu6Var);
        } else if (!eu6Var.g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + eu6Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                wt6 c = eu6Var.c();
                fs6 fs6Var = this.r;
                if (c == fs6Var && this.d != eu6Var) {
                    fs6Var.s(eu6Var.b);
                    return;
                }
            }
            j(eu6Var, i);
        }
    }

    public final void j(eu6 eu6Var, int i) {
        am4 am4Var;
        if (this.d == eu6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            ut6 ut6Var = this.y;
            if (ut6Var != null) {
                ut6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (am4Var = eu6Var.a.e) != null && am4Var.c) {
            ut6 c = eu6Var.c().c(eu6Var.b);
            if (c != null) {
                Executor g = rr.g(this.h);
                pj4 pj4Var = this.E;
                synchronized (c.a) {
                    if (g != null) {
                        if (pj4Var != null) {
                            c.b = g;
                            c.c = pj4Var;
                            ArrayList arrayList = c.e;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                zs6 zs6Var = c.d;
                                ArrayList arrayList2 = c.e;
                                c.d = null;
                                c.e = null;
                                c.b.execute(new st6(c, pj4Var, zs6Var, arrayList2, (byte) 0));
                            }
                        } else {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                    } else {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                }
                this.x = eu6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + eu6Var);
        }
        vt6 d = eu6Var.c().d(eu6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = eu6Var;
            this.e = d;
            Message obtainMessage = this.a.obtainMessage(262, new lu7(null, eu6Var));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, eu6Var, d, i, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux4.k():void");
    }

    public final void l() {
        int i;
        eu6 eu6Var = this.d;
        if (eu6Var != null) {
            int i2 = eu6Var.p;
            rf6 rf6Var = this.n;
            rf6Var.a = i2;
            rf6Var.b = eu6Var.q;
            int i3 = 0;
            if (eu6Var.e() && !gu6.g()) {
                i = 0;
            } else {
                i = eu6Var.o;
            }
            rf6Var.c = i;
            rf6Var.d = this.d.m;
            if (f() && this.d.c() == this.r) {
                rf6Var.e = fs6.p(this.e);
            } else {
                rf6Var.e = null;
            }
            ArrayList arrayList = this.m;
            if (arrayList.size() <= 0) {
                xl3 xl3Var = this.C;
                if (xl3Var != null) {
                    eu6 eu6Var2 = this.d;
                    eu6 eu6Var3 = this.v;
                    if (eu6Var3 != null) {
                        if (eu6Var2 != eu6Var3 && eu6Var2 != this.w) {
                            if (rf6Var.c == 1) {
                                i3 = 2;
                            }
                            int i4 = i3;
                            int i5 = rf6Var.b;
                            int i6 = rf6Var.a;
                            String str = (String) rf6Var.e;
                            mv6 mv6Var = (mv6) xl3Var.b;
                            if (mv6Var != null) {
                                tx3 tx3Var = (tx3) xl3Var.c;
                                if (tx3Var != null && i4 == 0 && i5 == 0) {
                                    tx3Var.c = i6;
                                    vjc.a(tx3Var.b(), i6);
                                    return;
                                }
                                tx3 tx3Var2 = new tx3(xl3Var, i4, i5, i6, str);
                                xl3Var.c = tx3Var2;
                                ((zu6) mv6Var.b).a.setPlaybackToRemote(tx3Var2.b());
                                return;
                            }
                            return;
                        }
                        xl3Var.o();
                        return;
                    }
                    sc8.j("There is no default route.  The media router has not yet been fully initialized.");
                    return;
                }
                return;
            }
            ((tx4) arrayList.get(0)).getClass();
            throw null;
        }
        xl3 xl3Var2 = this.C;
        if (xl3Var2 != null) {
            xl3Var2.o();
        }
    }

    public final void m(defpackage.du6 r20, defpackage.am4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux4.m(du6, am4):void");
    }

    public final int n(eu6 eu6Var, zs6 zs6Var) {
        int i = eu6Var.i(zs6Var);
        if (i != 0) {
            int i2 = i & 1;
            rx4 rx4Var = this.a;
            if (i2 != 0) {
                rx4Var.b(259, eu6Var);
            }
            if ((i & 2) != 0) {
                rx4Var.b(260, eu6Var);
            }
            if ((i & 4) != 0) {
                rx4Var.b(261, eu6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        eu6 eu6Var = this.v;
        if (eu6Var != null && !eu6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        eu6 eu6Var2 = this.v;
        vb8 vb8Var = this.s;
        ArrayList arrayList = this.j;
        if (eu6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                eu6 eu6Var3 = (eu6) obj;
                if (eu6Var3.c() == vb8Var && eu6Var3.b.equals("DEFAULT_ROUTE") && eu6Var3.f()) {
                    this.v = eu6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        eu6 eu6Var4 = this.w;
        if (eu6Var4 != null && !eu6Var4.f()) {
            Log.i("GlobalMediaRouter", "Clearing the bluetooth route because it is no longer selectable: " + this.w);
            this.w = null;
        }
        if (this.w == null) {
            int size2 = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size2) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                i2++;
                eu6 eu6Var5 = (eu6) obj2;
                if (eu6Var5.c() == vb8Var && eu6Var5.m("android.media.intent.category.LIVE_AUDIO") && !eu6Var5.m("android.media.intent.category.LIVE_VIDEO") && eu6Var5.f()) {
                    this.w = eu6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        eu6 eu6Var6 = this.d;
        if (eu6Var6 != null && eu6Var6.g) {
            if (z) {
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
