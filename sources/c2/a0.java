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
    public final z f2090a;
    public final String f2091b;
    public final String f2092c;
    public String d;
    public String f2093e;
    public Uri f2094f;
    public boolean f2095g;
    public final boolean h;
    public int f2096i;
    public boolean f2097j;
    public int f2099l;
    public int f2100m;
    public int f2101n;
    public int f2102o;
    public int f2103p;
    public int f2104q;
    public Bundle f2106s;
    public IntentSender f2107t;
    public n f2108u;
    public a0.f f2109w;
    public final ArrayList f2098k = new ArrayList();
    public int f2105r = -1;
    public ArrayList v = new ArrayList();

    public a0(z zVar, String str, String str2, boolean z10) {
        this.f2090a = zVar;
        this.f2091b = str;
        this.f2092c = str2;
        this.h = z10;
    }

    public static q a() {
        c0.b();
        r rVar = c0.c().f2137e;
        if (rVar instanceof q) {
            return (q) rVar;
        }
        return null;
    }

    public final fa.c b(a0 a0Var) {
        if (a0Var != null) {
            String str = a0Var.f2092c;
            a0.f fVar = this.f2109w;
            if (fVar != null && fVar.containsKey(str)) {
                return new fa.c((p) this.f2109w.get(str), 7);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final s c() {
        z zVar = this.f2090a;
        zVar.getClass();
        c0.b();
        return zVar.f2269a;
    }

    public final boolean d() {
        c0.b();
        a0 a0Var = c0.c().v;
        if (a0Var != null) {
            if (a0Var != this && this.f2101n != 3) {
                if (TextUtils.equals(((ComponentName) ((android.support.v4.media.c) c().d).f281b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f2108u != null && this.f2095g) {
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
            ArrayList arrayList = this.f2098k;
            if (arrayList != null) {
                vVar.a();
                if (!vVar.f2238b.isEmpty()) {
                    int size = arrayList.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList.get(i9);
                        i9++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : vVar.f2238b) {
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

    public final void j(int i9) {
        r rVar;
        r rVar2;
        c0.b();
        e c10 = c0.c();
        int min = Math.min(this.f2104q, Math.max(0, i9));
        HashMap hashMap = c10.f2135b;
        if (this == c10.d && (rVar2 = c10.f2137e) != null) {
            rVar2.f(min);
        } else if (!hashMap.isEmpty() && (rVar = (r) hashMap.get(this.f2092c)) != null) {
            rVar.f(min);
        }
    }

    public final void k(int i9) {
        r rVar;
        r rVar2;
        c0.b();
        if (i9 != 0) {
            e c10 = c0.c();
            HashMap hashMap = c10.f2135b;
            if (this == c10.d && (rVar2 = c10.f2137e) != null) {
                rVar2.i(i9);
            } else if (!hashMap.isEmpty() && (rVar = (r) hashMap.get(this.f2092c)) != null) {
                rVar.i(i9);
            }
        }
    }

    public final void l() {
        c0.b();
        c0.c().i(this, 3);
    }

    public final boolean m(String str) {
        c0.b();
        ArrayList arrayList = this.f2098k;
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            if (((IntentFilter) obj).hasCategory(str)) {
                return true;
            }
        }
        return false;
    }

    public final void n(Collection collection) {
        this.v.clear();
        if (this.f2109w == null) {
            this.f2109w = new a0.k(0);
        }
        this.f2109w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            a0 a2 = this.f2090a.a(pVar.f2204a.d());
            if (a2 != null) {
                this.f2109w.put(a2.f2092c, pVar);
                int i9 = pVar.f2205b;
                if (i9 == 2 || i9 == 3) {
                    this.v.add(a2);
                }
            }
        }
        c0.c().f2134a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f2092c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f2093e);
        sb2.append(", iconUri=");
        sb2.append(this.f2094f);
        sb2.append(", enabled=");
        sb2.append(this.f2095g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f2096i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f2097j);
        sb2.append(", playbackType=");
        sb2.append(this.f2099l);
        sb2.append(", playbackStream=");
        sb2.append(this.f2100m);
        sb2.append(", deviceType=");
        sb2.append(this.f2101n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f2102o);
        sb2.append(", volume=");
        sb2.append(this.f2103p);
        sb2.append(", volumeMax=");
        sb2.append(this.f2104q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f2105r);
        sb2.append(", extras=");
        sb2.append(this.f2106s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f2107t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f2090a.d.f281b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i9 = 0; i9 < size; i9++) {
                if (i9 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i9) != this) {
                    sb2.append(((a0) this.v.get(i9)).f2092c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
