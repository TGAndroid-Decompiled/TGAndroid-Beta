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
    public static final String f7423s;
    public static final String f7424t;
    public static final String f7425u;
    public static final String v;
    public static final String f7426w;
    public static final String f7427x;
    public static final String f7428y;
    public static final String f7429z;
    public final CharSequence f7430a;
    public final Layout.Alignment f7431b;
    public final Layout.Alignment f7432c;
    public final Bitmap d;
    public final float e;
    public final int f7433f;
    public final int f7434g;
    public final float h;
    public final int f7435i;
    public final float f7436j;
    public final float f7437k;
    public final boolean f7438l;
    public final int f7439m;
    public final int f7440n;
    public final float f7441o;
    public final int f7442p;
    public final float f7443q;
    public final int f7444r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7883a;
        f7423s = Integer.toString(0, 36);
        f7424t = Integer.toString(17, 36);
        f7425u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7426w = Integer.toString(3, 36);
        f7427x = Integer.toString(18, 36);
        f7428y = Integer.toString(4, 36);
        f7429z = Integer.toString(5, 36);
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
            this.f7430a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7430a = charSequence.toString();
        } else {
            this.f7430a = null;
        }
        this.f7431b = alignment;
        this.f7432c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7433f = i10;
        this.f7434g = i11;
        this.h = f10;
        this.f7435i = i12;
        this.f7436j = f12;
        this.f7437k = f13;
        this.f7438l = z10;
        this.f7439m = i14;
        this.f7440n = i13;
        this.f7441o = f11;
        this.f7442p = i15;
        this.f7443q = f14;
        this.f7444r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7430a;
        if (charSequence != null) {
            bundle.putCharSequence(f7423s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7450a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7453c, gVar.f7454a);
                    bundle2.putInt(g.d, gVar.f7455b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7457a);
                    bundle3.putInt(h.e, hVar.f7458b);
                    bundle3.putInt(h.f7456f, hVar.f7459c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7460b, iVar.f7461a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7424t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7425u, this.f7431b);
        bundle.putSerializable(v, this.f7432c);
        bundle.putFloat(f7428y, this.e);
        bundle.putInt(f7429z, this.f7433f);
        bundle.putInt(A, this.f7434g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7435i);
        bundle.putInt(D, this.f7440n);
        bundle.putFloat(E, this.f7441o);
        bundle.putFloat(F, this.f7436j);
        bundle.putFloat(G, this.f7437k);
        bundle.putBoolean(I, this.f7438l);
        bundle.putInt(H, this.f7439m);
        bundle.putInt(J, this.f7442p);
        bundle.putFloat(K, this.f7443q);
        bundle.putInt(L, this.f7444r);
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
            if (TextUtils.equals(this.f7430a, bVar.f7430a) && this.f7431b == bVar.f7431b && this.f7432c == bVar.f7432c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7433f == bVar.f7433f && this.f7434g == bVar.f7434g && this.h == bVar.h && this.f7435i == bVar.f7435i && this.f7436j == bVar.f7436j && this.f7437k == bVar.f7437k && this.f7438l == bVar.f7438l && this.f7439m == bVar.f7439m && this.f7440n == bVar.f7440n && this.f7441o == bVar.f7441o && this.f7442p == bVar.f7442p && this.f7443q == bVar.f7443q && this.f7444r == bVar.f7444r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7430a, this.f7431b, this.f7432c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7433f), Integer.valueOf(this.f7434g), Float.valueOf(this.h), Integer.valueOf(this.f7435i), Float.valueOf(this.f7436j), Float.valueOf(this.f7437k), Boolean.valueOf(this.f7438l), Integer.valueOf(this.f7439m), Integer.valueOf(this.f7440n), Float.valueOf(this.f7441o), Integer.valueOf(this.f7442p), Float.valueOf(this.f7443q), Integer.valueOf(this.f7444r));
    }
}
