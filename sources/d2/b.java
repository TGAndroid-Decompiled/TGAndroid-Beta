package d2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.m0;
import j$.util.Objects;
import java.util.ArrayList;
import v7.u6;
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
    public static final String f6290s;
    public static final String f6291t;
    public static final String f6292u;
    public static final String v;
    public static final String f6293w;
    public static final String f6294x;
    public static final String f6295y;
    public static final String f6296z;
    public final CharSequence f6297a;
    public final Layout.Alignment f6298b;
    public final Layout.Alignment f6299c;
    public final Bitmap d;
    public final float e;
    public final int f6300f;
    public final int f6301g;
    public final float h;
    public final int f6302i;
    public final float f6303j;
    public final float f6304k;
    public final boolean f6305l;
    public final int f6306m;
    public final int f6307n;
    public final float f6308o;
    public final int f6309p;
    public final float f6310q;
    public final int f6311r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8372a;
        f6290s = Integer.toString(0, 36);
        f6291t = Integer.toString(17, 36);
        f6292u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f6293w = Integer.toString(3, 36);
        f6294x = Integer.toString(18, 36);
        f6295y = Integer.toString(4, 36);
        f6296z = Integer.toString(5, 36);
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

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f7, int i10, int i11, float f10, int i12, int i13, float f11, float f12, float f13, boolean z10, int i14, int i15, float f14, int i16) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            u6.g(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f6297a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6297a = charSequence.toString();
        } else {
            this.f6297a = null;
        }
        this.f6298b = alignment;
        this.f6299c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f6300f = i10;
        this.f6301g = i11;
        this.h = f10;
        this.f6302i = i12;
        this.f6303j = f12;
        this.f6304k = f13;
        this.f6305l = z10;
        this.f6306m = i14;
        this.f6307n = i13;
        this.f6308o = f11;
        this.f6309p = i15;
        this.f6310q = f14;
        this.f6311r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f6297a;
        if (charSequence != null) {
            bundle.putCharSequence(f6290s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f6316a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f6319c, fVar.f6320a);
                    bundle2.putInt(f.d, fVar.f6321b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f6323a);
                    bundle3.putInt(g.e, gVar.f6324b);
                    bundle3.putInt(g.f6322f, gVar.f6325c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f6326b, hVar.f6327a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f6291t, arrayList);
                }
            }
        }
        bundle.putSerializable(f6292u, this.f6298b);
        bundle.putSerializable(v, this.f6299c);
        bundle.putFloat(f6295y, this.e);
        bundle.putInt(f6296z, this.f6300f);
        bundle.putInt(A, this.f6301g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f6302i);
        bundle.putInt(D, this.f6307n);
        bundle.putFloat(E, this.f6308o);
        bundle.putFloat(F, this.f6303j);
        bundle.putFloat(G, this.f6304k);
        bundle.putBoolean(I, this.f6305l);
        bundle.putInt(H, this.f6306m);
        bundle.putInt(J, this.f6309p);
        bundle.putFloat(K, this.f6310q);
        bundle.putInt(L, this.f6311r);
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
            if (TextUtils.equals(this.f6297a, bVar.f6297a) && this.f6298b == bVar.f6298b && this.f6299c == bVar.f6299c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f6300f == bVar.f6300f && this.f6301g == bVar.f6301g && this.h == bVar.h && this.f6302i == bVar.f6302i && this.f6303j == bVar.f6303j && this.f6304k == bVar.f6304k && this.f6305l == bVar.f6305l && this.f6306m == bVar.f6306m && this.f6307n == bVar.f6307n && this.f6308o == bVar.f6308o && this.f6309p == bVar.f6309p && this.f6310q == bVar.f6310q && this.f6311r == bVar.f6311r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6297a, this.f6298b, this.f6299c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f6300f), Integer.valueOf(this.f6301g), Float.valueOf(this.h), Integer.valueOf(this.f6302i), Float.valueOf(this.f6303j), Float.valueOf(this.f6304k), Boolean.valueOf(this.f6305l), Integer.valueOf(this.f6306m), Integer.valueOf(this.f6307n), Float.valueOf(this.f6308o), Integer.valueOf(this.f6309p), Float.valueOf(this.f6310q), Integer.valueOf(this.f6311r));
    }
}
