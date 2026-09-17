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
    public static final String f7428s;
    public static final String f7429t;
    public static final String f7430u;
    public static final String v;
    public static final String f7431w;
    public static final String f7432x;
    public static final String f7433y;
    public static final String f7434z;
    public final CharSequence f7435a;
    public final Layout.Alignment f7436b;
    public final Layout.Alignment f7437c;
    public final Bitmap d;
    public final float e;
    public final int f7438f;
    public final int f7439g;
    public final float h;
    public final int f7440i;
    public final float f7441j;
    public final float f7442k;
    public final boolean f7443l;
    public final int f7444m;
    public final int f7445n;
    public final float f7446o;
    public final int f7447p;
    public final float f7448q;
    public final int f7449r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7888a;
        f7428s = Integer.toString(0, 36);
        f7429t = Integer.toString(17, 36);
        f7430u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7431w = Integer.toString(3, 36);
        f7432x = Integer.toString(18, 36);
        f7433y = Integer.toString(4, 36);
        f7434z = Integer.toString(5, 36);
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
            this.f7435a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7435a = charSequence.toString();
        } else {
            this.f7435a = null;
        }
        this.f7436b = alignment;
        this.f7437c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7438f = i10;
        this.f7439g = i11;
        this.h = f10;
        this.f7440i = i12;
        this.f7441j = f12;
        this.f7442k = f13;
        this.f7443l = z10;
        this.f7444m = i14;
        this.f7445n = i13;
        this.f7446o = f11;
        this.f7447p = i15;
        this.f7448q = f14;
        this.f7449r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7435a;
        if (charSequence != null) {
            bundle.putCharSequence(f7428s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f7455a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f7458c, gVar.f7459a);
                    bundle2.putInt(g.d, gVar.f7460b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f7462a);
                    bundle3.putInt(h.e, hVar.f7463b);
                    bundle3.putInt(h.f7461f, hVar.f7464c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f7465b, iVar.f7466a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7429t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7430u, this.f7436b);
        bundle.putSerializable(v, this.f7437c);
        bundle.putFloat(f7433y, this.e);
        bundle.putInt(f7434z, this.f7438f);
        bundle.putInt(A, this.f7439g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7440i);
        bundle.putInt(D, this.f7445n);
        bundle.putFloat(E, this.f7446o);
        bundle.putFloat(F, this.f7441j);
        bundle.putFloat(G, this.f7442k);
        bundle.putBoolean(I, this.f7443l);
        bundle.putInt(H, this.f7444m);
        bundle.putInt(J, this.f7447p);
        bundle.putFloat(K, this.f7448q);
        bundle.putInt(L, this.f7449r);
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
            if (TextUtils.equals(this.f7435a, bVar.f7435a) && this.f7436b == bVar.f7436b && this.f7437c == bVar.f7437c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7438f == bVar.f7438f && this.f7439g == bVar.f7439g && this.h == bVar.h && this.f7440i == bVar.f7440i && this.f7441j == bVar.f7441j && this.f7442k == bVar.f7442k && this.f7443l == bVar.f7443l && this.f7444m == bVar.f7444m && this.f7445n == bVar.f7445n && this.f7446o == bVar.f7446o && this.f7447p == bVar.f7447p && this.f7448q == bVar.f7448q && this.f7449r == bVar.f7449r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7435a, this.f7436b, this.f7437c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7438f), Integer.valueOf(this.f7439g), Float.valueOf(this.h), Integer.valueOf(this.f7440i), Float.valueOf(this.f7441j), Float.valueOf(this.f7442k), Boolean.valueOf(this.f7443l), Integer.valueOf(this.f7444m), Integer.valueOf(this.f7445n), Float.valueOf(this.f7446o), Integer.valueOf(this.f7447p), Float.valueOf(this.f7448q), Integer.valueOf(this.f7449r));
    }
}
