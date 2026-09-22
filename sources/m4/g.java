package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14511l;
    public static final String f14512m;
    public static final String f14513n;
    public static final String f14514o;
    public static final String f14515p;
    public static final String f14516q;
    public static final String f14517r;
    public static final String f14518s;
    public static final String f14519t;
    public static final String f14520u;
    public static final String v;
    public static final String f14521w;
    public static final String f14522x;
    public static final String f14523y;
    public final j f14524a;
    public final n1 f14525b;
    public final b2.x0 f14526c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14527f;
    public final i1 f14528g;
    public final e9.i0 h;
    public final e9.i0 f14529i;
    public final MediaSession.Token f14530j;
    public final e9.i0 f14531k;

    static {
        String str = e2.d0.f7885a;
        f14511l = Integer.toString(0, 36);
        f14512m = Integer.toString(1, 36);
        f14513n = Integer.toString(2, 36);
        f14514o = Integer.toString(9, 36);
        f14515p = Integer.toString(14, 36);
        f14516q = Integer.toString(13, 36);
        f14517r = Integer.toString(3, 36);
        f14518s = Integer.toString(4, 36);
        f14519t = Integer.toString(5, 36);
        f14520u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14521w = Integer.toString(7, 36);
        f14522x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14523y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, n1 n1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, i1 i1Var, MediaSession.Token token) {
        this.f14524a = jVar;
        this.h = i0Var;
        this.f14529i = i0Var2;
        this.f14531k = i0Var3;
        this.f14525b = n1Var;
        this.f14526c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14527f = bundle2;
        this.f14528g = i1Var;
        this.f14530j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14511l, 1008001300);
        bundle.putBinder(f14512m, this.f14524a.asBinder());
        bundle.putParcelable(f14513n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14514o;
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
        e9.i0 i0Var2 = this.f14529i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14515p, arrayList2);
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
        e9.i0 i0Var3 = this.f14531k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14516q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        n1 n1Var = this.f14525b;
        n1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = n1Var.f14625a.iterator();
        while (it4.hasNext()) {
            m1 m1Var = (m1) it4.next();
            m1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(m1.f14613f, m1Var.f14615a);
            bundle3.putString(m1.f14614g, m1Var.f14616b);
            bundle3.putBundle(m1.h, m1Var.f14617c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(n1.f14624b, arrayList5);
        bundle.putBundle(f14517r, bundle2);
        String str2 = f14518s;
        b2.x0 x0Var = this.f14526c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14519t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14520u, this.e);
        bundle.putBundle(v, this.f14527f);
        bundle.putBundle(f14521w, this.f14528g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14522x, 5);
        MediaSession.Token token = this.f14530j;
        if (token != null) {
            bundle.putParcelable(f14523y, token);
        }
        return bundle;
    }
}
