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
    public static final String f7425s;
    public static final String f7426t;
    public static final String f7427u;
    public static final String v;
    public static final String f7428w;
    public static final String f7429x;
    public static final String f7430y;
    public static final String f7431z;
    public final CharSequence f7432a;
    public final Layout.Alignment f7433b;
    public final Layout.Alignment f7434c;
    public final Bitmap d;
    public final float e;
    public final int f7435f;
    public final int f7436g;
    public final float h;
    public final int f7437i;
    public final float f7438j;
    public final float f7439k;
    public final boolean f7440l;
    public final int f7441m;
    public final int f7442n;
    public final float f7443o;
    public final int f7444p;
    public final float f7445q;
    public final int f7446r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7885a;
        f7425s = Integer.toString(0, 36);
        f7426t = Integer.toString(17, 36);
        f7427u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7428w = Integer.toString(3, 36);
        f7429x = Integer.toString(18, 36);
        f7430y = Integer.toString(4, 36);
        f7431z = Integer.toString(5, 36);
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
            this.f7432a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7432a = charSequence.toString();
        } else {
            this.f7432a = null;
        }
        this.f7433b = alignment;
        this.f7434c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7435f = i10;
        this.f7436g = i11;
        this.h = f10;
        this.f7437i = i12;
        this.f7438j = f12;
        this.f7439k = f13;
        this.f7440l = z10;
        this.f7441m = i14;
        this.f7442n = i13;
        this.f7443o = f11;
        this.f7444p = i15;
        this.f7445q = f14;
        this.f7446r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7432a;
        if (charSequence != null) {
            bundle.putCharSequence(f7425s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7452a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7455c, gVar.f7456a);
                    bundle2.putInt(g.d, gVar.f7457b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7459a);
                    bundle3.putInt(h.e, hVar.f7460b);
                    bundle3.putInt(h.f7458f, hVar.f7461c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7462b, iVar.f7463a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7426t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7427u, this.f7433b);
        bundle.putSerializable(v, this.f7434c);
        bundle.putFloat(f7430y, this.e);
        bundle.putInt(f7431z, this.f7435f);
        bundle.putInt(A, this.f7436g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7437i);
        bundle.putInt(D, this.f7442n);
        bundle.putFloat(E, this.f7443o);
        bundle.putFloat(F, this.f7438j);
        bundle.putFloat(G, this.f7439k);
        bundle.putBoolean(I, this.f7440l);
        bundle.putInt(H, this.f7441m);
        bundle.putInt(J, this.f7444p);
        bundle.putFloat(K, this.f7445q);
        bundle.putInt(L, this.f7446r);
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
            if (TextUtils.equals(this.f7432a, bVar.f7432a) && this.f7433b == bVar.f7433b && this.f7434c == bVar.f7434c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7435f == bVar.f7435f && this.f7436g == bVar.f7436g && this.h == bVar.h && this.f7437i == bVar.f7437i && this.f7438j == bVar.f7438j && this.f7439k == bVar.f7439k && this.f7440l == bVar.f7440l && this.f7441m == bVar.f7441m && this.f7442n == bVar.f7442n && this.f7443o == bVar.f7443o && this.f7444p == bVar.f7444p && this.f7445q == bVar.f7445q && this.f7446r == bVar.f7446r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7432a, this.f7433b, this.f7434c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7435f), Integer.valueOf(this.f7436g), Float.valueOf(this.h), Integer.valueOf(this.f7437i), Float.valueOf(this.f7438j), Float.valueOf(this.f7439k), Boolean.valueOf(this.f7440l), Integer.valueOf(this.f7441m), Integer.valueOf(this.f7442n), Float.valueOf(this.f7443o), Integer.valueOf(this.f7444p), Float.valueOf(this.f7445q), Integer.valueOf(this.f7446r));
    }
}
