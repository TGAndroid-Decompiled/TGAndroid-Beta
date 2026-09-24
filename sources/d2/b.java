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
    public static final String f7410s;
    public static final String f7411t;
    public static final String f7412u;
    public static final String v;
    public static final String f7413w;
    public static final String f7414x;
    public static final String f7415y;
    public static final String f7416z;
    public final CharSequence f7417a;
    public final Layout.Alignment f7418b;
    public final Layout.Alignment f7419c;
    public final Bitmap d;
    public final float e;
    public final int f7420f;
    public final int f7421g;
    public final float h;
    public final int f7422i;
    public final float f7423j;
    public final float f7424k;
    public final boolean f7425l;
    public final int f7426m;
    public final int f7427n;
    public final float f7428o;
    public final int f7429p;
    public final float f7430q;
    public final int f7431r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7870a;
        f7410s = Integer.toString(0, 36);
        f7411t = Integer.toString(17, 36);
        f7412u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7413w = Integer.toString(3, 36);
        f7414x = Integer.toString(18, 36);
        f7415y = Integer.toString(4, 36);
        f7416z = Integer.toString(5, 36);
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
            this.f7417a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7417a = charSequence.toString();
        } else {
            this.f7417a = null;
        }
        this.f7418b = alignment;
        this.f7419c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7420f = i10;
        this.f7421g = i11;
        this.h = f10;
        this.f7422i = i12;
        this.f7423j = f12;
        this.f7424k = f13;
        this.f7425l = z10;
        this.f7426m = i14;
        this.f7427n = i13;
        this.f7428o = f11;
        this.f7429p = i15;
        this.f7430q = f14;
        this.f7431r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7417a;
        if (charSequence != null) {
            bundle.putCharSequence(f7410s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7437a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7440c, gVar.f7441a);
                    bundle2.putInt(g.d, gVar.f7442b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7444a);
                    bundle3.putInt(h.e, hVar.f7445b);
                    bundle3.putInt(h.f7443f, hVar.f7446c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7447b, iVar.f7448a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7411t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7412u, this.f7418b);
        bundle.putSerializable(v, this.f7419c);
        bundle.putFloat(f7415y, this.e);
        bundle.putInt(f7416z, this.f7420f);
        bundle.putInt(A, this.f7421g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7422i);
        bundle.putInt(D, this.f7427n);
        bundle.putFloat(E, this.f7428o);
        bundle.putFloat(F, this.f7423j);
        bundle.putFloat(G, this.f7424k);
        bundle.putBoolean(I, this.f7425l);
        bundle.putInt(H, this.f7426m);
        bundle.putInt(J, this.f7429p);
        bundle.putFloat(K, this.f7430q);
        bundle.putInt(L, this.f7431r);
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
            if (TextUtils.equals(this.f7417a, bVar.f7417a) && this.f7418b == bVar.f7418b && this.f7419c == bVar.f7419c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7420f == bVar.f7420f && this.f7421g == bVar.f7421g && this.h == bVar.h && this.f7422i == bVar.f7422i && this.f7423j == bVar.f7423j && this.f7424k == bVar.f7424k && this.f7425l == bVar.f7425l && this.f7426m == bVar.f7426m && this.f7427n == bVar.f7427n && this.f7428o == bVar.f7428o && this.f7429p == bVar.f7429p && this.f7430q == bVar.f7430q && this.f7431r == bVar.f7431r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7417a, this.f7418b, this.f7419c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7420f), Integer.valueOf(this.f7421g), Float.valueOf(this.h), Integer.valueOf(this.f7422i), Float.valueOf(this.f7423j), Float.valueOf(this.f7424k), Boolean.valueOf(this.f7425l), Integer.valueOf(this.f7426m), Integer.valueOf(this.f7427n), Float.valueOf(this.f7428o), Integer.valueOf(this.f7429p), Float.valueOf(this.f7430q), Integer.valueOf(this.f7431r));
    }
}
