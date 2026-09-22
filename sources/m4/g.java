package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14749l;
    public static final String f14750m;
    public static final String f14751n;
    public static final String f14752o;
    public static final String f14753p;
    public static final String f14754q;
    public static final String f14755r;
    public static final String f14756s;
    public static final String f14757t;
    public static final String f14758u;
    public static final String v;
    public static final String f14759w;
    public static final String f14760x;
    public static final String f14761y;
    public final j f14762a;
    public final m1 f14763b;
    public final b2.x0 f14764c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14765f;
    public final h1 f14766g;
    public final e9.i0 h;
    public final e9.i0 f14767i;
    public final MediaSession.Token f14768j;
    public final e9.i0 f14769k;

    static {
        String str = e2.d0.f7887a;
        f14749l = Integer.toString(0, 36);
        f14750m = Integer.toString(1, 36);
        f14751n = Integer.toString(2, 36);
        f14752o = Integer.toString(9, 36);
        f14753p = Integer.toString(14, 36);
        f14754q = Integer.toString(13, 36);
        f14755r = Integer.toString(3, 36);
        f14756s = Integer.toString(4, 36);
        f14757t = Integer.toString(5, 36);
        f14758u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14759w = Integer.toString(7, 36);
        f14760x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14761y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, m1 m1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, h1 h1Var, MediaSession.Token token) {
        this.f14762a = jVar;
        this.h = i0Var;
        this.f14767i = i0Var2;
        this.f14769k = i0Var3;
        this.f14763b = m1Var;
        this.f14764c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14765f = bundle2;
        this.f14766g = h1Var;
        this.f14768j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14749l, 1008001300);
        bundle.putBinder(f14750m, this.f14762a.asBinder());
        bundle.putParcelable(f14751n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14752o;
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
        e9.i0 i0Var2 = this.f14767i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14753p, arrayList2);
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
        e9.i0 i0Var3 = this.f14769k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14754q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        m1 m1Var = this.f14763b;
        m1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = m1Var.f14854a.iterator();
        while (it4.hasNext()) {
            l1 l1Var = (l1) it4.next();
            l1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(l1.f14845f, l1Var.f14847a);
            bundle3.putString(l1.f14846g, l1Var.f14848b);
            bundle3.putBundle(l1.h, l1Var.f14849c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(m1.f14853b, arrayList5);
        bundle.putBundle(f14755r, bundle2);
        String str2 = f14756s;
        b2.x0 x0Var = this.f14764c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14757t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14758u, this.e);
        bundle.putBundle(v, this.f14765f);
        bundle.putBundle(f14759w, this.f14766g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14760x, 5);
        MediaSession.Token token = this.f14768j;
        if (token != null) {
            bundle.putParcelable(f14761y, token);
        }
        return bundle;
    }
}
