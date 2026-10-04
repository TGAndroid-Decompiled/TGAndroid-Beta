package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16144l;
    public static final String f16145m;
    public static final String f16146n;
    public static final String f16147o;
    public static final String f16148p;
    public static final String f16149q;
    public static final String f16150r;
    public static final String f16151s;
    public static final String f16152t;
    public static final String f16153u;
    public static final String v;
    public static final String f16154w;
    public static final String f16155x;
    public static final String f16156y;
    public final j f16157a;
    public final h1 f16158b;
    public final b2.x0 f16159c;
    public final b2.x0 d;
    public final Bundle f16160e;
    public final Bundle f16161f;
    public final c1 f16162g;
    public final e9.i0 h;
    public final e9.i0 f16163i;
    public final MediaSession.Token f16164j;
    public final e9.i0 f16165k;

    static {
        String str = e2.d0.f8537a;
        f16144l = Integer.toString(0, 36);
        f16145m = Integer.toString(1, 36);
        f16146n = Integer.toString(2, 36);
        f16147o = Integer.toString(9, 36);
        f16148p = Integer.toString(14, 36);
        f16149q = Integer.toString(13, 36);
        f16150r = Integer.toString(3, 36);
        f16151s = Integer.toString(4, 36);
        f16152t = Integer.toString(5, 36);
        f16153u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16154w = Integer.toString(7, 36);
        f16155x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16156y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f16157a = jVar;
        this.h = i0Var;
        this.f16163i = i0Var2;
        this.f16165k = i0Var3;
        this.f16158b = h1Var;
        this.f16159c = x0Var;
        this.d = x0Var2;
        this.f16160e = bundle;
        this.f16161f = bundle2;
        this.f16162g = c1Var;
        this.f16164j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16144l, 1008001300);
        bundle.putBinder(f16145m, this.f16157a.asBinder());
        bundle.putParcelable(f16146n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16147o;
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
        e9.i0 i0Var2 = this.f16163i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16148p, arrayList2);
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
        e9.i0 i0Var3 = this.f16165k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16149q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f16158b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f16177a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f16169f, g1Var.f16171a);
            bundle3.putString(g1.f16170g, g1Var.f16172b);
            bundle3.putBundle(g1.h, g1Var.f16173c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f16176b, arrayList5);
        bundle.putBundle(f16150r, bundle2);
        String str2 = f16151s;
        b2.x0 x0Var = this.f16159c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16152t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16153u, this.f16160e);
        bundle.putBundle(v, this.f16161f);
        bundle.putBundle(f16154w, this.f16162g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16155x, 5);
        MediaSession.Token token = this.f16164j;
        if (token != null) {
            bundle.putParcelable(f16156y, token);
        }
        return bundle;
    }
}
