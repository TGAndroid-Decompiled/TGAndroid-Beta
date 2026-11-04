package f2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import b8.zb;
import g2.n0;
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
    public static final String f11354s;
    public static final String f11355t;
    public static final String f11356u;
    public static final String v;
    public static final String f11357w;
    public static final String f11358x;
    public static final String f11359y;
    public static final String f11360z;
    public final CharSequence f11361a;
    public final Layout.Alignment f11362b;
    public final Layout.Alignment f11363c;
    public final Bitmap d;
    public final float f11364e;
    public final int f11365f;
    public final int f11366g;
    public final float h;
    public final int f11367i;
    public final float f11368j;
    public final float f11369k;
    public final boolean f11370l;
    public final int f11371m;
    public final int f11372n;
    public final float f11373o;
    public final int f11374p;
    public final float f11375q;
    public final int f11376r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = n0.f11873a;
        f11354s = Integer.toString(0, 36);
        f11355t = Integer.toString(17, 36);
        f11356u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f11357w = Integer.toString(3, 36);
        f11358x = Integer.toString(18, 36);
        f11359y = Integer.toString(4, 36);
        f11360z = Integer.toString(5, 36);
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

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i3, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15, int i15) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            zb.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f11361a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f11361a = charSequence.toString();
        } else {
            this.f11361a = null;
        }
        this.f11362b = alignment;
        this.f11363c = alignment2;
        this.d = bitmap;
        this.f11364e = f10;
        this.f11365f = i3;
        this.f11366g = i10;
        this.h = f11;
        this.f11367i = i11;
        this.f11368j = f13;
        this.f11369k = f14;
        this.f11370l = z10;
        this.f11371m = i13;
        this.f11372n = i12;
        this.f11373o = f12;
        this.f11374p = i14;
        this.f11375q = f15;
        this.f11376r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f11361a;
        if (charSequence != null) {
            bundle.putCharSequence(f11354s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f11382a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f11386c, fVar.f11387a);
                    bundle2.putInt(f.d, fVar.f11388b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f11391a);
                    bundle3.putInt(g.f11389e, gVar.f11392b);
                    bundle3.putInt(g.f11390f, gVar.f11393c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f11394b, hVar.f11395a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f11355t, arrayList);
                }
            }
        }
        bundle.putSerializable(f11356u, this.f11362b);
        bundle.putSerializable(v, this.f11363c);
        bundle.putFloat(f11359y, this.f11364e);
        bundle.putInt(f11360z, this.f11365f);
        bundle.putInt(A, this.f11366g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f11367i);
        bundle.putInt(D, this.f11372n);
        bundle.putFloat(E, this.f11373o);
        bundle.putFloat(F, this.f11368j);
        bundle.putFloat(G, this.f11369k);
        bundle.putBoolean(I, this.f11370l);
        bundle.putInt(H, this.f11371m);
        bundle.putInt(J, this.f11374p);
        bundle.putFloat(K, this.f11375q);
        bundle.putInt(L, this.f11376r);
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
            if (TextUtils.equals(this.f11361a, bVar.f11361a) && this.f11362b == bVar.f11362b && this.f11363c == bVar.f11363c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f11364e == bVar.f11364e && this.f11365f == bVar.f11365f && this.f11366g == bVar.f11366g && this.h == bVar.h && this.f11367i == bVar.f11367i && this.f11368j == bVar.f11368j && this.f11369k == bVar.f11369k && this.f11370l == bVar.f11370l && this.f11371m == bVar.f11371m && this.f11372n == bVar.f11372n && this.f11373o == bVar.f11373o && this.f11374p == bVar.f11374p && this.f11375q == bVar.f11375q && this.f11376r == bVar.f11376r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11361a, this.f11362b, this.f11363c, this.d, Float.valueOf(this.f11364e), Integer.valueOf(this.f11365f), Integer.valueOf(this.f11366g), Float.valueOf(this.h), Integer.valueOf(this.f11367i), Float.valueOf(this.f11368j), Float.valueOf(this.f11369k), Boolean.valueOf(this.f11370l), Integer.valueOf(this.f11371m), Integer.valueOf(this.f11372n), Float.valueOf(this.f11373o), Integer.valueOf(this.f11374p), Float.valueOf(this.f11375q), Integer.valueOf(this.f11376r));
    }
}
