package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14819l;
    public static final String f14820m;
    public static final String f14821n;
    public static final String f14822o;
    public static final String f14823p;
    public static final String f14824q;
    public static final String f14825r;
    public static final String f14826s;
    public static final String f14827t;
    public static final String f14828u;
    public static final String v;
    public static final String f14829w;
    public static final String f14830x;
    public static final String f14831y;
    public final j f14832a;
    public final h1 f14833b;
    public final b2.x0 f14834c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14835f;
    public final c1 f14836g;
    public final e9.i0 h;
    public final e9.i0 f14837i;
    public final MediaSession.Token f14838j;
    public final e9.i0 f14839k;

    static {
        String str = e2.d0.f7872a;
        f14819l = Integer.toString(0, 36);
        f14820m = Integer.toString(1, 36);
        f14821n = Integer.toString(2, 36);
        f14822o = Integer.toString(9, 36);
        f14823p = Integer.toString(14, 36);
        f14824q = Integer.toString(13, 36);
        f14825r = Integer.toString(3, 36);
        f14826s = Integer.toString(4, 36);
        f14827t = Integer.toString(5, 36);
        f14828u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14829w = Integer.toString(7, 36);
        f14830x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14831y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f14832a = jVar;
        this.h = i0Var;
        this.f14837i = i0Var2;
        this.f14839k = i0Var3;
        this.f14833b = h1Var;
        this.f14834c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14835f = bundle2;
        this.f14836g = c1Var;
        this.f14838j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14819l, 1008001300);
        bundle.putBinder(f14820m, this.f14832a.asBinder());
        bundle.putParcelable(f14821n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14822o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            Iterator<E> it = i0Var.iterator();
            if (!it.hasNext()) {
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                a4.a.y(it.next());
                throw null;
            }
        }
        e9.i0 i0Var2 = this.f14837i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14823p, arrayList2);
                } else {
                    a4.a.y(it2.next());
                    throw null;
                }
            } else {
                e9.a1 a2 = a.a(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a2.d);
                e9.g0 listIterator = a2.listIterator(0);
                if (!listIterator.hasNext()) {
                    bundle.putParcelableArrayList(str, arrayList3);
                } else {
                    a4.a.y(listIterator.next());
                    throw null;
                }
            }
        }
        e9.i0 i0Var3 = this.f14839k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14824q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f14833b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f14850a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f14842f, g1Var.f14844a);
            bundle3.putString(g1.f14843g, g1Var.f14845b);
            bundle3.putBundle(g1.h, g1Var.f14846c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f14849b, arrayList5);
        bundle.putBundle(f14825r, bundle2);
        String str2 = f14826s;
        b2.x0 x0Var = this.f14834c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14827t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14828u, this.e);
        bundle.putBundle(v, this.f14835f);
        bundle.putBundle(f14829w, this.f14836g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14830x, 5);
        MediaSession.Token token = this.f14838j;
        if (token != null) {
            bundle.putParcelable(f14831y, token);
        }
        return bundle;
    }
}
