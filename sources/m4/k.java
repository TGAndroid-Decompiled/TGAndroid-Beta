package m4;

import a8.ie;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import f9.g2;
import java.util.ArrayList;
public final class k {
    public static final String f18096l;
    public static final String f18097m;
    public static final String f18098n;
    public static final String f18099o;
    public static final String f18100p;
    public static final String f18101q;
    public static final String f18102r;
    public static final String f18103s;
    public static final String f18104t;
    public static final String f18105u;
    public static final String v;
    public static final String f18106w;
    public static final String f18107x;
    public static final String f18108y;
    public final n f18109a;
    public final q1 f18110b;
    public final b2.c1 f18111c;
    public final b2.c1 d;
    public final Bundle e;
    public final Bundle f18112f;
    public final l1 f18113g;
    public final f9.i0 h;
    public final f9.i0 f18114i;
    public final MediaSession.Token f18115j;
    public final f9.i0 f18116k;

    static {
        String str = e2.n0.f9692a;
        f18096l = Integer.toString(0, 36);
        f18097m = Integer.toString(1, 36);
        f18098n = Integer.toString(2, 36);
        f18099o = Integer.toString(9, 36);
        f18100p = Integer.toString(14, 36);
        f18101q = Integer.toString(13, 36);
        f18102r = Integer.toString(3, 36);
        f18103s = Integer.toString(4, 36);
        f18104t = Integer.toString(5, 36);
        f18105u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f18106w = Integer.toString(7, 36);
        f18107x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f18108y = Integer.toString(12, 36);
    }

    public k(n nVar, f9.i0 i0Var, f9.i0 i0Var2, f9.i0 i0Var3, q1 q1Var, b2.c1 c1Var, b2.c1 c1Var2, Bundle bundle, Bundle bundle2, l1 l1Var, MediaSession.Token token) {
        this.f18109a = nVar;
        this.h = i0Var;
        this.f18114i = i0Var2;
        this.f18116k = i0Var3;
        this.f18110b = q1Var;
        this.f18111c = c1Var;
        this.d = c1Var2;
        this.e = bundle;
        this.f18112f = bundle2;
        this.f18113g = l1Var;
        this.f18115j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f18096l, 1010001300);
        bundle.putBinder(f18097m, this.f18109a.asBinder());
        bundle.putParcelable(f18098n, null);
        f9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f18099o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = i0Var.get(i11);
                i11++;
                arrayList.add(((e) obj).k(i10));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        f9.i0 i0Var2 = this.f18114i;
        if (!i0Var2.isEmpty()) {
            if (i10 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                int size2 = i0Var2.size();
                int i12 = 0;
                while (i12 < size2) {
                    Object obj2 = i0Var2.get(i12);
                    i12++;
                    arrayList2.add(((e) obj2).k(i10));
                }
                bundle.putParcelableArrayList(f18100p, arrayList2);
            } else {
                f9.s1 g7 = e.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g7.d);
                f9.g0 listIterator = g7.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((e) listIterator.next()).k(i10));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        f9.i0 i0Var3 = this.f18116k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = i0Var3.get(i13);
                i13++;
                arrayList4.add(((e) obj3).k(i10));
            }
            bundle.putParcelableArrayList(f18101q, arrayList4);
        }
        q1 q1Var = this.f18110b;
        q1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        g2 it = q1Var.f18206a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((p1) it.next()).a());
        }
        bundle2.putParcelableArrayList(q1.f18205b, arrayList5);
        bundle.putBundle(f18102r, bundle2);
        String str2 = f18103s;
        b2.c1 c1Var = this.f18111c;
        bundle.putBundle(str2, c1Var.b());
        String str3 = f18104t;
        b2.c1 c1Var2 = this.d;
        bundle.putBundle(str3, c1Var2.b());
        bundle.putBundle(f18105u, this.e);
        bundle.putBundle(v, this.f18112f);
        bundle.putBundle(f18106w, this.f18113g.e(ie.a(c1Var, c1Var2), false, false).f(i10));
        bundle.putInt(f18107x, 9);
        MediaSession.Token token = this.f18115j;
        if (token != null) {
            bundle.putParcelable(f18108y, token);
        }
        return bundle;
    }
}
