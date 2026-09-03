package c2;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
public final class a0 {
    public final z f2038a;
    public final String f2039b;
    public final String f2040c;
    public String d;
    public String f2041e;
    public Uri f2042f;
    public boolean f2043g;
    public final boolean h;
    public int f2044i;
    public boolean f2045j;
    public int f2047l;
    public int f2048m;
    public int f2049n;
    public int f2050o;
    public int f2051p;
    public int f2052q;
    public Bundle f2054s;
    public IntentSender f2055t;
    public n f2056u;
    public a0.f f2057w;
    public final ArrayList f2046k = new ArrayList();
    public int f2053r = -1;
    public ArrayList v = new ArrayList();

    public a0(z zVar, String str, String str2, boolean z4) {
        this.f2038a = zVar;
        this.f2039b = str;
        this.f2040c = str2;
        this.h = z4;
    }

    public static r a() {
        c0.b();
        s sVar = c0.c().f2079e;
        if (sVar instanceof r) {
            return (r) sVar;
        }
        return null;
    }

    public final ja.c b(a0 a0Var) {
        if (a0Var != null) {
            String str = a0Var.f2040c;
            a0.f fVar = this.f2057w;
            if (fVar != null && fVar.containsKey(str)) {
                return new ja.c((q) this.f2057w.get(str));
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final t c() {
        z zVar = this.f2038a;
        zVar.getClass();
        c0.b();
        return zVar.f2219a;
    }

    public final boolean d() {
        c0.b();
        a0 a0Var = c0.c().v;
        if (a0Var != null) {
            if (a0Var != this && this.f2049n != 3) {
                if (TextUtils.equals(((ComponentName) ((y5.h) c().d).f50813b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
                    return true;
                }
                return false;
            }
            return true;
        }
        throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
    }

    public final boolean e() {
        if (DesugarCollections.unmodifiableList(this.v).size() >= 1) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        if (this.f2056u != null && this.f2043g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        c0.b();
        if (c0.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(v vVar) {
        if (vVar != null) {
            c0.b();
            ArrayList arrayList = this.f2046k;
            if (arrayList != null) {
                vVar.a();
                if (!vVar.f2185b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : vVar.f2185b) {
                                if (intentFilter.hasCategory(str)) {
                                    return true;
                                }
                            }
                            continue;
                        }
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public final int i(c2.n r18) {
        throw new UnsupportedOperationException("Method not decompiled: c2.a0.i(c2.n):int");
    }

    public final void j(int i10) {
        s sVar;
        s sVar2;
        c0.b();
        e c3 = c0.c();
        int min = Math.min(this.f2052q, Math.max(0, i10));
        HashMap hashMap = c3.f2077b;
        if (this == c3.d && (sVar2 = c3.f2079e) != null) {
            sVar2.f(min);
        } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f2040c)) != null) {
            sVar.f(min);
        }
    }

    public final void k(int i10) {
        s sVar;
        s sVar2;
        c0.b();
        if (i10 != 0) {
            e c3 = c0.c();
            HashMap hashMap = c3.f2077b;
            if (this == c3.d && (sVar2 = c3.f2079e) != null) {
                sVar2.i(i10);
            } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f2040c)) != null) {
                sVar.i(i10);
            }
        }
    }

    public final void l() {
        c0.b();
        c0.c().i(this, 3);
    }

    public final boolean m(String str) {
        c0.b();
        ArrayList arrayList = this.f2046k;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.f2057w == null) {
            this.f2057w = new a0.k(0);
        }
        this.f2057w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            a0 a2 = this.f2038a.a(qVar.f2155a.d());
            if (a2 != null) {
                this.f2057w.put(a2.f2040c, qVar);
                int i10 = qVar.f2156b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        c0.c().f2076a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f2040c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.f2041e);
        sb.append(", iconUri=");
        sb.append(this.f2042f);
        sb.append(", enabled=");
        sb.append(this.f2043g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.f2044i);
        sb.append(", canDisconnect=");
        sb.append(this.f2045j);
        sb.append(", playbackType=");
        sb.append(this.f2047l);
        sb.append(", playbackStream=");
        sb.append(this.f2048m);
        sb.append(", deviceType=");
        sb.append(this.f2049n);
        sb.append(", volumeHandling=");
        sb.append(this.f2050o);
        sb.append(", volume=");
        sb.append(this.f2051p);
        sb.append(", volumeMax=");
        sb.append(this.f2052q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f2053r);
        sb.append(", extras=");
        sb.append(this.f2054s);
        sb.append(", settingsIntent=");
        sb.append(this.f2055t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f2038a.d.f50813b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb.append(((a0) this.v.get(i10)).f2040c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
