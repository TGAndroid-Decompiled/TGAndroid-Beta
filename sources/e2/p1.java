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
    public int f10460e;
    public int f10461f;
    public int f10462g;
    public int h;
    public h9.i0 f10467m;
    public h9.i0 f10468n;
    public h9.i0 f10469o;
    public int f10470p;
    public h9.i0 f10471q;
    public h9.i0 f10472r;
    public int f10473s;
    public int f10474t;
    public int f10475u;
    public h9.i0 v;
    public o1 f10476w;
    public boolean f10477x;
    public h9.i0 f10478y;
    public int f10479z;
    public int f10457a = Integer.MAX_VALUE;
    public int f10458b = Integer.MAX_VALUE;
    public int f10459c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10463i = Integer.MAX_VALUE;
    public int f10464j = Integer.MAX_VALUE;
    public boolean f10465k = true;
    public boolean f10466l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14329b;
        h9.t1 t1Var = h9.t1.f14397e;
        this.f10467m = t1Var;
        this.f10468n = t1Var;
        this.f10469o = t1Var;
        this.f10470p = 0;
        this.f10471q = t1Var;
        this.f10472r = t1Var;
        this.f10473s = 0;
        this.f10474t = Integer.MAX_VALUE;
        this.f10475u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10476w = o1.d;
        this.f10477x = false;
        this.f10478y = t1Var;
        this.f10479z = 0;
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
        this.H.put(n1Var.f10401a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10457a = q1Var.f10507a;
        this.f10458b = q1Var.f10508b;
        this.f10459c = q1Var.f10509c;
        this.d = q1Var.d;
        this.f10460e = q1Var.f10510e;
        this.f10461f = q1Var.f10511f;
        this.f10462g = q1Var.f10512g;
        this.h = q1Var.h;
        this.f10463i = q1Var.f10513i;
        this.f10464j = q1Var.f10514j;
        this.f10465k = q1Var.f10515k;
        this.f10466l = q1Var.f10516l;
        this.f10468n = q1Var.f10518n;
        this.f10467m = q1Var.f10517m;
        this.f10469o = q1Var.f10519o;
        this.f10470p = q1Var.f10520p;
        this.f10471q = q1Var.f10521q;
        this.f10473s = q1Var.f10523s;
        this.f10472r = q1Var.f10522r;
        this.f10474t = q1Var.f10524t;
        this.f10475u = q1Var.f10525u;
        this.v = q1Var.v;
        this.f10476w = q1Var.f10526w;
        this.f10477x = q1Var.f10527x;
        this.f10478y = q1Var.f10528y;
        this.f10479z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10529z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
