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
    public static final String f7427s;
    public static final String f7428t;
    public static final String f7429u;
    public static final String v;
    public static final String f7430w;
    public static final String f7431x;
    public static final String f7432y;
    public static final String f7433z;
    public final CharSequence f7434a;
    public final Layout.Alignment f7435b;
    public final Layout.Alignment f7436c;
    public final Bitmap d;
    public final float e;
    public final int f7437f;
    public final int f7438g;
    public final float h;
    public final int f7439i;
    public final float f7440j;
    public final float f7441k;
    public final boolean f7442l;
    public final int f7443m;
    public final int f7444n;
    public final float f7445o;
    public final int f7446p;
    public final float f7447q;
    public final int f7448r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7887a;
        f7427s = Integer.toString(0, 36);
        f7428t = Integer.toString(17, 36);
        f7429u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7430w = Integer.toString(3, 36);
        f7431x = Integer.toString(18, 36);
        f7432y = Integer.toString(4, 36);
        f7433z = Integer.toString(5, 36);
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
            this.f7434a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7434a = charSequence.toString();
        } else {
            this.f7434a = null;
        }
        this.f7435b = alignment;
        this.f7436c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7437f = i10;
        this.f7438g = i11;
        this.h = f10;
        this.f7439i = i12;
        this.f7440j = f12;
        this.f7441k = f13;
        this.f7442l = z10;
        this.f7443m = i14;
        this.f7444n = i13;
        this.f7445o = f11;
        this.f7446p = i15;
        this.f7447q = f14;
        this.f7448r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7434a;
        if (charSequence != null) {
            bundle.putCharSequence(f7427s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7454a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7457c, gVar.f7458a);
                    bundle2.putInt(g.d, gVar.f7459b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7461a);
                    bundle3.putInt(h.e, hVar.f7462b);
                    bundle3.putInt(h.f7460f, hVar.f7463c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7464b, iVar.f7465a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7428t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7429u, this.f7435b);
        bundle.putSerializable(v, this.f7436c);
        bundle.putFloat(f7432y, this.e);
        bundle.putInt(f7433z, this.f7437f);
        bundle.putInt(A, this.f7438g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7439i);
        bundle.putInt(D, this.f7444n);
        bundle.putFloat(E, this.f7445o);
        bundle.putFloat(F, this.f7440j);
        bundle.putFloat(G, this.f7441k);
        bundle.putBoolean(I, this.f7442l);
        bundle.putInt(H, this.f7443m);
        bundle.putInt(J, this.f7446p);
        bundle.putFloat(K, this.f7447q);
        bundle.putInt(L, this.f7448r);
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
            if (TextUtils.equals(this.f7434a, bVar.f7434a) && this.f7435b == bVar.f7435b && this.f7436c == bVar.f7436c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7437f == bVar.f7437f && this.f7438g == bVar.f7438g && this.h == bVar.h && this.f7439i == bVar.f7439i && this.f7440j == bVar.f7440j && this.f7441k == bVar.f7441k && this.f7442l == bVar.f7442l && this.f7443m == bVar.f7443m && this.f7444n == bVar.f7444n && this.f7445o == bVar.f7445o && this.f7446p == bVar.f7446p && this.f7447q == bVar.f7447q && this.f7448r == bVar.f7448r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7434a, this.f7435b, this.f7436c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7437f), Integer.valueOf(this.f7438g), Float.valueOf(this.h), Integer.valueOf(this.f7439i), Float.valueOf(this.f7440j), Float.valueOf(this.f7441k), Boolean.valueOf(this.f7442l), Integer.valueOf(this.f7443m), Integer.valueOf(this.f7444n), Float.valueOf(this.f7445o), Integer.valueOf(this.f7446p), Float.valueOf(this.f7447q), Integer.valueOf(this.f7448r));
    }
}
