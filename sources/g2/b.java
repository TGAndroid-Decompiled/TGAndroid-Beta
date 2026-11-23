package g2;

import a8.ma;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import h2.l0;
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
    public static final String f13089s;
    public static final String f13090t;
    public static final String f13091u;
    public static final String v;
    public static final String f13092w;
    public static final String f13093x;
    public static final String f13094y;
    public static final String f13095z;
    public final CharSequence f13096a;
    public final Layout.Alignment f13097b;
    public final Layout.Alignment f13098c;
    public final Bitmap d;
    public final float f13099e;
    public final int f13100f;
    public final int f13101g;
    public final float h;
    public final int f13102i;
    public final float f13103j;
    public final float f13104k;
    public final boolean f13105l;
    public final int f13106m;
    public final int f13107n;
    public final float f13108o;
    public final int f13109p;
    public final float f13110q;
    public final int f13111r;

    static {
        new b("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = l0.f13778a;
        f13089s = Integer.toString(0, 36);
        f13090t = Integer.toString(17, 36);
        f13091u = Integer.toString(1, 36);
        v = Integer.toString(2, 36);
        f13092w = Integer.toString(3, 36);
        f13093x = Integer.toString(18, 36);
        f13094y = Integer.toString(4, 36);
        f13095z = Integer.toString(5, 36);
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

    public b(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i7, int i10, float f11, int i11, int i12, float f12, float f13, float f14, boolean z10, int i13, int i14, float f15, int i15) {
        boolean z11;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            ma.f(z11);
        }
        if (charSequence instanceof Spanned) {
            this.f13096a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f13096a = charSequence.toString();
        } else {
            this.f13096a = null;
        }
        this.f13097b = alignment;
        this.f13098c = alignment2;
        this.d = bitmap;
        this.f13099e = f10;
        this.f13100f = i7;
        this.f13101g = i10;
        this.h = f11;
        this.f13102i = i11;
        this.f13103j = f13;
        this.f13104k = f14;
        this.f13105l = z10;
        this.f13106m = i13;
        this.f13107n = i12;
        this.f13108o = f12;
        this.f13109p = i14;
        this.f13110q = f15;
        this.f13111r = i15;
    }

    public final Bundle a() {
        f[] fVarArr;
        g[] gVarArr;
        h[] hVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f13096a;
        if (charSequence != null) {
            bundle.putCharSequence(f13089s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = d.f13117a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (f fVar : (f[]) spanned.getSpans(0, spanned.length(), f.class)) {
                    fVar.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(f.f13121c, fVar.f13122a);
                    bundle2.putInt(f.d, fVar.f13123b);
                    arrayList.add(d.a(spanned, fVar, 1, bundle2));
                }
                for (g gVar : (g[]) spanned.getSpans(0, spanned.length(), g.class)) {
                    gVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(g.d, gVar.f13126a);
                    bundle3.putInt(g.f13124e, gVar.f13127b);
                    bundle3.putInt(g.f13125f, gVar.f13128c);
                    arrayList.add(d.a(spanned, gVar, 2, bundle3));
                }
                for (e eVar : (e[]) spanned.getSpans(0, spanned.length(), e.class)) {
                    arrayList.add(d.a(spanned, eVar, 3, null));
                }
                for (h hVar : (h[]) spanned.getSpans(0, spanned.length(), h.class)) {
                    hVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(h.f13129b, hVar.f13130a);
                    arrayList.add(d.a(spanned, hVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(f13090t, arrayList);
                }
            }
        }
        bundle.putSerializable(f13091u, this.f13097b);
        bundle.putSerializable(v, this.f13098c);
        bundle.putFloat(f13094y, this.f13099e);
        bundle.putInt(f13095z, this.f13100f);
        bundle.putInt(A, this.f13101g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.f13102i);
        bundle.putInt(D, this.f13107n);
        bundle.putFloat(E, this.f13108o);
        bundle.putFloat(F, this.f13103j);
        bundle.putFloat(G, this.f13104k);
        bundle.putBoolean(I, this.f13105l);
        bundle.putInt(H, this.f13106m);
        bundle.putInt(J, this.f13109p);
        bundle.putFloat(K, this.f13110q);
        bundle.putInt(L, this.f13111r);
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
            if (TextUtils.equals(this.f13096a, bVar.f13096a) && this.f13097b == bVar.f13097b && this.f13098c == bVar.f13098c && ((bitmap = this.d) != null ? !(bitmap2 == null || !bitmap.sameAs(bitmap2)) : bitmap2 == null) && this.f13099e == bVar.f13099e && this.f13100f == bVar.f13100f && this.f13101g == bVar.f13101g && this.h == bVar.h && this.f13102i == bVar.f13102i && this.f13103j == bVar.f13103j && this.f13104k == bVar.f13104k && this.f13105l == bVar.f13105l && this.f13106m == bVar.f13106m && this.f13107n == bVar.f13107n && this.f13108o == bVar.f13108o && this.f13109p == bVar.f13109p && this.f13110q == bVar.f13110q && this.f13111r == bVar.f13111r) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f13096a, this.f13097b, this.f13098c, this.d, Float.valueOf(this.f13099e), Integer.valueOf(this.f13100f), Integer.valueOf(this.f13101g), Float.valueOf(this.h), Integer.valueOf(this.f13102i), Float.valueOf(this.f13103j), Float.valueOf(this.f13104k), Boolean.valueOf(this.f13105l), Integer.valueOf(this.f13106m), Integer.valueOf(this.f13107n), Float.valueOf(this.f13108o), Integer.valueOf(this.f13109p), Float.valueOf(this.f13110q), Integer.valueOf(this.f13111r));
    }
}
