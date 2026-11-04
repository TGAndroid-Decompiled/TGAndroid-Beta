package o4;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcelable;
import b8.xe;
import g9.g2;
import java.util.ArrayList;
public final class j {
    public static final String f20680l;
    public static final String f20681m;
    public static final String f20682n;
    public static final String f20683o;
    public static final String f20684p;
    public static final String f20685q;
    public static final String f20686r;
    public static final String f20687s;
    public static final String f20688t;
    public static final String f20689u;
    public static final String v;
    public static final String f20690w;
    public static final String f20691x;
    public static final String f20692y;
    public final m f20693a;
    public final o1 f20694b;
    public final d2.a1 f20695c;
    public final d2.a1 d;
    public final Bundle f20696e;
    public final Bundle f20697f;
    public final j1 f20698g;
    public final g9.i0 h;
    public final g9.i0 f20699i;
    public final MediaSession.Token f20700j;
    public final g9.i0 f20701k;

    static {
        String str = g2.n0.f11873a;
        f20680l = Integer.toString(0, 36);
        f20681m = Integer.toString(1, 36);
        f20682n = Integer.toString(2, 36);
        f20683o = Integer.toString(9, 36);
        f20684p = Integer.toString(14, 36);
        f20685q = Integer.toString(13, 36);
        f20686r = Integer.toString(3, 36);
        f20687s = Integer.toString(4, 36);
        f20688t = Integer.toString(5, 36);
        f20689u = Integer.toString(6, 36);
        v = Integer.toString(11, 36);
        f20690w = Integer.toString(7, 36);
        f20691x = Integer.toString(8, 36);
        Integer.toString(10, 36);
        f20692y = Integer.toString(12, 36);
    }

    public j(m mVar, g9.i0 i0Var, g9.i0 i0Var2, g9.i0 i0Var3, o1 o1Var, d2.a1 a1Var, d2.a1 a1Var2, Bundle bundle, Bundle bundle2, j1 j1Var, MediaSession.Token token) {
        this.f20693a = mVar;
        this.h = i0Var;
        this.f20699i = i0Var2;
        this.f20701k = i0Var3;
        this.f20694b = o1Var;
        this.f20695c = a1Var;
        this.d = a1Var2;
        this.f20696e = bundle;
        this.f20697f = bundle2;
        this.f20698g = j1Var;
        this.f20700j = token;
    }

    public final Bundle a(int i3) {
        Bundle bundle = new Bundle();
        bundle.putInt(f20680l, 1010001300);
        bundle.putBinder(f20681m, this.f20693a.asBinder());
        bundle.putParcelable(f20682n, null);
        g9.i0 i0Var = this.h;
        boolean isEmpty = i0Var.isEmpty();
        String str = f20683o;
        if (!isEmpty) {
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>(i0Var.size());
            int size = i0Var.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = i0Var.get(i10);
                i10++;
                arrayList.add(((d) obj).k(i3));
            }
            bundle.putParcelableArrayList(str, arrayList);
        }
        g9.i0 i0Var2 = this.f20699i;
        if (!i0Var2.isEmpty()) {
            if (i3 >= 7) {
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>(i0Var2.size());
                int size2 = i0Var2.size();
                int i11 = 0;
                while (i11 < size2) {
                    Object obj2 = i0Var2.get(i11);
                    i11++;
                    arrayList2.add(((d) obj2).k(i3));
                }
                bundle.putParcelableArrayList(f20684p, arrayList2);
            } else {
                g9.s1 g7 = d.g(i0Var2);
                ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>(g7.d);
                g9.g0 listIterator = g7.listIterator(0);
                while (listIterator.hasNext()) {
                    arrayList3.add(((d) listIterator.next()).k(i3));
                }
                bundle.putParcelableArrayList(str, arrayList3);
            }
        }
        g9.i0 i0Var3 = this.f20701k;
        if (!i0Var3.isEmpty()) {
            ArrayList<? extends Parcelable> arrayList4 = new ArrayList<>(i0Var3.size());
            int size3 = i0Var3.size();
            int i12 = 0;
            while (i12 < size3) {
                Object obj3 = i0Var3.get(i12);
                i12++;
                arrayList4.add(((d) obj3).k(i3));
            }
            bundle.putParcelableArrayList(f20685q, arrayList4);
        }
        o1 o1Var = this.f20694b;
        o1Var.getClass();
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
        g2 it = o1Var.f20791a.iterator();
        while (it.hasNext()) {
            arrayList5.add(((n1) it.next()).a());
        }
        bundle2.putParcelableArrayList(o1.f20790b, arrayList5);
        bundle.putBundle(f20686r, bundle2);
        String str2 = f20687s;
        d2.a1 a1Var = this.f20695c;
        bundle.putBundle(str2, a1Var.b());
        String str3 = f20688t;
        d2.a1 a1Var2 = this.d;
        bundle.putBundle(str3, a1Var2.b());
        bundle.putBundle(f20689u, this.f20696e);
        bundle.putBundle(v, this.f20697f);
        bundle.putBundle(f20690w, this.f20698g.e(xe.a(a1Var, a1Var2), false, false).f(i3));
        bundle.putInt(f20691x, 9);
        MediaSession.Token token = this.f20700j;
        if (token != null) {
            bundle.putParcelable(f20692y, token);
        }
        return bundle;
    }
}
