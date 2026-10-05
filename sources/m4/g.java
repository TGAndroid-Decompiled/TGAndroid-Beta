package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16153l;
    public static final String f16154m;
    public static final String f16155n;
    public static final String f16156o;
    public static final String f16157p;
    public static final String f16158q;
    public static final String f16159r;
    public static final String f16160s;
    public static final String f16161t;
    public static final String f16162u;
    public static final String v;
    public static final String f16163w;
    public static final String f16164x;
    public static final String f16165y;
    public final j f16166a;
    public final h1 f16167b;
    public final b2.x0 f16168c;
    public final b2.x0 d;
    public final Bundle f16169e;
    public final Bundle f16170f;
    public final c1 f16171g;
    public final e9.i0 h;
    public final e9.i0 f16172i;
    public final MediaSession.Token f16173j;
    public final e9.i0 f16174k;

    static {
        String str = e2.d0.f8538a;
        f16153l = Integer.toString(0, 36);
        f16154m = Integer.toString(1, 36);
        f16155n = Integer.toString(2, 36);
        f16156o = Integer.toString(9, 36);
        f16157p = Integer.toString(14, 36);
        f16158q = Integer.toString(13, 36);
        f16159r = Integer.toString(3, 36);
        f16160s = Integer.toString(4, 36);
        f16161t = Integer.toString(5, 36);
        f16162u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16163w = Integer.toString(7, 36);
        f16164x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16165y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, h1 h1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, c1 c1Var, MediaSession.Token token) {
        this.f16166a = jVar;
        this.h = i0Var;
        this.f16172i = i0Var2;
        this.f16174k = i0Var3;
        this.f16167b = h1Var;
        this.f16168c = x0Var;
        this.d = x0Var2;
        this.f16169e = bundle;
        this.f16170f = bundle2;
        this.f16171g = c1Var;
        this.f16173j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16153l, 1008001300);
        bundle.putBinder(f16154m, this.f16166a.asBinder());
        bundle.putParcelable(f16155n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16156o;
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
        e9.i0 i0Var2 = this.f16172i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16157p, arrayList2);
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
        e9.i0 i0Var3 = this.f16174k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16158q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        h1 h1Var = this.f16167b;
        h1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = h1Var.f16186a.iterator();
        while (it4.hasNext()) {
            g1 g1Var = (g1) it4.next();
            g1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(g1.f16178f, g1Var.f16180a);
            bundle3.putString(g1.f16179g, g1Var.f16181b);
            bundle3.putBundle(g1.h, g1Var.f16182c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(h1.f16185b, arrayList5);
        bundle.putBundle(f16159r, bundle2);
        String str2 = f16160s;
        b2.x0 x0Var = this.f16168c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16161t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16162u, this.f16169e);
        bundle.putBundle(v, this.f16170f);
        bundle.putBundle(f16163w, this.f16171g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16164x, 5);
        MediaSession.Token token = this.f16173j;
        if (token != null) {
            bundle.putParcelable(f16165y, token);
        }
        return bundle;
    }
}
