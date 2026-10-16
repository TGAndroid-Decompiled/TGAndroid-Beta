package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.m2;
import e9.x1;
import java.util.ArrayList;
public final class j {
    public static final String f15209l;
    public static final String f15210m;
    public static final String f15211n;
    public static final String f15212o;
    public static final String f15213p;
    public static final String f15214q;
    public static final String f15215r;
    public static final String f15216s;
    public static final String f15217t;
    public static final String f15218u;
    public static final String v;
    public static final String f15219w;
    public static final String f15220x;
    public static final String f15221y;
    public final m f15222a;
    public final p1 f15223b;
    public final b2.c1 f15224c;
    public final b2.c1 d;
    public final Bundle e;
    public final Bundle f15225f;
    public final k1 f15226g;
    public final e9.n0 h;
    public final e9.n0 f15227i;
    public final MediaSession.Token f15228j;
    public final e9.n0 f15229k;

    static {
        String str = e2.m0.f8375a;
        f15209l = Integer.toString(0, 36);
        f15210m = Integer.toString(1, 36);
        f15211n = Integer.toString(2, 36);
        f15212o = Integer.toString(9, 36);
        f15213p = Integer.toString(14, 36);
        f15214q = Integer.toString(13, 36);
        f15215r = Integer.toString(3, 36);
        f15216s = Integer.toString(4, 36);
        f15217t = Integer.toString(5, 36);
        f15218u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15219w = Integer.toString(7, 36);
        f15220x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15221y = Integer.toString(12, 36);
    }

    public j(m mVar, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, p1 p1Var, b2.c1 c1Var, b2.c1 c1Var2, Bundle bundle, Bundle bundle2, k1 k1Var, MediaSession.Token token) {
        this.f15222a = mVar;
        this.h = n0Var;
        this.f15227i = n0Var2;
        this.f15229k = n0Var3;
        this.f15223b = p1Var;
        this.f15224c = c1Var;
        this.d = c1Var2;
        this.e = bundle;
        this.f15225f = bundle2;
        this.f15226g = k1Var;
        this.f15228j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15209l, 1010001300);
        bundle.putBinder(f15210m, this.f15222a.asBinder());
        bundle.putParcelable(f15211n, null);
        e9.n0 n0Var = this.h;
        boolean isEmpty = n0Var.isEmpty();
        String str = f15212o;
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
        e9.n0 n0Var2 = this.f15227i;
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
                bundle.putParcelableArrayList(f15213p, arrayList2);
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
        e9.n0 n0Var3 = this.f15229k;
        if (!n0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(n0Var3.size());
            int size3 = n0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = n0Var3.get(i13);
                i13++;
                arrayList4.add(((d) obj3).k(i10));
            }
            bundle.putParcelableArrayList(f15214q, arrayList4);
        }
        p1 p1Var = this.f15223b;
        p1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        m2 it = p1Var.f15320a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((o1) it.next()).a());
        }
        bundle2.putParcelableArrayList(p1.f15319b, arrayList5);
        bundle.putBundle(f15215r, bundle2);
        String str2 = f15216s;
        b2.c1 c1Var = this.f15224c;
        bundle.putBundle(str2, c1Var.b());
        String str3 = f15217t;
        b2.c1 c1Var2 = this.d;
        bundle.putBundle(str3, c1Var2.b());
        bundle.putBundle(f15218u, this.e);
        bundle.putBundle(v, this.f15225f);
        bundle.putBundle(f15219w, this.f15226g.e(w7.v.a(c1Var, c1Var2), false, false).f(i10));
        bundle.putInt(f15220x, 9);
        MediaSession.Token token = this.f15228j;
        if (token != null) {
            bundle.putParcelable(f15221y, token);
        }
        return bundle;
    }
}
