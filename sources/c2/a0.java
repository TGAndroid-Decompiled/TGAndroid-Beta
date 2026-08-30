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
    public final z f1876a;
    public final String f1877b;
    public final String f1878c;
    public String d;
    public String e;
    public Uri f1879f;
    public boolean f1880g;
    public final boolean h;
    public int f1881i;
    public boolean f1882j;
    public int f1884l;
    public int f1885m;
    public int f1886n;
    public int f1887o;
    public int f1888p;
    public int f1889q;
    public Bundle f1891s;
    public IntentSender f1892t;
    public n f1893u;
    public a0.f f1894w;
    public final ArrayList f1883k = new ArrayList();
    public int f1890r = -1;
    public ArrayList v = new ArrayList();

    public a0(z zVar, String str, String str2, boolean z4) {
        this.f1876a = zVar;
        this.f1877b = str;
        this.f1878c = str2;
        this.h = z4;
    }

    public static r a() {
        c0.b();
        s sVar = c0.c().e;
        if (sVar instanceof r) {
            return (r) sVar;
        }
        return null;
    }

    public final a3.c b(a0 a0Var) {
        if (a0Var != null) {
            String str = a0Var.f1878c;
            a0.f fVar = this.f1894w;
            if (fVar != null && fVar.containsKey(str)) {
                return new a3.c((q) this.f1894w.get(str), 5);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final t c() {
        z zVar = this.f1876a;
        zVar.getClass();
        c0.b();
        return zVar.f2043a;
    }

    public final boolean d() {
        c0.b();
        a0 a0Var = c0.c().v;
        if (a0Var != null) {
            if (a0Var != this && this.f1886n != 3) {
                if (TextUtils.equals(((ComponentName) ((o5.i) c().d).f16457b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f1893u != null && this.f1880g) {
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
            ArrayList arrayList = this.f1883k;
            if (arrayList != null) {
                vVar.a();
                if (!vVar.f2012b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : vVar.f2012b) {
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
        int min = Math.min(this.f1889q, Math.max(0, i10));
        HashMap hashMap = c3.f1912b;
        if (this == c3.d && (sVar2 = c3.e) != null) {
            sVar2.f(min);
        } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f1878c)) != null) {
            sVar.f(min);
        }
    }

    public final void k(int i10) {
        s sVar;
        s sVar2;
        c0.b();
        if (i10 != 0) {
            e c3 = c0.c();
            HashMap hashMap = c3.f1912b;
            if (this == c3.d && (sVar2 = c3.e) != null) {
                sVar2.i(i10);
            } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f1878c)) != null) {
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
        ArrayList arrayList = this.f1883k;
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
        if (this.f1894w == null) {
            this.f1894w = new a0.k(0);
        }
        this.f1894w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            a0 a2 = this.f1876a.a(qVar.f1986a.d());
            if (a2 != null) {
                this.f1894w.put(a2.f1878c, qVar);
                int i10 = qVar.f1987b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        c0.c().f1911a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb.append(this.f1878c);
        sb.append(", name=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", iconUri=");
        sb.append(this.f1879f);
        sb.append(", enabled=");
        sb.append(this.f1880g);
        sb.append(", isSystemRoute=");
        sb.append(this.h);
        sb.append(", connectionState=");
        sb.append(this.f1881i);
        sb.append(", canDisconnect=");
        sb.append(this.f1882j);
        sb.append(", playbackType=");
        sb.append(this.f1884l);
        sb.append(", playbackStream=");
        sb.append(this.f1885m);
        sb.append(", deviceType=");
        sb.append(this.f1886n);
        sb.append(", volumeHandling=");
        sb.append(this.f1887o);
        sb.append(", volume=");
        sb.append(this.f1888p);
        sb.append(", volumeMax=");
        sb.append(this.f1889q);
        sb.append(", presentationDisplayId=");
        sb.append(this.f1890r);
        sb.append(", extras=");
        sb.append(this.f1891s);
        sb.append(", settingsIntent=");
        sb.append(this.f1892t);
        sb.append(", providerPackageName=");
        sb.append(((ComponentName) this.f1876a.d.f16457b).getPackageName());
        if (e()) {
            sb.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb.append(((a0) this.v.get(i10)).f1878c);
                }
            }
            sb.append(']');
        }
        sb.append(" }");
        return sb.toString();
    }
}
