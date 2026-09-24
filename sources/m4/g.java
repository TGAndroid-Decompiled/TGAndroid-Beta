package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14777l;
    public static final String f14778m;
    public static final String f14779n;
    public static final String f14780o;
    public static final String f14781p;
    public static final String f14782q;
    public static final String f14783r;
    public static final String f14784s;
    public static final String f14785t;
    public static final String f14786u;
    public static final String v;
    public static final String f14787w;
    public static final String f14788x;
    public static final String f14789y;
    public final j f14790a;
    public final h1 f14791b;
    public final b2.x0 f14792c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14793f;
    public final c1 f14794g;
    public final e9.i0 h;
    public final e9.i0 f14795i;
    public final MediaSession.Token f14796j;
    public final e9.i0 f14797k;

    static {
        String str = e2.d0.f7870a;
        f14777l = Integer.toString(0, 36);
        f14778m = Integer.toString(1, 36);
        f14779n = Integer.toString(2, 36);
        f14780o = Integer.toString(9, 36);
        f14781p = Integer.toString(14, 36);
        f14782q = Integer.toString(13, 36);
        f14783r = Integer.toString(3, 36);
        f14784s = Integer.toString(4, 36);
        f14785t = Integer.toString(5, 36);
        f14786u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14787w = Integer.toString(7, 36);
        f14788x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14789y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f14790a = jVar;
        this.h = i0Var;
        this.f14795i = i0Var2;
        this.f14797k = i0Var3;
        this.f14791b = h1Var;
        this.f14792c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14793f = bundle2;
        this.f14794g = c1Var;
        this.f14796j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14777l, 1008001300);
        bundle.putBinder(f14778m, this.f14790a.asBinder());
        bundle.putParcelable(f14779n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14780o;
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
        e9.i0 i0Var2 = this.f14795i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14781p, arrayList2);
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
        e9.i0 i0Var3 = this.f14797k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14782q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f14791b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f14808a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f14800f, g1Var.f14802a);
            bundle3.putString(g1.f14801g, g1Var.f14803b);
            bundle3.putBundle(g1.h, g1Var.f14804c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f14807b, arrayList5);
        bundle.putBundle(f14783r, bundle2);
        String str2 = f14784s;
        b2.x0 x0Var = this.f14792c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14785t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14786u, this.e);
        bundle.putBundle(v, this.f14793f);
        bundle.putBundle(f14787w, this.f14794g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14788x, 5);
        MediaSession.Token token = this.f14796j;
        if (token != null) {
            bundle.putParcelable(f14789y, token);
        }
        return bundle;
    }
}
