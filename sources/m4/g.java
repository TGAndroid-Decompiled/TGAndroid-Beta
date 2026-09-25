package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14792l;
    public static final String f14793m;
    public static final String f14794n;
    public static final String f14795o;
    public static final String f14796p;
    public static final String f14797q;
    public static final String f14798r;
    public static final String f14799s;
    public static final String f14800t;
    public static final String f14801u;
    public static final String v;
    public static final String f14802w;
    public static final String f14803x;
    public static final String f14804y;
    public final j f14805a;
    public final h1 f14806b;
    public final b2.x0 f14807c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14808f;
    public final c1 f14809g;
    public final e9.i0 h;
    public final e9.i0 f14810i;
    public final MediaSession.Token f14811j;
    public final e9.i0 f14812k;

    static {
        String str = e2.d0.f7870a;
        f14792l = Integer.toString(0, 36);
        f14793m = Integer.toString(1, 36);
        f14794n = Integer.toString(2, 36);
        f14795o = Integer.toString(9, 36);
        f14796p = Integer.toString(14, 36);
        f14797q = Integer.toString(13, 36);
        f14798r = Integer.toString(3, 36);
        f14799s = Integer.toString(4, 36);
        f14800t = Integer.toString(5, 36);
        f14801u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14802w = Integer.toString(7, 36);
        f14803x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14804y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f14805a = jVar;
        this.h = i0Var;
        this.f14810i = i0Var2;
        this.f14812k = i0Var3;
        this.f14806b = h1Var;
        this.f14807c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14808f = bundle2;
        this.f14809g = c1Var;
        this.f14811j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14792l, 1008001300);
        bundle.putBinder(f14793m, this.f14805a.asBinder());
        bundle.putParcelable(f14794n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14795o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            Iterator<E> it = i0Var.iterator();
            if (!it.hasNext()) {
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                a4.a.z(it.next());
                throw null;
            }
        }
        e9.i0 i0Var2 = this.f14810i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14796p, arrayList2);
                } else {
                    a4.a.z(it2.next());
                    throw null;
                }
            } else {
                e9.a1 a2 = a.a(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a2.d);
                e9.g0 listIterator = a2.listIterator(0);
                if (!listIterator.hasNext()) {
                    bundle.putParcelableArrayList(str, arrayList3);
                } else {
                    a4.a.z(listIterator.next());
                    throw null;
                }
            }
        }
        e9.i0 i0Var3 = this.f14812k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14797q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f14806b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f14823a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f14815f, g1Var.f14817a);
            bundle3.putString(g1.f14816g, g1Var.f14818b);
            bundle3.putBundle(g1.h, g1Var.f14819c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f14822b, arrayList5);
        bundle.putBundle(f14798r, bundle2);
        String str2 = f14799s;
        b2.x0 x0Var = this.f14807c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14800t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14801u, this.e);
        bundle.putBundle(v, this.f14808f);
        bundle.putBundle(f14802w, this.f14809g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14803x, 5);
        MediaSession.Token token = this.f14811j;
        if (token != null) {
            bundle.putParcelable(f14804y, token);
        }
        return bundle;
    }
}
