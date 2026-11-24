package defpackage;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Layout;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import j$.util.Objects;
import java.util.ArrayList;
public final class f53 {
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
    public static final String s;
    public static final String t;
    public static final String u;
    public static final String v;
    public static final String w;
    public static final String x;
    public static final String y;
    public static final String z;
    public final CharSequence a;
    public final Layout.Alignment b;
    public final Layout.Alignment c;
    public final Bitmap d;
    public final float e;
    public final int f;
    public final int g;
    public final float h;
    public final int i;
    public final float j;
    public final float k;
    public final boolean l;
    public final int m;
    public final int n;
    public final float o;
    public final int p;
    public final float q;
    public final int r;

    static {
        new f53("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = hac.a;
        s = "0";
        t = "h";
        u = "1";
        v = "2";
        w = "3";
        x = "i";
        y = "4";
        z = "5";
        A = "6";
        B = "7";
        C = "8";
        D = "9";
        E = "a";
        F = "b";
        G = "c";
        H = "d";
        I = "e";
        J = "f";
        K = "g";
        L = "j";
    }

    public f53(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        boolean z3;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            jte.f(z3);
        }
        if (charSequence instanceof Spanned) {
            this.a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.a = charSequence.toString();
        } else {
            this.a = null;
        }
        this.b = alignment;
        this.c = alignment2;
        this.d = bitmap;
        this.e = f;
        this.f = i;
        this.g = i2;
        this.h = f2;
        this.i = i3;
        this.j = f4;
        this.k = f5;
        this.l = z2;
        this.m = i5;
        this.n = i4;
        this.o = f3;
        this.p = i6;
        this.q = f6;
        this.r = i7;
    }

    public final Bundle a() {
        eq9[] eq9VarArr;
        ljb[] ljbVarArr;
        nlc[] nlcVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = h63.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (eq9 eq9Var : (eq9[]) spanned.getSpans(0, spanned.length(), eq9.class)) {
                    eq9Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(eq9.c, eq9Var.a);
                    bundle2.putInt(eq9.d, eq9Var.b);
                    arrayList.add(h63.a(spanned, eq9Var, 1, bundle2));
                }
                for (ljb ljbVar : (ljb[]) spanned.getSpans(0, spanned.length(), ljb.class)) {
                    ljbVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(ljb.d, ljbVar.a);
                    bundle3.putInt(ljb.e, ljbVar.b);
                    bundle3.putInt(ljb.f, ljbVar.c);
                    arrayList.add(h63.a(spanned, ljbVar, 2, bundle3));
                }
                for (xh5 xh5Var : (xh5[]) spanned.getSpans(0, spanned.length(), xh5.class)) {
                    arrayList.add(h63.a(spanned, xh5Var, 3, null));
                }
                for (nlc nlcVar : (nlc[]) spanned.getSpans(0, spanned.length(), nlc.class)) {
                    nlcVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(nlc.b, nlcVar.a);
                    arrayList.add(h63.a(spanned, nlcVar, 4, bundle4));
                }
                if (!arrayList.isEmpty()) {
                    bundle.putParcelableArrayList(t, arrayList);
                }
            }
        }
        bundle.putSerializable(u, this.b);
        bundle.putSerializable(v, this.c);
        bundle.putFloat(y, this.e);
        bundle.putInt(z, this.f);
        bundle.putInt(A, this.g);
        bundle.putFloat(B, this.h);
        bundle.putInt(C, this.i);
        bundle.putInt(D, this.n);
        bundle.putFloat(E, this.o);
        bundle.putFloat(F, this.j);
        bundle.putFloat(G, this.k);
        bundle.putBoolean(I, this.l);
        bundle.putInt(H, this.m);
        bundle.putInt(J, this.p);
        bundle.putFloat(K, this.q);
        bundle.putInt(L, this.r);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f53.class == obj.getClass()) {
                f53 f53Var = (f53) obj;
                if (TextUtils.equals(this.a, f53Var.a) && this.b == f53Var.b && this.c == f53Var.c) {
                    Bitmap bitmap = f53Var.d;
                    Bitmap bitmap2 = this.d;
                    if (bitmap2 == null) {
                        if (bitmap != null) {
                            return false;
                        }
                    } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
                        return false;
                    }
                    if (this.e == f53Var.e && this.f == f53Var.f && this.g == f53Var.g && this.h == f53Var.h && this.i == f53Var.i && this.j == f53Var.j && this.k == f53Var.k && this.l == f53Var.l && this.m == f53Var.m && this.n == f53Var.n && this.o == f53Var.o && this.p == f53Var.p && this.q == f53Var.q && this.r == f53Var.r) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Float.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), Float.valueOf(this.h), Integer.valueOf(this.i), Float.valueOf(this.j), Float.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), Integer.valueOf(this.n), Float.valueOf(this.o), Integer.valueOf(this.p), Float.valueOf(this.q), Integer.valueOf(this.r));
    }
}
