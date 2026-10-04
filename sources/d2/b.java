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
    public static final String f8014s;
    public static final String f8015t;
    public static final String f8016u;
    public static final String v;
    public static final String f8017w;
    public static final String f8018x;
    public static final String f8019y;
    public static final String f8020z;
    public final CharSequence f8021a;
    public final Layout.Alignment f8022b;
    public final Layout.Alignment f8023c;
    public final Bitmap d;
    public final float f8024e;
    public final int f8025f;
    public final int f8026g;
    public final float h;
    public final int f8027i;
    public final float f8028j;
    public final float f8029k;
    public final boolean f8030l;
    public final int f8031m;
    public final int f8032n;
    public final float f8033o;
    public final int f8034p;
    public final float f8035q;
    public final int f8036r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8537a;
        f8014s = Integer.toString(0, 36);
        f8015t = Integer.toString(17, 36);
        f8016u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8017w = Integer.toString(3, 36);
        f8018x = Integer.toString(18, 36);
        f8019y = Integer.toString(4, 36);
        f8020z = Integer.toString(5, 36);
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
            this.f8021a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8021a = charSequence.toString();
        } else {
            this.f8021a = null;
        }
        this.f8022b = alignment;
        this.f8023c = alignment2;
        this.d = bitmap;
        this.f8024e = f7;
        this.f8025f = i10;
        this.f8026g = i11;
        this.h = f10;
        this.f8027i = i12;
        this.f8028j = f12;
        this.f8029k = f13;
        this.f8030l = z10;
        this.f8031m = i14;
        this.f8032n = i13;
        this.f8033o = f11;
        this.f8034p = i15;
        this.f8035q = f14;
        this.f8036r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8021a;
        if (charSequence != null) {
            bundle.putCharSequence(f8014s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f8043a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f8047c, gVar.f8048a);
                    bundle2.putInt(g.d, gVar.f8049b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f8052a);
                    bundle3.putInt(h.f8050e, hVar.f8053b);
                    bundle3.putInt(h.f8051f, hVar.f8054c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f8055b, iVar.f8056a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f8015t, arrayList);
                }
            }
        }
        bundle.putSerializable(f8016u, this.f8022b);
        bundle.putSerializable(v, this.f8023c);
        bundle.putFloat(f8019y, this.f8024e);
        bundle.putInt(f8020z, this.f8025f);
        bundle.putInt(A, this.f8026g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f8027i);
        bundle.putInt(D, this.f8032n);
        bundle.putFloat(E, this.f8033o);
        bundle.putFloat(F, this.f8028j);
        bundle.putFloat(G, this.f8029k);
        bundle.putBoolean(I, this.f8030l);
        bundle.putInt(H, this.f8031m);
        bundle.putInt(J, this.f8034p);
        bundle.putFloat(K, this.f8035q);
        bundle.putInt(L, this.f8036r);
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
            if (TextUtils.equals(this.f8021a, bVar.f8021a) && this.f8022b == bVar.f8022b && this.f8023c == bVar.f8023c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f8024e == bVar.f8024e && this.f8025f == bVar.f8025f && this.f8026g == bVar.f8026g && this.h == bVar.h && this.f8027i == bVar.f8027i && this.f8028j == bVar.f8028j && this.f8029k == bVar.f8029k && this.f8030l == bVar.f8030l && this.f8031m == bVar.f8031m && this.f8032n == bVar.f8032n && this.f8033o == bVar.f8033o && this.f8034p == bVar.f8034p && this.f8035q == bVar.f8035q && this.f8036r == bVar.f8036r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8021a, this.f8022b, this.f8023c, this.d, Float.valueOf(this.f8024e), Integer.valueOf(this.f8025f), Integer.valueOf(this.f8026g), Float.valueOf(this.h), Integer.valueOf(this.f8027i), Float.valueOf(this.f8028j), Float.valueOf(this.f8029k), Boolean.valueOf(this.f8030l), Integer.valueOf(this.f8031m), Integer.valueOf(this.f8032n), Float.valueOf(this.f8033o), Integer.valueOf(this.f8034p), Float.valueOf(this.f8035q), Integer.valueOf(this.f8036r));
    }
}
