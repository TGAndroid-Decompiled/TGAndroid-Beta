package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
public class byb {
    public static final byb J = new byb(new ayb());
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
    public final qm5 H;
    public final ym5 I;
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
    public final w59 m;
    public final w59 n;
    public final w59 o;
    public final int p;
    public final w59 q;
    public final w59 r;
    public final int s;
    public final int t;
    public final int u;
    public final w59 v;
    public final zxb w;
    public final boolean x;
    public final w59 y;
    public final w59 z;

    static {
        String str = g8c.a;
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

    public byb(ayb aybVar) {
        this.a = aybVar.a;
        this.b = aybVar.b;
        this.c = aybVar.c;
        this.d = aybVar.d;
        this.e = aybVar.e;
        this.f = aybVar.f;
        this.g = aybVar.g;
        this.h = aybVar.h;
        this.i = aybVar.i;
        this.j = aybVar.j;
        this.k = aybVar.k;
        this.l = aybVar.l;
        this.m = aybVar.m;
        this.n = aybVar.n;
        this.o = aybVar.o;
        this.p = aybVar.p;
        this.q = aybVar.q;
        this.s = aybVar.s;
        this.t = aybVar.t;
        this.r = aybVar.r;
        this.u = aybVar.u;
        this.v = aybVar.v;
        this.w = aybVar.w;
        this.x = aybVar.x;
        this.y = aybVar.y;
        this.A = aybVar.z;
        this.B = aybVar.A;
        this.z = aybVar.B;
        this.C = aybVar.C;
        this.D = aybVar.D;
        this.E = aybVar.E;
        this.F = aybVar.F;
        this.G = aybVar.G;
        this.H = qm5.b(aybVar.H);
        this.I = ym5.q(aybVar.I);
    }

    public static byb b(Bundle bundle) {
        boolean z;
        zxb zxbVar;
        w59 b;
        ?? obj = new Object();
        byb bybVar = J;
        obj.a = bundle.getInt(P, bybVar.a);
        obj.b = bundle.getInt(Q, bybVar.b);
        obj.c = bundle.getInt(R, bybVar.c);
        obj.d = bundle.getInt(S, bybVar.d);
        obj.e = bundle.getInt(T, bybVar.e);
        obj.f = bundle.getInt(U, bybVar.f);
        obj.g = bundle.getInt(V, bybVar.g);
        obj.h = bundle.getInt(W, bybVar.h);
        obj.i = bundle.getInt(X, bybVar.i);
        int i = bundle.getInt(Y, bybVar.j);
        obj.j = i;
        boolean z2 = true;
        if (obj.i == Integer.MAX_VALUE && i == Integer.MAX_VALUE && bundle.getBoolean(q0, bybVar.k)) {
            z = true;
        } else {
            z = false;
        }
        obj.k = z;
        obj.l = bundle.getBoolean(Z, bybVar.l);
        String[] stringArray = bundle.getStringArray(a0);
        String[] strArr = new String[0];
        if (stringArray == null) {
            stringArray = strArr;
        }
        obj.m = mm5.r(stringArray);
        String[] stringArray2 = bundle.getStringArray(t0);
        String[] strArr2 = new String[0];
        if (stringArray2 == null) {
            stringArray2 = strArr2;
        }
        obj.n = mm5.r(stringArray2);
        String[] stringArray3 = bundle.getStringArray(p0);
        String[] strArr3 = new String[0];
        if (stringArray3 == null) {
            stringArray3 = strArr3;
        }
        obj.o = mm5.r(stringArray3);
        obj.p = bundle.getInt(i0, bybVar.p);
        String[] stringArray4 = bundle.getStringArray(K);
        String[] strArr4 = new String[0];
        if (stringArray4 == null) {
            stringArray4 = strArr4;
        }
        obj.q = ayb.e(stringArray4);
        String[] stringArray5 = bundle.getStringArray(u0);
        String[] strArr5 = new String[0];
        if (stringArray5 == null) {
            stringArray5 = strArr5;
        }
        obj.r = mm5.r(stringArray5);
        obj.s = bundle.getInt(L, bybVar.s);
        obj.t = bundle.getInt(b0, bybVar.t);
        obj.u = bundle.getInt(c0, bybVar.u);
        String[] stringArray6 = bundle.getStringArray(d0);
        String[] strArr6 = new String[0];
        if (stringArray6 == null) {
            stringArray6 = strArr6;
        }
        obj.v = mm5.r(stringArray6);
        Bundle bundle2 = bundle.getBundle(n0);
        if (bundle2 != null) {
            cz1 cz1Var = new cz1();
            String str = zxb.e;
            zxb zxbVar2 = zxb.d;
            cz1Var.a = bundle2.getInt(str, zxbVar2.a);
            cz1Var.b = bundle2.getBoolean(zxb.f, zxbVar2.b);
            cz1Var.c = bundle2.getBoolean(zxb.g, zxbVar2.c);
            zxbVar = new zxb(cz1Var);
        } else {
            cz1 cz1Var2 = new cz1();
            zxb zxbVar3 = zxb.d;
            cz1Var2.a = bundle.getInt(k0, zxbVar3.a);
            cz1Var2.b = bundle.getBoolean(l0, zxbVar3.b);
            cz1Var2.c = bundle.getBoolean(m0, zxbVar3.c);
            zxbVar = new zxb(cz1Var2);
        }
        obj.w = zxbVar;
        obj.x = bundle.getBoolean(s0, bybVar.x);
        String[] stringArray7 = bundle.getStringArray(M);
        String[] strArr7 = new String[0];
        if (stringArray7 == null) {
            stringArray7 = strArr7;
        }
        obj.y = ayb.e(stringArray7);
        obj.z = bundle.getInt(N, bybVar.A);
        obj.A = (obj.y.isEmpty() && obj.z == 0 && bundle.getBoolean(r0, bybVar.B)) ? false : false;
        obj.C = bundle.getInt(j0, bybVar.C);
        String[] stringArray8 = bundle.getStringArray(v0);
        String[] strArr8 = new String[0];
        if (stringArray8 == null) {
            stringArray8 = strArr8;
        }
        obj.B = mm5.r(stringArray8);
        obj.D = bundle.getBoolean(O, bybVar.D);
        obj.E = bundle.getBoolean(o0, bybVar.E);
        obj.F = bundle.getBoolean(e0, bybVar.F);
        obj.G = bundle.getBoolean(f0, bybVar.G);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(g0);
        if (parcelableArrayList == null) {
            b = w59.e;
        } else {
            b = v21.b(new g31((byte) 19), parcelableArrayList);
        }
        obj.H = new HashMap();
        for (int i2 = 0; i2 < b.d; i2++) {
            yxb yxbVar = (yxb) b.get(i2);
            obj.H.put(yxbVar.a, yxbVar);
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
        return new byb(obj);
    }

    public ayb a() {
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
        w59 w59Var = this.m;
        bundle.putStringArray(a0, (String[]) w59Var.toArray(new String[0]));
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
        zxb zxbVar = this.w;
        bundle.putInt(k0, zxbVar.a);
        boolean z = zxbVar.b;
        bundle.putBoolean(l0, z);
        boolean z2 = zxbVar.c;
        bundle.putBoolean(m0, z2);
        Bundle bundle2 = new Bundle();
        bundle2.putInt(zxb.e, zxbVar.a);
        bundle2.putBoolean(zxb.f, z);
        bundle2.putBoolean(zxb.g, z2);
        bundle.putBundle(n0, bundle2);
        bundle.putBoolean(o0, this.E);
        bundle.putBoolean(e0, this.F);
        bundle.putBoolean(f0, this.G);
        gm5<yxb> values = this.H.values();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(values.size());
        for (yxb yxbVar : values) {
            yxbVar.getClass();
            Bundle bundle3 = new Bundle();
            bundle3.putBundle(yxb.c, yxbVar.a.c());
            bundle3.putIntArray(yxb.d, gle.e(yxbVar.b));
            arrayList.add(bundle3);
        }
        bundle.putParcelableArrayList(g0, arrayList);
        bundle.putIntArray(h0, gle.e(this.I));
        return bundle;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                byb bybVar = (byb) obj;
                if (this.a == bybVar.a && this.b == bybVar.b && this.c == bybVar.c && this.d == bybVar.d && this.e == bybVar.e && this.f == bybVar.f && this.g == bybVar.g && this.h == bybVar.h && this.l == bybVar.l && this.i == bybVar.i && this.j == bybVar.j && this.k == bybVar.k && this.m.equals(bybVar.m) && this.n.equals(bybVar.n) && this.o.equals(bybVar.o) && this.p == bybVar.p && this.q.equals(bybVar.q) && this.s == bybVar.s && this.t == bybVar.t && this.r.equals(bybVar.r) && this.u == bybVar.u && this.v.equals(bybVar.v) && this.w.equals(bybVar.w) && this.x == bybVar.x && this.z.equals(bybVar.z) && this.y.equals(bybVar.y) && this.A == bybVar.A && this.B == bybVar.B && this.C == bybVar.C && this.D == bybVar.D && this.E == bybVar.E && this.F == bybVar.F && this.G == bybVar.G && coe.b(this.H, bybVar.H) && this.I.equals(bybVar.I)) {
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
