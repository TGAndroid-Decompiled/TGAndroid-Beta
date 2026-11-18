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
    public static final String f13095s;
    public static final String f13096t;
    public static final String f13097u;
    public static final String v;
    public static final String f13098w;
    public static final String f13099x;
    public static final String f13100y;
    public static final String f13101z;
    public final CharSequence f13102a;
    public final Layout.Alignment f13103b;
    public final Layout.Alignment f13104c;
    public final Bitmap d;
    public final float f13105e;
    public final int f13106f;
    public final int f13107g;
    public final float h;
    public final int f13108i;
    public final float f13109j;
    public final float f13110k;
    public final boolean f13111l;
    public final int f13112m;
    public final int f13113n;
    public final float f13114o;
    public final int f13115p;
    public final float f13116q;
    public final int f13117r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13783a;
        f13095s = Integer.toString(0, 36);
        f13096t = Integer.toString(17, 36);
        f13097u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13098w = Integer.toString(3, 36);
        f13099x = Integer.toString(18, 36);
        f13100y = Integer.toString(4, 36);
        f13101z = Integer.toString(5, 36);
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
            this.f13102a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13102a = charSequence.toString();
        } else {
            this.f13102a = null;
        }
        this.f13103b = alignment;
        this.f13104c = alignment2;
        this.d = bitmap;
        this.f13105e = f10;
        this.f13106f = i7;
        this.f13107g = i10;
        this.h = f11;
        this.f13108i = i11;
        this.f13109j = f13;
        this.f13110k = f14;
        this.f13111l = z10;
        this.f13112m = i13;
        this.f13113n = i12;
        this.f13114o = f12;
        this.f13115p = i14;
        this.f13116q = f15;
        this.f13117r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13102a;
        if (charSequence != null) {
            bundle.putCharSequence(f13095s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13123a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13127c, fVar.f13128a);
                    bundle2.putInt(f.d, fVar.f13129b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13132a);
                    bundle3.putInt(g.f13130e, gVar.f13133b);
                    bundle3.putInt(g.f13131f, gVar.f13134c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13135b, hVar.f13136a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13096t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13097u, this.f13103b);
        bundle.putSerializable(v, this.f13104c);
        bundle.putFloat(f13100y, this.f13105e);
        bundle.putInt(f13101z, this.f13106f);
        bundle.putInt(A, this.f13107g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13108i);
        bundle.putInt(D, this.f13113n);
        bundle.putFloat(E, this.f13114o);
        bundle.putFloat(F, this.f13109j);
        bundle.putFloat(G, this.f13110k);
        bundle.putBoolean(I, this.f13111l);
        bundle.putInt(H, this.f13112m);
        bundle.putInt(J, this.f13115p);
        bundle.putFloat(K, this.f13116q);
        bundle.putInt(L, this.f13117r);
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
            if (TextUtils.equals(this.f13102a, bVar.f13102a) && this.f13103b == bVar.f13103b && this.f13104c == bVar.f13104c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13105e == bVar.f13105e && this.f13106f == bVar.f13106f && this.f13107g == bVar.f13107g && this.h == bVar.h && this.f13108i == bVar.f13108i && this.f13109j == bVar.f13109j && this.f13110k == bVar.f13110k && this.f13111l == bVar.f13111l && this.f13112m == bVar.f13112m && this.f13113n == bVar.f13113n && this.f13114o == bVar.f13114o && this.f13115p == bVar.f13115p && this.f13116q == bVar.f13116q && this.f13117r == bVar.f13117r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13102a, this.f13103b, this.f13104c, this.d, Float.valueOf(this.f13105e), Integer.valueOf(this.f13106f), Integer.valueOf(this.f13107g), Float.valueOf(this.h), Integer.valueOf(this.f13108i), Float.valueOf(this.f13109j), Float.valueOf(this.f13110k), Boolean.valueOf(this.f13111l), Integer.valueOf(this.f13112m), Integer.valueOf(this.f13113n), Float.valueOf(this.f13114o), Integer.valueOf(this.f13115p), Float.valueOf(this.f13116q), Integer.valueOf(this.f13117r));
    }
}
