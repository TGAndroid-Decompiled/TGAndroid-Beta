package d2;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.l0;
import j$.util.Objects;
import java.util.ArrayList;
import v7.t6;
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
    public static final String f5659s;
    public static final String f5660t;
    public static final String f5661u;
    public static final String v;
    public static final String f5662w;
    public static final String f5663x;
    public static final String f5664y;
    public static final String f5665z;
    public final CharSequence f5666a;
    public final Layout.Alignment f5667b;
    public final Layout.Alignment f5668c;
    public final Bitmap d;
    public final float e;
    public final int f5669f;
    public final int f5670g;
    public final float h;
    public final int f5671i;
    public final float f5672j;
    public final float f5673k;
    public final boolean f5674l;
    public final int f5675m;
    public final int f5676n;
    public final float f5677o;
    public final int f5678p;
    public final float f5679q;
    public final int f5680r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f6165a;
        f5659s = Integer.toString(0, 36);
        f5660t = Integer.toString(17, 36);
        f5661u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f5662w = Integer.toString(3, 36);
        f5663x = Integer.toString(18, 36);
        f5664y = Integer.toString(4, 36);
        f5665z = Integer.toString(5, 36);
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
            t6.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f5666a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f5666a = charSequence.toString();
        } else {
            this.f5666a = null;
        }
        this.f5667b = alignment;
        this.f5668c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f5669f = i10;
        this.f5670g = i11;
        this.h = f10;
        this.f5671i = i12;
        this.f5672j = f12;
        this.f5673k = f13;
        this.f5674l = z10;
        this.f5675m = i14;
        this.f5676n = i13;
        this.f5677o = f11;
        this.f5678p = i15;
        this.f5679q = f14;
        this.f5680r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f5666a;
        if (charSequence != null) {
            bundle.putCharSequence(f5659s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f5686a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f5689c, gVar.f5690a);
                    bundle2.putInt(g.d, gVar.f5691b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f5693a);
                    bundle3.putInt(h.e, hVar.f5694b);
                    bundle3.putInt(h.f5692f, hVar.f5695c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f5696b, iVar.f5697a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f5660t, arrayList);
                }
            }
        }
        bundle.putSerializable(f5661u, this.f5667b);
        bundle.putSerializable(v, this.f5668c);
        bundle.putFloat(f5664y, this.e);
        bundle.putInt(f5665z, this.f5669f);
        bundle.putInt(A, this.f5670g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f5671i);
        bundle.putInt(D, this.f5676n);
        bundle.putFloat(E, this.f5677o);
        bundle.putFloat(F, this.f5672j);
        bundle.putFloat(G, this.f5673k);
        bundle.putBoolean(I, this.f5674l);
        bundle.putInt(H, this.f5675m);
        bundle.putInt(J, this.f5678p);
        bundle.putFloat(K, this.f5679q);
        bundle.putInt(L, this.f5680r);
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
            if (TextUtils.equals(this.f5666a, bVar.f5666a) && this.f5667b == bVar.f5667b && this.f5668c == bVar.f5668c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f5669f == bVar.f5669f && this.f5670g == bVar.f5670g && this.h == bVar.h && this.f5671i == bVar.f5671i && this.f5672j == bVar.f5672j && this.f5673k == bVar.f5673k && this.f5674l == bVar.f5674l && this.f5675m == bVar.f5675m && this.f5676n == bVar.f5676n && this.f5677o == bVar.f5677o && this.f5678p == bVar.f5678p && this.f5679q == bVar.f5679q && this.f5680r == bVar.f5680r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f5666a, this.f5667b, this.f5668c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f5669f), Integer.valueOf(this.f5670g), Float.valueOf(this.h), Integer.valueOf(this.f5671i), Float.valueOf(this.f5672j), Float.valueOf(this.f5673k), Boolean.valueOf(this.f5674l), Integer.valueOf(this.f5675m), Integer.valueOf(this.f5676n), Float.valueOf(this.f5677o), Integer.valueOf(this.f5678p), Float.valueOf(this.f5679q), Integer.valueOf(this.f5680r));
    }
}
