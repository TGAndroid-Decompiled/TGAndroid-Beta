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
public final class wz4 {
    public static final int F = 0;
    public bv6 A;
    public int B;
    public in3 C;
    public mx6 D;
    public final k44 E;
    public final pf3 c;
    public ew6 d;
    public vv6 e;
    public xdd f;
    public cw6 g;
    public final Context h;
    public final rh6 n;
    public final ai4 o;
    public final boolean p;
    public final boolean q;
    public gu6 r;
    public final yd8 s;
    public final tf2 t;
    public iw6 u;
    public ew6 v;
    public ew6 w;
    public ew6 x;
    public uv6 y;
    public bv6 z;
    public final tz4 a = new tz4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public wz4(android.content.Context r8) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz4.<init>(android.content.Context):void");
    }

    public final void a(wv6 wv6Var, boolean z) {
        if (d(wv6Var) == null) {
            dw6 dw6Var = new dw6(wv6Var, z);
            this.l.add(dw6Var);
            this.a.b(513, dw6Var);
            m(dw6Var, (bo4) wv6Var.n);
            gw6.b();
            wv6Var.f = this.o;
            wv6Var.h(this.z);
        }
    }

    public final String b(dw6 dw6Var, String str) {
        String q;
        String flattenToShortString = ((ComponentName) dw6Var.d.b).flattenToShortString();
        boolean z = dw6Var.c;
        if (z) {
            q = str;
        } else {
            q = td4.q(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((ew6) arrayList.get(i)).c.equals(q)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", b10.i("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = q + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (((ew6) arrayList.get(i3)).c.equals(str2)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 < 0) {
                        hashMap.put(new mw7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new mw7(flattenToShortString, str), q);
        return q;
    }

    public final ew6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ew6 ew6Var = (ew6) obj;
            if (ew6Var != this.v && ew6Var.c() == this.s && ew6Var.m("android.media.intent.category.LIVE_AUDIO") && !ew6Var.m("android.media.intent.category.LIVE_VIDEO") && ew6Var.f()) {
                return ew6Var;
            }
        }
        return this.v;
    }

    public final dw6 d(wv6 wv6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            dw6 dw6Var = (dw6) obj;
            if (dw6Var.a == wv6Var) {
                return dw6Var;
            }
        }
        return null;
    }

    public final ew6 e() {
        ew6 ew6Var = this.d;
        if (ew6Var != null) {
            return ew6Var;
        }
        dq9.m("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (this.q) {
            iw6 iw6Var = this.u;
            if (iw6Var == null || iw6Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<ew6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (ew6 ew6Var : unmodifiableList) {
                hashSet.add(ew6Var.c);
            }
            HashMap hashMap = this.b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    vv6 vv6Var = (vv6) entry.getValue();
                    vv6Var.h(0);
                    vv6Var.d();
                    it.remove();
                }
            }
            for (ew6 ew6Var2 : unmodifiableList) {
                if (!hashMap.containsKey(ew6Var2.c)) {
                    vv6 e = ew6Var2.c().e(ew6Var2.b, this.d.b);
                    e.e();
                    hashMap.put(ew6Var2.c, e);
                }
            }
        }
    }

    public final void h(wz4 wz4Var, ew6 ew6Var, vv6 vv6Var, int i, ew6 ew6Var2, ArrayList arrayList) {
        xdd xddVar;
        cw6 cw6Var = this.g;
        if (cw6Var != null) {
            cw6Var.e();
            this.g = null;
        }
        cw6 cw6Var2 = new cw6(wz4Var, ew6Var, vv6Var, i, ew6Var2, arrayList);
        this.g = cw6Var2;
        if (cw6Var2.b == 3 && (xddVar = this.f) != null) {
            ew6 ew6Var3 = this.d;
            ew6 ew6Var4 = (ew6) cw6Var2.h;
            xdd.c.b("Prepare transfer from Route(%s) to Route(%s)", ew6Var3, ew6Var4);
            ?? obj = new Object();
            obj.c = new Object();
            va1 va1Var = new va1(obj);
            ua1 ua1Var = va1Var.b;
            obj.b = va1Var;
            obj.a = ycd.class;
            try {
                obj.a = Boolean.valueOf(xddVar.b.post(new de1(xddVar, ew6Var3, ew6Var4, obj, (byte) 1)));
            } catch (Exception e) {
                ua1Var.l(e);
            }
            cw6 cw6Var3 = this.g;
            wz4 wz4Var2 = (wz4) ((WeakReference) cw6Var3.s).get();
            if (wz4Var2 != null && wz4Var2.g == cw6Var3) {
                if (((va1) cw6Var3.w) == null) {
                    cw6Var3.w = va1Var;
                    bw6 bw6Var = new bw6(cw6Var3, (byte) 0);
                    tz4 tz4Var = wz4Var2.a;
                    Objects.requireNonNull(tz4Var);
                    ua1Var.b(bw6Var, new rf2(tz4Var, (byte) 2));
                    return;
                }
                dq9.m("future is already set");
                return;
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            cw6Var3.e();
            return;
        }
        cw6Var2.j();
    }

    public final void i(ew6 ew6Var, int i) {
        if (!this.j.contains(ew6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + ew6Var);
        } else if (!ew6Var.g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + ew6Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                wv6 c = ew6Var.c();
                gu6 gu6Var = this.r;
                if (c == gu6Var && this.d != ew6Var) {
                    gu6Var.s(ew6Var.b);
                    return;
                }
            }
            j(ew6Var, i);
        }
    }

    public final void j(ew6 ew6Var, int i) {
        bo4 bo4Var;
        if (this.d == ew6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            uv6 uv6Var = this.y;
            if (uv6Var != null) {
                uv6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (bo4Var = ew6Var.a.e) != null && bo4Var.c) {
            uv6 c = ew6Var.c().c(ew6Var.b);
            if (c != null) {
                Executor g = rs.g(this.h);
                k44 k44Var = this.E;
                synchronized (c.a) {
                    if (g != null) {
                        if (k44Var != null) {
                            c.b = g;
                            c.c = k44Var;
                            ArrayList arrayList = c.e;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                zu6 zu6Var = c.d;
                                ArrayList arrayList2 = c.e;
                                c.d = null;
                                c.e = null;
                                c.b.execute(new sv6(c, k44Var, zu6Var, arrayList2, (byte) 0));
                            }
                        } else {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                    } else {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                }
                this.x = ew6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + ew6Var);
        }
        vv6 d = ew6Var.c().d(ew6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = ew6Var;
            this.e = d;
            Message obtainMessage = this.a.obtainMessage(262, new mw7(null, ew6Var));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, ew6Var, d, i, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz4.k():void");
    }

    public final void l() {
        int i;
        ew6 ew6Var = this.d;
        if (ew6Var != null) {
            int i2 = ew6Var.p;
            rh6 rh6Var = this.n;
            rh6Var.a = i2;
            rh6Var.b = ew6Var.q;
            int i3 = 0;
            if (ew6Var.e() && !gw6.g()) {
                i = 0;
            } else {
                i = ew6Var.o;
            }
            rh6Var.c = i;
            rh6Var.d = this.d.m;
            if (f() && this.d.c() == this.r) {
                rh6Var.e = gu6.p(this.e);
            } else {
                rh6Var.e = null;
            }
            ArrayList arrayList = this.m;
            if (arrayList.size() <= 0) {
                in3 in3Var = this.C;
                if (in3Var != null) {
                    ew6 ew6Var2 = this.d;
                    ew6 ew6Var3 = this.v;
                    if (ew6Var3 != null) {
                        if (ew6Var2 != ew6Var3 && ew6Var2 != this.w) {
                            if (rh6Var.c == 1) {
                                i3 = 2;
                            }
                            int i4 = i3;
                            int i5 = rh6Var.b;
                            int i6 = rh6Var.a;
                            String str = (String) rh6Var.e;
                            mx6 mx6Var = (mx6) in3Var.b;
                            if (mx6Var != null) {
                                dz3 dz3Var = (dz3) in3Var.c;
                                if (dz3Var != null && i4 == 0 && i5 == 0) {
                                    dz3Var.c = i6;
                                    vlc.a(dz3Var.b(), i6);
                                    return;
                                }
                                dz3 dz3Var2 = new dz3(in3Var, i4, i5, i6, str);
                                in3Var.c = dz3Var2;
                                ((zw6) mx6Var.b).a.setPlaybackToRemote(dz3Var2.b());
                                return;
                            }
                            return;
                        }
                        in3Var.o();
                        return;
                    }
                    dq9.m("There is no default route.  The media router has not yet been fully initialized.");
                    return;
                }
                return;
            }
            ((vz4) arrayList.get(0)).getClass();
            throw null;
        }
        in3 in3Var2 = this.C;
        if (in3Var2 != null) {
            in3Var2.o();
        }
    }

    public final void m(defpackage.dw6 r20, defpackage.bo4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wz4.m(dw6, bo4):void");
    }

    public final int n(ew6 ew6Var, zu6 zu6Var) {
        int i = ew6Var.i(zu6Var);
        if (i != 0) {
            int i2 = i & 1;
            tz4 tz4Var = this.a;
            if (i2 != 0) {
                tz4Var.b(259, ew6Var);
            }
            if ((i & 2) != 0) {
                tz4Var.b(260, ew6Var);
            }
            if ((i & 4) != 0) {
                tz4Var.b(261, ew6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        ew6 ew6Var = this.v;
        if (ew6Var != null && !ew6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        ew6 ew6Var2 = this.v;
        yd8 yd8Var = this.s;
        ArrayList arrayList = this.j;
        if (ew6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                ew6 ew6Var3 = (ew6) obj;
                if (ew6Var3.c() == yd8Var && ew6Var3.b.equals("DEFAULT_ROUTE") && ew6Var3.f()) {
                    this.v = ew6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        ew6 ew6Var4 = this.w;
        if (ew6Var4 != null && !ew6Var4.f()) {
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
                ew6 ew6Var5 = (ew6) obj2;
                if (ew6Var5.c() == yd8Var && ew6Var5.m("android.media.intent.category.LIVE_AUDIO") && !ew6Var5.m("android.media.intent.category.LIVE_VIDEO") && ew6Var5.f()) {
                    this.w = ew6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        ew6 ew6Var6 = this.d;
        if (ew6Var6 != null && ew6Var6.g) {
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
