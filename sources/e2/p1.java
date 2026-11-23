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
    public int f10604e;
    public int f10605f;
    public int f10606g;
    public int h;
    public h9.i0 f10611m;
    public h9.i0 f10612n;
    public h9.i0 f10613o;
    public int f10614p;
    public h9.i0 f10615q;
    public h9.i0 f10616r;
    public int f10617s;
    public int f10618t;
    public int f10619u;
    public h9.i0 v;
    public o1 f10620w;
    public boolean f10621x;
    public h9.i0 f10622y;
    public int f10623z;
    public int f10601a = Integer.MAX_VALUE;
    public int f10602b = Integer.MAX_VALUE;
    public int f10603c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10607i = Integer.MAX_VALUE;
    public int f10608j = Integer.MAX_VALUE;
    public boolean f10609k = true;
    public boolean f10610l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f13995b;
        h9.s1 s1Var = h9.s1.f14058e;
        this.f10611m = s1Var;
        this.f10612n = s1Var;
        this.f10613o = s1Var;
        this.f10614p = 0;
        this.f10615q = s1Var;
        this.f10616r = s1Var;
        this.f10617s = 0;
        this.f10618t = Integer.MAX_VALUE;
        this.f10619u = Integer.MAX_VALUE;
        this.v = s1Var;
        this.f10620w = o1.d;
        this.f10621x = false;
        this.f10622y = s1Var;
        this.f10623z = 0;
        this.A = true;
        this.B = s1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static h9.s1 e(String[] strArr) {
        h9.f0 p10 = h9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(h2.l0.T(str));
        }
        return p10.f();
    }

    public void a(n1 n1Var) {
        this.H.put(n1Var.f10545a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10601a = q1Var.f10651a;
        this.f10602b = q1Var.f10652b;
        this.f10603c = q1Var.f10653c;
        this.d = q1Var.d;
        this.f10604e = q1Var.f10654e;
        this.f10605f = q1Var.f10655f;
        this.f10606g = q1Var.f10656g;
        this.h = q1Var.h;
        this.f10607i = q1Var.f10657i;
        this.f10608j = q1Var.f10658j;
        this.f10609k = q1Var.f10659k;
        this.f10610l = q1Var.f10660l;
        this.f10612n = q1Var.f10662n;
        this.f10611m = q1Var.f10661m;
        this.f10613o = q1Var.f10663o;
        this.f10614p = q1Var.f10664p;
        this.f10615q = q1Var.f10665q;
        this.f10617s = q1Var.f10667s;
        this.f10616r = q1Var.f10666r;
        this.f10618t = q1Var.f10668t;
        this.f10619u = q1Var.f10669u;
        this.v = q1Var.v;
        this.f10620w = q1Var.f10670w;
        this.f10621x = q1Var.f10671x;
        this.f10622y = q1Var.f10672y;
        this.f10623z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10673z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
