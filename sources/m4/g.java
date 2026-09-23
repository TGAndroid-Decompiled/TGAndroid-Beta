package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.o1;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f14537l;
    public static final String f14538m;
    public static final String f14539n;
    public static final String f14540o;
    public static final String f14541p;
    public static final String f14542q;
    public static final String f14543r;
    public static final String f14544s;
    public static final String f14545t;
    public static final String f14546u;
    public static final String v;
    public static final String f14547w;
    public static final String f14548x;
    public static final String f14549y;
    public final j f14550a;
    public final i1 f14551b;
    public final b2.x0 f14552c;
    public final b2.x0 d;
    public final Bundle e;
    public final Bundle f14553f;
    public final d1 f14554g;
    public final e9.i0 h;
    public final e9.i0 f14555i;
    public final MediaSession.Token f14556j;
    public final e9.i0 f14557k;

    static {
        String str = e2.d0.f7871a;
        f14537l = Integer.toString(0, 36);
        f14538m = Integer.toString(1, 36);
        f14539n = Integer.toString(2, 36);
        f14540o = Integer.toString(9, 36);
        f14541p = Integer.toString(14, 36);
        f14542q = Integer.toString(13, 36);
        f14543r = Integer.toString(3, 36);
        f14544s = Integer.toString(4, 36);
        f14545t = Integer.toString(5, 36);
        f14546u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f14547w = Integer.toString(7, 36);
        f14548x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f14549y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, i1 i1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, d1 d1Var, MediaSession.Token token) {
        this.f14550a = jVar;
        this.h = i0Var;
        this.f14555i = i0Var2;
        this.f14557k = i0Var3;
        this.f14551b = i1Var;
        this.f14552c = x0Var;
        this.d = x0Var2;
        this.e = bundle;
        this.f14553f = bundle2;
        this.f14554g = d1Var;
        this.f14556j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f14537l, 1008001300);
        bundle.putBinder(f14538m, this.f14550a.asBinder());
        bundle.putParcelable(f14539n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f14540o;
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
        e9.i0 i0Var2 = this.f14555i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f14541p, arrayList2);
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
        e9.i0 i0Var3 = this.f14557k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f14542q, arrayList4);
            } else {
                a4.a.z(it3.next());
                throw null;
            }
        }
        i1 i1Var = this.f14551b;
        i1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        o1 it4 = i1Var.f14573a.iterator();
        while (it4.hasNext()) {
            h1 h1Var = (h1) it4.next();
            h1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(h1.f14566f, h1Var.f14568a);
            bundle3.putString(h1.f14567g, h1Var.f14569b);
            bundle3.putBundle(h1.h, h1Var.f14570c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(i1.f14572b, arrayList5);
        bundle.putBundle(f14543r, bundle2);
        String str2 = f14544s;
        b2.x0 x0Var = this.f14552c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f14545t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f14546u, this.e);
        bundle.putBundle(v, this.f14553f);
        bundle.putBundle(f14547w, this.f14554g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f14548x, 5);
        MediaSession.Token token = this.f14556j;
        if (token != null) {
            bundle.putParcelable(f14549y, token);
        }
        return bundle;
    }
}
