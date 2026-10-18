package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.m2;
import e9.x1;
import java.util.ArrayList;
public final class j {
    public static final String f16567l;
    public static final String f16568m;
    public static final String f16569n;
    public static final String f16570o;
    public static final String f16571p;
    public static final String f16572q;
    public static final String f16573r;
    public static final String f16574s;
    public static final String f16575t;
    public static final String f16576u;
    public static final String v;
    public static final String f16577w;
    public static final String f16578x;
    public static final String f16579y;
    public final m f16580a;
    public final p1 f16581b;
    public final b2.b1 f16582c;
    public final b2.b1 d;
    public final Bundle e;
    public final Bundle f16583f;
    public final k1 f16584g;
    public final e9.n0 h;
    public final e9.n0 f16585i;
    public final MediaSession.Token f16586j;
    public final e9.n0 f16587k;

    static {
        String str = e2.m0.f8253a;
        f16567l = Integer.toString(0, 36);
        f16568m = Integer.toString(1, 36);
        f16569n = Integer.toString(2, 36);
        f16570o = Integer.toString(9, 36);
        f16571p = Integer.toString(14, 36);
        f16572q = Integer.toString(13, 36);
        f16573r = Integer.toString(3, 36);
        f16574s = Integer.toString(4, 36);
        f16575t = Integer.toString(5, 36);
        f16576u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f16577w = Integer.toString(7, 36);
        f16578x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f16579y = Integer.toString(12, 36);
    }

    public j(m mVar, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, p1 p1Var, b2.b1 b1Var, b2.b1 b1Var2, Bundle bundle, Bundle bundle2, k1 k1Var, MediaSession.Token token) {
        this.f16580a = mVar;
        this.h = n0Var;
        this.f16585i = n0Var2;
        this.f16587k = n0Var3;
        this.f16581b = p1Var;
        this.f16582c = b1Var;
        this.d = b1Var2;
        this.e = bundle;
        this.f16583f = bundle2;
        this.f16584g = k1Var;
        this.f16586j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f16567l, 1010001300);
        bundle.putBinder(f16568m, this.f16580a.asBinder());
        bundle.putParcelable(f16569n, null);
        e9.n0 n0Var = this.h;
        boolean isEmpty = n0Var.isEmpty();
        String str = f16570o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(n0Var.size());
            int size = n0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = n0Var.get(i11);
                i11++;
                arrayList.add(((d) obj).k(i10));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        e9.n0 n0Var2 = this.f16585i;
        if (!n0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(n0Var2.size());
                int size2 = n0Var2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = n0Var2.get(i12);
                    i12++;
                    arrayList2.add(((d) obj2).k(i10));
                }
                bundle.putParcelableArrayList(f16571p, arrayList2);
            } else {
                x1 g10 = d.g(n0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g10.d);
                e9.l0 listIterator = g10.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i10));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        e9.n0 n0Var3 = this.f16587k;
        if (!n0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(n0Var3.size());
            int size3 = n0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = n0Var3.get(i13);
                i13++;
                arrayList4.add(((d) obj3).k(i10));
            }
            bundle.putParcelableArrayList(f16572q, arrayList4);
        }
        p1 p1Var = this.f16581b;
        p1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        m2 it = p1Var.f16677a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((o1) it.next()).a());
        }
        bundle2.putParcelableArrayList(p1.f16676b, arrayList5);
        bundle.putBundle(f16573r, bundle2);
        String str2 = f16574s;
        b2.b1 b1Var = this.f16582c;
        bundle.putBundle(str2, b1Var.b());
        String str3 = f16575t;
        b2.b1 b1Var2 = this.d;
        bundle.putBundle(str3, b1Var2.b());
        bundle.putBundle(f16576u, this.e);
        bundle.putBundle(v, this.f16583f);
        bundle.putBundle(f16577w, this.f16584g.e(w7.v.a(b1Var, b1Var2), false, false).f(i10));
        bundle.putInt(f16578x, 9);
        MediaSession.Token token = this.f16586j;
        if (token != null) {
            bundle.putParcelable(f16579y, token);
        }
        return bundle;
    }
}
