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
    public static final String f7746s;
    public static final String f7747t;
    public static final String f7748u;
    public static final String v;
    public static final String f7749w;
    public static final String f7750x;
    public static final String f7751y;
    public static final String f7752z;
    public final CharSequence f7753a;
    public final Layout.Alignment f7754b;
    public final Layout.Alignment f7755c;
    public final Bitmap d;
    public final float e;
    public final int f7756f;
    public final int f7757g;
    public final float h;
    public final int f7758i;
    public final float f7759j;
    public final float f7760k;
    public final boolean f7761l;
    public final int f7762m;
    public final int f7763n;
    public final float f7764o;
    public final int f7765p;
    public final float f7766q;
    public final int f7767r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8252a;
        f7746s = Integer.toString(0, 36);
        f7747t = Integer.toString(17, 36);
        f7748u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7749w = Integer.toString(3, 36);
        f7750x = Integer.toString(18, 36);
        f7751y = Integer.toString(4, 36);
        f7752z = Integer.toString(5, 36);
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
            this.f7753a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7753a = charSequence.toString();
        } else {
            this.f7753a = null;
        }
        this.f7754b = alignment;
        this.f7755c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7756f = i10;
        this.f7757g = i11;
        this.h = f10;
        this.f7758i = i12;
        this.f7759j = f12;
        this.f7760k = f13;
        this.f7761l = z10;
        this.f7762m = i14;
        this.f7763n = i13;
        this.f7764o = f11;
        this.f7765p = i15;
        this.f7766q = f14;
        this.f7767r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7753a;
        if (charSequence != null) {
            bundle.putCharSequence(f7746s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f7772a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f7775c, fVar.f7776a);
                    bundle2.putInt(f.d, fVar.f7777b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f7779a);
                    bundle3.putInt(g.e, gVar.f7780b);
                    bundle3.putInt(g.f7778f, gVar.f7781c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f7782b, hVar.f7783a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7747t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7748u, this.f7754b);
        bundle.putSerializable(v, this.f7755c);
        bundle.putFloat(f7751y, this.e);
        bundle.putInt(f7752z, this.f7756f);
        bundle.putInt(A, this.f7757g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7758i);
        bundle.putInt(D, this.f7763n);
        bundle.putFloat(E, this.f7764o);
        bundle.putFloat(F, this.f7759j);
        bundle.putFloat(G, this.f7760k);
        bundle.putBoolean(I, this.f7761l);
        bundle.putInt(H, this.f7762m);
        bundle.putInt(J, this.f7765p);
        bundle.putFloat(K, this.f7766q);
        bundle.putInt(L, this.f7767r);
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
            if (TextUtils.equals(this.f7753a, bVar.f7753a) && this.f7754b == bVar.f7754b && this.f7755c == bVar.f7755c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7756f == bVar.f7756f && this.f7757g == bVar.f7757g && this.h == bVar.h && this.f7758i == bVar.f7758i && this.f7759j == bVar.f7759j && this.f7760k == bVar.f7760k && this.f7761l == bVar.f7761l && this.f7762m == bVar.f7762m && this.f7763n == bVar.f7763n && this.f7764o == bVar.f7764o && this.f7765p == bVar.f7765p && this.f7766q == bVar.f7766q && this.f7767r == bVar.f7767r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7753a, this.f7754b, this.f7755c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7756f), Integer.valueOf(this.f7757g), Float.valueOf(this.h), Integer.valueOf(this.f7758i), Float.valueOf(this.f7759j), Float.valueOf(this.f7760k), Boolean.valueOf(this.f7761l), Integer.valueOf(this.f7762m), Integer.valueOf(this.f7763n), Float.valueOf(this.f7764o), Integer.valueOf(this.f7765p), Float.valueOf(this.f7766q), Integer.valueOf(this.f7767r));
    }
}
