package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
public final class es2 {
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
    public final ox6 a;
    public final q5a b;
    public final kc8 c;
    public final kc8 d;
    public final Bundle e;
    public final Bundle f;
    public final wc8 g;
    public final mm5 h;
    public final mm5 i;
    public final MediaSession.Token j;
    public final w59 k;

    static {
        String str = g8c.a;
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

    public es2(ox6 ox6Var, mm5 mm5Var, mm5 mm5Var2, w59 w59Var, q5a q5aVar, kc8 kc8Var, kc8 kc8Var2, Bundle bundle, Bundle bundle2, wc8 wc8Var, MediaSession.Token token) {
        this.a = ox6Var;
        this.h = mm5Var;
        this.i = mm5Var2;
        this.k = w59Var;
        this.b = q5aVar;
        this.c = kc8Var;
        this.d = kc8Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = wc8Var;
        this.j = token;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1011001300);
        bundle.putBinder(m, this.a);
        bundle.putParcelable(n, null);
        mm5 mm5Var = this.h;
        boolean isEmpty = mm5Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(mm5Var.size());
            int size = mm5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = mm5Var.get(i2);
                i2++;
                arrayList.add(((hm2) obj).j(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        mm5 mm5Var2 = this.i;
        if (!mm5Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(mm5Var2.size());
                int size2 = mm5Var2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = mm5Var2.get(i3);
                    i3++;
                    arrayList2.add(((hm2) obj2).j(i));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                w59 f = hm2.f(mm5Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(f.d);
                km5 listIterator = f.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((hm2) listIterator.next()).j(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        w59 w59Var = this.k;
        if (!w59Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(w59Var.d);
            km5 listIterator2 = w59Var.listIterator(0);
            while (listIterator2.hasNext()) {
                arrayList4.add(((hm2) listIterator2.next()).j(i));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        q5a q5aVar = this.b;
        q5aVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        v5c n2 = q5aVar.a.n();
        while (n2.hasNext()) {
            arrayList5.add(((p5a) n2.next()).a());
        }
        bundle2.putParcelableArrayList(q5a.c, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        kc8 kc8Var = this.c;
        bundle.putBundle(str2, kc8Var.b());
        String str3 = t;
        kc8 kc8Var2 = this.d;
        bundle.putBundle(str3, kc8Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(woe.a(kc8Var, kc8Var2), false, false).f(i));
        bundle.putInt(x, 10);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
