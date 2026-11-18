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
    public int f10611e;
    public int f10612f;
    public int f10613g;
    public int h;
    public h9.i0 f10618m;
    public h9.i0 f10619n;
    public h9.i0 f10620o;
    public int f10621p;
    public h9.i0 f10622q;
    public h9.i0 f10623r;
    public int f10624s;
    public int f10625t;
    public int f10626u;
    public h9.i0 v;
    public o1 f10627w;
    public boolean f10628x;
    public h9.i0 f10629y;
    public int f10630z;
    public int f10608a = Integer.MAX_VALUE;
    public int f10609b = Integer.MAX_VALUE;
    public int f10610c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10614i = Integer.MAX_VALUE;
    public int f10615j = Integer.MAX_VALUE;
    public boolean f10616k = true;
    public boolean f10617l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14003b;
        h9.t1 t1Var = h9.t1.f14071e;
        this.f10618m = t1Var;
        this.f10619n = t1Var;
        this.f10620o = t1Var;
        this.f10621p = 0;
        this.f10622q = t1Var;
        this.f10623r = t1Var;
        this.f10624s = 0;
        this.f10625t = Integer.MAX_VALUE;
        this.f10626u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10627w = o1.d;
        this.f10628x = false;
        this.f10629y = t1Var;
        this.f10630z = 0;
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
        this.H.put(n1Var.f10552a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10608a = q1Var.f10658a;
        this.f10609b = q1Var.f10659b;
        this.f10610c = q1Var.f10660c;
        this.d = q1Var.d;
        this.f10611e = q1Var.f10661e;
        this.f10612f = q1Var.f10662f;
        this.f10613g = q1Var.f10663g;
        this.h = q1Var.h;
        this.f10614i = q1Var.f10664i;
        this.f10615j = q1Var.f10665j;
        this.f10616k = q1Var.f10666k;
        this.f10617l = q1Var.f10667l;
        this.f10619n = q1Var.f10669n;
        this.f10618m = q1Var.f10668m;
        this.f10620o = q1Var.f10670o;
        this.f10621p = q1Var.f10671p;
        this.f10622q = q1Var.f10672q;
        this.f10624s = q1Var.f10674s;
        this.f10623r = q1Var.f10673r;
        this.f10625t = q1Var.f10675t;
        this.f10626u = q1Var.f10676u;
        this.v = q1Var.v;
        this.f10627w = q1Var.f10677w;
        this.f10628x = q1Var.f10678x;
        this.f10629y = q1Var.f10679y;
        this.f10630z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10680z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
