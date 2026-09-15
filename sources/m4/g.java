package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14513l;
    public static final String f14514m;
    public static final String f14515n;
    public static final String f14516o;
    public static final String f14517p;
    public static final String f14518q;
    public static final String f14519r;
    public static final String f14520s;
    public static final String f14521t;
    public static final String f14522u;
    public static final String v;
    public static final String f14523w;
    public static final String f14524x;
    public static final String f14525y;
    public final j f14526a;
    public final n1 f14527b;
    public final b2.x0 f14528c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14529f;
    public final i1 f14530g;
    public final e9.i0 h;
    public final e9.i0 f14531i;
    public final MediaSession.Token f14532j;
    public final e9.i0 f14533k;

    static {
        String str = e2.d0.f7883a;
        f14513l = Integer.toString(0, 36);
        f14514m = Integer.toString(1, 36);
        f14515n = Integer.toString(2, 36);
        f14516o = Integer.toString(9, 36);
        f14517p = Integer.toString(14, 36);
        f14518q = Integer.toString(13, 36);
        f14519r = Integer.toString(3, 36);
        f14520s = Integer.toString(4, 36);
        f14521t = Integer.toString(5, 36);
        f14522u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14523w = Integer.toString(7, 36);
        f14524x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14525y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, n1 n1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, i1 i1Var, MediaSession.Token token) {
        this.f14526a = jVar;
        this.h = i0Var;
        this.f14531i = i0Var2;
        this.f14533k = i0Var3;
        this.f14527b = n1Var;
        this.f14528c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14529f = bundle2;
        this.f14530g = i1Var;
        this.f14532j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14513l, 1008001300);
        bundle.putBinder(f14514m, this.f14526a.asBinder());
        bundle.putParcelable(f14515n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14516o;
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
        e9.i0 i0Var2 = this.f14531i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14517p, arrayList2);
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
        e9.i0 i0Var3 = this.f14533k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14518q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        n1 n1Var = this.f14527b;
        n1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = n1Var.f14627a.iterator();
        while (it4.hasNext()) {
            m1 m1Var = (m1) it4.next();
            m1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(m1.f14615f, m1Var.f14617a);
            bundle3.putString(m1.f14616g, m1Var.f14618b);
            bundle3.putBundle(m1.h, m1Var.f14619c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(n1.f14626b, arrayList5);
        bundle.putBundle(f14519r, bundle2);
        String str2 = f14520s;
        b2.x0 x0Var = this.f14528c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14521t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14522u, this.e);
        bundle.putBundle(v, this.f14529f);
        bundle.putBundle(f14523w, this.f14530g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14524x, 5);
        MediaSession.Token token = this.f14532j;
        if (token != null) {
            bundle.putParcelable(f14525y, token);
        }
        return bundle;
    }
}
