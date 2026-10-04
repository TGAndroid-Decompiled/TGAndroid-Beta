package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16143l;
    public static final String f16144m;
    public static final String f16145n;
    public static final String f16146o;
    public static final String f16147p;
    public static final String f16148q;
    public static final String f16149r;
    public static final String f16150s;
    public static final String f16151t;
    public static final String f16152u;
    public static final String v;
    public static final String f16153w;
    public static final String f16154x;
    public static final String f16155y;
    public final j f16156a;
    public final h1 f16157b;
    public final b2.x0 f16158c;
    public final b2.x0 d;
    public final Bundle f16159e;
    public final Bundle f16160f;
    public final c1 f16161g;
    public final e9.i0 h;
    public final e9.i0 f16162i;
    public final MediaSession.Token f16163j;
    public final e9.i0 f16164k;

    static {
        String str = e2.d0.f8537a;
        f16143l = Integer.toString(0, 36);
        f16144m = Integer.toString(1, 36);
        f16145n = Integer.toString(2, 36);
        f16146o = Integer.toString(9, 36);
        f16147p = Integer.toString(14, 36);
        f16148q = Integer.toString(13, 36);
        f16149r = Integer.toString(3, 36);
        f16150s = Integer.toString(4, 36);
        f16151t = Integer.toString(5, 36);
        f16152u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16153w = Integer.toString(7, 36);
        f16154x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16155y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f16156a = jVar;
        this.h = i0Var;
        this.f16162i = i0Var2;
        this.f16164k = i0Var3;
        this.f16157b = h1Var;
        this.f16158c = x0Var;
        this.d = x0Var2;
        this.f16159e = bundle;
        this.f16160f = bundle2;
        this.f16161g = c1Var;
        this.f16163j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16143l, 1008001300);
        bundle.putBinder(f16144m, this.f16156a.asBinder());
        bundle.putParcelable(f16145n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16146o;
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
        e9.i0 i0Var2 = this.f16162i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16147p, arrayList2);
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
        e9.i0 i0Var3 = this.f16164k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16148q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f16157b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f16176a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f16168f, g1Var.f16170a);
            bundle3.putString(g1.f16169g, g1Var.f16171b);
            bundle3.putBundle(g1.h, g1Var.f16172c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f16175b, arrayList5);
        bundle.putBundle(f16149r, bundle2);
        String str2 = f16150s;
        b2.x0 x0Var = this.f16158c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16151t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16152u, this.f16159e);
        bundle.putBundle(v, this.f16160f);
        bundle.putBundle(f16153w, this.f16161g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16154x, 5);
        MediaSession.Token token = this.f16163j;
        if (token != null) {
            bundle.putParcelable(f16155y, token);
        }
        return bundle;
    }
}
