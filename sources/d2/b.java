package d2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.d0;
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
    public static final String f7412s;
    public static final String f7413t;
    public static final String f7414u;
    public static final String v;
    public static final String f7415w;
    public static final String f7416x;
    public static final String f7417y;
    public static final String f7418z;
    public final CharSequence f7419a;
    public final Layout.Alignment f7420b;
    public final Layout.Alignment f7421c;
    public final Bitmap d;
    public final float e;
    public final int f7422f;
    public final int f7423g;
    public final float h;
    public final int f7424i;
    public final float f7425j;
    public final float f7426k;
    public final boolean f7427l;
    public final int f7428m;
    public final int f7429n;
    public final float f7430o;
    public final int f7431p;
    public final float f7432q;
    public final int f7433r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7872a;
        f7412s = Integer.toString(0, 36);
        f7413t = Integer.toString(17, 36);
        f7414u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7415w = Integer.toString(3, 36);
        f7416x = Integer.toString(18, 36);
        f7417y = Integer.toString(4, 36);
        f7418z = Integer.toString(5, 36);
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
            e2.d.b(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f7419a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7419a = charSequence.toString();
        } else {
            this.f7419a = null;
        }
        this.f7420b = alignment;
        this.f7421c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7422f = i10;
        this.f7423g = i11;
        this.h = f10;
        this.f7424i = i12;
        this.f7425j = f12;
        this.f7426k = f13;
        this.f7427l = z10;
        this.f7428m = i14;
        this.f7429n = i13;
        this.f7430o = f11;
        this.f7431p = i15;
        this.f7432q = f14;
        this.f7433r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7419a;
        if (charSequence != null) {
            bundle.putCharSequence(f7412s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7439a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7442c, gVar.f7443a);
                    bundle2.putInt(g.d, gVar.f7444b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7446a);
                    bundle3.putInt(h.e, hVar.f7447b);
                    bundle3.putInt(h.f7445f, hVar.f7448c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7449b, iVar.f7450a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7413t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7414u, this.f7420b);
        bundle.putSerializable(v, this.f7421c);
        bundle.putFloat(f7417y, this.e);
        bundle.putInt(f7418z, this.f7422f);
        bundle.putInt(A, this.f7423g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7424i);
        bundle.putInt(D, this.f7429n);
        bundle.putFloat(E, this.f7430o);
        bundle.putFloat(F, this.f7425j);
        bundle.putFloat(G, this.f7426k);
        bundle.putBoolean(I, this.f7427l);
        bundle.putInt(H, this.f7428m);
        bundle.putInt(J, this.f7431p);
        bundle.putFloat(K, this.f7432q);
        bundle.putInt(L, this.f7433r);
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
            if (TextUtils.equals(this.f7419a, bVar.f7419a) && this.f7420b == bVar.f7420b && this.f7421c == bVar.f7421c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7422f == bVar.f7422f && this.f7423g == bVar.f7423g && this.h == bVar.h && this.f7424i == bVar.f7424i && this.f7425j == bVar.f7425j && this.f7426k == bVar.f7426k && this.f7427l == bVar.f7427l && this.f7428m == bVar.f7428m && this.f7429n == bVar.f7429n && this.f7430o == bVar.f7430o && this.f7431p == bVar.f7431p && this.f7432q == bVar.f7432q && this.f7433r == bVar.f7433r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7419a, this.f7420b, this.f7421c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7422f), Integer.valueOf(this.f7423g), Float.valueOf(this.h), Integer.valueOf(this.f7424i), Float.valueOf(this.f7425j), Float.valueOf(this.f7426k), Boolean.valueOf(this.f7427l), Integer.valueOf(this.f7428m), Integer.valueOf(this.f7429n), Float.valueOf(this.f7430o), Integer.valueOf(this.f7431p), Float.valueOf(this.f7432q), Integer.valueOf(this.f7433r));
    }
}
