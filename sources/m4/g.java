package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f16140l;
    public static final String f16141m;
    public static final String f16142n;
    public static final String f16143o;
    public static final String f16144p;
    public static final String f16145q;
    public static final String f16146r;
    public static final String f16147s;
    public static final String f16148t;
    public static final String f16149u;
    public static final String v;
    public static final String f16150w;
    public static final String f16151x;
    public static final String f16152y;
    public final j f16153a;
    public final j1 f16154b;
    public final b2.x0 f16155c;
    public final b2.x0 d;
    public final Bundle f16156e;
    public final Bundle f16157f;
    public final e1 f16158g;
    public final e9.i0 h;
    public final e9.i0 f16159i;
    public final MediaSession.Token f16160j;
    public final e9.i0 f16161k;

    static {
        String str = e2.d0.f8531a;
        f16140l = Integer.toString(0, 36);
        f16141m = Integer.toString(1, 36);
        f16142n = Integer.toString(2, 36);
        f16143o = Integer.toString(9, 36);
        f16144p = Integer.toString(14, 36);
        f16145q = Integer.toString(13, 36);
        f16146r = Integer.toString(3, 36);
        f16147s = Integer.toString(4, 36);
        f16148t = Integer.toString(5, 36);
        f16149u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16150w = Integer.toString(7, 36);
        f16151x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16152y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, j1 j1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, e1 e1Var, MediaSession.Token token) {
        this.f16153a = jVar;
        this.h = i0Var;
        this.f16159i = i0Var2;
        this.f16161k = i0Var3;
        this.f16154b = j1Var;
        this.f16155c = x0Var;
        this.d = x0Var2;
        this.f16156e = bundle;
        this.f16157f = bundle2;
        this.f16158g = e1Var;
        this.f16160j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16140l, 1008001300);
        bundle.putBinder(f16141m, this.f16153a.asBinder());
        bundle.putParcelable(f16142n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f16143o;
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
        e9.i0 i0Var2 = this.f16159i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f16144p, arrayList2);
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
        e9.i0 i0Var3 = this.f16161k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f16145q, arrayList4);
            } else {
                a1.g.z(it3.next());
                throw null;
            }
        }
        j1 j1Var = this.f16154b;
        j1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = j1Var.f16183a.iterator();
        while (it4.hasNext()) {
            i1 i1Var = (i1) it4.next();
            i1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(i1.f16173f, i1Var.f16175a);
            bundle3.putString(i1.f16174g, i1Var.f16176b);
            bundle3.putBundle(i1.h, i1Var.f16177c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(j1.f16182b, arrayList5);
        bundle.putBundle(f16146r, bundle2);
        String str2 = f16147s;
        b2.x0 x0Var = this.f16155c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f16148t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f16149u, this.f16156e);
        bundle.putBundle(v, this.f16157f);
        bundle.putBundle(f16150w, this.f16158g.e(w7.s.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f16151x, 5);
        MediaSession.Token token = this.f16160j;
        if (token != null) {
            bundle.putParcelable(f16152y, token);
        }
        return bundle;
    }
}
