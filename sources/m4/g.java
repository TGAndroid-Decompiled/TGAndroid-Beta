package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14808l;
    public static final String f14809m;
    public static final String f14810n;
    public static final String f14811o;
    public static final String f14812p;
    public static final String f14813q;
    public static final String f14814r;
    public static final String f14815s;
    public static final String f14816t;
    public static final String f14817u;
    public static final String v;
    public static final String f14818w;
    public static final String f14819x;
    public static final String f14820y;
    public final j f14821a;
    public final h1 f14822b;
    public final b2.x0 f14823c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14824f;
    public final c1 f14825g;
    public final e9.i0 h;
    public final e9.i0 f14826i;
    public final MediaSession.Token f14827j;
    public final e9.i0 f14828k;

    static {
        String str = e2.d0.f7882a;
        f14808l = Integer.toString(0, 36);
        f14809m = Integer.toString(1, 36);
        f14810n = Integer.toString(2, 36);
        f14811o = Integer.toString(9, 36);
        f14812p = Integer.toString(14, 36);
        f14813q = Integer.toString(13, 36);
        f14814r = Integer.toString(3, 36);
        f14815s = Integer.toString(4, 36);
        f14816t = Integer.toString(5, 36);
        f14817u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14818w = Integer.toString(7, 36);
        f14819x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14820y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f14821a = jVar;
        this.h = i0Var;
        this.f14826i = i0Var2;
        this.f14828k = i0Var3;
        this.f14822b = h1Var;
        this.f14823c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14824f = bundle2;
        this.f14825g = c1Var;
        this.f14827j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14808l, 1008001300);
        bundle.putBinder(f14809m, this.f14821a.asBinder());
        bundle.putParcelable(f14810n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14811o;
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
        e9.i0 i0Var2 = this.f14826i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14812p, arrayList2);
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
        e9.i0 i0Var3 = this.f14828k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14813q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f14822b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f14839a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f14831f, g1Var.f14833a);
            bundle3.putString(g1.f14832g, g1Var.f14834b);
            bundle3.putBundle(g1.h, g1Var.f14835c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f14838b, arrayList5);
        bundle.putBundle(f14814r, bundle2);
        String str2 = f14815s;
        b2.x0 x0Var = this.f14823c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14816t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14817u, this.e);
        bundle.putBundle(v, this.f14824f);
        bundle.putBundle(f14818w, this.f14825g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14819x, 5);
        MediaSession.Token token = this.f14827j;
        if (token != null) {
            bundle.putParcelable(f14820y, token);
        }
        return bundle;
    }
}
