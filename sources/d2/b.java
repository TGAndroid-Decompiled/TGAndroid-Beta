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
    public static final String f7749s;
    public static final String f7750t;
    public static final String f7751u;
    public static final String v;
    public static final String f7752w;
    public static final String f7753x;
    public static final String f7754y;
    public static final String f7755z;
    public final CharSequence f7756a;
    public final Layout.Alignment f7757b;
    public final Layout.Alignment f7758c;
    public final Bitmap d;
    public final float e;
    public final int f7759f;
    public final int f7760g;
    public final float h;
    public final int f7761i;
    public final float f7762j;
    public final float f7763k;
    public final boolean f7764l;
    public final int f7765m;
    public final int f7766n;
    public final float f7767o;
    public final int f7768p;
    public final float f7769q;
    public final int f7770r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8255a;
        f7749s = Integer.toString(0, 36);
        f7750t = Integer.toString(17, 36);
        f7751u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7752w = Integer.toString(3, 36);
        f7753x = Integer.toString(18, 36);
        f7754y = Integer.toString(4, 36);
        f7755z = Integer.toString(5, 36);
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
            this.f7756a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7756a = charSequence.toString();
        } else {
            this.f7756a = null;
        }
        this.f7757b = alignment;
        this.f7758c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7759f = i10;
        this.f7760g = i11;
        this.h = f10;
        this.f7761i = i12;
        this.f7762j = f12;
        this.f7763k = f13;
        this.f7764l = z10;
        this.f7765m = i14;
        this.f7766n = i13;
        this.f7767o = f11;
        this.f7768p = i15;
        this.f7769q = f14;
        this.f7770r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7756a;
        if (charSequence != null) {
            bundle.putCharSequence(f7749s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f7775a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f7778c, fVar.f7779a);
                    bundle2.putInt(f.d, fVar.f7780b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f7782a);
                    bundle3.putInt(g.e, gVar.f7783b);
                    bundle3.putInt(g.f7781f, gVar.f7784c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f7785b, hVar.f7786a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7750t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7751u, this.f7757b);
        bundle.putSerializable(v, this.f7758c);
        bundle.putFloat(f7754y, this.e);
        bundle.putInt(f7755z, this.f7759f);
        bundle.putInt(A, this.f7760g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7761i);
        bundle.putInt(D, this.f7766n);
        bundle.putFloat(E, this.f7767o);
        bundle.putFloat(F, this.f7762j);
        bundle.putFloat(G, this.f7763k);
        bundle.putBoolean(I, this.f7764l);
        bundle.putInt(H, this.f7765m);
        bundle.putInt(J, this.f7768p);
        bundle.putFloat(K, this.f7769q);
        bundle.putInt(L, this.f7770r);
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
            if (TextUtils.equals(this.f7756a, bVar.f7756a) && this.f7757b == bVar.f7757b && this.f7758c == bVar.f7758c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7759f == bVar.f7759f && this.f7760g == bVar.f7760g && this.h == bVar.h && this.f7761i == bVar.f7761i && this.f7762j == bVar.f7762j && this.f7763k == bVar.f7763k && this.f7764l == bVar.f7764l && this.f7765m == bVar.f7765m && this.f7766n == bVar.f7766n && this.f7767o == bVar.f7767o && this.f7768p == bVar.f7768p && this.f7769q == bVar.f7769q && this.f7770r == bVar.f7770r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7756a, this.f7757b, this.f7758c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7759f), Integer.valueOf(this.f7760g), Float.valueOf(this.h), Integer.valueOf(this.f7761i), Float.valueOf(this.f7762j), Float.valueOf(this.f7763k), Boolean.valueOf(this.f7764l), Integer.valueOf(this.f7765m), Integer.valueOf(this.f7766n), Float.valueOf(this.f7767o), Integer.valueOf(this.f7768p), Float.valueOf(this.f7769q), Integer.valueOf(this.f7770r));
    }
}
