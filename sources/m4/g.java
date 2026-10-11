package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16104l;
    public static final String f16105m;
    public static final String f16106n;
    public static final String f16107o;
    public static final String f16108p;
    public static final String f16109q;
    public static final String f16110r;
    public static final String f16111s;
    public static final String f16112t;
    public static final String f16113u;
    public static final String v;
    public static final String f16114w;
    public static final String f16115x;
    public static final String f16116y;
    public final j f16117a;
    public final j1 f16118b;
    public final b2.x0 f16119c;
    public final b2.x0 d;
    public final Bundle f16120e;
    public final Bundle f16121f;
    public final e1 f16122g;
    public final e9.i0 h;
    public final e9.i0 f16123i;
    public final MediaSession.Token f16124j;
    public final e9.i0 f16125k;

    static {
        String str = e2.d0.f8531a;
        f16104l = Integer.toString(0, 36);
        f16105m = Integer.toString(1, 36);
        f16106n = Integer.toString(2, 36);
        f16107o = Integer.toString(9, 36);
        f16108p = Integer.toString(14, 36);
        f16109q = Integer.toString(13, 36);
        f16110r = Integer.toString(3, 36);
        f16111s = Integer.toString(4, 36);
        f16112t = Integer.toString(5, 36);
        f16113u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16114w = Integer.toString(7, 36);
        f16115x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16116y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, j1 j1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f16117a = jVar;
        this.h = i0Var;
        this.f16123i = i0Var2;
        this.f16125k = i0Var3;
        this.f16118b = j1Var;
        this.f16119c = x0Var;
        this.d = x0Var2;
        this.f16120e = bundle;
        this.f16121f = bundle2;
        this.f16122g = e1Var;
        this.f16124j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16104l, 1008001300);
        bundle.putBinder(f16105m, this.f16117a.asBinder());
        bundle.putParcelable(f16106n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16107o;
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
        e9.i0 i0Var2 = this.f16123i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16108p, arrayList2);
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
        e9.i0 i0Var3 = this.f16125k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16109q, arrayList4);
            } else {
                a1.g.z(it3.next());
                throw null;
            }
        }
        j1 j1Var = this.f16118b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = j1Var.f16147a.iterator();
        while (it4.hasNext()) {
            i1 i1Var = (i1) it4.next();
            i1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i1.f16137f, i1Var.f16139a);
            bundle3.putString(i1.f16138g, i1Var.f16140b);
            bundle3.putBundle(i1.h, i1Var.f16141c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(j1.f16146b, arrayList5);
        bundle.putBundle(f16110r, bundle2);
        String str2 = f16111s;
        b2.x0 x0Var = this.f16119c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16112t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16113u, this.f16120e);
        bundle.putBundle(v, this.f16121f);
        bundle.putBundle(f16114w, this.f16122g.e(w7.s.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16115x, 5);
        MediaSession.Token token = this.f16124j;
        if (token != null) {
            bundle.putParcelable(f16116y, token);
        }
        return bundle;
    }
}
