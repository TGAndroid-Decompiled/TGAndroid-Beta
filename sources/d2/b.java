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
    public static final String f6201s;
    public static final String f6202t;
    public static final String f6203u;
    public static final String v;
    public static final String f6204w;
    public static final String f6205x;
    public static final String f6206y;
    public static final String f6207z;
    public final CharSequence f6208a;
    public final Layout.Alignment f6209b;
    public final Layout.Alignment f6210c;
    public final Bitmap d;
    public final float e;
    public final int f6211f;
    public final int f6212g;
    public final float h;
    public final int f6213i;
    public final float f6214j;
    public final float f6215k;
    public final boolean f6216l;
    public final int f6217m;
    public final int f6218n;
    public final float f6219o;
    public final int f6220p;
    public final float f6221q;
    public final int f6222r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f7188a;
        f6201s = Integer.toString(0, 36);
        f6202t = Integer.toString(17, 36);
        f6203u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f6204w = Integer.toString(3, 36);
        f6205x = Integer.toString(18, 36);
        f6206y = Integer.toString(4, 36);
        f6207z = Integer.toString(5, 36);
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
            this.f6208a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f6208a = charSequence.toString();
        } else {
            this.f6208a = null;
        }
        this.f6209b = alignment;
        this.f6210c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f6211f = i10;
        this.f6212g = i11;
        this.h = f10;
        this.f6213i = i12;
        this.f6214j = f12;
        this.f6215k = f13;
        this.f6216l = z10;
        this.f6217m = i14;
        this.f6218n = i13;
        this.f6219o = f11;
        this.f6220p = i15;
        this.f6221q = f14;
        this.f6222r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f6208a;
        if (charSequence != null) {
            bundle.putCharSequence(f6201s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f6227a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f6230c, fVar.f6231a);
                    bundle2.putInt(f.d, fVar.f6232b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f6234a);
                    bundle3.putInt(g.e, gVar.f6235b);
                    bundle3.putInt(g.f6233f, gVar.f6236c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f6237b, hVar.f6238a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f6202t, arrayList);
                }
            }
        }
        bundle.putSerializable(f6203u, this.f6209b);
        bundle.putSerializable(v, this.f6210c);
        bundle.putFloat(f6206y, this.e);
        bundle.putInt(f6207z, this.f6211f);
        bundle.putInt(A, this.f6212g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f6213i);
        bundle.putInt(D, this.f6218n);
        bundle.putFloat(E, this.f6219o);
        bundle.putFloat(F, this.f6214j);
        bundle.putFloat(G, this.f6215k);
        bundle.putBoolean(I, this.f6216l);
        bundle.putInt(H, this.f6217m);
        bundle.putInt(J, this.f6220p);
        bundle.putFloat(K, this.f6221q);
        bundle.putInt(L, this.f6222r);
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
            if (TextUtils.equals(this.f6208a, bVar.f6208a) && this.f6209b == bVar.f6209b && this.f6210c == bVar.f6210c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f6211f == bVar.f6211f && this.f6212g == bVar.f6212g && this.h == bVar.h && this.f6213i == bVar.f6213i && this.f6214j == bVar.f6214j && this.f6215k == bVar.f6215k && this.f6216l == bVar.f6216l && this.f6217m == bVar.f6217m && this.f6218n == bVar.f6218n && this.f6219o == bVar.f6219o && this.f6220p == bVar.f6220p && this.f6221q == bVar.f6221q && this.f6222r == bVar.f6222r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f6208a, this.f6209b, this.f6210c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f6211f), Integer.valueOf(this.f6212g), Float.valueOf(this.h), Integer.valueOf(this.f6213i), Float.valueOf(this.f6214j), Float.valueOf(this.f6215k), Boolean.valueOf(this.f6216l), Integer.valueOf(this.f6217m), Integer.valueOf(this.f6218n), Float.valueOf(this.f6219o), Integer.valueOf(this.f6220p), Float.valueOf(this.f6221q), Integer.valueOf(this.f6222r));
    }
}
