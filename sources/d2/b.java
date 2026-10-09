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
    public static final String f8064s;
    public static final String f8065t;
    public static final String f8066u;
    public static final String v;
    public static final String f8067w;
    public static final String f8068x;
    public static final String f8069y;
    public static final String f8070z;
    public final CharSequence f8071a;
    public final Layout.Alignment f8072b;
    public final Layout.Alignment f8073c;
    public final Bitmap d;
    public final float f8074e;
    public final int f8075f;
    public final int f8076g;
    public final float h;
    public final int f8077i;
    public final float f8078j;
    public final float f8079k;
    public final boolean f8080l;
    public final int f8081m;
    public final int f8082n;
    public final float f8083o;
    public final int f8084p;
    public final float f8085q;
    public final int f8086r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8532a;
        f8064s = Integer.toString(0, 36);
        f8065t = Integer.toString(17, 36);
        f8066u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8067w = Integer.toString(3, 36);
        f8068x = Integer.toString(18, 36);
        f8069y = Integer.toString(4, 36);
        f8070z = Integer.toString(5, 36);
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
            this.f8071a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8071a = charSequence.toString();
        } else {
            this.f8071a = null;
        }
        this.f8072b = alignment;
        this.f8073c = alignment2;
        this.d = bitmap;
        this.f8074e = f7;
        this.f8075f = i10;
        this.f8076g = i11;
        this.h = f10;
        this.f8077i = i12;
        this.f8078j = f12;
        this.f8079k = f13;
        this.f8080l = z10;
        this.f8081m = i14;
        this.f8082n = i13;
        this.f8083o = f11;
        this.f8084p = i15;
        this.f8085q = f14;
        this.f8086r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8071a;
        if (charSequence != null) {
            bundle.putCharSequence(f8064s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f8093a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f8097c, gVar.f8098a);
                    bundle2.putInt(g.d, gVar.f8099b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f8102a);
                    bundle3.putInt(h.f8100e, hVar.f8103b);
                    bundle3.putInt(h.f8101f, hVar.f8104c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f8105b, iVar.f8106a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f8065t, arrayList);
                }
            }
        }
        bundle.putSerializable(f8066u, this.f8072b);
        bundle.putSerializable(v, this.f8073c);
        bundle.putFloat(f8069y, this.f8074e);
        bundle.putInt(f8070z, this.f8075f);
        bundle.putInt(A, this.f8076g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f8077i);
        bundle.putInt(D, this.f8082n);
        bundle.putFloat(E, this.f8083o);
        bundle.putFloat(F, this.f8078j);
        bundle.putFloat(G, this.f8079k);
        bundle.putBoolean(I, this.f8080l);
        bundle.putInt(H, this.f8081m);
        bundle.putInt(J, this.f8084p);
        bundle.putFloat(K, this.f8085q);
        bundle.putInt(L, this.f8086r);
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
            if (TextUtils.equals(this.f8071a, bVar.f8071a) && this.f8072b == bVar.f8072b && this.f8073c == bVar.f8073c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f8074e == bVar.f8074e && this.f8075f == bVar.f8075f && this.f8076g == bVar.f8076g && this.h == bVar.h && this.f8077i == bVar.f8077i && this.f8078j == bVar.f8078j && this.f8079k == bVar.f8079k && this.f8080l == bVar.f8080l && this.f8081m == bVar.f8081m && this.f8082n == bVar.f8082n && this.f8083o == bVar.f8083o && this.f8084p == bVar.f8084p && this.f8085q == bVar.f8085q && this.f8086r == bVar.f8086r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8071a, this.f8072b, this.f8073c, this.d, Float.valueOf(this.f8074e), Integer.valueOf(this.f8075f), Integer.valueOf(this.f8076g), Float.valueOf(this.h), Integer.valueOf(this.f8077i), Float.valueOf(this.f8078j), Float.valueOf(this.f8079k), Boolean.valueOf(this.f8080l), Integer.valueOf(this.f8081m), Integer.valueOf(this.f8082n), Float.valueOf(this.f8083o), Integer.valueOf(this.f8084p), Float.valueOf(this.f8085q), Integer.valueOf(this.f8086r));
    }
}
