package d2;

import a8.yb;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import e2.n0;
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
    public static final String f7850s;
    public static final String f7851t;
    public static final String f7852u;
    public static final String v;
    public static final String f7853w;
    public static final String f7854x;
    public static final String f7855y;
    public static final String f7856z;
    public final CharSequence f7857a;
    public final Layout.Alignment f7858b;
    public final Layout.Alignment f7859c;
    public final Bitmap d;
    public final float e;
    public final int f7860f;
    public final int f7861g;
    public final float h;
    public final int f7862i;
    public final float f7863j;
    public final float f7864k;
    public final boolean f7865l;
    public final int f7866m;
    public final int f7867n;
    public final float f7868o;
    public final int f7869p;
    public final float f7870q;
    public final int f7871r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = n0.f9691a;
        f7850s = Integer.toString(0, 36);
        f7851t = Integer.toString(17, 36);
        f7852u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f7853w = Integer.toString(3, 36);
        f7854x = Integer.toString(18, 36);
        f7855y = Integer.toString(4, 36);
        f7856z = Integer.toString(5, 36);
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
            yb.g(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f7857a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f7857a = charSequence.toString();
        } else {
            this.f7857a = null;
        }
        this.f7858b = alignment;
        this.f7859c = alignment2;
        this.d = bitmap;
        this.e = f7;
        this.f7860f = i10;
        this.f7861g = i11;
        this.h = f10;
        this.f7862i = i12;
        this.f7863j = f12;
        this.f7864k = f13;
        this.f7865l = z10;
        this.f7866m = i14;
        this.f7867n = i13;
        this.f7868o = f11;
        this.f7869p = i15;
        this.f7870q = f14;
        this.f7871r = i16;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f7857a;
        if (charSequence != null) {
            bundle.putCharSequence(f7850s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f7876a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f7879c, fVar.f7880a);
                    bundle2.putInt(f.d, fVar.f7881b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f7883a);
                    bundle3.putInt(g.e, gVar.f7884b);
                    bundle3.putInt(g.f7882f, gVar.f7885c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f7886b, hVar.f7887a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f7851t, arrayList);
                }
            }
        }
        bundle.putSerializable(f7852u, this.f7858b);
        bundle.putSerializable(v, this.f7859c);
        bundle.putFloat(f7855y, this.e);
        bundle.putInt(f7856z, this.f7860f);
        bundle.putInt(A, this.f7861g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f7862i);
        bundle.putInt(D, this.f7867n);
        bundle.putFloat(E, this.f7868o);
        bundle.putFloat(F, this.f7863j);
        bundle.putFloat(G, this.f7864k);
        bundle.putBoolean(I, this.f7865l);
        bundle.putInt(H, this.f7866m);
        bundle.putInt(J, this.f7869p);
        bundle.putFloat(K, this.f7870q);
        bundle.putInt(L, this.f7871r);
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
            if (TextUtils.equals(this.f7857a, bVar.f7857a) && this.f7858b == bVar.f7858b && this.f7859c == bVar.f7859c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.e == bVar.e && this.f7860f == bVar.f7860f && this.f7861g == bVar.f7861g && this.h == bVar.h && this.f7862i == bVar.f7862i && this.f7863j == bVar.f7863j && this.f7864k == bVar.f7864k && this.f7865l == bVar.f7865l && this.f7866m == bVar.f7866m && this.f7867n == bVar.f7867n && this.f7868o == bVar.f7868o && this.f7869p == bVar.f7869p && this.f7870q == bVar.f7870q && this.f7871r == bVar.f7871r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f7857a, this.f7858b, this.f7859c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f7860f), Integer.valueOf(this.f7861g), Float.valueOf(this.h), Integer.valueOf(this.f7862i), Float.valueOf(this.f7863j), Float.valueOf(this.f7864k), Boolean.valueOf(this.f7865l), Integer.valueOf(this.f7866m), Integer.valueOf(this.f7867n), Float.valueOf(this.f7868o), Integer.valueOf(this.f7869p), Float.valueOf(this.f7870q), Integer.valueOf(this.f7871r));
    }
}
