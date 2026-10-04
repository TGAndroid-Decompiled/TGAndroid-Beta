package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16148l;
    public static final String f16149m;
    public static final String f16150n;
    public static final String f16151o;
    public static final String f16152p;
    public static final String f16153q;
    public static final String f16154r;
    public static final String f16155s;
    public static final String f16156t;
    public static final String f16157u;
    public static final String v;
    public static final String f16158w;
    public static final String f16159x;
    public static final String f16160y;
    public final j f16161a;
    public final h1 f16162b;
    public final b2.x0 f16163c;
    public final b2.x0 d;
    public final Bundle f16164e;
    public final Bundle f16165f;
    public final c1 f16166g;
    public final e9.i0 h;
    public final e9.i0 f16167i;
    public final MediaSession.Token f16168j;
    public final e9.i0 f16169k;

    static {
        String str = e2.d0.f8538a;
        f16148l = Integer.toString(0, 36);
        f16149m = Integer.toString(1, 36);
        f16150n = Integer.toString(2, 36);
        f16151o = Integer.toString(9, 36);
        f16152p = Integer.toString(14, 36);
        f16153q = Integer.toString(13, 36);
        f16154r = Integer.toString(3, 36);
        f16155s = Integer.toString(4, 36);
        f16156t = Integer.toString(5, 36);
        f16157u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16158w = Integer.toString(7, 36);
        f16159x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16160y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f16161a = jVar;
        this.h = i0Var;
        this.f16167i = i0Var2;
        this.f16169k = i0Var3;
        this.f16162b = h1Var;
        this.f16163c = x0Var;
        this.d = x0Var2;
        this.f16164e = bundle;
        this.f16165f = bundle2;
        this.f16166g = c1Var;
        this.f16168j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16148l, 1008001300);
        bundle.putBinder(f16149m, this.f16161a.asBinder());
        bundle.putParcelable(f16150n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16151o;
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
        e9.i0 i0Var2 = this.f16167i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16152p, arrayList2);
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
        e9.i0 i0Var3 = this.f16169k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16153q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f16162b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f16181a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f16173f, g1Var.f16175a);
            bundle3.putString(g1.f16174g, g1Var.f16176b);
            bundle3.putBundle(g1.h, g1Var.f16177c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f16180b, arrayList5);
        bundle.putBundle(f16154r, bundle2);
        String str2 = f16155s;
        b2.x0 x0Var = this.f16163c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16156t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16157u, this.f16164e);
        bundle.putBundle(v, this.f16165f);
        bundle.putBundle(f16158w, this.f16166g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16159x, 5);
        MediaSession.Token token = this.f16168j;
        if (token != null) {
            bundle.putParcelable(f16160y, token);
        }
        return bundle;
    }
}
