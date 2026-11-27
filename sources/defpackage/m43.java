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
public final class m43 {
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
        new m43("", null, null, null, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
        String str = gcc.a;
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

    public m43(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f, int i, int i2, float f2, int i3, int i4, float f3, float f4, float f5, boolean z2, int i5, int i6, float f6, int i7) {
        boolean z3;
        if (charSequence == null) {
            bitmap.getClass();
        } else {
            if (bitmap == null) {
                z3 = true;
            } else {
                z3 = false;
            }
            yve.f(z3);
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
        wr9[] wr9VarArr;
        glb[] glbVarArr;
        aoc[] aocVarArr;
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.a;
        if (charSequence != null) {
            bundle.putCharSequence(s, charSequence);
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                String str = o53.a;
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                for (wr9 wr9Var : (wr9[]) spanned.getSpans(0, spanned.length(), wr9.class)) {
                    wr9Var.getClass();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString(wr9.c, wr9Var.a);
                    bundle2.putInt(wr9.d, wr9Var.b);
                    arrayList.add(o53.a(spanned, wr9Var, 1, bundle2));
                }
                for (glb glbVar : (glb[]) spanned.getSpans(0, spanned.length(), glb.class)) {
                    glbVar.getClass();
                    Bundle bundle3 = new Bundle();
                    bundle3.putInt(glb.d, glbVar.a);
                    bundle3.putInt(glb.e, glbVar.b);
                    bundle3.putInt(glb.f, glbVar.c);
                    arrayList.add(o53.a(spanned, glbVar, 2, bundle3));
                }
                for (ai5 ai5Var : (ai5[]) spanned.getSpans(0, spanned.length(), ai5.class)) {
                    arrayList.add(o53.a(spanned, ai5Var, 3, null));
                }
                for (aoc aocVar : (aoc[]) spanned.getSpans(0, spanned.length(), aoc.class)) {
                    aocVar.getClass();
                    Bundle bundle4 = new Bundle();
                    bundle4.putString(aoc.b, aocVar.a);
                    arrayList.add(o53.a(spanned, aocVar, 4, bundle4));
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
            if (obj != null && m43.class == obj.getClass()) {
                m43 m43Var = (m43) obj;
                if (TextUtils.equals(this.a, m43Var.a) && this.b == m43Var.b && this.c == m43Var.c) {
                    Bitmap bitmap = m43Var.d;
                    Bitmap bitmap2 = this.d;
                    if (bitmap2 == null) {
                        if (bitmap != null) {
                            return false;
                        }
                    } else if (bitmap == null || !bitmap2.sameAs(bitmap)) {
                        return false;
                    }
                    if (this.e == m43Var.e && this.f == m43Var.f && this.g == m43Var.g && this.h == m43Var.h && this.i == m43Var.i && this.j == m43Var.j && this.k == m43Var.k && this.l == m43Var.l && this.m == m43Var.m && this.n == m43Var.n && this.o == m43Var.o && this.p == m43Var.p && this.q == m43Var.q && this.r == m43Var.r) {
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
