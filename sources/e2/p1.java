package e2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public h9.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int f10465e;
    public int f10466f;
    public int f10467g;
    public int h;
    public h9.i0 f10472m;
    public h9.i0 f10473n;
    public h9.i0 f10474o;
    public int f10475p;
    public h9.i0 f10476q;
    public h9.i0 f10477r;
    public int f10478s;
    public int f10479t;
    public int f10480u;
    public h9.i0 v;
    public o1 f10481w;
    public boolean f10482x;
    public h9.i0 f10483y;
    public int f10484z;
    public int f10462a = Integer.MAX_VALUE;
    public int f10463b = Integer.MAX_VALUE;
    public int f10464c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10468i = Integer.MAX_VALUE;
    public int f10469j = Integer.MAX_VALUE;
    public boolean f10470k = true;
    public boolean f10471l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14331b;
        h9.t1 t1Var = h9.t1.f14399e;
        this.f10472m = t1Var;
        this.f10473n = t1Var;
        this.f10474o = t1Var;
        this.f10475p = 0;
        this.f10476q = t1Var;
        this.f10477r = t1Var;
        this.f10478s = 0;
        this.f10479t = Integer.MAX_VALUE;
        this.f10480u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10481w = o1.d;
        this.f10482x = false;
        this.f10483y = t1Var;
        this.f10484z = 0;
        this.A = true;
        this.B = t1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static h9.t1 e(String[] strArr) {
        h9.f0 p10 = h9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(h2.m0.T(str));
        }
        return p10.f();
    }

    public void a(n1 n1Var) {
        this.H.put(n1Var.f10406a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10462a = q1Var.f10512a;
        this.f10463b = q1Var.f10513b;
        this.f10464c = q1Var.f10514c;
        this.d = q1Var.d;
        this.f10465e = q1Var.f10515e;
        this.f10466f = q1Var.f10516f;
        this.f10467g = q1Var.f10517g;
        this.h = q1Var.h;
        this.f10468i = q1Var.f10518i;
        this.f10469j = q1Var.f10519j;
        this.f10470k = q1Var.f10520k;
        this.f10471l = q1Var.f10521l;
        this.f10473n = q1Var.f10523n;
        this.f10472m = q1Var.f10522m;
        this.f10474o = q1Var.f10524o;
        this.f10475p = q1Var.f10525p;
        this.f10476q = q1Var.f10526q;
        this.f10478s = q1Var.f10528s;
        this.f10477r = q1Var.f10527r;
        this.f10479t = q1Var.f10529t;
        this.f10480u = q1Var.f10530u;
        this.v = q1Var.v;
        this.f10481w = q1Var.f10531w;
        this.f10482x = q1Var.f10532x;
        this.f10483y = q1Var.f10533y;
        this.f10484z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10534z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
