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
    public static final String f8063s;
    public static final String f8064t;
    public static final String f8065u;
    public static final String v;
    public static final String f8066w;
    public static final String f8067x;
    public static final String f8068y;
    public static final String f8069z;
    public final CharSequence f8070a;
    public final Layout.Alignment f8071b;
    public final Layout.Alignment f8072c;
    public final Bitmap d;
    public final float f8073e;
    public final int f8074f;
    public final int f8075g;
    public final float h;
    public final int f8076i;
    public final float f8077j;
    public final float f8078k;
    public final boolean f8079l;
    public final int f8080m;
    public final int f8081n;
    public final float f8082o;
    public final int f8083p;
    public final float f8084q;
    public final int f8085r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8531a;
        f8063s = Integer.toString(0, 36);
        f8064t = Integer.toString(17, 36);
        f8065u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8066w = Integer.toString(3, 36);
        f8067x = Integer.toString(18, 36);
        f8068y = Integer.toString(4, 36);
        f8069z = Integer.toString(5, 36);
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
            this.f8070a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8070a = charSequence.toString();
        } else {
            this.f8070a = null;
        }
        this.f8071b = alignment;
        this.f8072c = alignment2;
        this.d = bitmap;
        this.f8073e = f7;
        this.f8074f = i10;
        this.f8075g = i11;
        this.h = f10;
        this.f8076i = i12;
        this.f8077j = f12;
        this.f8078k = f13;
        this.f8079l = z10;
        this.f8080m = i14;
        this.f8081n = i13;
        this.f8082o = f11;
        this.f8083p = i15;
        this.f8084q = f14;
        this.f8085r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8070a;
        if (charSequence != null) {
            bundle.putCharSequence(f8063s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f8092a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f8096c, gVar.f8097a);
                    bundle2.putInt(g.d, gVar.f8098b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f8101a);
                    bundle3.putInt(h.f8099e, hVar.f8102b);
                    bundle3.putInt(h.f8100f, hVar.f8103c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f8104b, iVar.f8105a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f8064t, arrayList);
                }
            }
        }
        bundle.putSerializable(f8065u, this.f8071b);
        bundle.putSerializable(v, this.f8072c);
        bundle.putFloat(f8068y, this.f8073e);
        bundle.putInt(f8069z, this.f8074f);
        bundle.putInt(A, this.f8075g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f8076i);
        bundle.putInt(D, this.f8081n);
        bundle.putFloat(E, this.f8082o);
        bundle.putFloat(F, this.f8077j);
        bundle.putFloat(G, this.f8078k);
        bundle.putBoolean(I, this.f8079l);
        bundle.putInt(H, this.f8080m);
        bundle.putInt(J, this.f8083p);
        bundle.putFloat(K, this.f8084q);
        bundle.putInt(L, this.f8085r);
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
            if (TextUtils.equals(this.f8070a, bVar.f8070a) && this.f8071b == bVar.f8071b && this.f8072c == bVar.f8072c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f8073e == bVar.f8073e && this.f8074f == bVar.f8074f && this.f8075g == bVar.f8075g && this.h == bVar.h && this.f8076i == bVar.f8076i && this.f8077j == bVar.f8077j && this.f8078k == bVar.f8078k && this.f8079l == bVar.f8079l && this.f8080m == bVar.f8080m && this.f8081n == bVar.f8081n && this.f8082o == bVar.f8082o && this.f8083p == bVar.f8083p && this.f8084q == bVar.f8084q && this.f8085r == bVar.f8085r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8070a, this.f8071b, this.f8072c, this.d, Float.valueOf(this.f8073e), Integer.valueOf(this.f8074f), Integer.valueOf(this.f8075g), Float.valueOf(this.h), Integer.valueOf(this.f8076i), Float.valueOf(this.f8077j), Float.valueOf(this.f8078k), Boolean.valueOf(this.f8079l), Integer.valueOf(this.f8080m), Integer.valueOf(this.f8081n), Float.valueOf(this.f8082o), Integer.valueOf(this.f8083p), Float.valueOf(this.f8084q), Integer.valueOf(this.f8085r));
    }
}
