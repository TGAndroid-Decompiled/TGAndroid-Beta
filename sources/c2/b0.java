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
public final class b0 {
    public final a0 f1909a;
    public final String f1910b;
    public final String f1911c;
    public String d;
    public String e;
    public Uri f1912f;
    public boolean f1913g;
    public final boolean h;
    public int f1914i;
    public boolean f1915j;
    public int f1917l;
    public int f1918m;
    public int f1919n;
    public int f1920o;
    public int f1921p;
    public int f1922q;
    public Bundle f1924s;
    public IntentSender f1925t;
    public n f1926u;
    public a0.f f1927w;
    public final ArrayList f1916k = new ArrayList();
    public int f1923r = -1;
    public ArrayList v = new ArrayList();

    public b0(a0 a0Var, String str, String str2, boolean z4) {
        this.f1909a = a0Var;
        this.f1910b = str;
        this.f1911c = str2;
        this.h = z4;
    }

    public static r a() {
        d0.b();
        s sVar = d0.c().e;
        if (sVar instanceof r) {
            return (r) sVar;
        }
        return null;
    }

    public final bb.b b(b0 b0Var) {
        if (b0Var != null) {
            String str = b0Var.f1911c;
            a0.f fVar = this.f1927w;
            if (fVar != null && fVar.containsKey(str)) {
                return new bb.b((q) this.f1927w.get(str), 5);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final t c() {
        a0 a0Var = this.f1909a;
        a0Var.getClass();
        d0.b();
        return a0Var.f1898a;
    }

    public final boolean d() {
        d0.b();
        b0 b0Var = d0.c().v;
        if (b0Var != null) {
            if (b0Var != this && this.f1919n != 3) {
                if (TextUtils.equals(((ComponentName) ((o5.i) c().d).f16439b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f1926u != null && this.f1913g) {
            return true;
        }
        return false;
    }

    public final boolean g() {
        d0.b();
        if (d0.c().e() == this) {
            return true;
        }
        return false;
    }

    public final boolean h(w wVar) {
        if (wVar != null) {
            d0.b();
            ArrayList arrayList = this.f1916k;
            if (arrayList != null) {
                wVar.a();
                if (!wVar.f2043b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : wVar.f2043b) {
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
        throw new UnsupportedOperationException("Method not decompiled: c2.b0.i(c2.n):int");
    }

    public final void j(int i10) {
        s sVar;
        s sVar2;
        d0.b();
        e c3 = d0.c();
        int min = Math.min(this.f1922q, Math.max(0, i10));
        HashMap hashMap = c3.f1939b;
        if (this == c3.d && (sVar2 = c3.e) != null) {
            sVar2.f(min);
        } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f1911c)) != null) {
            sVar.f(min);
        }
    }

    public final void k(int i10) {
        s sVar;
        s sVar2;
        d0.b();
        if (i10 != 0) {
            e c3 = d0.c();
            HashMap hashMap = c3.f1939b;
            if (this == c3.d && (sVar2 = c3.e) != null) {
                sVar2.i(i10);
            } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f1911c)) != null) {
                sVar.i(i10);
            }
        }
    }

    public final void l() {
        d0.b();
        d0.c().i(this, 3);
    }

    public final boolean m(String str) {
        d0.b();
        ArrayList arrayList = this.f1916k;
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
        if (this.f1927w == null) {
            this.f1927w = new a0.k(0);
        }
        this.f1927w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            b0 a2 = this.f1909a.a(qVar.f2011a.d());
            if (a2 != null) {
                this.f1927w.put(a2.f1911c, qVar);
                int i10 = qVar.f2012b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        d0.c().f1938a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f1911c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f1912f);
        sb.append(", enabled=");
        sb.append(this.f1913g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.f1914i);
        sb.append(", canDisconnect=");
        sb.append(this.f1915j);
        sb.append(", playbackType=");
        sb.append(this.f1917l);
        sb.append(", playbackStream=");
        sb.append(this.f1918m);
        sb.append(", deviceType=");
        sb.append(this.f1919n);
        sb.append(", volumeHandling=");
        sb.append(this.f1920o);
        sb.append(", volume=");
        sb.append(this.f1921p);
        sb.append(", volumeMax=");
        sb.append(this.f1922q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f1923r);
        sb.append(", extras=");
        sb.append(this.f1924s);
        sb.append(", settingsIntent=");
        sb.append(this.f1925t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f1909a.d.f16439b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb.append(((b0) this.v.get(i10)).f1911c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
