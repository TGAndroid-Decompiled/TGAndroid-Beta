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
    public static final String f7426s;
    public static final String f7427t;
    public static final String f7428u;
    public static final String v;
    public static final String f7429w;
    public static final String f7430x;
    public static final String f7431y;
    public static final String f7432z;
    public final CharSequence f7433a;
    public final Layout.Alignment f7434b;
    public final Layout.Alignment f7435c;
    public final Bitmap d;
    public final float e;
    public final int f7436f;
    public final int f7437g;
    public final float h;
    public final int f7438i;
    public final float f7439j;
    public final float f7440k;
    public final boolean f7441l;
    public final int f7442m;
    public final int f7443n;
    public final float f7444o;
    public final int f7445p;
    public final float f7446q;
    public final int f7447r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7887a;
        f7426s = Integer.toString(0, 36);
        f7427t = Integer.toString(17, 36);
        f7428u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7429w = Integer.toString(3, 36);
        f7430x = Integer.toString(18, 36);
        f7431y = Integer.toString(4, 36);
        f7432z = Integer.toString(5, 36);
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
            this.f7433a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7433a = charSequence.toString();
        } else {
            this.f7433a = null;
        }
        this.f7434b = alignment;
        this.f7435c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7436f = i10;
        this.f7437g = i11;
        this.h = f10;
        this.f7438i = i12;
        this.f7439j = f12;
        this.f7440k = f13;
        this.f7441l = z10;
        this.f7442m = i14;
        this.f7443n = i13;
        this.f7444o = f11;
        this.f7445p = i15;
        this.f7446q = f14;
        this.f7447r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7433a;
        if (charSequence != null) {
            bundle.putCharSequence(f7426s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7453a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7456c, gVar.f7457a);
                    bundle2.putInt(g.d, gVar.f7458b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7460a);
                    bundle3.putInt(h.e, hVar.f7461b);
                    bundle3.putInt(h.f7459f, hVar.f7462c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7463b, iVar.f7464a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7427t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7428u, this.f7434b);
        bundle.putSerializable(v, this.f7435c);
        bundle.putFloat(f7431y, this.e);
        bundle.putInt(f7432z, this.f7436f);
        bundle.putInt(A, this.f7437g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7438i);
        bundle.putInt(D, this.f7443n);
        bundle.putFloat(E, this.f7444o);
        bundle.putFloat(F, this.f7439j);
        bundle.putFloat(G, this.f7440k);
        bundle.putBoolean(I, this.f7441l);
        bundle.putInt(H, this.f7442m);
        bundle.putInt(J, this.f7445p);
        bundle.putFloat(K, this.f7446q);
        bundle.putInt(L, this.f7447r);
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
            if (TextUtils.equals(this.f7433a, bVar.f7433a) && this.f7434b == bVar.f7434b && this.f7435c == bVar.f7435c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7436f == bVar.f7436f && this.f7437g == bVar.f7437g && this.h == bVar.h && this.f7438i == bVar.f7438i && this.f7439j == bVar.f7439j && this.f7440k == bVar.f7440k && this.f7441l == bVar.f7441l && this.f7442m == bVar.f7442m && this.f7443n == bVar.f7443n && this.f7444o == bVar.f7444o && this.f7445p == bVar.f7445p && this.f7446q == bVar.f7446q && this.f7447r == bVar.f7447r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7433a, this.f7434b, this.f7435c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7436f), Integer.valueOf(this.f7437g), Float.valueOf(this.h), Integer.valueOf(this.f7438i), Float.valueOf(this.f7439j), Float.valueOf(this.f7440k), Boolean.valueOf(this.f7441l), Integer.valueOf(this.f7442m), Integer.valueOf(this.f7443n), Float.valueOf(this.f7444o), Integer.valueOf(this.f7445p), Float.valueOf(this.f7446q), Integer.valueOf(this.f7447r));
    }
}
