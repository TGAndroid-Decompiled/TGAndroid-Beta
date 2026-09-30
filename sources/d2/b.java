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
    public static final String f7422s;
    public static final String f7423t;
    public static final String f7424u;
    public static final String v;
    public static final String f7425w;
    public static final String f7426x;
    public static final String f7427y;
    public static final String f7428z;
    public final CharSequence f7429a;
    public final Layout.Alignment f7430b;
    public final Layout.Alignment f7431c;
    public final Bitmap d;
    public final float e;
    public final int f7432f;
    public final int f7433g;
    public final float h;
    public final int f7434i;
    public final float f7435j;
    public final float f7436k;
    public final boolean f7437l;
    public final int f7438m;
    public final int f7439n;
    public final float f7440o;
    public final int f7441p;
    public final float f7442q;
    public final int f7443r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7882a;
        f7422s = Integer.toString(0, 36);
        f7423t = Integer.toString(17, 36);
        f7424u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7425w = Integer.toString(3, 36);
        f7426x = Integer.toString(18, 36);
        f7427y = Integer.toString(4, 36);
        f7428z = Integer.toString(5, 36);
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
            this.f7429a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7429a = charSequence.toString();
        } else {
            this.f7429a = null;
        }
        this.f7430b = alignment;
        this.f7431c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7432f = i10;
        this.f7433g = i11;
        this.h = f10;
        this.f7434i = i12;
        this.f7435j = f12;
        this.f7436k = f13;
        this.f7437l = z10;
        this.f7438m = i14;
        this.f7439n = i13;
        this.f7440o = f11;
        this.f7441p = i15;
        this.f7442q = f14;
        this.f7443r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7429a;
        if (charSequence != null) {
            bundle.putCharSequence(f7422s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7449a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7452c, gVar.f7453a);
                    bundle2.putInt(g.d, gVar.f7454b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7456a);
                    bundle3.putInt(h.e, hVar.f7457b);
                    bundle3.putInt(h.f7455f, hVar.f7458c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7459b, iVar.f7460a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7423t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7424u, this.f7430b);
        bundle.putSerializable(v, this.f7431c);
        bundle.putFloat(f7427y, this.e);
        bundle.putInt(f7428z, this.f7432f);
        bundle.putInt(A, this.f7433g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7434i);
        bundle.putInt(D, this.f7439n);
        bundle.putFloat(E, this.f7440o);
        bundle.putFloat(F, this.f7435j);
        bundle.putFloat(G, this.f7436k);
        bundle.putBoolean(I, this.f7437l);
        bundle.putInt(H, this.f7438m);
        bundle.putInt(J, this.f7441p);
        bundle.putFloat(K, this.f7442q);
        bundle.putInt(L, this.f7443r);
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
            if (TextUtils.equals(this.f7429a, bVar.f7429a) && this.f7430b == bVar.f7430b && this.f7431c == bVar.f7431c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7432f == bVar.f7432f && this.f7433g == bVar.f7433g && this.h == bVar.h && this.f7434i == bVar.f7434i && this.f7435j == bVar.f7435j && this.f7436k == bVar.f7436k && this.f7437l == bVar.f7437l && this.f7438m == bVar.f7438m && this.f7439n == bVar.f7439n && this.f7440o == bVar.f7440o && this.f7441p == bVar.f7441p && this.f7442q == bVar.f7442q && this.f7443r == bVar.f7443r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7429a, this.f7430b, this.f7431c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7432f), Integer.valueOf(this.f7433g), Float.valueOf(this.h), Integer.valueOf(this.f7434i), Float.valueOf(this.f7435j), Float.valueOf(this.f7436k), Boolean.valueOf(this.f7437l), Integer.valueOf(this.f7438m), Integer.valueOf(this.f7439n), Float.valueOf(this.f7440o), Integer.valueOf(this.f7441p), Float.valueOf(this.f7442q), Integer.valueOf(this.f7443r));
    }
}
