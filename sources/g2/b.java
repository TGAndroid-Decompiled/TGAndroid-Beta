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
    public static final String f13098s;
    public static final String f13099t;
    public static final String f13100u;
    public static final String v;
    public static final String f13101w;
    public static final String f13102x;
    public static final String f13103y;
    public static final String f13104z;
    public final CharSequence f13105a;
    public final Layout.Alignment f13106b;
    public final Layout.Alignment f13107c;
    public final Bitmap d;
    public final float f13108e;
    public final int f13109f;
    public final int f13110g;
    public final float h;
    public final int f13111i;
    public final float f13112j;
    public final float f13113k;
    public final boolean f13114l;
    public final int f13115m;
    public final int f13116n;
    public final float f13117o;
    public final int f13118p;
    public final float f13119q;
    public final int f13120r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13786a;
        f13098s = Integer.toString(0, 36);
        f13099t = Integer.toString(17, 36);
        f13100u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13101w = Integer.toString(3, 36);
        f13102x = Integer.toString(18, 36);
        f13103y = Integer.toString(4, 36);
        f13104z = Integer.toString(5, 36);
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
            this.f13105a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13105a = charSequence.toString();
        } else {
            this.f13105a = null;
        }
        this.f13106b = alignment;
        this.f13107c = alignment2;
        this.d = bitmap;
        this.f13108e = f10;
        this.f13109f = i7;
        this.f13110g = i10;
        this.h = f11;
        this.f13111i = i11;
        this.f13112j = f13;
        this.f13113k = f14;
        this.f13114l = z10;
        this.f13115m = i13;
        this.f13116n = i12;
        this.f13117o = f12;
        this.f13118p = i14;
        this.f13119q = f15;
        this.f13120r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13105a;
        if (charSequence != null) {
            bundle.putCharSequence(f13098s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13126a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13130c, fVar.f13131a);
                    bundle2.putInt(f.d, fVar.f13132b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13135a);
                    bundle3.putInt(g.f13133e, gVar.f13136b);
                    bundle3.putInt(g.f13134f, gVar.f13137c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13138b, hVar.f13139a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13099t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13100u, this.f13106b);
        bundle.putSerializable(v, this.f13107c);
        bundle.putFloat(f13103y, this.f13108e);
        bundle.putInt(f13104z, this.f13109f);
        bundle.putInt(A, this.f13110g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13111i);
        bundle.putInt(D, this.f13116n);
        bundle.putFloat(E, this.f13117o);
        bundle.putFloat(F, this.f13112j);
        bundle.putFloat(G, this.f13113k);
        bundle.putBoolean(I, this.f13114l);
        bundle.putInt(H, this.f13115m);
        bundle.putInt(J, this.f13118p);
        bundle.putFloat(K, this.f13119q);
        bundle.putInt(L, this.f13120r);
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
            if (TextUtils.equals(this.f13105a, bVar.f13105a) && this.f13106b == bVar.f13106b && this.f13107c == bVar.f13107c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13108e == bVar.f13108e && this.f13109f == bVar.f13109f && this.f13110g == bVar.f13110g && this.h == bVar.h && this.f13111i == bVar.f13111i && this.f13112j == bVar.f13112j && this.f13113k == bVar.f13113k && this.f13114l == bVar.f13114l && this.f13115m == bVar.f13115m && this.f13116n == bVar.f13116n && this.f13117o == bVar.f13117o && this.f13118p == bVar.f13118p && this.f13119q == bVar.f13119q && this.f13120r == bVar.f13120r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13105a, this.f13106b, this.f13107c, this.d, Float.valueOf(this.f13108e), Integer.valueOf(this.f13109f), Integer.valueOf(this.f13110g), Float.valueOf(this.h), Integer.valueOf(this.f13111i), Float.valueOf(this.f13112j), Float.valueOf(this.f13113k), Boolean.valueOf(this.f13114l), Integer.valueOf(this.f13115m), Integer.valueOf(this.f13116n), Float.valueOf(this.f13117o), Integer.valueOf(this.f13118p), Float.valueOf(this.f13119q), Integer.valueOf(this.f13120r));
    }
}
