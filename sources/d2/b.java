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
    public static final String f6293s;
    public static final String f6294t;
    public static final String f6295u;
    public static final String v;
    public static final String f6296w;
    public static final String f6297x;
    public static final String f6298y;
    public static final String f6299z;
    public final CharSequence f6300a;
    public final Layout.Alignment f6301b;
    public final Layout.Alignment f6302c;
    public final Bitmap d;
    public final float e;
    public final int f6303f;
    public final int f6304g;
    public final float h;
    public final int f6305i;
    public final float f6306j;
    public final float f6307k;
    public final boolean f6308l;
    public final int f6309m;
    public final int f6310n;
    public final float f6311o;
    public final int f6312p;
    public final float f6313q;
    public final int f6314r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8375a;
        f6293s = Integer.toString(0, 36);
        f6294t = Integer.toString(17, 36);
        f6295u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f6296w = Integer.toString(3, 36);
        f6297x = Integer.toString(18, 36);
        f6298y = Integer.toString(4, 36);
        f6299z = Integer.toString(5, 36);
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
            this.f6300a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6300a = charSequence.toString();
        } else {
            this.f6300a = null;
        }
        this.f6301b = alignment;
        this.f6302c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f6303f = i10;
        this.f6304g = i11;
        this.h = f10;
        this.f6305i = i12;
        this.f6306j = f12;
        this.f6307k = f13;
        this.f6308l = z10;
        this.f6309m = i14;
        this.f6310n = i13;
        this.f6311o = f11;
        this.f6312p = i15;
        this.f6313q = f14;
        this.f6314r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f6300a;
        if (charSequence != null) {
            bundle.putCharSequence(f6293s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f6319a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f6322c, fVar.f6323a);
                    bundle2.putInt(f.d, fVar.f6324b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f6326a);
                    bundle3.putInt(g.e, gVar.f6327b);
                    bundle3.putInt(g.f6325f, gVar.f6328c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f6329b, hVar.f6330a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f6294t, arrayList);
                }
            }
        }
        bundle.putSerializable(f6295u, this.f6301b);
        bundle.putSerializable(v, this.f6302c);
        bundle.putFloat(f6298y, this.e);
        bundle.putInt(f6299z, this.f6303f);
        bundle.putInt(A, this.f6304g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f6305i);
        bundle.putInt(D, this.f6310n);
        bundle.putFloat(E, this.f6311o);
        bundle.putFloat(F, this.f6306j);
        bundle.putFloat(G, this.f6307k);
        bundle.putBoolean(I, this.f6308l);
        bundle.putInt(H, this.f6309m);
        bundle.putInt(J, this.f6312p);
        bundle.putFloat(K, this.f6313q);
        bundle.putInt(L, this.f6314r);
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
            if (TextUtils.equals(this.f6300a, bVar.f6300a) && this.f6301b == bVar.f6301b && this.f6302c == bVar.f6302c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f6303f == bVar.f6303f && this.f6304g == bVar.f6304g && this.h == bVar.h && this.f6305i == bVar.f6305i && this.f6306j == bVar.f6306j && this.f6307k == bVar.f6307k && this.f6308l == bVar.f6308l && this.f6309m == bVar.f6309m && this.f6310n == bVar.f6310n && this.f6311o == bVar.f6311o && this.f6312p == bVar.f6312p && this.f6313q == bVar.f6313q && this.f6314r == bVar.f6314r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6300a, this.f6301b, this.f6302c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f6303f), Integer.valueOf(this.f6304g), Float.valueOf(this.h), Integer.valueOf(this.f6305i), Float.valueOf(this.f6306j), Float.valueOf(this.f6307k), Boolean.valueOf(this.f6308l), Integer.valueOf(this.f6309m), Integer.valueOf(this.f6310n), Float.valueOf(this.f6311o), Integer.valueOf(this.f6312p), Float.valueOf(this.f6313q), Integer.valueOf(this.f6314r));
    }
}
