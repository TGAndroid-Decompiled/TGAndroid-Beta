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
    public static final String f7747s;
    public static final String f7748t;
    public static final String f7749u;
    public static final String v;
    public static final String f7750w;
    public static final String f7751x;
    public static final String f7752y;
    public static final String f7753z;
    public final CharSequence f7754a;
    public final Layout.Alignment f7755b;
    public final Layout.Alignment f7756c;
    public final Bitmap d;
    public final float e;
    public final int f7757f;
    public final int f7758g;
    public final float h;
    public final int f7759i;
    public final float f7760j;
    public final float f7761k;
    public final boolean f7762l;
    public final int f7763m;
    public final int f7764n;
    public final float f7765o;
    public final int f7766p;
    public final float f7767q;
    public final int f7768r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f8253a;
        f7747s = Integer.toString(0, 36);
        f7748t = Integer.toString(17, 36);
        f7749u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7750w = Integer.toString(3, 36);
        f7751x = Integer.toString(18, 36);
        f7752y = Integer.toString(4, 36);
        f7753z = Integer.toString(5, 36);
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
            this.f7754a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7754a = charSequence.toString();
        } else {
            this.f7754a = null;
        }
        this.f7755b = alignment;
        this.f7756c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7757f = i10;
        this.f7758g = i11;
        this.h = f10;
        this.f7759i = i12;
        this.f7760j = f12;
        this.f7761k = f13;
        this.f7762l = z10;
        this.f7763m = i14;
        this.f7764n = i13;
        this.f7765o = f11;
        this.f7766p = i15;
        this.f7767q = f14;
        this.f7768r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7754a;
        if (charSequence != null) {
            bundle.putCharSequence(f7747s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f7773a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f7776c, fVar.f7777a);
                    bundle2.putInt(f.d, fVar.f7778b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f7780a);
                    bundle3.putInt(g.e, gVar.f7781b);
                    bundle3.putInt(g.f7779f, gVar.f7782c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f7783b, hVar.f7784a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7748t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7749u, this.f7755b);
        bundle.putSerializable(v, this.f7756c);
        bundle.putFloat(f7752y, this.e);
        bundle.putInt(f7753z, this.f7757f);
        bundle.putInt(A, this.f7758g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7759i);
        bundle.putInt(D, this.f7764n);
        bundle.putFloat(E, this.f7765o);
        bundle.putFloat(F, this.f7760j);
        bundle.putFloat(G, this.f7761k);
        bundle.putBoolean(I, this.f7762l);
        bundle.putInt(H, this.f7763m);
        bundle.putInt(J, this.f7766p);
        bundle.putFloat(K, this.f7767q);
        bundle.putInt(L, this.f7768r);
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
            if (TextUtils.equals(this.f7754a, bVar.f7754a) && this.f7755b == bVar.f7755b && this.f7756c == bVar.f7756c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7757f == bVar.f7757f && this.f7758g == bVar.f7758g && this.h == bVar.h && this.f7759i == bVar.f7759i && this.f7760j == bVar.f7760j && this.f7761k == bVar.f7761k && this.f7762l == bVar.f7762l && this.f7763m == bVar.f7763m && this.f7764n == bVar.f7764n && this.f7765o == bVar.f7765o && this.f7766p == bVar.f7766p && this.f7767q == bVar.f7767q && this.f7768r == bVar.f7768r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7754a, this.f7755b, this.f7756c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7757f), Integer.valueOf(this.f7758g), Float.valueOf(this.h), Integer.valueOf(this.f7759i), Float.valueOf(this.f7760j), Float.valueOf(this.f7761k), Boolean.valueOf(this.f7762l), Integer.valueOf(this.f7763m), Integer.valueOf(this.f7764n), Float.valueOf(this.f7765o), Integer.valueOf(this.f7766p), Float.valueOf(this.f7767q), Integer.valueOf(this.f7768r));
    }
}
