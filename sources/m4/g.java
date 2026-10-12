package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f15823l;
    public static final String f15824m;
    public static final String f15825n;
    public static final String f15826o;
    public static final String f15827p;
    public static final String f15828q;
    public static final String f15829r;
    public static final String f15830s;
    public static final String f15831t;
    public static final String f15832u;
    public static final String v;
    public static final String f15833w;
    public static final String f15834x;
    public static final String f15835y;
    public final j f15836a;
    public final j1 f15837b;
    public final b2.x0 f15838c;
    public final b2.x0 d;
    public final Bundle f15839e;
    public final Bundle f15840f;
    public final e1 f15841g;
    public final e9.i0 h;
    public final e9.i0 f15842i;
    public final MediaSession.Token f15843j;
    public final e9.i0 f15844k;

    static {
        String str = e2.d0.f8529a;
        f15823l = Integer.toString(0, 36);
        f15824m = Integer.toString(1, 36);
        f15825n = Integer.toString(2, 36);
        f15826o = Integer.toString(9, 36);
        f15827p = Integer.toString(14, 36);
        f15828q = Integer.toString(13, 36);
        f15829r = Integer.toString(3, 36);
        f15830s = Integer.toString(4, 36);
        f15831t = Integer.toString(5, 36);
        f15832u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15833w = Integer.toString(7, 36);
        f15834x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15835y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, j1 j1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f15836a = jVar;
        this.h = i0Var;
        this.f15842i = i0Var2;
        this.f15844k = i0Var3;
        this.f15837b = j1Var;
        this.f15838c = x0Var;
        this.d = x0Var2;
        this.f15839e = bundle;
        this.f15840f = bundle2;
        this.f15841g = e1Var;
        this.f15843j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15823l, 1008001300);
        bundle.putBinder(f15824m, this.f15836a.asBinder());
        bundle.putParcelable(f15825n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f15826o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            Iterator<E> it = i0Var.iterator();
            if (!it.hasNext()) {
                bundle.putParcelableArrayList(str, arrayList);
            } else {
                a1.g.z(it.next());
                throw null;
            }
        }
        e9.i0 i0Var2 = this.f15842i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f15827p, arrayList2);
                } else {
                    a1.g.z(it2.next());
                    throw null;
                }
            } else {
                e9.a1 a2 = a.a(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(a2.d);
                e9.g0 listIterator = a2.listIterator(0);
                if (!listIterator.hasNext()) {
                    bundle.putParcelableArrayList(str, arrayList3);
                } else {
                    a1.g.z(listIterator.next());
                    throw null;
                }
            }
        }
        e9.i0 i0Var3 = this.f15844k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f15828q, arrayList4);
            } else {
                a1.g.z(it3.next());
                throw null;
            }
        }
        j1 j1Var = this.f15837b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = j1Var.f15867a.iterator();
        while (it4.hasNext()) {
            i1 i1Var = (i1) it4.next();
            i1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i1.f15860f, i1Var.f15862a);
            bundle3.putString(i1.f15861g, i1Var.f15863b);
            bundle3.putBundle(i1.h, i1Var.f15864c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(j1.f15866b, arrayList5);
        bundle.putBundle(f15829r, bundle2);
        String str2 = f15830s;
        b2.x0 x0Var = this.f15838c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f15831t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f15832u, this.f15839e);
        bundle.putBundle(v, this.f15840f);
        bundle.putBundle(f15833w, this.f15841g.e(w7.r.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f15834x, 5);
        MediaSession.Token token = this.f15843j;
        if (token != null) {
            bundle.putParcelable(f15835y, token);
        }
        return bundle;
    }
}
