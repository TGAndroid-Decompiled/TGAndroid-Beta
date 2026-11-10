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
    public static final String f13431s;
    public static final String f13432t;
    public static final String f13433u;
    public static final String v;
    public static final String f13434w;
    public static final String f13435x;
    public static final String f13436y;
    public static final String f13437z;
    public final CharSequence f13438a;
    public final Layout.Alignment f13439b;
    public final Layout.Alignment f13440c;
    public final Bitmap d;
    public final float f13441e;
    public final int f13442f;
    public final int f13443g;
    public final float h;
    public final int f13444i;
    public final float f13445j;
    public final float f13446k;
    public final boolean f13447l;
    public final int f13448m;
    public final int f13449n;
    public final float f13450o;
    public final int f13451p;
    public final float f13452q;
    public final int f13453r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = m0.f14114a;
        f13431s = Integer.toString(0, 36);
        f13432t = Integer.toString(17, 36);
        f13433u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13434w = Integer.toString(3, 36);
        f13435x = Integer.toString(18, 36);
        f13436y = Integer.toString(4, 36);
        f13437z = Integer.toString(5, 36);
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
            this.f13438a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13438a = charSequence.toString();
        } else {
            this.f13438a = null;
        }
        this.f13439b = alignment;
        this.f13440c = alignment2;
        this.d = bitmap;
        this.f13441e = f10;
        this.f13442f = i7;
        this.f13443g = i10;
        this.h = f11;
        this.f13444i = i11;
        this.f13445j = f13;
        this.f13446k = f14;
        this.f13447l = z9;
        this.f13448m = i13;
        this.f13449n = i12;
        this.f13450o = f12;
        this.f13451p = i14;
        this.f13452q = f15;
        this.f13453r = i15;
    }

    public final Bundle a() {
        g[] gVarArr;
        h[] hVarArr;
        i[] iVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13438a;
        if (charSequence != null) {
            bundle.putCharSequence(f13431s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = e.f13460a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(g.f13464c, gVar.f13465a);
                    bundle2.putInt(g.d, gVar.f13466b);
                    arrayList.add(e.a(spanned, gVar, 1, bundle2));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(h.d, hVar.f13469a);
                    bundle3.putInt(h.f13467e, hVar.f13470b);
                    bundle3.putInt(h.f13468f, hVar.f13471c);
                    arrayList.add(e.a(spanned, hVar, 2, bundle3));
                }
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    arrayList.add(e.a(spanned, fVar, 3, null));
                }
                for (i iVar : (i[]) spanned.getSpans(0, spanned.length(), i.class)) {
                    iVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(i.f13472b, iVar.f13473a);
                    arrayList.add(e.a(spanned, iVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13432t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13433u, this.f13439b);
        bundle.putSerializable(v, this.f13440c);
        bundle.putFloat(f13436y, this.f13441e);
        bundle.putInt(f13437z, this.f13442f);
        bundle.putInt(A, this.f13443g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13444i);
        bundle.putInt(D, this.f13449n);
        bundle.putFloat(E, this.f13450o);
        bundle.putFloat(F, this.f13445j);
        bundle.putFloat(G, this.f13446k);
        bundle.putBoolean(I, this.f13447l);
        bundle.putInt(H, this.f13448m);
        bundle.putInt(J, this.f13451p);
        bundle.putFloat(K, this.f13452q);
        bundle.putInt(L, this.f13453r);
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
            if (TextUtils.equals(this.f13438a, bVar.f13438a) && this.f13439b == bVar.f13439b && this.f13440c == bVar.f13440c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13441e == bVar.f13441e && this.f13442f == bVar.f13442f && this.f13443g == bVar.f13443g && this.h == bVar.h && this.f13444i == bVar.f13444i && this.f13445j == bVar.f13445j && this.f13446k == bVar.f13446k && this.f13447l == bVar.f13447l && this.f13448m == bVar.f13448m && this.f13449n == bVar.f13449n && this.f13450o == bVar.f13450o && this.f13451p == bVar.f13451p && this.f13452q == bVar.f13452q && this.f13453r == bVar.f13453r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13438a, this.f13439b, this.f13440c, this.d, Float.valueOf(this.f13441e), Integer.valueOf(this.f13442f), Integer.valueOf(this.f13443g), Float.valueOf(this.h), Integer.valueOf(this.f13444i), Float.valueOf(this.f13445j), Float.valueOf(this.f13446k), Boolean.valueOf(this.f13447l), Integer.valueOf(this.f13448m), Integer.valueOf(this.f13449n), Float.valueOf(this.f13450o), Integer.valueOf(this.f13451p), Float.valueOf(this.f13452q), Integer.valueOf(this.f13453r));
    }
}
