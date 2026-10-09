package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16080l;
    public static final String f16081m;
    public static final String f16082n;
    public static final String f16083o;
    public static final String f16084p;
    public static final String f16085q;
    public static final String f16086r;
    public static final String f16087s;
    public static final String f16088t;
    public static final String f16089u;
    public static final String v;
    public static final String f16090w;
    public static final String f16091x;
    public static final String f16092y;
    public final j f16093a;
    public final i1 f16094b;
    public final b2.x0 f16095c;
    public final b2.x0 d;
    public final Bundle f16096e;
    public final Bundle f16097f;
    public final d1 f16098g;
    public final e9.i0 h;
    public final e9.i0 f16099i;
    public final MediaSession.Token f16100j;
    public final e9.i0 f16101k;

    static {
        String str = e2.d0.f8532a;
        f16080l = Integer.toString(0, 36);
        f16081m = Integer.toString(1, 36);
        f16082n = Integer.toString(2, 36);
        f16083o = Integer.toString(9, 36);
        f16084p = Integer.toString(14, 36);
        f16085q = Integer.toString(13, 36);
        f16086r = Integer.toString(3, 36);
        f16087s = Integer.toString(4, 36);
        f16088t = Integer.toString(5, 36);
        f16089u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16090w = Integer.toString(7, 36);
        f16091x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16092y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, i1 i1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, d1 d1Var, MediaSession.Token token) {
        this.f16093a = jVar;
        this.h = i0Var;
        this.f16099i = i0Var2;
        this.f16101k = i0Var3;
        this.f16094b = i1Var;
        this.f16095c = x0Var;
        this.d = x0Var2;
        this.f16096e = bundle;
        this.f16097f = bundle2;
        this.f16098g = d1Var;
        this.f16100j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16080l, 1008001300);
        bundle.putBinder(f16081m, this.f16093a.asBinder());
        bundle.putParcelable(f16082n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16083o;
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
        e9.i0 i0Var2 = this.f16099i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16084p, arrayList2);
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
        e9.i0 i0Var3 = this.f16101k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16085q, arrayList4);
            } else {
                a1.g.z(it3.next());
                throw null;
            }
        }
        i1 i1Var = this.f16094b;
        i1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = i1Var.f16118a.iterator();
        while (it4.hasNext()) {
            h1 h1Var = (h1) it4.next();
            h1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(h1.f16111f, h1Var.f16113a);
            bundle3.putString(h1.f16112g, h1Var.f16114b);
            bundle3.putBundle(h1.h, h1Var.f16115c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(i1.f16117b, arrayList5);
        bundle.putBundle(f16086r, bundle2);
        String str2 = f16087s;
        b2.x0 x0Var = this.f16095c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16088t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16089u, this.f16096e);
        bundle.putBundle(v, this.f16097f);
        bundle.putBundle(f16090w, this.f16098g.e(w7.s.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16091x, 5);
        MediaSession.Token token = this.f16100j;
        if (token != null) {
            bundle.putParcelable(f16092y, token);
        }
        return bundle;
    }
}
