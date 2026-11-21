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
    public static final String f13124s;
    public static final String f13125t;
    public static final String f13126u;
    public static final String v;
    public static final String f13127w;
    public static final String f13128x;
    public static final String f13129y;
    public static final String f13130z;
    public final CharSequence f13131a;
    public final Layout.Alignment f13132b;
    public final Layout.Alignment f13133c;
    public final Bitmap d;
    public final float f13134e;
    public final int f13135f;
    public final int f13136g;
    public final float h;
    public final int f13137i;
    public final float f13138j;
    public final float f13139k;
    public final boolean f13140l;
    public final int f13141m;
    public final int f13142n;
    public final float f13143o;
    public final int f13144p;
    public final float f13145q;
    public final int f13146r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13812a;
        f13124s = Integer.toString(0, 36);
        f13125t = Integer.toString(17, 36);
        f13126u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13127w = Integer.toString(3, 36);
        f13128x = Integer.toString(18, 36);
        f13129y = Integer.toString(4, 36);
        f13130z = Integer.toString(5, 36);
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
            this.f13131a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13131a = charSequence.toString();
        } else {
            this.f13131a = null;
        }
        this.f13132b = alignment;
        this.f13133c = alignment2;
        this.d = bitmap;
        this.f13134e = f10;
        this.f13135f = i7;
        this.f13136g = i10;
        this.h = f11;
        this.f13137i = i11;
        this.f13138j = f13;
        this.f13139k = f14;
        this.f13140l = z10;
        this.f13141m = i13;
        this.f13142n = i12;
        this.f13143o = f12;
        this.f13144p = i14;
        this.f13145q = f15;
        this.f13146r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13131a;
        if (charSequence != null) {
            bundle.putCharSequence(f13124s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13152a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13156c, fVar.f13157a);
                    bundle2.putInt(f.d, fVar.f13158b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13161a);
                    bundle3.putInt(g.f13159e, gVar.f13162b);
                    bundle3.putInt(g.f13160f, gVar.f13163c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13164b, hVar.f13165a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13125t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13126u, this.f13132b);
        bundle.putSerializable(v, this.f13133c);
        bundle.putFloat(f13129y, this.f13134e);
        bundle.putInt(f13130z, this.f13135f);
        bundle.putInt(A, this.f13136g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13137i);
        bundle.putInt(D, this.f13142n);
        bundle.putFloat(E, this.f13143o);
        bundle.putFloat(F, this.f13138j);
        bundle.putFloat(G, this.f13139k);
        bundle.putBoolean(I, this.f13140l);
        bundle.putInt(H, this.f13141m);
        bundle.putInt(J, this.f13144p);
        bundle.putFloat(K, this.f13145q);
        bundle.putInt(L, this.f13146r);
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
            if (TextUtils.equals(this.f13131a, bVar.f13131a) && this.f13132b == bVar.f13132b && this.f13133c == bVar.f13133c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13134e == bVar.f13134e && this.f13135f == bVar.f13135f && this.f13136g == bVar.f13136g && this.h == bVar.h && this.f13137i == bVar.f13137i && this.f13138j == bVar.f13138j && this.f13139k == bVar.f13139k && this.f13140l == bVar.f13140l && this.f13141m == bVar.f13141m && this.f13142n == bVar.f13142n && this.f13143o == bVar.f13143o && this.f13144p == bVar.f13144p && this.f13145q == bVar.f13145q && this.f13146r == bVar.f13146r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13131a, this.f13132b, this.f13133c, this.d, Float.valueOf(this.f13134e), Integer.valueOf(this.f13135f), Integer.valueOf(this.f13136g), Float.valueOf(this.h), Integer.valueOf(this.f13137i), Float.valueOf(this.f13138j), Float.valueOf(this.f13139k), Boolean.valueOf(this.f13140l), Integer.valueOf(this.f13141m), Integer.valueOf(this.f13142n), Float.valueOf(this.f13143o), Integer.valueOf(this.f13144p), Float.valueOf(this.f13145q), Integer.valueOf(this.f13146r));
    }
}
