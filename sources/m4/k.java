package m4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import e9.m2;
import e9.x1;
import java.util.ArrayList;
public final class k {
    public static final String f15479l;
    public static final String f15480m;
    public static final String f15481n;
    public static final String f15482o;
    public static final String f15483p;
    public static final String f15484q;
    public static final String f15485r;
    public static final String f15486s;
    public static final String f15487t;
    public static final String f15488u;
    public static final String v;
    public static final String f15489w;
    public static final String f15490x;
    public static final String f15491y;
    public final n f15492a;
    public final q1 f15493b;
    public final b2.c1 f15494c;
    public final b2.c1 d;
    public final Bundle e;
    public final Bundle f15495f;
    public final l1 f15496g;
    public final e9.n0 h;
    public final e9.n0 f15497i;
    public final MediaSession.Token f15498j;
    public final e9.n0 f15499k;

    static {
        String str = e2.m0.f8372a;
        f15479l = Integer.toString(0, 36);
        f15480m = Integer.toString(1, 36);
        f15481n = Integer.toString(2, 36);
        f15482o = Integer.toString(9, 36);
        f15483p = Integer.toString(14, 36);
        f15484q = Integer.toString(13, 36);
        f15485r = Integer.toString(3, 36);
        f15486s = Integer.toString(4, 36);
        f15487t = Integer.toString(5, 36);
        f15488u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f15489w = Integer.toString(7, 36);
        f15490x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f15491y = Integer.toString(12, 36);
    }

    public k(n nVar, e9.n0 n0Var, e9.n0 n0Var2, e9.n0 n0Var3, q1 q1Var, b2.c1 c1Var, b2.c1 c1Var2, Bundle bundle, Bundle bundle2, l1 l1Var, MediaSession.Token token) {
        this.f15492a = nVar;
        this.h = n0Var;
        this.f15497i = n0Var2;
        this.f15499k = n0Var3;
        this.f15493b = q1Var;
        this.f15494c = c1Var;
        this.d = c1Var2;
        this.e = bundle;
        this.f15495f = bundle2;
        this.f15496g = l1Var;
        this.f15498j = token;
    }

    public final Bundle a(int i10) {
        Bundle bundle = new Bundle();
        bundle.putInt(f15479l, 1010001300);
        bundle.putBinder(f15480m, this.f15492a.asBinder());
        bundle.putParcelable(f15481n, null);
        e9.n0 n0Var = this.h;
        boolean isEmpty = n0Var.isEmpty();
        String str = f15482o;
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
        e9.n0 n0Var2 = this.f15497i;
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
                bundle.putParcelableArrayList(f15483p, arrayList2);
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
        e9.n0 n0Var3 = this.f15499k;
        if (!n0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(n0Var3.size());
            int size3 = n0Var3.size();
            int i13 = 0;
            while (i13 < size3) {
                Object obj3 = n0Var3.get(i13);
                i13++;
                arrayList4.add(((e) obj3).k(i10));
            }
            bundle.putParcelableArrayList(f15484q, arrayList4);
        }
        q1 q1Var = this.f15493b;
        q1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        m2 it = q1Var.f15590a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((p1) it.next()).a());
        }
        bundle2.putParcelableArrayList(q1.f15589b, arrayList5);
        bundle.putBundle(f15485r, bundle2);
        String str2 = f15486s;
        b2.c1 c1Var = this.f15494c;
        bundle.putBundle(str2, c1Var.b());
        String str3 = f15487t;
        b2.c1 c1Var2 = this.d;
        bundle.putBundle(str3, c1Var2.b());
        bundle.putBundle(f15488u, this.e);
        bundle.putBundle(v, this.f15495f);
        bundle.putBundle(f15489w, this.f15496g.e(w7.w.a(c1Var, c1Var2), false, false).f(i10));
        bundle.putInt(f15490x, 9);
        MediaSession.Token token = this.f15498j;
        if (token != null) {
            bundle.putParcelable(f15491y, token);
        }
        return bundle;
    }
}
