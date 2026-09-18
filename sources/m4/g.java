package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14698l;
    public static final String f14699m;
    public static final String f14700n;
    public static final String f14701o;
    public static final String f14702p;
    public static final String f14703q;
    public static final String f14704r;
    public static final String f14705s;
    public static final String f14706t;
    public static final String f14707u;
    public static final String v;
    public static final String f14708w;
    public static final String f14709x;
    public static final String f14710y;
    public final j f14711a;
    public final m1 f14712b;
    public final b2.x0 f14713c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14714f;
    public final h1 f14715g;
    public final e9.i0 h;
    public final e9.i0 f14716i;
    public final MediaSession.Token f14717j;
    public final e9.i0 f14718k;

    static {
        String str = e2.d0.f7887a;
        f14698l = Integer.toString(0, 36);
        f14699m = Integer.toString(1, 36);
        f14700n = Integer.toString(2, 36);
        f14701o = Integer.toString(9, 36);
        f14702p = Integer.toString(14, 36);
        f14703q = Integer.toString(13, 36);
        f14704r = Integer.toString(3, 36);
        f14705s = Integer.toString(4, 36);
        f14706t = Integer.toString(5, 36);
        f14707u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14708w = Integer.toString(7, 36);
        f14709x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14710y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, m1 m1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, h1 h1Var, MediaSession.Token token) {
        this.f14711a = jVar;
        this.h = i0Var;
        this.f14716i = i0Var2;
        this.f14718k = i0Var3;
        this.f14712b = m1Var;
        this.f14713c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14714f = bundle2;
        this.f14715g = h1Var;
        this.f14717j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14698l, 1008001300);
        bundle.putBinder(f14699m, this.f14711a.asBinder());
        bundle.putParcelable(f14700n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14701o;
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
        e9.i0 i0Var2 = this.f14716i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14702p, arrayList2);
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
        e9.i0 i0Var3 = this.f14718k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14703q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        m1 m1Var = this.f14712b;
        m1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = m1Var.f14803a.iterator();
        while (it4.hasNext()) {
            l1 l1Var = (l1) it4.next();
            l1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(l1.f14794f, l1Var.f14796a);
            bundle3.putString(l1.f14795g, l1Var.f14797b);
            bundle3.putBundle(l1.h, l1Var.f14798c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(m1.f14802b, arrayList5);
        bundle.putBundle(f14704r, bundle2);
        String str2 = f14705s;
        b2.x0 x0Var = this.f14713c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14706t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14707u, this.e);
        bundle.putBundle(v, this.f14714f);
        bundle.putBundle(f14708w, this.f14715g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14709x, 5);
        MediaSession.Token token = this.f14717j;
        if (token != null) {
            bundle.putParcelable(f14710y, token);
        }
        return bundle;
    }
}
