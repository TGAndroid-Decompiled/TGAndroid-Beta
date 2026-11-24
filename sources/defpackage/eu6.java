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
public final class eu6 {
    public final du6 a;
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
    public zs6 u;
    public ps w;
    public final ArrayList k = new ArrayList();
    public int r = -1;
    public ArrayList v = new ArrayList();

    public eu6(du6 du6Var, String str, String str2, boolean z) {
        this.a = du6Var;
        this.b = str;
        this.c = str2;
        this.h = z;
    }

    public static ut6 a() {
        gu6.b();
        vt6 vt6Var = gu6.c().e;
        if (vt6Var instanceof ut6) {
            return (ut6) vt6Var;
        }
        return null;
    }

    public final pj4 b(eu6 eu6Var) {
        if (eu6Var != null) {
            String str = eu6Var.c;
            ps psVar = this.w;
            if (psVar == null || !psVar.containsKey(str)) {
                return null;
            }
            return new pj4((tt6) this.w.get(str), (byte) 16);
        }
        fvc.f("route must not be null");
        return null;
    }

    public final wt6 c() {
        gu6.b();
        return this.a.a;
    }

    public final boolean d() {
        gu6.b();
        eu6 eu6Var = gu6.c().v;
        if (eu6Var != null) {
            if (eu6Var != this && this.n != 3) {
                if (!TextUtils.equals(((ComponentName) ((z24) c().d).b).getPackageName(), "android") || !m("android.media.intent.category.LIVE_AUDIO") || m("android.media.intent.category.LIVE_VIDEO")) {
                    return false;
                }
                return true;
            }
            return true;
        }
        sc8.j("There is no default route.  The media router has not yet been fully initialized.");
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
        gu6.b();
        if (gu6.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(yt6 yt6Var) {
        if (yt6Var != null) {
            gu6.b();
            yt6Var.a();
            if (!yt6Var.b.isEmpty()) {
                ArrayList arrayList = this.k;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        for (String str : yt6Var.b) {
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
        w26.j("selector must not be null");
        return false;
    }

    public final int i(defpackage.zs6 r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eu6.i(zs6):int");
    }

    public final void j(int i) {
        vt6 vt6Var;
        vt6 vt6Var2;
        gu6.b();
        ux4 c = gu6.c();
        int min = Math.min(this.q, Math.max(0, i));
        HashMap hashMap = c.b;
        if (this == c.d && (vt6Var2 = c.e) != null) {
            vt6Var2.f(min);
        } else if (!hashMap.isEmpty() && (vt6Var = (vt6) hashMap.get(this.c)) != null) {
            vt6Var.f(min);
        }
    }

    public final void k(int i) {
        vt6 vt6Var;
        vt6 vt6Var2;
        gu6.b();
        if (i != 0) {
            ux4 c = gu6.c();
            HashMap hashMap = c.b;
            if (this == c.d && (vt6Var2 = c.e) != null) {
                vt6Var2.i(i);
            } else if (!hashMap.isEmpty() && (vt6Var = (vt6) hashMap.get(this.c)) != null) {
                vt6Var.i(i);
            }
        }
    }

    public final void l() {
        gu6.b();
        gu6.c().i(this, 3);
    }

    public final boolean m(String str) {
        gu6.b();
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
        ps psVar = this.w;
        int i = 0;
        ps psVar2 = psVar;
        if (psVar == null) {
            ?? aiaVar = new aia(0);
            this.w = aiaVar;
            psVar2 = aiaVar;
        }
        psVar2.clear();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            tt6 tt6Var = (tt6) obj;
            eu6 a = this.a.a(tt6Var.a.d());
            if (a != null) {
                this.w.put(a.c, tt6Var);
                int i2 = tt6Var.b;
                if (i2 == 2 || i2 == 3) {
                    this.v.add(a);
                }
            }
        }
        gu6.c().a.b(259, this);
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
                    sb.append(((eu6) this.v.get(i)).c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
