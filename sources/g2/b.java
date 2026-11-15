package g2;

import a8.ja;
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
    public static final String f12781s;
    public static final String f12782t;
    public static final String f12783u;
    public static final String v;
    public static final String f12784w;
    public static final String f12785x;
    public static final String f12786y;
    public static final String f12787z;
    public final CharSequence f12788a;
    public final Layout.Alignment f12789b;
    public final Layout.Alignment f12790c;
    public final Bitmap d;
    public final float f12791e;
    public final int f12792f;
    public final int f12793g;
    public final float h;
    public final int f12794i;
    public final float f12795j;
    public final float f12796k;
    public final boolean f12797l;
    public final int f12798m;
    public final int f12799n;
    public final float f12800o;
    public final int f12801p;
    public final float f12802q;
    public final int f12803r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13471a;
        f12781s = Integer.toString(0, 36);
        f12782t = Integer.toString(17, 36);
        f12783u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f12784w = Integer.toString(3, 36);
        f12785x = Integer.toString(18, 36);
        f12786y = Integer.toString(4, 36);
        f12787z = Integer.toString(5, 36);
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
            ja.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f12788a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f12788a = charSequence.toString();
        } else {
            this.f12788a = null;
        }
        this.f12789b = alignment;
        this.f12790c = alignment2;
        this.d = bitmap;
        this.f12791e = f10;
        this.f12792f = i7;
        this.f12793g = i10;
        this.h = f11;
        this.f12794i = i11;
        this.f12795j = f13;
        this.f12796k = f14;
        this.f12797l = z10;
        this.f12798m = i13;
        this.f12799n = i12;
        this.f12800o = f12;
        this.f12801p = i14;
        this.f12802q = f15;
        this.f12803r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f12788a;
        if (charSequence != null) {
            bundle.putCharSequence(f12781s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f12809a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f12813c, fVar.f12814a);
                    bundle2.putInt(f.d, fVar.f12815b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f12818a);
                    bundle3.putInt(g.f12816e, gVar.f12819b);
                    bundle3.putInt(g.f12817f, gVar.f12820c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f12821b, hVar.f12822a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f12782t, arrayList);
                }
            }
        }
        bundle.putSerializable(f12783u, this.f12789b);
        bundle.putSerializable(v, this.f12790c);
        bundle.putFloat(f12786y, this.f12791e);
        bundle.putInt(f12787z, this.f12792f);
        bundle.putInt(A, this.f12793g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f12794i);
        bundle.putInt(D, this.f12799n);
        bundle.putFloat(E, this.f12800o);
        bundle.putFloat(F, this.f12795j);
        bundle.putFloat(G, this.f12796k);
        bundle.putBoolean(I, this.f12797l);
        bundle.putInt(H, this.f12798m);
        bundle.putInt(J, this.f12801p);
        bundle.putFloat(K, this.f12802q);
        bundle.putInt(L, this.f12803r);
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
            if (TextUtils.equals(this.f12788a, bVar.f12788a) && this.f12789b == bVar.f12789b && this.f12790c == bVar.f12790c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f12791e == bVar.f12791e && this.f12792f == bVar.f12792f && this.f12793g == bVar.f12793g && this.h == bVar.h && this.f12794i == bVar.f12794i && this.f12795j == bVar.f12795j && this.f12796k == bVar.f12796k && this.f12797l == bVar.f12797l && this.f12798m == bVar.f12798m && this.f12799n == bVar.f12799n && this.f12800o == bVar.f12800o && this.f12801p == bVar.f12801p && this.f12802q == bVar.f12802q && this.f12803r == bVar.f12803r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f12788a, this.f12789b, this.f12790c, this.d, Float.valueOf(this.f12791e), Integer.valueOf(this.f12792f), Integer.valueOf(this.f12793g), Float.valueOf(this.h), Integer.valueOf(this.f12794i), Float.valueOf(this.f12795j), Float.valueOf(this.f12796k), Boolean.valueOf(this.f12797l), Integer.valueOf(this.f12798m), Integer.valueOf(this.f12799n), Float.valueOf(this.f12800o), Integer.valueOf(this.f12801p), Float.valueOf(this.f12802q), Integer.valueOf(this.f12803r));
    }
}
