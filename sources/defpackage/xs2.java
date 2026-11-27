package defpackage;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
public final class xs2 {
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
    public final sz6 a;
    public final i9a b;
    public final zf8 c;
    public final zf8 d;
    public final Bundle e;
    public final Bundle f;
    public final kg8 g;
    public final po5 h;
    public final po5 i;
    public final MediaSession.Token j;
    public final j99 k;

    static {
        String str = gcc.a;
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

    public xs2(sz6 sz6Var, po5 po5Var, po5 po5Var2, j99 j99Var, i9a i9aVar, zf8 zf8Var, zf8 zf8Var2, Bundle bundle, Bundle bundle2, kg8 kg8Var, MediaSession.Token token) {
        this.a = sz6Var;
        this.h = po5Var;
        this.i = po5Var2;
        this.k = j99Var;
        this.b = i9aVar;
        this.c = zf8Var;
        this.d = zf8Var2;
        this.e = bundle;
        this.f = bundle2;
        this.g = kg8Var;
        this.j = token;
    }

    public final Bundle a(int i) {
        Bundle bundle = new Bundle();
        bundle.putInt(l, 1011001300);
        bundle.putBinder(m, this.a);
        bundle.putParcelable(n, null);
        po5 po5Var = this.h;
        boolean isEmpty = po5Var.isEmpty();
        String str = o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(po5Var.size());
            int size = po5Var.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = po5Var.get(i2);
                i2++;
                arrayList.add(((bn2) obj).j(i));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        po5 po5Var2 = this.i;
        if (!po5Var2.isEmpty()) {
            if (i >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(po5Var2.size());
                int size2 = po5Var2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = po5Var2.get(i3);
                    i3++;
                    arrayList2.add(((bn2) obj2).j(i));
                }
                bundle.putParcelableArrayList(p, arrayList2);
            } else {
                j99 f = bn2.f(po5Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(f.d);
                no5 listIterator = f.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((bn2) listIterator.next()).j(i));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        j99 j99Var = this.k;
        if (!j99Var.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(j99Var.d);
            no5 listIterator2 = j99Var.listIterator(0);
            while (listIterator2.hasNext()) {
                arrayList4.add(((bn2) listIterator2.next()).j(i));
            }
            bundle.putParcelableArrayList(q, arrayList4);
        }
        i9a i9aVar = this.b;
        i9aVar.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        v9c n2 = i9aVar.a.n();
        while (n2.hasNext()) {
            arrayList5.add(((h9a) n2.next()).a());
        }
        bundle2.putParcelableArrayList(i9a.c, arrayList5);
        bundle.putBundle(r, bundle2);
        String str2 = s;
        zf8 zf8Var = this.c;
        bundle.putBundle(str2, zf8Var.b());
        String str3 = t;
        zf8 zf8Var2 = this.d;
        bundle.putBundle(str3, zf8Var2.b());
        bundle.putBundle(u, this.e);
        bundle.putBundle(v, this.f);
        bundle.putBundle(w, this.g.e(ote.a(zf8Var, zf8Var2), false, false).f(i));
        bundle.putInt(x, 10);
        MediaSession.Token token = this.j;
        if (token != null) {
            bundle.putParcelable(y, token);
        }
        return bundle;
    }
}
