package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
public final class pt2 {
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public static final String q;
    public static final String r;
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public final oz6 a;
    public final s7a b;
    public final ne8 c;
    public final ne8 d;
    public final Bundle e;
    public final Bundle f;
    public final ye8 g;
    public final mo5 h;
    public final mo5 i;
    public final MediaSession.Token j;
    public final y79 k;

    static {
        String str = hac.a;
        l = "0";
        m = "1";
        n = "2";
        o = "9";
        p = "e";
        q = "d";
        r = "3";
        s = "4";
        t = "5";
        u = "6";
        v = "b";
        w = "7";
        x = "8";
        y = "c";
    }

    public pt2(oz6 oz6Var, mo5 mo5Var, mo5 mo5Var2, y79 y79Var, s7a s7aVar, ne8 ne8Var, ne8 ne8Var2, Bundle bundle, Bundle bundle2, ye8 ye8Var, MediaSession.Token token) {
        this.a = oz6Var;
        this.h = mo5Var;
        this.i = mo5Var2;
        this.k = y79Var;
        this.b = s7aVar;
        this.c = ne8Var;
        this.d = ne8Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = ye8Var;
        this.j = token;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1011001300);
        bundle.putBinder(m, this.a);
        bundle.putParcelable(n, null);
        mo5 mo5Var = this.h;
        boolean isEmpty = mo5Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(mo5Var.size());
            int size = mo5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = mo5Var.get(i2);
                i2++;
                arrayList.add(((un2) obj).j(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        mo5 mo5Var2 = this.i;
        if (!mo5Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(mo5Var2.size());
                int size2 = mo5Var2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = mo5Var2.get(i3);
                    i3++;
                    arrayList2.add(((un2) obj2).j(i));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                y79 f = un2.f(mo5Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(f.d);
                ko5 listIterator = f.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((un2) listIterator.next()).j(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        y79 y79Var = this.k;
        if (!y79Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(y79Var.d);
            ko5 listIterator2 = y79Var.listIterator(0);
            while (listIterator2.hasNext()) {
                arrayList4.add(((un2) listIterator2.next()).j(i));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        s7a s7aVar = this.b;
        s7aVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        v7c n2 = s7aVar.a.n();
        while (n2.hasNext()) {
            arrayList5.add(((r7a) n2.next()).a());
        }
        bundle2.putParcelableArrayList(s7a.c, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        ne8 ne8Var = this.c;
        bundle.putBundle(str2, ne8Var.b());
        String str3 = t;
        ne8 ne8Var2 = this.d;
        bundle.putBundle(str3, ne8Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(zqe.a(ne8Var, ne8Var2), false, false).f(i));
        bundle.putInt(x, 10);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
