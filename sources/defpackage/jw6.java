package defpackage;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
public final class jw6 {
    public final iw6 a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public Uri f;
    public boolean g;
    public final boolean h;
    public int i;
    public boolean j;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public Bundle s;
    public IntentSender t;
    public ev6 u;
    public qs w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public jw6(iw6 iw6Var, String str, String str2, boolean z) {
        this.a = iw6Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static zv6 a() {
        lw6.b();
        aw6 aw6Var = lw6.c().e;
        if (aw6Var instanceof zv6) {
            return (zv6) aw6Var;
        }
        return null;
    }

    public final v34 b(jw6 jw6Var) {
        if (jw6Var != null) {
            String str = jw6Var.c;
            qs qsVar = this.w;
            if (qsVar == null || !qsVar.containsKey(str)) {
                return null;
            }
            return new v34((yv6) this.w.get(str), (byte) 17);
        }
        p3d.h("route must not be null");
        return null;
    }

    public final bw6 c() {
        lw6.b();
        return this.a.a;
    }

    public final boolean d() {
        lw6.b();
        jw6 jw6Var = lw6.c().v;
        if (jw6Var != null) {
            if (jw6Var != this && this.n != 3) {
                if (!TextUtils.equals(((ComponentName) ((xh4) c().d).b).getPackageName(), "android") || !m("android.media.intent.category.LIVE_AUDIO") || m("android.media.intent.category.LIVE_VIDEO")) {
                    return false;
                }
                return true;
            }
            return true;
        }
        grb.i("There is no default route.  The media router has not yet been fully initialized.");
        return false;
    }

    public final boolean e() {
        if (DesugarCollections.unmodifiableList(this.v).size() >= 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.u != null && this.g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        lw6.b();
        if (lw6.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(dw6 dw6Var) {
        if (dw6Var != null) {
            lw6.b();
            dw6Var.a();
            if (!dw6Var.b.isEmpty()) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        for (String str : dw6Var.b) {
                            if (intentFilter.hasCategory(str)) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
            return false;
        }
        lq5.j("selector must not be null");
        return false;
    }

    public final int i(defpackage.ev6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jw6.i(ev6):int");
    }

    public final void j(int i) {
        aw6 aw6Var;
        aw6 aw6Var2;
        lw6.b();
        a05 c = lw6.c();
        int min = Math.min(this.q, Math.max(0, i));
        HashMap hashMap = c.b;
        if (this == c.d && (aw6Var2 = c.e) != null) {
            aw6Var2.f(min);
        } else if (!hashMap.isEmpty() && (aw6Var = (aw6) hashMap.get(this.c)) != null) {
            aw6Var.f(min);
        }
    }

    public final void k(int i) {
        aw6 aw6Var;
        aw6 aw6Var2;
        lw6.b();
        if (i != 0) {
            a05 c = lw6.c();
            HashMap hashMap = c.b;
            if (this == c.d && (aw6Var2 = c.e) != null) {
                aw6Var2.i(i);
            } else if (!hashMap.isEmpty() && (aw6Var = (aw6) hashMap.get(this.c)) != null) {
                aw6Var.i(i);
            }
        }
    }

    public final void l() {
        lw6.b();
        lw6.c().i(this, 3);
    }

    public final boolean m(String str) {
        lw6.b();
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(ArrayList arrayList) {
        this.v.clear();
        qs qsVar = this.w;
        int i = 0;
        qs qsVar2 = qsVar;
        if (qsVar == null) {
            ?? vlaVar = new vla(0);
            this.w = vlaVar;
            qsVar2 = vlaVar;
        }
        qsVar2.clear();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            yv6 yv6Var = (yv6) obj;
            jw6 a = this.a.a(yv6Var.a.d());
            if (a != null) {
                this.w.put(a.c, yv6Var);
                int i2 = yv6Var.b;
                if (i2 == 2 || i2 == 3) {
                    this.v.add(a);
                }
            }
        }
        lw6.c().a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f);
        sb.append(", enabled=");
        sb.append(this.g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.i);
        sb.append(", canDisconnect=");
        sb.append(this.j);
        sb.append(", playbackType=");
        sb.append(this.l);
        sb.append(", playbackStream=");
        sb.append(this.m);
        sb.append(", deviceType=");
        sb.append(this.n);
        sb.append(", volumeHandling=");
        sb.append(this.o);
        sb.append(", volume=");
        sb.append(this.p);
        sb.append(", volumeMax=");
        sb.append(this.q);
        sb.append(", presentationDisplayId=");
        sb.append(this.r);
        sb.append(", extras=");
        sb.append(this.s);
        sb.append(", settingsIntent=");
        sb.append(this.t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.a.d.b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i) != this) {
                    sb.append(((jw6) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
