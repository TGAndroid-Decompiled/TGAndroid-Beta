package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class c2c {
    public static final c2c J = new c2c(new b2c());
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final String b0;
    public static final String c0;
    public static final String d0;
    public static final String e0;
    public static final String f0;
    public static final String g0;
    public static final String h0;
    public static final String i0;
    public static final String j0;
    public static final String k0;
    public static final String l0;
    public static final String m0;
    public static final String n0;
    public static final String o0;
    public static final String p0;
    public static final String q0;
    public static final String r0;
    public static final String s0;
    public static final String t0;
    public static final String u0;
    public static final String v0;
    public final int A;
    public final boolean B;
    public final int C;
    public final boolean D;
    public final boolean E;
    public final boolean F;
    public final boolean G;
    public final to5 H;
    public final bp5 I;
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final boolean k;
    public final boolean l;
    public final j99 m;
    public final j99 n;
    public final j99 o;
    public final int p;
    public final j99 q;
    public final j99 r;
    public final int s;
    public final int t;
    public final int u;
    public final j99 v;
    public final a2c w;
    public final boolean x;
    public final j99 y;
    public final j99 z;

    static {
        String str = gcc.a;
        K = "1";
        L = "2";
        M = "3";
        N = "4";
        O = "5";
        P = "6";
        Q = "7";
        R = "8";
        S = "9";
        T = "a";
        U = "b";
        V = "c";
        W = "d";
        X = "e";
        Y = "f";
        Z = "g";
        a0 = "h";
        b0 = "i";
        c0 = "j";
        d0 = "k";
        e0 = "l";
        f0 = "m";
        g0 = "n";
        h0 = "o";
        i0 = "p";
        j0 = "q";
        k0 = "r";
        l0 = "s";
        m0 = "t";
        n0 = "u";
        o0 = "v";
        p0 = "w";
        q0 = "x";
        r0 = "y";
        s0 = "z";
        t0 = "10";
        u0 = "11";
        v0 = "12";
    }

    public c2c(b2c b2cVar) {
        this.a = b2cVar.a;
        this.b = b2cVar.b;
        this.c = b2cVar.c;
        this.d = b2cVar.d;
        this.e = b2cVar.e;
        this.f = b2cVar.f;
        this.g = b2cVar.g;
        this.h = b2cVar.h;
        this.i = b2cVar.i;
        this.j = b2cVar.j;
        this.k = b2cVar.k;
        this.l = b2cVar.l;
        this.m = b2cVar.m;
        this.n = b2cVar.n;
        this.o = b2cVar.o;
        this.p = b2cVar.p;
        this.q = b2cVar.q;
        this.s = b2cVar.s;
        this.t = b2cVar.t;
        this.r = b2cVar.r;
        this.u = b2cVar.u;
        this.v = b2cVar.v;
        this.w = b2cVar.w;
        this.x = b2cVar.x;
        this.y = b2cVar.y;
        this.A = b2cVar.z;
        this.B = b2cVar.A;
        this.z = b2cVar.B;
        this.C = b2cVar.C;
        this.D = b2cVar.D;
        this.E = b2cVar.E;
        this.F = b2cVar.F;
        this.G = b2cVar.G;
        this.H = to5.b(b2cVar.H);
        this.I = bp5.q(b2cVar.I);
    }

    public static c2c b(Bundle bundle) {
        boolean z;
        a2c a2cVar;
        j99 b;
        ?? obj = new Object();
        c2c c2cVar = J;
        obj.a = bundle.getInt(P, c2cVar.a);
        obj.b = bundle.getInt(Q, c2cVar.b);
        obj.c = bundle.getInt(R, c2cVar.c);
        obj.d = bundle.getInt(S, c2cVar.d);
        obj.e = bundle.getInt(T, c2cVar.e);
        obj.f = bundle.getInt(U, c2cVar.f);
        obj.g = bundle.getInt(V, c2cVar.g);
        obj.h = bundle.getInt(W, c2cVar.h);
        obj.i = bundle.getInt(X, c2cVar.i);
        int i = bundle.getInt(Y, c2cVar.j);
        obj.j = i;
        boolean z2 = true;
        if (obj.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(q0, c2cVar.k)) {
            z = true;
        } else {
            z = false;
        }
        obj.k = z;
        obj.l = bundle.getBoolean(Z, c2cVar.l);
        String[] stringArray = bundle.getStringArray(a0);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        obj.m = po5.r(stringArray);
        String[] stringArray2 = bundle.getStringArray(t0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        obj.n = po5.r(stringArray2);
        String[] stringArray3 = bundle.getStringArray(p0);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        obj.o = po5.r(stringArray3);
        obj.p = bundle.getInt(i0, c2cVar.p);
        String[] stringArray4 = bundle.getStringArray(K);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        obj.q = b2c.e(stringArray4);
        String[] stringArray5 = bundle.getStringArray(u0);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        obj.r = po5.r(stringArray5);
        obj.s = bundle.getInt(L, c2cVar.s);
        obj.t = bundle.getInt(b0, c2cVar.t);
        obj.u = bundle.getInt(c0, c2cVar.u);
        String[] stringArray6 = bundle.getStringArray(d0);
        String[] strArr6 = new String[0];
        if (stringArray6 == null) {
            stringArray6 = strArr6;
        }
        obj.v = po5.r(stringArray6);
        Bundle bundle2 = bundle.getBundle(n0);
        if (bundle2 != null) {
            uz1 uz1Var = new uz1();
            String str = a2c.e;
            a2c a2cVar2 = a2c.d;
            uz1Var.a = bundle2.getInt(str, a2cVar2.a);
            uz1Var.b = bundle2.getBoolean(a2c.f, a2cVar2.b);
            uz1Var.c = bundle2.getBoolean(a2c.g, a2cVar2.c);
            a2cVar = new a2c(uz1Var);
        } else {
            uz1 uz1Var2 = new uz1();
            a2c a2cVar3 = a2c.d;
            uz1Var2.a = bundle.getInt(k0, a2cVar3.a);
            uz1Var2.b = bundle.getBoolean(l0, a2cVar3.b);
            uz1Var2.c = bundle.getBoolean(m0, a2cVar3.c);
            a2cVar = new a2c(uz1Var2);
        }
        obj.w = a2cVar;
        obj.x = bundle.getBoolean(s0, c2cVar.x);
        String[] stringArray7 = bundle.getStringArray(M);
        String[] strArr7 = new String[0];
        if (stringArray7 == null) {
            stringArray7 = strArr7;
        }
        obj.y = b2c.e(stringArray7);
        obj.z = bundle.getInt(N, c2cVar.A);
        obj.A = (obj.y.isEmpty() && obj.z == 0 && bundle.getBoolean(r0, c2cVar.B)) ? false : false;
        obj.C = bundle.getInt(j0, c2cVar.C);
        String[] stringArray8 = bundle.getStringArray(v0);
        String[] strArr8 = new String[0];
        if (stringArray8 == null) {
            stringArray8 = strArr8;
        }
        obj.B = po5.r(stringArray8);
        obj.D = bundle.getBoolean(O, c2cVar.D);
        obj.E = bundle.getBoolean(o0, c2cVar.E);
        obj.F = bundle.getBoolean(e0, c2cVar.F);
        obj.G = bundle.getBoolean(f0, c2cVar.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0);
        if (parcelableArrayList == null) {
            b = j99.e;
        } else {
            b = e31.b(new p31((byte) 19), parcelableArrayList);
        }
        obj.H = new HashMap();
        for (int i2 = 0; i2 < b.d; i2++) {
            z1c z1cVar = (z1c) b.get(i2);
            obj.H.put(z1cVar.a, z1cVar);
        }
        int[] intArray = bundle.getIntArray(h0);
        int[] iArr = new int[0];
        if (intArray == null) {
            intArray = iArr;
        }
        obj.I = new HashSet();
        for (int i3 : intArray) {
            obj.I.add(Integer.valueOf(i3));
        }
        return new c2c(obj);
    }

    public b2c a() {
        ?? obj = new Object();
        obj.d(this);
        return obj;
    }

    public Bundle c() {
        Bundle bundle = new Bundle();
        bundle.putInt(P, this.a);
        bundle.putInt(Q, this.b);
        bundle.putInt(R, this.c);
        bundle.putInt(S, this.d);
        bundle.putInt(T, this.e);
        bundle.putInt(U, this.f);
        bundle.putInt(V, this.g);
        bundle.putInt(W, this.h);
        bundle.putInt(X, this.i);
        bundle.putInt(Y, this.j);
        bundle.putBoolean(q0, this.k);
        bundle.putBoolean(Z, this.l);
        j99 j99Var = this.m;
        bundle.putStringArray(a0, (String[]) j99Var.toArray(new String[0]));
        bundle.putStringArray(p0, (String[]) this.o.toArray(new String[0]));
        bundle.putStringArray(t0, (String[]) this.n.toArray(new String[0]));
        bundle.putInt(i0, this.p);
        bundle.putStringArray(K, (String[]) this.q.toArray(new String[0]));
        bundle.putInt(L, this.s);
        bundle.putInt(b0, this.t);
        bundle.putInt(c0, this.u);
        bundle.putStringArray(u0, (String[]) this.r.toArray(new String[0]));
        bundle.putStringArray(d0, (String[]) this.v.toArray(new String[0]));
        bundle.putBoolean(s0, this.x);
        bundle.putStringArray(M, (String[]) this.y.toArray(new String[0]));
        bundle.putInt(N, this.A);
        bundle.putBoolean(r0, this.B);
        bundle.putStringArray(v0, (String[]) this.z.toArray(new String[0]));
        bundle.putInt(j0, this.C);
        bundle.putBoolean(O, this.D);
        a2c a2cVar = this.w;
        bundle.putInt(k0, a2cVar.a);
        boolean z = a2cVar.b;
        bundle.putBoolean(l0, z);
        boolean z2 = a2cVar.c;
        bundle.putBoolean(m0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(a2c.e, a2cVar.a);
        bundle2.putBoolean(a2c.f, z);
        bundle2.putBoolean(a2c.g, z2);
        bundle.putBundle(n0, bundle2);
        bundle.putBoolean(o0, this.E);
        bundle.putBoolean(e0, this.F);
        bundle.putBoolean(f0, this.G);
        jo5<z1c> values = this.H.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (z1c z1cVar : values) {
            z1cVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(z1c.c, z1cVar.a.c());
            bundle3.putIntArray(z1c.d, ype.e(z1cVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(g0, arrayList);
        bundle.putIntArray(h0, ype.e(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                c2c c2cVar = (c2c) obj;
                if (this.a == c2cVar.a && this.b == c2cVar.b && this.c == c2cVar.c && this.d == c2cVar.d && this.e == c2cVar.e && this.f == c2cVar.f && this.g == c2cVar.g && this.h == c2cVar.h && this.l == c2cVar.l && this.i == c2cVar.i && this.j == c2cVar.j && this.k == c2cVar.k && this.m.equals(c2cVar.m) && this.n.equals(c2cVar.n) && this.o.equals(c2cVar.o) && this.p == c2cVar.p && this.q.equals(c2cVar.q) && this.s == c2cVar.s && this.t == c2cVar.t && this.r.equals(c2cVar.r) && this.u == c2cVar.u && this.v.equals(c2cVar.v) && this.w.equals(c2cVar.w) && this.x == c2cVar.x && this.z.equals(c2cVar.z) && this.y.equals(c2cVar.y) && this.A == c2cVar.A && this.B == c2cVar.B && this.C == c2cVar.C && this.D == c2cVar.D && this.E == c2cVar.E && this.F == c2cVar.F && this.G == c2cVar.G && use.b(this.H, c2cVar.H) && this.I.equals(c2cVar.I)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int hashCode = this.m.hashCode();
        int hashCode2 = this.n.hashCode();
        int hashCode3 = this.o.hashCode();
        int hashCode4 = this.q.hashCode();
        int hashCode5 = this.r.hashCode();
        int hashCode6 = this.v.hashCode();
        int hashCode7 = this.w.hashCode();
        int hashCode8 = this.y.hashCode();
        int hashCode9 = this.z.hashCode();
        int hashCode10 = this.H.hashCode();
        return this.I.hashCode() + ((hashCode10 + ((((((((((((hashCode9 + ((((((hashCode8 + ((((hashCode7 + ((hashCode6 + ((((hashCode5 + ((((((hashCode4 + ((((hashCode3 + ((hashCode2 + ((hashCode + ((((((((((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + this.e) * 31) + this.f) * 31) + this.g) * 31) + this.h) * 31) + (this.l ? 1 : 0)) * 31) + this.i) * 31) + this.j) * 31) + (this.k ? 1 : 0)) * 31)) * 31)) * 31)) * 31) + this.p) * 31)) * 31) + this.s) * 31) + this.t) * 31)) * 31) + this.u) * 31)) * 31)) * 31) + (this.x ? 1 : 0)) * 31)) * 31) + this.A) * 31) + (this.B ? 1 : 0)) * 31)) * 31) + this.C) * 31) + (this.D ? 1 : 0)) * 31) + (this.E ? 1 : 0)) * 31) + (this.F ? 1 : 0)) * 31) + (this.G ? 1 : 0)) * 31)) * 31);
    }
}
