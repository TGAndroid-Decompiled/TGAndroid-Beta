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
    public static final String f8061s;
    public static final String f8062t;
    public static final String f8063u;
    public static final String v;
    public static final String f8064w;
    public static final String f8065x;
    public static final String f8066y;
    public static final String f8067z;
    public final CharSequence f8068a;
    public final Layout.Alignment f8069b;
    public final Layout.Alignment f8070c;
    public final Bitmap d;
    public final float f8071e;
    public final int f8072f;
    public final int f8073g;
    public final float h;
    public final int f8074i;
    public final float f8075j;
    public final float f8076k;
    public final boolean f8077l;
    public final int f8078m;
    public final int f8079n;
    public final float f8080o;
    public final int f8081p;
    public final float f8082q;
    public final int f8083r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = d0.f8529a;
        f8061s = Integer.toString(0, 36);
        f8062t = Integer.toString(17, 36);
        f8063u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f8064w = Integer.toString(3, 36);
        f8065x = Integer.toString(18, 36);
        f8066y = Integer.toString(4, 36);
        f8067z = Integer.toString(5, 36);
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
            this.f8068a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f8068a = charSequence.toString();
        } else {
            this.f8068a = null;
        }
        this.f8069b = alignment;
        this.f8070c = alignment2;
        this.d = bitmap;
        this.f8071e = f7;
        this.f8072f = i10;
        this.f8073g = i11;
        this.h = f10;
        this.f8074i = i12;
        this.f8075j = f12;
        this.f8076k = f13;
        this.f8077l = z10;
        this.f8078m = i14;
        this.f8079n = i13;
        this.f8080o = f11;
        this.f8081p = i15;
        this.f8082q = f14;
        this.f8083r = i16;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f8068a;
        if (charSequence != null) {
            bundle.putCharSequence(f8061s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f8090a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f8094c, gVar.f8095a);
                    bundle2.putInt(g.d, gVar.f8096b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f8099a);
                    bundle3.putInt(h.f8097e, hVar.f8100b);
                    bundle3.putInt(h.f8098f, hVar.f8101c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f8102b, iVar.f8103a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f8062t, arrayList);
                }
            }
        }
        bundle.putSerializable(f8063u, this.f8069b);
        bundle.putSerializable(v, this.f8070c);
        bundle.putFloat(f8066y, this.f8071e);
        bundle.putInt(f8067z, this.f8072f);
        bundle.putInt(A, this.f8073g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f8074i);
        bundle.putInt(D, this.f8079n);
        bundle.putFloat(E, this.f8080o);
        bundle.putFloat(F, this.f8075j);
        bundle.putFloat(G, this.f8076k);
        bundle.putBoolean(I, this.f8077l);
        bundle.putInt(H, this.f8078m);
        bundle.putInt(J, this.f8081p);
        bundle.putFloat(K, this.f8082q);
        bundle.putInt(L, this.f8083r);
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
            if (TextUtils.equals(this.f8068a, bVar.f8068a) && this.f8069b == bVar.f8069b && this.f8070c == bVar.f8070c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f8071e == bVar.f8071e && this.f8072f == bVar.f8072f && this.f8073g == bVar.f8073g && this.h == bVar.h && this.f8074i == bVar.f8074i && this.f8075j == bVar.f8075j && this.f8076k == bVar.f8076k && this.f8077l == bVar.f8077l && this.f8078m == bVar.f8078m && this.f8079n == bVar.f8079n && this.f8080o == bVar.f8080o && this.f8081p == bVar.f8081p && this.f8082q == bVar.f8082q && this.f8083r == bVar.f8083r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f8068a, this.f8069b, this.f8070c, this.d, Float.valueOf(this.f8071e), Integer.valueOf(this.f8072f), Integer.valueOf(this.f8073g), Float.valueOf(this.h), Integer.valueOf(this.f8074i), Float.valueOf(this.f8075j), Float.valueOf(this.f8076k), Boolean.valueOf(this.f8077l), Integer.valueOf(this.f8078m), Integer.valueOf(this.f8079n), Float.valueOf(this.f8080o), Integer.valueOf(this.f8081p), Float.valueOf(this.f8082q), Integer.valueOf(this.f8083r));
    }
}
