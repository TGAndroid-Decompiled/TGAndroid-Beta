package d2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.m0;
import j$.util.Objects;
import java.util.ArrayList;
import v7.u6;
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
    public static final String f7758s;
    public static final String f7759t;
    public static final String f7760u;
    public static final String v;
    public static final String f7761w;
    public static final String f7762x;
    public static final String f7763y;
    public static final String f7764z;
    public final CharSequence f7765a;
    public final Layout.Alignment f7766b;
    public final Layout.Alignment f7767c;
    public final Bitmap d;
    public final float e;
    public final int f7768f;
    public final int f7769g;
    public final float h;
    public final int f7770i;
    public final float f7771j;
    public final float f7772k;
    public final boolean f7773l;
    public final int f7774m;
    public final int f7775n;
    public final float f7776o;
    public final int f7777p;
    public final float f7778q;
    public final int f7779r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8259a;
        f7758s = Integer.toString(0, 36);
        f7759t = Integer.toString(17, 36);
        f7760u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7761w = Integer.toString(3, 36);
        f7762x = Integer.toString(18, 36);
        f7763y = Integer.toString(4, 36);
        f7764z = Integer.toString(5, 36);
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
            u6.g(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f7765a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7765a = charSequence.toString();
        } else {
            this.f7765a = null;
        }
        this.f7766b = alignment;
        this.f7767c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7768f = i10;
        this.f7769g = i11;
        this.h = f10;
        this.f7770i = i12;
        this.f7771j = f12;
        this.f7772k = f13;
        this.f7773l = z10;
        this.f7774m = i14;
        this.f7775n = i13;
        this.f7776o = f11;
        this.f7777p = i15;
        this.f7778q = f14;
        this.f7779r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7765a;
        if (charSequence != null) {
            bundle.putCharSequence(f7758s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f7784a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f7787c, fVar.f7788a);
                    bundle2.putInt(f.d, fVar.f7789b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f7791a);
                    bundle3.putInt(g.e, gVar.f7792b);
                    bundle3.putInt(g.f7790f, gVar.f7793c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f7794b, hVar.f7795a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7759t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7760u, this.f7766b);
        bundle.putSerializable(v, this.f7767c);
        bundle.putFloat(f7763y, this.e);
        bundle.putInt(f7764z, this.f7768f);
        bundle.putInt(A, this.f7769g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7770i);
        bundle.putInt(D, this.f7775n);
        bundle.putFloat(E, this.f7776o);
        bundle.putFloat(F, this.f7771j);
        bundle.putFloat(G, this.f7772k);
        bundle.putBoolean(I, this.f7773l);
        bundle.putInt(H, this.f7774m);
        bundle.putInt(J, this.f7777p);
        bundle.putFloat(K, this.f7778q);
        bundle.putInt(L, this.f7779r);
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
            if (TextUtils.equals(this.f7765a, bVar.f7765a) && this.f7766b == bVar.f7766b && this.f7767c == bVar.f7767c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7768f == bVar.f7768f && this.f7769g == bVar.f7769g && this.h == bVar.h && this.f7770i == bVar.f7770i && this.f7771j == bVar.f7771j && this.f7772k == bVar.f7772k && this.f7773l == bVar.f7773l && this.f7774m == bVar.f7774m && this.f7775n == bVar.f7775n && this.f7776o == bVar.f7776o && this.f7777p == bVar.f7777p && this.f7778q == bVar.f7778q && this.f7779r == bVar.f7779r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7765a, this.f7766b, this.f7767c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7768f), Integer.valueOf(this.f7769g), Float.valueOf(this.h), Integer.valueOf(this.f7770i), Float.valueOf(this.f7771j), Float.valueOf(this.f7772k), Boolean.valueOf(this.f7773l), Integer.valueOf(this.f7774m), Integer.valueOf(this.f7775n), Float.valueOf(this.f7776o), Integer.valueOf(this.f7777p), Float.valueOf(this.f7778q), Integer.valueOf(this.f7779r));
    }
}
