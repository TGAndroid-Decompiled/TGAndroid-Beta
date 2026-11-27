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
public final class a05 {
    public static final int F = 0;
    public gv6 A;
    public int B;
    public pm3 C;
    public rx6 D;
    public final v34 E;
    public final ye3 c;
    public jw6 d;
    public aw6 e;
    public ogd f;
    public hw6 g;
    public final Context h;
    public final vh6 n;
    public final xh4 o;
    public final boolean p;
    public final boolean q;
    public ku6 r;
    public final kf8 s;
    public final ze2 t;
    public nw6 u;
    public jw6 v;
    public jw6 w;
    public jw6 x;
    public zv6 y;
    public gv6 z;
    public final xz4 a = new xz4(this);
    public final HashMap b = new HashMap();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final HashMap k = new HashMap();
    public final ArrayList l = new ArrayList();
    public final ArrayList m = new ArrayList();

    static {
        Log.isLoggable("GlobalMediaRouter", 3);
    }

    public a05(android.content.Context r9) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a05.<init>(android.content.Context):void");
    }

    public final void a(bw6 bw6Var, boolean z) {
        if (d(bw6Var) == null) {
            iw6 iw6Var = new iw6(bw6Var, z);
            this.l.add(iw6Var);
            this.a.b(513, iw6Var);
            m(iw6Var, (fo4) bw6Var.n);
            lw6.b();
            bw6Var.f = this.o;
            bw6Var.h(this.z);
        }
    }

    public final String b(iw6 iw6Var, String str) {
        String p;
        String flattenToShortString = ((ComponentName) iw6Var.d.b).flattenToShortString();
        boolean z = iw6Var.c;
        if (z) {
            p = str;
        } else {
            p = qd4.p(flattenToShortString, ":", str);
        }
        HashMap hashMap = this.k;
        if (!z) {
            ArrayList arrayList = this.j;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    if (((jw6) arrayList.get(i)).c.equals(p)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (i >= 0) {
                Log.w("GlobalMediaRouter", c00.j("Either ", str, " isn't unique in ", flattenToShortString, " or we're trying to assign a unique ID for an already added route"));
                int i2 = 2;
                while (true) {
                    Locale locale = Locale.US;
                    String str2 = p + "_" + i2;
                    int size2 = arrayList.size();
                    int i3 = 0;
                    while (true) {
                        if (i3 < size2) {
                            if (((jw6) arrayList.get(i3)).c.equals(str2)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    if (i3 < 0) {
                        hashMap.put(new sx7(flattenToShortString, str), str2);
                        return str2;
                    }
                    i2++;
                }
            }
        }
        hashMap.put(new sx7(flattenToShortString, str), p);
        return p;
    }

    public final jw6 c() {
        ArrayList arrayList = this.j;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            jw6 jw6Var = (jw6) obj;
            if (jw6Var != this.v && jw6Var.c() == this.s && jw6Var.m("android.media.intent.category.LIVE_AUDIO") && !jw6Var.m("android.media.intent.category.LIVE_VIDEO") && jw6Var.f()) {
                return jw6Var;
            }
        }
        return this.v;
    }

    public final iw6 d(bw6 bw6Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            iw6 iw6Var = (iw6) obj;
            if (iw6Var.a == bw6Var) {
                return iw6Var;
            }
        }
        return null;
    }

    public final jw6 e() {
        jw6 jw6Var = this.d;
        if (jw6Var != null) {
            return jw6Var;
        }
        grb.i("There is no currently selected route.  The media router has not yet been fully initialized.");
        return null;
    }

    public final boolean f() {
        if (this.q) {
            nw6 nw6Var = this.u;
            if (nw6Var == null || nw6Var.b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void g() {
        if (this.d.e()) {
            List<jw6> unmodifiableList = DesugarCollections.unmodifiableList(this.d.v);
            HashSet hashSet = new HashSet();
            for (jw6 jw6Var : unmodifiableList) {
                hashSet.add(jw6Var.c);
            }
            HashMap hashMap = this.b;
            Iterator it = hashMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!hashSet.contains(entry.getKey())) {
                    aw6 aw6Var = (aw6) entry.getValue();
                    aw6Var.h(0);
                    aw6Var.d();
                    it.remove();
                }
            }
            for (jw6 jw6Var2 : unmodifiableList) {
                if (!hashMap.containsKey(jw6Var2.c)) {
                    aw6 e = jw6Var2.c().e(jw6Var2.b, this.d.b);
                    e.e();
                    hashMap.put(jw6Var2.c, e);
                }
            }
        }
    }

    public final void h(a05 a05Var, jw6 jw6Var, aw6 aw6Var, int i, jw6 jw6Var2, ArrayList arrayList) {
        ogd ogdVar;
        hw6 hw6Var = this.g;
        if (hw6Var != null) {
            hw6Var.e();
            this.g = null;
        }
        hw6 hw6Var2 = new hw6(a05Var, jw6Var, aw6Var, i, jw6Var2, arrayList);
        this.g = hw6Var2;
        if (hw6Var2.b == 3 && (ogdVar = this.f) != null) {
            jw6 jw6Var3 = this.d;
            jw6 jw6Var4 = (jw6) hw6Var2.h;
            ogd.c.b("Prepare transfer from Route(%s) to Route(%s)", jw6Var3, jw6Var4);
            ?? obj = new Object();
            obj.c = new Object();
            v91 v91Var = new v91(obj);
            u91 u91Var = v91Var.b;
            obj.b = v91Var;
            obj.a = pfd.class;
            try {
                obj.a = Boolean.valueOf(ogdVar.b.post(new dd1(ogdVar, jw6Var3, jw6Var4, obj, (byte) 1)));
            } catch (Exception e) {
                u91Var.l(e);
            }
            hw6 hw6Var3 = this.g;
            a05 a05Var2 = (a05) ((WeakReference) hw6Var3.s).get();
            if (a05Var2 != null && a05Var2.g == hw6Var3) {
                if (((v91) hw6Var3.w) == null) {
                    hw6Var3.w = v91Var;
                    gw6 gw6Var = new gw6(hw6Var3, (byte) 0);
                    xz4 xz4Var = a05Var2.a;
                    Objects.requireNonNull(xz4Var);
                    u91Var.b(gw6Var, new pe2(xz4Var, (byte) 2));
                    return;
                }
                grb.i("future is already set");
                return;
            }
            Log.w("AxMediaRouter", "Router is released. Cancel transfer");
            hw6Var3.e();
            return;
        }
        hw6Var2.j();
    }

    public final void i(jw6 jw6Var, int i) {
        if (!this.j.contains(jw6Var)) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select removed route: " + jw6Var);
        } else if (!jw6Var.g) {
            Log.w("GlobalMediaRouter", "Ignoring attempt to select disabled route: " + jw6Var);
        } else {
            if (Build.VERSION.SDK_INT >= 30) {
                bw6 c = jw6Var.c();
                ku6 ku6Var = this.r;
                if (c == ku6Var && this.d != jw6Var) {
                    ku6Var.s(jw6Var.b);
                    return;
                }
            }
            j(jw6Var, i);
        }
    }

    public final void j(jw6 jw6Var, int i) {
        fo4 fo4Var;
        if (this.d == jw6Var) {
            return;
        }
        if (this.x != null) {
            this.x = null;
            zv6 zv6Var = this.y;
            if (zv6Var != null) {
                zv6Var.h(3);
                this.y.d();
                this.y = null;
            }
        }
        if (f() && (fo4Var = jw6Var.a.e) != null && fo4Var.c) {
            zv6 c = jw6Var.c().c(jw6Var.b);
            if (c != null) {
                Executor g = sr.g(this.h);
                v34 v34Var = this.E;
                synchronized (c.a) {
                    if (g != null) {
                        if (v34Var != null) {
                            c.b = g;
                            c.c = v34Var;
                            ArrayList arrayList = c.e;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                ev6 ev6Var = c.d;
                                ArrayList arrayList2 = c.e;
                                c.d = null;
                                c.e = null;
                                c.b.execute(new xv6(c, v34Var, ev6Var, arrayList2, (byte) 0));
                            }
                        } else {
                            throw new NullPointerException("Listener shouldn't be null");
                        }
                    } else {
                        throw new NullPointerException("Executor shouldn't be null");
                    }
                }
                this.x = jw6Var;
                this.y = c;
                c.e();
                return;
            }
            Log.w("GlobalMediaRouter", "setSelectedRouteInternal: Failed to create dynamic group route controller. route=" + jw6Var);
        }
        aw6 d = jw6Var.c().d(jw6Var.b);
        if (d != null) {
            d.e();
        }
        if (this.d == null) {
            this.d = jw6Var;
            this.e = d;
            Message obtainMessage = this.a.obtainMessage(262, new sx7(null, jw6Var));
            obtainMessage.arg1 = i;
            obtainMessage.sendToTarget();
            return;
        }
        h(this, jw6Var, d, i, null, null);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a05.k():void");
    }

    public final void l() {
        int i;
        jw6 jw6Var = this.d;
        if (jw6Var != null) {
            int i2 = jw6Var.p;
            vh6 vh6Var = this.n;
            vh6Var.a = i2;
            vh6Var.b = jw6Var.q;
            int i3 = 0;
            if (jw6Var.e() && !lw6.g()) {
                i = 0;
            } else {
                i = jw6Var.o;
            }
            vh6Var.c = i;
            vh6Var.d = this.d.m;
            if (f() && this.d.c() == this.r) {
                vh6Var.e = ku6.p(this.e);
            } else {
                vh6Var.e = null;
            }
            ArrayList arrayList = this.m;
            if (arrayList.size() <= 0) {
                pm3 pm3Var = this.C;
                if (pm3Var != null) {
                    jw6 jw6Var2 = this.d;
                    jw6 jw6Var3 = this.v;
                    if (jw6Var3 != null) {
                        if (jw6Var2 != jw6Var3 && jw6Var2 != this.w) {
                            if (vh6Var.c == 1) {
                                i3 = 2;
                            }
                            int i4 = i3;
                            int i5 = vh6Var.b;
                            int i6 = vh6Var.a;
                            String str = (String) vh6Var.e;
                            rx6 rx6Var = (rx6) pm3Var.b;
                            if (rx6Var != null) {
                                oy3 oy3Var = (oy3) pm3Var.c;
                                if (oy3Var != null && i4 == 0 && i5 == 0) {
                                    oy3Var.c = i6;
                                    ioc.a(oy3Var.b(), i6);
                                    return;
                                }
                                oy3 oy3Var2 = new oy3(pm3Var, i4, i5, i6, str);
                                pm3Var.c = oy3Var2;
                                ((ex6) rx6Var.b).a.setPlaybackToRemote(oy3Var2.b());
                                return;
                            }
                            return;
                        }
                        pm3Var.o();
                        return;
                    }
                    grb.i("There is no default route.  The media router has not yet been fully initialized.");
                    return;
                }
                return;
            }
            ((zz4) arrayList.get(0)).getClass();
            throw null;
        }
        pm3 pm3Var2 = this.C;
        if (pm3Var2 != null) {
            pm3Var2.o();
        }
    }

    public final void m(defpackage.iw6 r20, defpackage.fo4 r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a05.m(iw6, fo4):void");
    }

    public final int n(jw6 jw6Var, ev6 ev6Var) {
        int i = jw6Var.i(ev6Var);
        if (i != 0) {
            int i2 = i & 1;
            xz4 xz4Var = this.a;
            if (i2 != 0) {
                xz4Var.b(259, jw6Var);
            }
            if ((i & 2) != 0) {
                xz4Var.b(260, jw6Var);
            }
            if ((i & 4) != 0) {
                xz4Var.b(261, jw6Var);
            }
        }
        return i;
    }

    public final void o(boolean z) {
        jw6 jw6Var = this.v;
        if (jw6Var != null && !jw6Var.f()) {
            Log.i("GlobalMediaRouter", "Clearing the default route because it is no longer selectable: " + this.v);
            this.v = null;
        }
        jw6 jw6Var2 = this.v;
        kf8 kf8Var = this.s;
        ArrayList arrayList = this.j;
        if (jw6Var2 == null) {
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                jw6 jw6Var3 = (jw6) obj;
                if (jw6Var3.c() == kf8Var && jw6Var3.b.equals("DEFAULT_ROUTE") && jw6Var3.f()) {
                    this.v = jw6Var3;
                    Log.i("GlobalMediaRouter", "Found default route: " + this.v);
                    break;
                }
            }
        }
        jw6 jw6Var4 = this.w;
        if (jw6Var4 != null && !jw6Var4.f()) {
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
                jw6 jw6Var5 = (jw6) obj2;
                if (jw6Var5.c() == kf8Var && jw6Var5.m("android.media.intent.category.LIVE_AUDIO") && !jw6Var5.m("android.media.intent.category.LIVE_VIDEO") && jw6Var5.f()) {
                    this.w = jw6Var5;
                    Log.i("GlobalMediaRouter", "Found bluetooth route: " + this.w);
                    break;
                }
            }
        }
        jw6 jw6Var6 = this.d;
        if (jw6Var6 != null && jw6Var6.g) {
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
