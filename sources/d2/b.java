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
    public static final String f6512s;
    public static final String f6513t;
    public static final String f6514u;
    public static final String v;
    public static final String f6515w;
    public static final String f6516x;
    public static final String f6517y;
    public static final String f6518z;
    public final CharSequence f6519a;
    public final Layout.Alignment f6520b;
    public final Layout.Alignment f6521c;
    public final Bitmap d;
    public final float f6522e;
    public final int f6523f;
    public final int f6524g;
    public final float h;
    public final int f6525i;
    public final float f6526j;
    public final float f6527k;
    public final boolean f6528l;
    public final int f6529m;
    public final int f6530n;
    public final float f6531o;
    public final int f6532p;
    public final float f6533q;
    public final int f6534r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8765a;
        f6512s = Integer.toString(0, 36);
        f6513t = Integer.toString(17, 36);
        f6514u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f6515w = Integer.toString(3, 36);
        f6516x = Integer.toString(18, 36);
        f6517y = Integer.toString(4, 36);
        f6518z = Integer.toString(5, 36);
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
            this.f6519a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6519a = charSequence.toString();
        } else {
            this.f6519a = null;
        }
        this.f6520b = alignment;
        this.f6521c = alignment2;
        this.d = bitmap;
        this.f6522e = f7;
        this.f6523f = i10;
        this.f6524g = i11;
        this.h = f10;
        this.f6525i = i12;
        this.f6526j = f12;
        this.f6527k = f13;
        this.f6528l = z10;
        this.f6529m = i14;
        this.f6530n = i13;
        this.f6531o = f11;
        this.f6532p = i15;
        this.f6533q = f14;
        this.f6534r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f6519a;
        if (charSequence != null) {
            bundle.putCharSequence(f6512s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f6540a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f6544c, fVar.f6545a);
                    bundle2.putInt(f.d, fVar.f6546b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f6549a);
                    bundle3.putInt(g.f6547e, gVar.f6550b);
                    bundle3.putInt(g.f6548f, gVar.f6551c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f6552b, hVar.f6553a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f6513t, arrayList);
                }
            }
        }
        bundle.putSerializable(f6514u, this.f6520b);
        bundle.putSerializable(v, this.f6521c);
        bundle.putFloat(f6517y, this.f6522e);
        bundle.putInt(f6518z, this.f6523f);
        bundle.putInt(A, this.f6524g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f6525i);
        bundle.putInt(D, this.f6530n);
        bundle.putFloat(E, this.f6531o);
        bundle.putFloat(F, this.f6526j);
        bundle.putFloat(G, this.f6527k);
        bundle.putBoolean(I, this.f6528l);
        bundle.putInt(H, this.f6529m);
        bundle.putInt(J, this.f6532p);
        bundle.putFloat(K, this.f6533q);
        bundle.putInt(L, this.f6534r);
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
            if (TextUtils.equals(this.f6519a, bVar.f6519a) && this.f6520b == bVar.f6520b && this.f6521c == bVar.f6521c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f6522e == bVar.f6522e && this.f6523f == bVar.f6523f && this.f6524g == bVar.f6524g && this.h == bVar.h && this.f6525i == bVar.f6525i && this.f6526j == bVar.f6526j && this.f6527k == bVar.f6527k && this.f6528l == bVar.f6528l && this.f6529m == bVar.f6529m && this.f6530n == bVar.f6530n && this.f6531o == bVar.f6531o && this.f6532p == bVar.f6532p && this.f6533q == bVar.f6533q && this.f6534r == bVar.f6534r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6519a, this.f6520b, this.f6521c, this.d, Float.valueOf(this.f6522e), Integer.valueOf(this.f6523f), Integer.valueOf(this.f6524g), Float.valueOf(this.h), Integer.valueOf(this.f6525i), Float.valueOf(this.f6526j), Float.valueOf(this.f6527k), Boolean.valueOf(this.f6528l), Integer.valueOf(this.f6529m), Integer.valueOf(this.f6530n), Float.valueOf(this.f6531o), Integer.valueOf(this.f6532p), Float.valueOf(this.f6533q), Integer.valueOf(this.f6534r));
    }
}
