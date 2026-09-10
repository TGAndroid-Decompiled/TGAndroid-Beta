package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f13348l;
    public static final String f13349m;
    public static final String f13350n;
    public static final String f13351o;
    public static final String f13352p;
    public static final String f13353q;
    public static final String f13354r;
    public static final String f13355s;
    public static final String f13356t;
    public static final String f13357u;
    public static final String v;
    public static final String f13358w;
    public static final String f13359x;
    public static final String f13360y;
    public final j f13361a;
    public final o1 f13362b;
    public final b2.x0 f13363c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f13364f;
    public final j1 f13365g;
    public final e9.i0 h;
    public final e9.i0 f13366i;
    public final MediaSession.Token f13367j;
    public final e9.i0 f13368k;

    static {
        String str = e2.d0.f7188a;
        f13348l = Integer.toString(0, 36);
        f13349m = Integer.toString(1, 36);
        f13350n = Integer.toString(2, 36);
        f13351o = Integer.toString(9, 36);
        f13352p = Integer.toString(14, 36);
        f13353q = Integer.toString(13, 36);
        f13354r = Integer.toString(3, 36);
        f13355s = Integer.toString(4, 36);
        f13356t = Integer.toString(5, 36);
        f13357u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f13358w = Integer.toString(7, 36);
        f13359x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f13360y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, o1 o1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, j1 j1Var, MediaSession.Token token) {
        this.f13361a = jVar;
        this.h = i0Var;
        this.f13366i = i0Var2;
        this.f13368k = i0Var3;
        this.f13362b = o1Var;
        this.f13363c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f13364f = bundle2;
        this.f13365g = j1Var;
        this.f13367j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f13348l, 1008001300);
        bundle.putBinder(f13349m, this.f13361a.asBinder());
        bundle.putParcelable(f13350n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f13351o;
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
        e9.i0 i0Var2 = this.f13366i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f13352p, arrayList2);
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
        e9.i0 i0Var3 = this.f13368k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f13353q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        o1 o1Var = this.f13362b;
        o1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = o1Var.f13466a.iterator();
        while (it4.hasNext()) {
            n1 n1Var = (n1) it4.next();
            n1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(n1.f13456f, n1Var.f13458a);
            bundle3.putString(n1.f13457g, n1Var.f13459b);
            bundle3.putBundle(n1.h, n1Var.f13460c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(o1.f13465b, arrayList5);
        bundle.putBundle(f13354r, bundle2);
        String str2 = f13355s;
        b2.x0 x0Var = this.f13363c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f13356t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f13357u, this.e);
        bundle.putBundle(v, this.f13364f);
        bundle.putBundle(f13358w, this.f13365g.e(w7.u.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f13359x, 5);
        MediaSession.Token token = this.f13367j;
        if (token != null) {
            bundle.putParcelable(f13360y, token);
        }
        return bundle;
    }
}
