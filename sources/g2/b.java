package g2;

import a8.ma;
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
    public static final String f13090s;
    public static final String f13091t;
    public static final String f13092u;
    public static final String v;
    public static final String f13093w;
    public static final String f13094x;
    public static final String f13095y;
    public static final String f13096z;
    public final CharSequence f13097a;
    public final Layout.Alignment f13098b;
    public final Layout.Alignment f13099c;
    public final Bitmap d;
    public final float f13100e;
    public final int f13101f;
    public final int f13102g;
    public final float h;
    public final int f13103i;
    public final float f13104j;
    public final float f13105k;
    public final boolean f13106l;
    public final int f13107m;
    public final int f13108n;
    public final float f13109o;
    public final int f13110p;
    public final float f13111q;
    public final int f13112r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13778a;
        f13090s = Integer.toString(0, 36);
        f13091t = Integer.toString(17, 36);
        f13092u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13093w = Integer.toString(3, 36);
        f13094x = Integer.toString(18, 36);
        f13095y = Integer.toString(4, 36);
        f13096z = Integer.toString(5, 36);
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
            ma.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f13097a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13097a = charSequence.toString();
        } else {
            this.f13097a = null;
        }
        this.f13098b = alignment;
        this.f13099c = alignment2;
        this.d = bitmap;
        this.f13100e = f10;
        this.f13101f = i7;
        this.f13102g = i10;
        this.h = f11;
        this.f13103i = i11;
        this.f13104j = f13;
        this.f13105k = f14;
        this.f13106l = z10;
        this.f13107m = i13;
        this.f13108n = i12;
        this.f13109o = f12;
        this.f13110p = i14;
        this.f13111q = f15;
        this.f13112r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13097a;
        if (charSequence != null) {
            bundle.putCharSequence(f13090s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13118a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13122c, fVar.f13123a);
                    bundle2.putInt(f.d, fVar.f13124b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13127a);
                    bundle3.putInt(g.f13125e, gVar.f13128b);
                    bundle3.putInt(g.f13126f, gVar.f13129c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13130b, hVar.f13131a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13091t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13092u, this.f13098b);
        bundle.putSerializable(v, this.f13099c);
        bundle.putFloat(f13095y, this.f13100e);
        bundle.putInt(f13096z, this.f13101f);
        bundle.putInt(A, this.f13102g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13103i);
        bundle.putInt(D, this.f13108n);
        bundle.putFloat(E, this.f13109o);
        bundle.putFloat(F, this.f13104j);
        bundle.putFloat(G, this.f13105k);
        bundle.putBoolean(I, this.f13106l);
        bundle.putInt(H, this.f13107m);
        bundle.putInt(J, this.f13110p);
        bundle.putFloat(K, this.f13111q);
        bundle.putInt(L, this.f13112r);
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
            if (TextUtils.equals(this.f13097a, bVar.f13097a) && this.f13098b == bVar.f13098b && this.f13099c == bVar.f13099c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13100e == bVar.f13100e && this.f13101f == bVar.f13101f && this.f13102g == bVar.f13102g && this.h == bVar.h && this.f13103i == bVar.f13103i && this.f13104j == bVar.f13104j && this.f13105k == bVar.f13105k && this.f13106l == bVar.f13106l && this.f13107m == bVar.f13107m && this.f13108n == bVar.f13108n && this.f13109o == bVar.f13109o && this.f13110p == bVar.f13110p && this.f13111q == bVar.f13111q && this.f13112r == bVar.f13112r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13097a, this.f13098b, this.f13099c, this.d, Float.valueOf(this.f13100e), Integer.valueOf(this.f13101f), Integer.valueOf(this.f13102g), Float.valueOf(this.h), Integer.valueOf(this.f13103i), Float.valueOf(this.f13104j), Float.valueOf(this.f13105k), Boolean.valueOf(this.f13106l), Integer.valueOf(this.f13107m), Integer.valueOf(this.f13108n), Float.valueOf(this.f13109o), Integer.valueOf(this.f13110p), Float.valueOf(this.f13111q), Integer.valueOf(this.f13112r));
    }
}
