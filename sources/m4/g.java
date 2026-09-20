package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14734l;
    public static final String f14735m;
    public static final String f14736n;
    public static final String f14737o;
    public static final String f14738p;
    public static final String f14739q;
    public static final String f14740r;
    public static final String f14741s;
    public static final String f14742t;
    public static final String f14743u;
    public static final String v;
    public static final String f14744w;
    public static final String f14745x;
    public static final String f14746y;
    public final j f14747a;
    public final m1 f14748b;
    public final b2.x0 f14749c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14750f;
    public final h1 f14751g;
    public final e9.i0 h;
    public final e9.i0 f14752i;
    public final MediaSession.Token f14753j;
    public final e9.i0 f14754k;

    static {
        String str = e2.d0.f7888a;
        f14734l = Integer.toString(0, 36);
        f14735m = Integer.toString(1, 36);
        f14736n = Integer.toString(2, 36);
        f14737o = Integer.toString(9, 36);
        f14738p = Integer.toString(14, 36);
        f14739q = Integer.toString(13, 36);
        f14740r = Integer.toString(3, 36);
        f14741s = Integer.toString(4, 36);
        f14742t = Integer.toString(5, 36);
        f14743u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14744w = Integer.toString(7, 36);
        f14745x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14746y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, m1 m1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, h1 h1Var, MediaSession.Token token) {
        this.f14747a = jVar;
        this.h = i0Var;
        this.f14752i = i0Var2;
        this.f14754k = i0Var3;
        this.f14748b = m1Var;
        this.f14749c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14750f = bundle2;
        this.f14751g = h1Var;
        this.f14753j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14734l, 1008001300);
        bundle.putBinder(f14735m, this.f14747a.asBinder());
        bundle.putParcelable(f14736n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14737o;
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
        e9.i0 i0Var2 = this.f14752i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14738p, arrayList2);
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
        e9.i0 i0Var3 = this.f14754k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14739q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        m1 m1Var = this.f14748b;
        m1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = m1Var.f14839a.iterator();
        while (it4.hasNext()) {
            l1 l1Var = (l1) it4.next();
            l1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(l1.f14830f, l1Var.f14832a);
            bundle3.putString(l1.f14831g, l1Var.f14833b);
            bundle3.putBundle(l1.h, l1Var.f14834c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(m1.f14838b, arrayList5);
        bundle.putBundle(f14740r, bundle2);
        String str2 = f14741s;
        b2.x0 x0Var = this.f14749c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14742t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14743u, this.e);
        bundle.putBundle(v, this.f14750f);
        bundle.putBundle(f14744w, this.f14751g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14745x, 5);
        MediaSession.Token token = this.f14753j;
        if (token != null) {
            bundle.putParcelable(f14746y, token);
        }
        return bundle;
    }
}
