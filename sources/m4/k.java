package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.m2;
import e9.x1;
import java.util.ArrayList;
public final class k {
    public static final String f12794l;
    public static final String f12795m;
    public static final String f12796n;
    public static final String f12797o;
    public static final String f12798p;
    public static final String f12799q;
    public static final String f12800r;
    public static final String f12801s;
    public static final String f12802t;
    public static final String f12803u;
    public static final String v;
    public static final String f12804w;
    public static final String f12805x;
    public static final String f12806y;
    public final n f12807a;
    public final q1 f12808b;
    public final b2.b1 f12809c;
    public final b2.b1 d;
    public final Bundle e;
    public final Bundle f12810f;
    public final l1 f12811g;
    public final e9.n0 h;
    public final e9.n0 f12812i;
    public final MediaSession.Token f12813j;
    public final e9.n0 f12814k;

    static {
        String str = e2.l0.f6165a;
        f12794l = Integer.toString(0, 36);
        f12795m = Integer.toString(1, 36);
        f12796n = Integer.toString(2, 36);
        f12797o = Integer.toString(9, 36);
        f12798p = Integer.toString(14, 36);
        f12799q = Integer.toString(13, 36);
        f12800r = Integer.toString(3, 36);
        f12801s = Integer.toString(4, 36);
        f12802t = Integer.toString(5, 36);
        f12803u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f12804w = Integer.toString(7, 36);
        f12805x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f12806y = Integer.toString(12, 36);
    }

    public k(n nVar, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, q1 q1Var, b2.b1 b1Var, b2.b1 b1Var2, Bundle bundle, Bundle bundle2, l1 l1Var, MediaSession.Token token) {
        this.f12807a = nVar;
        this.h = n0Var;
        this.f12812i = n0Var2;
        this.f12814k = n0Var3;
        this.f12808b = q1Var;
        this.f12809c = b1Var;
        this.d = b1Var2;
        this.e = bundle;
        this.f12810f = bundle2;
        this.f12811g = l1Var;
        this.f12813j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f12794l, 1010001300);
        bundle.putBinder(f12795m, this.f12807a.asBinder());
        bundle.putParcelable(f12796n, null);
        e9.n0 n0Var = this.h;
        boolean isEmpty = n0Var.isEmpty();
        String str = f12797o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                arrayList.add(((e) obj).k(i10));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        e9.n0 n0Var2 = this.f12812i;
        if (!n0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var2.size());
                int size2 = n0Var2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = n0Var2.get(i12);
                    i12++;
                    arrayList2.add(((e) obj2).k(i10));
                }
                bundle.putParcelableArrayList(f12798p, arrayList2);
            } else {
                x1 g10 = e.g(n0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                e9.l0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((e) listIterator.next()).k(i10));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        e9.n0 n0Var3 = this.f12814k;
        if (!n0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(n0Var3.size());
            int size3 = n0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = n0Var3.get(i13);
                i13++;
                arrayList4.add(((e) obj3).k(i10));
            }
            bundle.putParcelableArrayList(f12799q, arrayList4);
        }
        q1 q1Var = this.f12808b;
        q1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        m2 it = q1Var.f12904a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((p1) it.next()).a());
        }
        bundle2.putParcelableArrayList(q1.f12903b, arrayList5);
        bundle.putBundle(f12800r, bundle2);
        String str2 = f12801s;
        b2.b1 b1Var = this.f12809c;
        bundle.putBundle(str2, b1Var.b());
        String str3 = f12802t;
        b2.b1 b1Var2 = this.d;
        bundle.putBundle(str3, b1Var2.b());
        bundle.putBundle(f12803u, this.e);
        bundle.putBundle(v, this.f12810f);
        bundle.putBundle(f12804w, this.f12811g.e(w7.y.a(b1Var, b1Var2), false, false).f(i10));
        bundle.putInt(f12805x, 9);
        MediaSession.Token token = this.f12813j;
        if (token != null) {
            bundle.putParcelable(f12806y, token);
        }
        return bundle;
    }
}
