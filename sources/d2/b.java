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
    public static final String f7411s;
    public static final String f7412t;
    public static final String f7413u;
    public static final String v;
    public static final String f7414w;
    public static final String f7415x;
    public static final String f7416y;
    public static final String f7417z;
    public final CharSequence f7418a;
    public final Layout.Alignment f7419b;
    public final Layout.Alignment f7420c;
    public final Bitmap d;
    public final float e;
    public final int f7421f;
    public final int f7422g;
    public final float h;
    public final int f7423i;
    public final float f7424j;
    public final float f7425k;
    public final boolean f7426l;
    public final int f7427m;
    public final int f7428n;
    public final float f7429o;
    public final int f7430p;
    public final float f7431q;
    public final int f7432r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7871a;
        f7411s = Integer.toString(0, 36);
        f7412t = Integer.toString(17, 36);
        f7413u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7414w = Integer.toString(3, 36);
        f7415x = Integer.toString(18, 36);
        f7416y = Integer.toString(4, 36);
        f7417z = Integer.toString(5, 36);
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
            this.f7418a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7418a = charSequence.toString();
        } else {
            this.f7418a = null;
        }
        this.f7419b = alignment;
        this.f7420c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7421f = i10;
        this.f7422g = i11;
        this.h = f10;
        this.f7423i = i12;
        this.f7424j = f12;
        this.f7425k = f13;
        this.f7426l = z10;
        this.f7427m = i14;
        this.f7428n = i13;
        this.f7429o = f11;
        this.f7430p = i15;
        this.f7431q = f14;
        this.f7432r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7418a;
        if (charSequence != null) {
            bundle.putCharSequence(f7411s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7438a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7441c, gVar.f7442a);
                    bundle2.putInt(g.d, gVar.f7443b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7445a);
                    bundle3.putInt(h.e, hVar.f7446b);
                    bundle3.putInt(h.f7444f, hVar.f7447c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7448b, iVar.f7449a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7412t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7413u, this.f7419b);
        bundle.putSerializable(v, this.f7420c);
        bundle.putFloat(f7416y, this.e);
        bundle.putInt(f7417z, this.f7421f);
        bundle.putInt(A, this.f7422g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7423i);
        bundle.putInt(D, this.f7428n);
        bundle.putFloat(E, this.f7429o);
        bundle.putFloat(F, this.f7424j);
        bundle.putFloat(G, this.f7425k);
        bundle.putBoolean(I, this.f7426l);
        bundle.putInt(H, this.f7427m);
        bundle.putInt(J, this.f7430p);
        bundle.putFloat(K, this.f7431q);
        bundle.putInt(L, this.f7432r);
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
            if (TextUtils.equals(this.f7418a, bVar.f7418a) && this.f7419b == bVar.f7419b && this.f7420c == bVar.f7420c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7421f == bVar.f7421f && this.f7422g == bVar.f7422g && this.h == bVar.h && this.f7423i == bVar.f7423i && this.f7424j == bVar.f7424j && this.f7425k == bVar.f7425k && this.f7426l == bVar.f7426l && this.f7427m == bVar.f7427m && this.f7428n == bVar.f7428n && this.f7429o == bVar.f7429o && this.f7430p == bVar.f7430p && this.f7431q == bVar.f7431q && this.f7432r == bVar.f7432r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7418a, this.f7419b, this.f7420c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7421f), Integer.valueOf(this.f7422g), Float.valueOf(this.h), Integer.valueOf(this.f7423i), Float.valueOf(this.f7424j), Float.valueOf(this.f7425k), Boolean.valueOf(this.f7426l), Integer.valueOf(this.f7427m), Integer.valueOf(this.f7428n), Float.valueOf(this.f7429o), Integer.valueOf(this.f7430p), Float.valueOf(this.f7431q), Integer.valueOf(this.f7432r));
    }
}
