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
    public static final String f8015s;
    public static final String f8016t;
    public static final String f8017u;
    public static final String v;
    public static final String f8018w;
    public static final String f8019x;
    public static final String f8020y;
    public static final String f8021z;
    public final CharSequence f8022a;
    public final Layout.Alignment f8023b;
    public final Layout.Alignment f8024c;
    public final Bitmap d;
    public final float f8025e;
    public final int f8026f;
    public final int f8027g;
    public final float h;
    public final int f8028i;
    public final float f8029j;
    public final float f8030k;
    public final boolean f8031l;
    public final int f8032m;
    public final int f8033n;
    public final float f8034o;
    public final int f8035p;
    public final float f8036q;
    public final int f8037r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8538a;
        f8015s = Integer.toString(0, 36);
        f8016t = Integer.toString(17, 36);
        f8017u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8018w = Integer.toString(3, 36);
        f8019x = Integer.toString(18, 36);
        f8020y = Integer.toString(4, 36);
        f8021z = Integer.toString(5, 36);
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
            this.f8022a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8022a = charSequence.toString();
        } else {
            this.f8022a = null;
        }
        this.f8023b = alignment;
        this.f8024c = alignment2;
        this.d = bitmap;
        this.f8025e = f7;
        this.f8026f = i10;
        this.f8027g = i11;
        this.h = f10;
        this.f8028i = i12;
        this.f8029j = f12;
        this.f8030k = f13;
        this.f8031l = z10;
        this.f8032m = i14;
        this.f8033n = i13;
        this.f8034o = f11;
        this.f8035p = i15;
        this.f8036q = f14;
        this.f8037r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8022a;
        if (charSequence != null) {
            bundle.putCharSequence(f8015s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f8044a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f8048c, gVar.f8049a);
                    bundle2.putInt(g.d, gVar.f8050b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f8053a);
                    bundle3.putInt(h.f8051e, hVar.f8054b);
                    bundle3.putInt(h.f8052f, hVar.f8055c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f8056b, iVar.f8057a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f8016t, arrayList);
                }
            }
        }
        bundle.putSerializable(f8017u, this.f8023b);
        bundle.putSerializable(v, this.f8024c);
        bundle.putFloat(f8020y, this.f8025e);
        bundle.putInt(f8021z, this.f8026f);
        bundle.putInt(A, this.f8027g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f8028i);
        bundle.putInt(D, this.f8033n);
        bundle.putFloat(E, this.f8034o);
        bundle.putFloat(F, this.f8029j);
        bundle.putFloat(G, this.f8030k);
        bundle.putBoolean(I, this.f8031l);
        bundle.putInt(H, this.f8032m);
        bundle.putInt(J, this.f8035p);
        bundle.putFloat(K, this.f8036q);
        bundle.putInt(L, this.f8037r);
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
            if (TextUtils.equals(this.f8022a, bVar.f8022a) && this.f8023b == bVar.f8023b && this.f8024c == bVar.f8024c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f8025e == bVar.f8025e && this.f8026f == bVar.f8026f && this.f8027g == bVar.f8027g && this.h == bVar.h && this.f8028i == bVar.f8028i && this.f8029j == bVar.f8029j && this.f8030k == bVar.f8030k && this.f8031l == bVar.f8031l && this.f8032m == bVar.f8032m && this.f8033n == bVar.f8033n && this.f8034o == bVar.f8034o && this.f8035p == bVar.f8035p && this.f8036q == bVar.f8036q && this.f8037r == bVar.f8037r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8022a, this.f8023b, this.f8024c, this.d, Float.valueOf(this.f8025e), Integer.valueOf(this.f8026f), Integer.valueOf(this.f8027g), Float.valueOf(this.h), Integer.valueOf(this.f8028i), Float.valueOf(this.f8029j), Float.valueOf(this.f8030k), Boolean.valueOf(this.f8031l), Integer.valueOf(this.f8032m), Integer.valueOf(this.f8033n), Float.valueOf(this.f8034o), Integer.valueOf(this.f8035p), Float.valueOf(this.f8036q), Integer.valueOf(this.f8037r));
    }
}
