package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14523l;
    public static final String f14524m;
    public static final String f14525n;
    public static final String f14526o;
    public static final String f14527p;
    public static final String f14528q;
    public static final String f14529r;
    public static final String f14530s;
    public static final String f14531t;
    public static final String f14532u;
    public static final String v;
    public static final String f14533w;
    public static final String f14534x;
    public static final String f14535y;
    public final j f14536a;
    public final n1 f14537b;
    public final b2.x0 f14538c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14539f;
    public final i1 f14540g;
    public final e9.i0 h;
    public final e9.i0 f14541i;
    public final MediaSession.Token f14542j;
    public final e9.i0 f14543k;

    static {
        String str = e2.d0.f7888a;
        f14523l = Integer.toString(0, 36);
        f14524m = Integer.toString(1, 36);
        f14525n = Integer.toString(2, 36);
        f14526o = Integer.toString(9, 36);
        f14527p = Integer.toString(14, 36);
        f14528q = Integer.toString(13, 36);
        f14529r = Integer.toString(3, 36);
        f14530s = Integer.toString(4, 36);
        f14531t = Integer.toString(5, 36);
        f14532u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14533w = Integer.toString(7, 36);
        f14534x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14535y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, n1 n1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, i1 i1Var, MediaSession.Token token) {
        this.f14536a = jVar;
        this.h = i0Var;
        this.f14541i = i0Var2;
        this.f14543k = i0Var3;
        this.f14537b = n1Var;
        this.f14538c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14539f = bundle2;
        this.f14540g = i1Var;
        this.f14542j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14523l, 1008001300);
        bundle.putBinder(f14524m, this.f14536a.asBinder());
        bundle.putParcelable(f14525n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14526o;
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
        e9.i0 i0Var2 = this.f14541i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14527p, arrayList2);
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
        e9.i0 i0Var3 = this.f14543k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14528q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        n1 n1Var = this.f14537b;
        n1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = n1Var.f14637a.iterator();
        while (it4.hasNext()) {
            m1 m1Var = (m1) it4.next();
            m1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(m1.f14625f, m1Var.f14627a);
            bundle3.putString(m1.f14626g, m1Var.f14628b);
            bundle3.putBundle(m1.h, m1Var.f14629c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(n1.f14636b, arrayList5);
        bundle.putBundle(f14529r, bundle2);
        String str2 = f14530s;
        b2.x0 x0Var = this.f14538c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14531t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14532u, this.e);
        bundle.putBundle(v, this.f14539f);
        bundle.putBundle(f14533w, this.f14540g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14534x, 5);
        MediaSession.Token token = this.f14542j;
        if (token != null) {
            bundle.putParcelable(f14535y, token);
        }
        return bundle;
    }
}
