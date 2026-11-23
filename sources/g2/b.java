package g2;

import a8.la;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import h2.l0;
import j$.util.Objects;
import java.util.ArrayList;
public final class b {
    public static final String A;
    public static final String B;
    public static final String C;
    public static final String D;
    public static final String E;
    public static final String F;
    public static final String G;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String f13127s;
    public static final String f13128t;
    public static final String f13129u;
    public static final String v;
    public static final String f13130w;
    public static final String f13131x;
    public static final String f13132y;
    public static final String f13133z;
    public final CharSequence f13134a;
    public final Layout.Alignment f13135b;
    public final Layout.Alignment f13136c;
    public final Bitmap d;
    public final float f13137e;
    public final int f13138f;
    public final int f13139g;
    public final float h;
    public final int f13140i;
    public final float f13141j;
    public final float f13142k;
    public final boolean f13143l;
    public final int f13144m;
    public final int f13145n;
    public final float f13146o;
    public final int f13147p;
    public final float f13148q;
    public final int f13149r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13815a;
        f13127s = Integer.toString(0, 36);
        f13128t = Integer.toString(17, 36);
        f13129u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13130w = Integer.toString(3, 36);
        f13131x = Integer.toString(18, 36);
        f13132y = Integer.toString(4, 36);
        f13133z = Integer.toString(5, 36);
        A = Integer.toString(6, 36);
        B = Integer.toString(7, 36);
        C = Integer.toString(8, 36);
        D = Integer.toString(9, 36);
        E = Integer.toString(10, 36);
        F = Integer.toString(11, 36);
        G = Integer.toString(12, 36);
        H = Integer.toString(13, 36);
        I = Integer.toString(14, 36);
        J = Integer.toString(15, 36);
        K = Integer.toString(16, 36);
        L = Integer.toString(19, 36);
    }

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i7, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15, int i15) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            la.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f13134a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13134a = charSequence.toString();
        } else {
            this.f13134a = null;
        }
        this.f13135b = alignment;
        this.f13136c = alignment2;
        this.d = bitmap;
        this.f13137e = f10;
        this.f13138f = i7;
        this.f13139g = i10;
        this.h = f11;
        this.f13140i = i11;
        this.f13141j = f13;
        this.f13142k = f14;
        this.f13143l = z10;
        this.f13144m = i13;
        this.f13145n = i12;
        this.f13146o = f12;
        this.f13147p = i14;
        this.f13148q = f15;
        this.f13149r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13134a;
        if (charSequence != null) {
            bundle.putCharSequence(f13127s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13155a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13159c, fVar.f13160a);
                    bundle2.putInt(f.d, fVar.f13161b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13164a);
                    bundle3.putInt(g.f13162e, gVar.f13165b);
                    bundle3.putInt(g.f13163f, gVar.f13166c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13167b, hVar.f13168a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13128t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13129u, this.f13135b);
        bundle.putSerializable(v, this.f13136c);
        bundle.putFloat(f13132y, this.f13137e);
        bundle.putInt(f13133z, this.f13138f);
        bundle.putInt(A, this.f13139g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13140i);
        bundle.putInt(D, this.f13145n);
        bundle.putFloat(E, this.f13146o);
        bundle.putFloat(F, this.f13141j);
        bundle.putFloat(G, this.f13142k);
        bundle.putBoolean(I, this.f13143l);
        bundle.putInt(H, this.f13144m);
        bundle.putInt(J, this.f13147p);
        bundle.putFloat(K, this.f13148q);
        bundle.putInt(L, this.f13149r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        Bitmap bitmap;
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            Bitmap bitmap2 = bVar.d;
            if (TextUtils.equals(this.f13134a, bVar.f13134a) && this.f13135b == bVar.f13135b && this.f13136c == bVar.f13136c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13137e == bVar.f13137e && this.f13138f == bVar.f13138f && this.f13139g == bVar.f13139g && this.h == bVar.h && this.f13140i == bVar.f13140i && this.f13141j == bVar.f13141j && this.f13142k == bVar.f13142k && this.f13143l == bVar.f13143l && this.f13144m == bVar.f13144m && this.f13145n == bVar.f13145n && this.f13146o == bVar.f13146o && this.f13147p == bVar.f13147p && this.f13148q == bVar.f13148q && this.f13149r == bVar.f13149r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13134a, this.f13135b, this.f13136c, this.d, Float.valueOf(this.f13137e), Integer.valueOf(this.f13138f), Integer.valueOf(this.f13139g), Float.valueOf(this.h), Integer.valueOf(this.f13140i), Float.valueOf(this.f13141j), Float.valueOf(this.f13142k), Boolean.valueOf(this.f13143l), Integer.valueOf(this.f13144m), Integer.valueOf(this.f13145n), Float.valueOf(this.f13146o), Integer.valueOf(this.f13147p), Float.valueOf(this.f13148q), Integer.valueOf(this.f13149r));
    }
}
