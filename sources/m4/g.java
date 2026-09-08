package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f15921l;
    public static final String f15922m;
    public static final String f15923n;
    public static final String f15924o;
    public static final String f15925p;
    public static final String f15926q;
    public static final String f15927r;
    public static final String f15928s;
    public static final String f15929t;
    public static final String f15930u;
    public static final String v;
    public static final String f15931w;
    public static final String f15932x;
    public static final String f15933y;
    public final j f15934a;
    public final m1 f15935b;
    public final b2.x0 f15936c;
    public final b2.x0 d;
    public final Bundle f15937e;
    public final Bundle f15938f;
    public final h1 f15939g;
    public final e9.i0 h;
    public final e9.i0 f15940i;
    public final MediaSession.Token f15941j;
    public final e9.i0 f15942k;

    static {
        String str = e2.d0.f8765a;
        f15921l = Integer.toString(0, 36);
        f15922m = Integer.toString(1, 36);
        f15923n = Integer.toString(2, 36);
        f15924o = Integer.toString(9, 36);
        f15925p = Integer.toString(14, 36);
        f15926q = Integer.toString(13, 36);
        f15927r = Integer.toString(3, 36);
        f15928s = Integer.toString(4, 36);
        f15929t = Integer.toString(5, 36);
        f15930u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15931w = Integer.toString(7, 36);
        f15932x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15933y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, m1 m1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, h1 h1Var, MediaSession.Token token) {
        this.f15934a = jVar;
        this.h = i0Var;
        this.f15940i = i0Var2;
        this.f15942k = i0Var3;
        this.f15935b = m1Var;
        this.f15936c = x0Var;
        this.d = x0Var2;
        this.f15937e = bundle;
        this.f15938f = bundle2;
        this.f15939g = h1Var;
        this.f15941j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15921l, 1008001300);
        bundle.putBinder(f15922m, this.f15934a.asBinder());
        bundle.putParcelable(f15923n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f15924o;
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
        e9.i0 i0Var2 = this.f15940i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f15925p, arrayList2);
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
        e9.i0 i0Var3 = this.f15942k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f15926q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        m1 m1Var = this.f15935b;
        m1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = m1Var.f16032a.iterator();
        while (it4.hasNext()) {
            l1 l1Var = (l1) it4.next();
            l1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(l1.f16023f, l1Var.f16025a);
            bundle3.putString(l1.f16024g, l1Var.f16026b);
            bundle3.putBundle(l1.h, l1Var.f16027c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(m1.f16031b, arrayList5);
        bundle.putBundle(f15927r, bundle2);
        String str2 = f15928s;
        b2.x0 x0Var = this.f15936c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f15929t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f15930u, this.f15937e);
        bundle.putBundle(v, this.f15938f);
        bundle.putBundle(f15931w, this.f15939g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f15932x, 5);
        MediaSession.Token token = this.f15941j;
        if (token != null) {
            bundle.putParcelable(f15933y, token);
        }
        return bundle;
    }
}
