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
    public int f10606e;
    public int f10607f;
    public int f10608g;
    public int h;
    public h9.i0 f10613m;
    public h9.i0 f10614n;
    public h9.i0 f10615o;
    public int f10616p;
    public h9.i0 f10617q;
    public h9.i0 f10618r;
    public int f10619s;
    public int f10620t;
    public int f10621u;
    public h9.i0 v;
    public o1 f10622w;
    public boolean f10623x;
    public h9.i0 f10624y;
    public int f10625z;
    public int f10603a = Integer.MAX_VALUE;
    public int f10604b = Integer.MAX_VALUE;
    public int f10605c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10609i = Integer.MAX_VALUE;
    public int f10610j = Integer.MAX_VALUE;
    public boolean f10611k = true;
    public boolean f10612l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f13998b;
        h9.t1 t1Var = h9.t1.f14066e;
        this.f10613m = t1Var;
        this.f10614n = t1Var;
        this.f10615o = t1Var;
        this.f10616p = 0;
        this.f10617q = t1Var;
        this.f10618r = t1Var;
        this.f10619s = 0;
        this.f10620t = Integer.MAX_VALUE;
        this.f10621u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10622w = o1.d;
        this.f10623x = false;
        this.f10624y = t1Var;
        this.f10625z = 0;
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
            p10.c(h2.l0.T(str));
        }
        return p10.f();
    }

    public void a(n1 n1Var) {
        this.H.put(n1Var.f10547a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10603a = q1Var.f10653a;
        this.f10604b = q1Var.f10654b;
        this.f10605c = q1Var.f10655c;
        this.d = q1Var.d;
        this.f10606e = q1Var.f10656e;
        this.f10607f = q1Var.f10657f;
        this.f10608g = q1Var.f10658g;
        this.h = q1Var.h;
        this.f10609i = q1Var.f10659i;
        this.f10610j = q1Var.f10660j;
        this.f10611k = q1Var.f10661k;
        this.f10612l = q1Var.f10662l;
        this.f10614n = q1Var.f10664n;
        this.f10613m = q1Var.f10663m;
        this.f10615o = q1Var.f10665o;
        this.f10616p = q1Var.f10666p;
        this.f10617q = q1Var.f10667q;
        this.f10619s = q1Var.f10669s;
        this.f10618r = q1Var.f10668r;
        this.f10620t = q1Var.f10670t;
        this.f10621u = q1Var.f10671u;
        this.v = q1Var.v;
        this.f10622w = q1Var.f10672w;
        this.f10623x = q1Var.f10673x;
        this.f10624y = q1Var.f10674y;
        this.f10625z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10675z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
