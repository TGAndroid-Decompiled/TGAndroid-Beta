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
    public final a0 f2771a;
    public final String f2772b;
    public final String f2773c;
    public String d;
    public String f2774e;
    public Uri f2775f;
    public boolean f2776g;
    public final boolean h;
    public int f2777i;
    public boolean f2778j;
    public int f2780l;
    public int f2781m;
    public int f2782n;
    public int f2783o;
    public int f2784p;
    public int f2785q;
    public Bundle f2787s;
    public IntentSender f2788t;
    public n f2789u;
    public a0.f f2790w;
    public final ArrayList f2779k = new ArrayList();
    public int f2786r = -1;
    public ArrayList v = new ArrayList();

    public b0(a0 a0Var, String str, String str2, boolean z10) {
        this.f2771a = a0Var;
        this.f2772b = str;
        this.f2773c = str2;
        this.h = z10;
    }

    public static r a() {
        d0.b();
        s sVar = d0.c().f2807e;
        if (sVar instanceof r) {
            return (r) sVar;
        }
        return null;
    }

    public final za.c b(b0 b0Var) {
        if (b0Var != null) {
            String str = b0Var.f2773c;
            a0.f fVar = this.f2790w;
            if (fVar != null && fVar.containsKey(str)) {
                return new za.c((q) this.f2790w.get(str), 7);
            }
            return null;
        }
        throw new NullPointerException("route must not be null");
    }

    public final t c() {
        a0 a0Var = this.f2771a;
        a0Var.getClass();
        d0.b();
        return a0Var.f2759a;
    }

    public final boolean d() {
        d0.b();
        b0 b0Var = d0.c().v;
        if (b0Var != null) {
            if (b0Var != this && this.f2782n != 3) {
                if (TextUtils.equals(((ComponentName) ((m5.i) c().d).f16880b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO")) {
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
        if (this.f2789u != null && this.f2776g) {
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
            ArrayList arrayList = this.f2779k;
            if (arrayList != null) {
                wVar.a();
                if (!wVar.f2916b.isEmpty()) {
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj = arrayList.get(i10);
                        i10++;
                        IntentFilter intentFilter = (IntentFilter) obj;
                        if (intentFilter != null) {
                            for (String str : wVar.f2916b) {
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
        int min = Math.min(this.f2785q, Math.max(0, i10));
        HashMap hashMap = c3.f2805b;
        if (this == c3.d && (sVar2 = c3.f2807e) != null) {
            sVar2.f(min);
        } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f2773c)) != null) {
            sVar.f(min);
        }
    }

    public final void k(int i10) {
        s sVar;
        s sVar2;
        d0.b();
        if (i10 != 0) {
            e c3 = d0.c();
            HashMap hashMap = c3.f2805b;
            if (this == c3.d && (sVar2 = c3.f2807e) != null) {
                sVar2.i(i10);
            } else if (!hashMap.isEmpty() && (sVar = (s) hashMap.get(this.f2773c)) != null) {
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
        ArrayList arrayList = this.f2779k;
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
        if (this.f2790w == null) {
            this.f2790w = new a0.k(0);
        }
        this.f2790w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            q qVar = (q) it.next();
            b0 a2 = this.f2771a.a(qVar.f2882a.d());
            if (a2 != null) {
                this.f2790w.put(a2.f2773c, qVar);
                int i10 = qVar.f2883b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(a2);
                }
            }
        }
        d0.c().f2804a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f2773c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f2774e);
        sb2.append(", iconUri=");
        sb2.append(this.f2775f);
        sb2.append(", enabled=");
        sb2.append(this.f2776g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f2777i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f2778j);
        sb2.append(", playbackType=");
        sb2.append(this.f2780l);
        sb2.append(", playbackStream=");
        sb2.append(this.f2781m);
        sb2.append(", deviceType=");
        sb2.append(this.f2782n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f2783o);
        sb2.append(", volume=");
        sb2.append(this.f2784p);
        sb2.append(", volumeMax=");
        sb2.append(this.f2785q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f2786r);
        sb2.append(", extras=");
        sb2.append(this.f2787s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f2788t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f2771a.d.f16880b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((b0) this.v.get(i10)).f2773c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
