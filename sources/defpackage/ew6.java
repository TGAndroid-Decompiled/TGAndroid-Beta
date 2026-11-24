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
public final class ew6 {
    public final dw6 a;
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
    public zu6 u;
    public qt w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public ew6(dw6 dw6Var, String str, String str2, boolean z) {
        this.a = dw6Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static uv6 a() {
        gw6.b();
        vv6 vv6Var = gw6.c().e;
        if (vv6Var instanceof uv6) {
            return (uv6) vv6Var;
        }
        return null;
    }

    public final k44 b(ew6 ew6Var) {
        if (ew6Var != null) {
            String str = ew6Var.c;
            qt qtVar = this.w;
            if (qtVar == null || !qtVar.containsKey(str)) {
                return null;
            }
            return new k44((tv6) this.w.get(str), (byte) 18);
        }
        gxc.d("route must not be null");
        return null;
    }

    public final wv6 c() {
        gw6.b();
        return this.a.a;
    }

    public final boolean d() {
        gw6.b();
        ew6 ew6Var = gw6.c().v;
        if (ew6Var != null) {
            if (ew6Var != this && this.n != 3) {
                if (!TextUtils.equals(((ComponentName) ((ai4) c().d).b).getPackageName(), "android") || !m("android.media.intent.category.LIVE_AUDIO") || m("android.media.intent.category.LIVE_VIDEO")) {
                    return false;
                }
                return true;
            }
            return true;
        }
        dq9.m("There is no default route.  The media router has not yet been fully initialized.");
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
        gw6.b();
        if (gw6.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(yv6 yv6Var) {
        if (yv6Var != null) {
            gw6.b();
            yv6Var.a();
            if (!yv6Var.b.isEmpty()) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        for (String str : yv6Var.b) {
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
        u36.j("selector must not be null");
        return false;
    }

    public final int i(defpackage.zu6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ew6.i(zu6):int");
    }

    public final void j(int i) {
        vv6 vv6Var;
        vv6 vv6Var2;
        gw6.b();
        wz4 c = gw6.c();
        int min = Math.min(this.q, Math.max(0, i));
        HashMap hashMap = c.b;
        if (this == c.d && (vv6Var2 = c.e) != null) {
            vv6Var2.f(min);
        } else if (!hashMap.isEmpty() && (vv6Var = (vv6) hashMap.get(this.c)) != null) {
            vv6Var.f(min);
        }
    }

    public final void k(int i) {
        vv6 vv6Var;
        vv6 vv6Var2;
        gw6.b();
        if (i != 0) {
            wz4 c = gw6.c();
            HashMap hashMap = c.b;
            if (this == c.d && (vv6Var2 = c.e) != null) {
                vv6Var2.i(i);
            } else if (!hashMap.isEmpty() && (vv6Var = (vv6) hashMap.get(this.c)) != null) {
                vv6Var.i(i);
            }
        }
    }

    public final void l() {
        gw6.b();
        gw6.c().i(this, 3);
    }

    public final boolean m(String str) {
        gw6.b();
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
        qt qtVar = this.w;
        int i = 0;
        qt qtVar2 = qtVar;
        if (qtVar == null) {
            ?? ckaVar = new cka(0);
            this.w = ckaVar;
            qtVar2 = ckaVar;
        }
        qtVar2.clear();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tv6 tv6Var = (tv6) obj;
            ew6 a = this.a.a(tv6Var.a.d());
            if (a != null) {
                this.w.put(a.c, tv6Var);
                int i2 = tv6Var.b;
                if (i2 == 2 || i2 == 3) {
                    this.v.add(a);
                }
            }
        }
        gw6.c().a.b(259, this);
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
                    sb.append(((ew6) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
