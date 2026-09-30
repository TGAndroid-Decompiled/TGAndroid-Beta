package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14793l;
    public static final String f14794m;
    public static final String f14795n;
    public static final String f14796o;
    public static final String f14797p;
    public static final String f14798q;
    public static final String f14799r;
    public static final String f14800s;
    public static final String f14801t;
    public static final String f14802u;
    public static final String v;
    public static final String f14803w;
    public static final String f14804x;
    public static final String f14805y;
    public final j f14806a;
    public final h1 f14807b;
    public final b2.x0 f14808c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14809f;
    public final c1 f14810g;
    public final e9.i0 h;
    public final e9.i0 f14811i;
    public final MediaSession.Token f14812j;
    public final e9.i0 f14813k;

    static {
        String str = e2.d0.f7870a;
        f14793l = Integer.toString(0, 36);
        f14794m = Integer.toString(1, 36);
        f14795n = Integer.toString(2, 36);
        f14796o = Integer.toString(9, 36);
        f14797p = Integer.toString(14, 36);
        f14798q = Integer.toString(13, 36);
        f14799r = Integer.toString(3, 36);
        f14800s = Integer.toString(4, 36);
        f14801t = Integer.toString(5, 36);
        f14802u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14803w = Integer.toString(7, 36);
        f14804x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14805y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f14806a = jVar;
        this.h = i0Var;
        this.f14811i = i0Var2;
        this.f14813k = i0Var3;
        this.f14807b = h1Var;
        this.f14808c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14809f = bundle2;
        this.f14810g = c1Var;
        this.f14812j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14793l, 1008001300);
        bundle.putBinder(f14794m, this.f14806a.asBinder());
        bundle.putParcelable(f14795n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14796o;
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
        e9.i0 i0Var2 = this.f14811i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14797p, arrayList2);
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
        e9.i0 i0Var3 = this.f14813k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14798q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f14807b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f14824a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f14816f, g1Var.f14818a);
            bundle3.putString(g1.f14817g, g1Var.f14819b);
            bundle3.putBundle(g1.h, g1Var.f14820c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f14823b, arrayList5);
        bundle.putBundle(f14799r, bundle2);
        String str2 = f14800s;
        b2.x0 x0Var = this.f14808c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14801t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14802u, this.e);
        bundle.putBundle(v, this.f14809f);
        bundle.putBundle(f14803w, this.f14810g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14804x, 5);
        MediaSession.Token token = this.f14812j;
        if (token != null) {
            bundle.putParcelable(f14805y, token);
        }
        return bundle;
    }
}
