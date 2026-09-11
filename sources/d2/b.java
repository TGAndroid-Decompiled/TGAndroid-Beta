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
    public static final String f6485s;
    public static final String f6486t;
    public static final String f6487u;
    public static final String v;
    public static final String f6488w;
    public static final String f6489x;
    public static final String f6490y;
    public static final String f6491z;
    public final CharSequence f6492a;
    public final Layout.Alignment f6493b;
    public final Layout.Alignment f6494c;
    public final Bitmap d;
    public final float f6495e;
    public final int f6496f;
    public final int f6497g;
    public final float h;
    public final int f6498i;
    public final float f6499j;
    public final float f6500k;
    public final boolean f6501l;
    public final int f6502m;
    public final int f6503n;
    public final float f6504o;
    public final int f6505p;
    public final float f6506q;
    public final int f6507r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8737a;
        f6485s = Integer.toString(0, 36);
        f6486t = Integer.toString(17, 36);
        f6487u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f6488w = Integer.toString(3, 36);
        f6489x = Integer.toString(18, 36);
        f6490y = Integer.toString(4, 36);
        f6491z = Integer.toString(5, 36);
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
            this.f6492a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6492a = charSequence.toString();
        } else {
            this.f6492a = null;
        }
        this.f6493b = alignment;
        this.f6494c = alignment2;
        this.d = bitmap;
        this.f6495e = f7;
        this.f6496f = i10;
        this.f6497g = i11;
        this.h = f10;
        this.f6498i = i12;
        this.f6499j = f12;
        this.f6500k = f13;
        this.f6501l = z10;
        this.f6502m = i14;
        this.f6503n = i13;
        this.f6504o = f11;
        this.f6505p = i15;
        this.f6506q = f14;
        this.f6507r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f6492a;
        if (charSequence != null) {
            bundle.putCharSequence(f6485s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f6513a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f6517c, fVar.f6518a);
                    bundle2.putInt(f.d, fVar.f6519b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f6522a);
                    bundle3.putInt(g.f6520e, gVar.f6523b);
                    bundle3.putInt(g.f6521f, gVar.f6524c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f6525b, hVar.f6526a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f6486t, arrayList);
                }
            }
        }
        bundle.putSerializable(f6487u, this.f6493b);
        bundle.putSerializable(v, this.f6494c);
        bundle.putFloat(f6490y, this.f6495e);
        bundle.putInt(f6491z, this.f6496f);
        bundle.putInt(A, this.f6497g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f6498i);
        bundle.putInt(D, this.f6503n);
        bundle.putFloat(E, this.f6504o);
        bundle.putFloat(F, this.f6499j);
        bundle.putFloat(G, this.f6500k);
        bundle.putBoolean(I, this.f6501l);
        bundle.putInt(H, this.f6502m);
        bundle.putInt(J, this.f6505p);
        bundle.putFloat(K, this.f6506q);
        bundle.putInt(L, this.f6507r);
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
            if (TextUtils.equals(this.f6492a, bVar.f6492a) && this.f6493b == bVar.f6493b && this.f6494c == bVar.f6494c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f6495e == bVar.f6495e && this.f6496f == bVar.f6496f && this.f6497g == bVar.f6497g && this.h == bVar.h && this.f6498i == bVar.f6498i && this.f6499j == bVar.f6499j && this.f6500k == bVar.f6500k && this.f6501l == bVar.f6501l && this.f6502m == bVar.f6502m && this.f6503n == bVar.f6503n && this.f6504o == bVar.f6504o && this.f6505p == bVar.f6505p && this.f6506q == bVar.f6506q && this.f6507r == bVar.f6507r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6492a, this.f6493b, this.f6494c, this.d, Float.valueOf(this.f6495e), Integer.valueOf(this.f6496f), Integer.valueOf(this.f6497g), Float.valueOf(this.h), Integer.valueOf(this.f6498i), Float.valueOf(this.f6499j), Float.valueOf(this.f6500k), Boolean.valueOf(this.f6501l), Integer.valueOf(this.f6502m), Integer.valueOf(this.f6503n), Float.valueOf(this.f6504o), Integer.valueOf(this.f6505p), Float.valueOf(this.f6506q), Integer.valueOf(this.f6507r));
    }
}
