package g2;

import a8.ia;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import h2.m0;
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
    public static final String f13429s;
    public static final String f13430t;
    public static final String f13431u;
    public static final String v;
    public static final String f13432w;
    public static final String f13433x;
    public static final String f13434y;
    public static final String f13435z;
    public final CharSequence f13436a;
    public final Layout.Alignment f13437b;
    public final Layout.Alignment f13438c;
    public final Bitmap d;
    public final float f13439e;
    public final int f13440f;
    public final int f13441g;
    public final float h;
    public final int f13442i;
    public final float f13443j;
    public final float f13444k;
    public final boolean f13445l;
    public final int f13446m;
    public final int f13447n;
    public final float f13448o;
    public final int f13449p;
    public final float f13450q;
    public final int f13451r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f14112a;
        f13429s = Integer.toString(0, 36);
        f13430t = Integer.toString(17, 36);
        f13431u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13432w = Integer.toString(3, 36);
        f13433x = Integer.toString(18, 36);
        f13434y = Integer.toString(4, 36);
        f13435z = Integer.toString(5, 36);
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

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i7, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z9, int i13, int i14, float f15, int i15) {
        boolean z10;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            ia.f(z10);
        }
        if (charSequence instanceof Spanned) {
            this.f13436a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13436a = charSequence.toString();
        } else {
            this.f13436a = null;
        }
        this.f13437b = alignment;
        this.f13438c = alignment2;
        this.d = bitmap;
        this.f13439e = f10;
        this.f13440f = i7;
        this.f13441g = i10;
        this.h = f11;
        this.f13442i = i11;
        this.f13443j = f13;
        this.f13444k = f14;
        this.f13445l = z9;
        this.f13446m = i13;
        this.f13447n = i12;
        this.f13448o = f12;
        this.f13449p = i14;
        this.f13450q = f15;
        this.f13451r = i15;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13436a;
        if (charSequence != null) {
            bundle.putCharSequence(f13429s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f13458a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f13462c, gVar.f13463a);
                    bundle2.putInt(g.d, gVar.f13464b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f13467a);
                    bundle3.putInt(h.f13465e, hVar.f13468b);
                    bundle3.putInt(h.f13466f, hVar.f13469c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f13470b, iVar.f13471a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13430t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13431u, this.f13437b);
        bundle.putSerializable(v, this.f13438c);
        bundle.putFloat(f13434y, this.f13439e);
        bundle.putInt(f13435z, this.f13440f);
        bundle.putInt(A, this.f13441g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13442i);
        bundle.putInt(D, this.f13447n);
        bundle.putFloat(E, this.f13448o);
        bundle.putFloat(F, this.f13443j);
        bundle.putFloat(G, this.f13444k);
        bundle.putBoolean(I, this.f13445l);
        bundle.putInt(H, this.f13446m);
        bundle.putInt(J, this.f13449p);
        bundle.putFloat(K, this.f13450q);
        bundle.putInt(L, this.f13451r);
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
            if (TextUtils.equals(this.f13436a, bVar.f13436a) && this.f13437b == bVar.f13437b && this.f13438c == bVar.f13438c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13439e == bVar.f13439e && this.f13440f == bVar.f13440f && this.f13441g == bVar.f13441g && this.h == bVar.h && this.f13442i == bVar.f13442i && this.f13443j == bVar.f13443j && this.f13444k == bVar.f13444k && this.f13445l == bVar.f13445l && this.f13446m == bVar.f13446m && this.f13447n == bVar.f13447n && this.f13448o == bVar.f13448o && this.f13449p == bVar.f13449p && this.f13450q == bVar.f13450q && this.f13451r == bVar.f13451r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13436a, this.f13437b, this.f13438c, this.d, Float.valueOf(this.f13439e), Integer.valueOf(this.f13440f), Integer.valueOf(this.f13441g), Float.valueOf(this.h), Integer.valueOf(this.f13442i), Float.valueOf(this.f13443j), Float.valueOf(this.f13444k), Boolean.valueOf(this.f13445l), Integer.valueOf(this.f13446m), Integer.valueOf(this.f13447n), Float.valueOf(this.f13448o), Integer.valueOf(this.f13449p), Float.valueOf(this.f13450q), Integer.valueOf(this.f13451r));
    }
}
