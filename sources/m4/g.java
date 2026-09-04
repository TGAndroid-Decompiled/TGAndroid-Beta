package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
public final class g {
    public static final String f15894l;
    public static final String f15895m;
    public static final String f15896n;
    public static final String f15897o;
    public static final String f15898p;
    public static final String f15899q;
    public static final String f15900r;
    public static final String f15901s;
    public static final String f15902t;
    public static final String f15903u;
    public static final String v;
    public static final String f15904w;
    public static final String f15905x;
    public static final String f15906y;
    public final j f15907a;
    public final m1 f15908b;
    public final b2.x0 f15909c;
    public final b2.x0 d;
    public final Bundle f15910e;
    public final Bundle f15911f;
    public final h1 f15912g;
    public final e9.i0 h;
    public final e9.i0 f15913i;
    public final MediaSession.Token f15914j;
    public final e9.i0 f15915k;

    static {
        String str = e2.d0.f8737a;
        f15894l = Integer.toString(0, 36);
        f15895m = Integer.toString(1, 36);
        f15896n = Integer.toString(2, 36);
        f15897o = Integer.toString(9, 36);
        f15898p = Integer.toString(14, 36);
        f15899q = Integer.toString(13, 36);
        f15900r = Integer.toString(3, 36);
        f15901s = Integer.toString(4, 36);
        f15902t = Integer.toString(5, 36);
        f15903u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15904w = Integer.toString(7, 36);
        f15905x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15906y = Integer.toString(12, 36);
    }

    public g(j jVar, e9.i0 i0Var, e9.i0 i0Var2, e9.i0 i0Var3, m1 m1Var, b2.x0 x0Var, b2.x0 x0Var2, Bundle bundle, Bundle bundle2, h1 h1Var, MediaSession.Token token) {
        this.f15907a = jVar;
        this.h = i0Var;
        this.f15913i = i0Var2;
        this.f15915k = i0Var3;
        this.f15908b = m1Var;
        this.f15909c = x0Var;
        this.d = x0Var2;
        this.f15910e = bundle;
        this.f15911f = bundle2;
        this.f15912g = h1Var;
        this.f15914j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15894l, 1008001300);
        bundle.putBinder(f15895m, this.f15907a.asBinder());
        bundle.putParcelable(f15896n, null);
        e9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f15897o;
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
        e9.i0 i0Var2 = this.f15913i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                Iterator<E> it2 = i0Var2.iterator();
                if (!it2.hasNext()) {
                    bundle.putParcelableArrayList(f15898p, arrayList2);
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
        e9.i0 i0Var3 = this.f15915k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            Iterator<E> it3 = i0Var3.iterator();
            if (!it3.hasNext()) {
                bundle.putParcelableArrayList(f15899q, arrayList4);
            } else {
                a4.a.y(it3.next());
                throw null;
            }
        }
        m1 m1Var = this.f15908b;
        m1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        e9.o1 it4 = m1Var.f16005a.iterator();
        while (it4.hasNext()) {
            l1 l1Var = (l1) it4.next();
            l1Var.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putInt(l1.f15996f, l1Var.f15998a);
            bundle3.putString(l1.f15997g, l1Var.f15999b);
            bundle3.putBundle(l1.h, l1Var.f16000c);
            arrayList5.add(bundle3);
        }
        bundle2.putParcelableArrayList(m1.f16004b, arrayList5);
        bundle.putBundle(f15900r, bundle2);
        String str2 = f15901s;
        b2.x0 x0Var = this.f15909c;
        bundle.putBundle(str2, x0Var.b());
        String str3 = f15902t;
        b2.x0 x0Var2 = this.d;
        bundle.putBundle(str3, x0Var2.b());
        bundle.putBundle(f15903u, this.f15910e);
        bundle.putBundle(v, this.f15911f);
        bundle.putBundle(f15904w, this.f15912g.e(w7.t.a(x0Var, x0Var2), false, false).f(i10));
        bundle.putInt(f15905x, 5);
        MediaSession.Token token = this.f15914j;
        if (token != null) {
            bundle.putParcelable(f15906y, token);
        }
        return bundle;
    }
}
