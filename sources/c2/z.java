package c2;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

public final class z {

    public final y f2390a;

    public final String f2391b;

    public final String f2392c;
    public String d;

    public String f2393e;

    public Uri f2394f;

    public boolean f2395g;
    public final boolean h;

    public int f2396i;

    public boolean f2397j;

    public int f2399l;

    public int f2400m;

    public int f2401n;

    public int f2402o;

    public int f2403p;

    public int f2404q;

    public Bundle f2406s;

    public IntentSender f2407t;

    public n f2408u;

    public a0.f f2409w;

    public final ArrayList f2398k = new ArrayList();

    public int f2405r = -1;
    public ArrayList v = new ArrayList();

    public z(y yVar, String str, String str2, boolean z10) {
        this.f2390a = yVar;
        this.f2391b = str;
        this.f2392c = str2;
        this.h = z10;
    }

    public static q a() {
        b0.b();
        r rVar = b0.c().f2254e;
        if (rVar instanceof q) {
            return (q) rVar;
        }
        return null;
    }

    public final ae.b b(z zVar) {
        if (zVar == null) {
            throw new NullPointerException("route must not be null");
        }
        String str = zVar.f2392c;
        a0.f fVar = this.f2409w;
        if (fVar == null || !fVar.containsKey(str)) {
            return null;
        }
        return new ae.b((p) this.f2409w.get(str), 5);
    }

    public final s c() {
        y yVar = this.f2390a;
        yVar.getClass();
        b0.b();
        return yVar.f2381a;
    }

    public final boolean d() {
        b0.b();
        z zVar = b0.c().v;
        if (zVar == null) {
            throw new IllegalStateException("There is no default route.  The media router has not yet been fully initialized.");
        }
        if (zVar == this || this.f2401n == 3) {
            return true;
        }
        return TextUtils.equals(((ComponentName) ((k5.i) c().d).f14480b).getPackageName(), "android") && m("android.media.intent.category.LIVE_AUDIO") && !m("android.media.intent.category.LIVE_VIDEO");
    }

    public final boolean e() {
        return DesugarCollections.unmodifiableList(this.v).size() >= 1;
    }

    public final boolean f() {
        return this.f2408u != null && this.f2395g;
    }

    public final boolean g() {
        b0.b();
        return b0.c().e() == this;
    }

    public final boolean h(u uVar) {
        if (uVar == null) {
            throw new IllegalArgumentException("selector must not be null");
        }
        b0.b();
        ArrayList arrayList = this.f2398k;
        if (arrayList != null) {
            uVar.a();
            if (!uVar.f2350b.isEmpty()) {
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    IntentFilter intentFilter = (IntentFilter) obj;
                    if (intentFilter != null) {
                        Iterator it = uVar.f2350b.iterator();
                        while (it.hasNext()) {
                            if (intentFilter.hasCategory((String) it.next())) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int i(n nVar) {
        int i10;
        z zVar;
        int iCountActions;
        if (this.f2408u == nVar) {
            return 0;
        }
        this.f2408u = nVar;
        if (nVar == null) {
            return 0;
        }
        Bundle bundle = nVar.f2312a;
        if (Objects.equals(this.d, bundle.getString("name"))) {
            i10 = 0;
        } else {
            this.d = bundle.getString("name");
            i10 = 1;
        }
        if (!Objects.equals(this.f2393e, bundle.getString("status"))) {
            this.f2393e = bundle.getString("status");
            i10 = 1;
        }
        Uri uri = this.f2394f;
        String string = bundle.getString("iconUri");
        if (!Objects.equals(uri, string == null ? null : Uri.parse(string))) {
            String string2 = bundle.getString("iconUri");
            this.f2394f = string2 == null ? null : Uri.parse(string2);
            i10 = 1;
        }
        if (this.f2395g != bundle.getBoolean("enabled", true)) {
            this.f2395g = bundle.getBoolean("enabled", true);
            i10 = 1;
        }
        if (this.f2396i != bundle.getInt("connectionState", 0)) {
            this.f2396i = bundle.getInt("connectionState", 0);
            i10 = 1;
        }
        ArrayList arrayListB = nVar.b();
        ArrayList arrayList = this.f2398k;
        if (arrayList != arrayListB) {
            if (arrayList != null) {
                ListIterator listIterator = arrayList.listIterator();
                ListIterator listIterator2 = arrayListB.listIterator();
                while (true) {
                    if (listIterator.hasNext() && listIterator2.hasNext()) {
                        IntentFilter intentFilter = (IntentFilter) listIterator.next();
                        IntentFilter intentFilter2 = (IntentFilter) listIterator2.next();
                        if (intentFilter != intentFilter2) {
                            if (intentFilter != null && intentFilter2 != null && (iCountActions = intentFilter.countActions()) == intentFilter2.countActions()) {
                                int i11 = 0;
                                while (true) {
                                    if (i11 >= iCountActions) {
                                        int iCountCategories = intentFilter.countCategories();
                                        if (iCountCategories == intentFilter2.countCategories()) {
                                            int i12 = 0;
                                            while (true) {
                                                if (i12 >= iCountCategories) {
                                                    continue;
                                                } else if (intentFilter.getCategory(i12).equals(intentFilter2.getCategory(i12))) {
                                                    i12++;
                                                }
                                            }
                                        }
                                    } else if (intentFilter.getAction(i11).equals(intentFilter2.getAction(i11))) {
                                        i11++;
                                    }
                                }
                            }
                        }
                    } else if (listIterator.hasNext() || listIterator2.hasNext()) {
                    }
                    arrayList.clear();
                    arrayList.addAll(nVar.b());
                    i10 = 1;
                }
            } else {
                arrayList.clear();
                arrayList.addAll(nVar.b());
                i10 = 1;
            }
        }
        if (this.f2399l != bundle.getInt("playbackType", 1)) {
            this.f2399l = bundle.getInt("playbackType", 1);
            i10 = 1;
        }
        if (this.f2400m != bundle.getInt("playbackStream", -1)) {
            this.f2400m = bundle.getInt("playbackStream", -1);
            i10 = 1;
        }
        if (this.f2401n != bundle.getInt("deviceType")) {
            this.f2401n = bundle.getInt("deviceType");
            i10 = 1;
        }
        int i13 = 3;
        if (this.f2402o != bundle.getInt("volumeHandling", 0)) {
            this.f2402o = bundle.getInt("volumeHandling", 0);
            i10 = 3;
        }
        if (this.f2403p != bundle.getInt("volume")) {
            this.f2403p = bundle.getInt("volume");
            i10 = 3;
        }
        if (this.f2404q != bundle.getInt("volumeMax")) {
            this.f2404q = bundle.getInt("volumeMax");
        } else {
            i13 = i10;
        }
        if (this.f2405r != bundle.getInt("presentationDisplayId", -1)) {
            this.f2405r = bundle.getInt("presentationDisplayId", -1);
            i13 |= 5;
        }
        if (!Objects.equals(this.f2406s, bundle.getBundle("extras"))) {
            this.f2406s = bundle.getBundle("extras");
            i13 |= 1;
        }
        if (!Objects.equals(this.f2407t, (IntentSender) bundle.getParcelable("settingsIntent"))) {
            this.f2407t = (IntentSender) bundle.getParcelable("settingsIntent");
            i13 |= 1;
        }
        if (this.f2397j != bundle.getBoolean("canDisconnect", false)) {
            this.f2397j = bundle.getBoolean("canDisconnect", false);
            i13 |= 5;
        }
        ArrayList arrayListC = nVar.c();
        ArrayList arrayList2 = new ArrayList();
        boolean z10 = arrayListC.size() != this.v.size();
        if (!arrayListC.isEmpty()) {
            e eVarC = b0.c();
            int size = arrayListC.size();
            int i14 = 0;
            while (i14 < size) {
                Object obj = arrayListC.get(i14);
                i14++;
                eVarC.getClass();
                String str = (String) eVarC.f2259k.get(new q0.b(((ComponentName) this.f2390a.d.f14480b).flattenToShortString(), (String) obj));
                ArrayList arrayList3 = eVarC.f2258j;
                int size2 = arrayList3.size();
                int i15 = 0;
                do {
                    if (i15 >= size2) {
                        zVar = null;
                        break;
                    }
                    Object obj2 = arrayList3.get(i15);
                    i15++;
                    zVar = (z) obj2;
                } while (!zVar.f2392c.equals(str));
                if (zVar != null) {
                    arrayList2.add(zVar);
                    if (!z10 && !this.v.contains(zVar)) {
                        z10 = true;
                    }
                }
            }
        }
        if (!z10) {
            return i13;
        }
        this.v = arrayList2;
        return i13 | 1;
    }

    public final void j(int i10) {
        r rVar;
        r rVar2;
        b0.b();
        e eVarC = b0.c();
        int iMin = Math.min(this.f2404q, Math.max(0, i10));
        HashMap map = eVarC.f2252b;
        if (this == eVarC.d && (rVar2 = eVarC.f2254e) != null) {
            rVar2.f(iMin);
        } else {
            if (map.isEmpty() || (rVar = (r) map.get(this.f2392c)) == null) {
                return;
            }
            rVar.f(iMin);
        }
    }

    public final void k(int i10) {
        r rVar;
        r rVar2;
        b0.b();
        if (i10 != 0) {
            e eVarC = b0.c();
            HashMap map = eVarC.f2252b;
            if (this == eVarC.d && (rVar2 = eVarC.f2254e) != null) {
                rVar2.i(i10);
            } else {
                if (map.isEmpty() || (rVar = (r) map.get(this.f2392c)) == null) {
                    return;
                }
                rVar.i(i10);
            }
        }
    }

    public final void l() {
        b0.b();
        b0.c().i(this, 3);
    }

    public final boolean m(String str) {
        b0.b();
        ArrayList arrayList = this.f2398k;
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
        if (this.f2409w == null) {
            this.f2409w = new a0.f(0);
        }
        this.f2409w.clear();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            z zVarA = this.f2390a.a(pVar.f2322a.d());
            if (zVarA != null) {
                this.f2409w.put(zVarA.f2392c, pVar);
                int i10 = pVar.f2323b;
                if (i10 == 2 || i10 == 3) {
                    this.v.add(zVarA);
                }
            }
        }
        b0.c().f2251a.b(259, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MediaRouter.RouteInfo{ uniqueId=");
        sb2.append(this.f2392c);
        sb2.append(", name=");
        sb2.append(this.d);
        sb2.append(", description=");
        sb2.append(this.f2393e);
        sb2.append(", iconUri=");
        sb2.append(this.f2394f);
        sb2.append(", enabled=");
        sb2.append(this.f2395g);
        sb2.append(", isSystemRoute=");
        sb2.append(this.h);
        sb2.append(", connectionState=");
        sb2.append(this.f2396i);
        sb2.append(", canDisconnect=");
        sb2.append(this.f2397j);
        sb2.append(", playbackType=");
        sb2.append(this.f2399l);
        sb2.append(", playbackStream=");
        sb2.append(this.f2400m);
        sb2.append(", deviceType=");
        sb2.append(this.f2401n);
        sb2.append(", volumeHandling=");
        sb2.append(this.f2402o);
        sb2.append(", volume=");
        sb2.append(this.f2403p);
        sb2.append(", volumeMax=");
        sb2.append(this.f2404q);
        sb2.append(", presentationDisplayId=");
        sb2.append(this.f2405r);
        sb2.append(", extras=");
        sb2.append(this.f2406s);
        sb2.append(", settingsIntent=");
        sb2.append(this.f2407t);
        sb2.append(", providerPackageName=");
        sb2.append(((ComponentName) this.f2390a.d.f14480b).getPackageName());
        if (e()) {
            sb2.append(", members=[");
            int size = this.v.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                if (this.v.get(i10) != this) {
                    sb2.append(((z) this.v.get(i10)).f2392c);
                }
            }
            sb2.append(']');
        }
        sb2.append(" }");
        return sb2.toString();
    }
}
