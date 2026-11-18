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
    public int f10614e;
    public int f10615f;
    public int f10616g;
    public int h;
    public h9.i0 f10621m;
    public h9.i0 f10622n;
    public h9.i0 f10623o;
    public int f10624p;
    public h9.i0 f10625q;
    public h9.i0 f10626r;
    public int f10627s;
    public int f10628t;
    public int f10629u;
    public h9.i0 v;
    public o1 f10630w;
    public boolean f10631x;
    public h9.i0 f10632y;
    public int f10633z;
    public int f10611a = Integer.MAX_VALUE;
    public int f10612b = Integer.MAX_VALUE;
    public int f10613c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10617i = Integer.MAX_VALUE;
    public int f10618j = Integer.MAX_VALUE;
    public boolean f10619k = true;
    public boolean f10620l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14006b;
        h9.t1 t1Var = h9.t1.f14074e;
        this.f10621m = t1Var;
        this.f10622n = t1Var;
        this.f10623o = t1Var;
        this.f10624p = 0;
        this.f10625q = t1Var;
        this.f10626r = t1Var;
        this.f10627s = 0;
        this.f10628t = Integer.MAX_VALUE;
        this.f10629u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10630w = o1.d;
        this.f10631x = false;
        this.f10632y = t1Var;
        this.f10633z = 0;
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
        this.H.put(n1Var.f10555a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10611a = q1Var.f10661a;
        this.f10612b = q1Var.f10662b;
        this.f10613c = q1Var.f10663c;
        this.d = q1Var.d;
        this.f10614e = q1Var.f10664e;
        this.f10615f = q1Var.f10665f;
        this.f10616g = q1Var.f10666g;
        this.h = q1Var.h;
        this.f10617i = q1Var.f10667i;
        this.f10618j = q1Var.f10668j;
        this.f10619k = q1Var.f10669k;
        this.f10620l = q1Var.f10670l;
        this.f10622n = q1Var.f10672n;
        this.f10621m = q1Var.f10671m;
        this.f10623o = q1Var.f10673o;
        this.f10624p = q1Var.f10674p;
        this.f10625q = q1Var.f10675q;
        this.f10627s = q1Var.f10677s;
        this.f10626r = q1Var.f10676r;
        this.f10628t = q1Var.f10678t;
        this.f10629u = q1Var.f10679u;
        this.v = q1Var.v;
        this.f10630w = q1Var.f10680w;
        this.f10631x = q1Var.f10681x;
        this.f10632y = q1Var.f10682y;
        this.f10633z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10683z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
