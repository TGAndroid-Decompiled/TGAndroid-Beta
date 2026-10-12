package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f15824l;
    public static final String f15825m;
    public static final String f15826n;
    public static final String f15827o;
    public static final String f15828p;
    public static final String f15829q;
    public static final String f15830r;
    public static final String f15831s;
    public static final String f15832t;
    public static final String f15833u;
    public static final String v;
    public static final String f15834w;
    public static final String f15835x;
    public static final String f15836y;
    public final j f15837a;
    public final j1 f15838b;
    public final b2.x0 f15839c;
    public final b2.x0 d;
    public final Bundle f15840e;
    public final Bundle f15841f;
    public final e1 f15842g;
    public final e9.i0 h;
    public final e9.i0 f15843i;
    public final MediaSession.Token f15844j;
    public final e9.i0 f15845k;

    static {
        String str = e2.d0.f8529a;
        f15824l = Integer.toString(0, 36);
        f15825m = Integer.toString(1, 36);
        f15826n = Integer.toString(2, 36);
        f15827o = Integer.toString(9, 36);
        f15828p = Integer.toString(14, 36);
        f15829q = Integer.toString(13, 36);
        f15830r = Integer.toString(3, 36);
        f15831s = Integer.toString(4, 36);
        f15832t = Integer.toString(5, 36);
        f15833u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15834w = Integer.toString(7, 36);
        f15835x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15836y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, j1 j1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f15837a = jVar;
        this.h = i0Var;
        this.f15843i = i0Var2;
        this.f15845k = i0Var3;
        this.f15838b = j1Var;
        this.f15839c = x0Var;
        this.d = x0Var2;
        this.f15840e = bundle;
        this.f15841f = bundle2;
        this.f15842g = e1Var;
        this.f15844j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15824l, 1008001300);
        bundle.putBinder(f15825m, this.f15837a.asBinder());
        bundle.putParcelable(f15826n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f15827o;
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
        e9.i0 i0Var2 = this.f15843i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f15828p, arrayList2);
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
        e9.i0 i0Var3 = this.f15845k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f15829q, arrayList4);
            } else {
                a1.g.z(it3.next());
                throw null;
            }
        }
        j1 j1Var = this.f15838b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = j1Var.f15868a.iterator();
        while (it4.hasNext()) {
            i1 i1Var = (i1) it4.next();
            i1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i1.f15861f, i1Var.f15863a);
            bundle3.putString(i1.f15862g, i1Var.f15864b);
            bundle3.putBundle(i1.h, i1Var.f15865c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(j1.f15867b, arrayList5);
        bundle.putBundle(f15830r, bundle2);
        String str2 = f15831s;
        b2.x0 x0Var = this.f15839c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f15832t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f15833u, this.f15840e);
        bundle.putBundle(v, this.f15841f);
        bundle.putBundle(f15834w, this.f15842g.e(w7.r.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f15835x, 5);
        MediaSession.Token token = this.f15844j;
        if (token != null) {
            bundle.putParcelable(f15836y, token);
        }
        return bundle;
    }
}
