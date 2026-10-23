package b2;

import java.util.HashMap;
import java.util.HashSet;
public class s1 {
    public boolean A;
    public e9.n0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f3992f;
    public int f3993g;
    public int h;
    public e9.n0 f3998m;
    public e9.n0 f3999n;
    public e9.n0 f4000o;
    public int f4001p;
    public e9.n0 f4002q;
    public e9.n0 f4003r;
    public int f4004s;
    public int f4005t;
    public int f4006u;
    public e9.n0 v;
    public r1 f4007w;
    public boolean f4008x;
    public e9.n0 f4009y;
    public int f4010z;
    public int f3989a = Integer.MAX_VALUE;
    public int f3990b = Integer.MAX_VALUE;
    public int f3991c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3994i = Integer.MAX_VALUE;
    public int f3995j = Integer.MAX_VALUE;
    public boolean f3996k = true;
    public boolean f3997l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.f8481b;
        e9.x1 x1Var = e9.x1.e;
        this.f3998m = x1Var;
        this.f3999n = x1Var;
        this.f4000o = x1Var;
        this.f4001p = 0;
        this.f4002q = x1Var;
        this.f4003r = x1Var;
        this.f4004s = 0;
        this.f4005t = Integer.MAX_VALUE;
        this.f4006u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f4007w = r1.d;
        this.f4008x = false;
        this.f4009y = x1Var;
        this.f4010z = 0;
        this.A = true;
        this.B = x1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static e9.x1 e(String[] strArr) {
        e9.k0 t10 = e9.n0.t();
        for (String str : strArr) {
            str.getClass();
            t10.c(e2.m0.T(str));
        }
        return t10.f();
    }

    public void a(q1 q1Var) {
        this.H.put(q1Var.f3934a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.f3989a = t1Var.f4037a;
        this.f3990b = t1Var.f4038b;
        this.f3991c = t1Var.f4039c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f3992f = t1Var.f4040f;
        this.f3993g = t1Var.f4041g;
        this.h = t1Var.h;
        this.f3994i = t1Var.f4042i;
        this.f3995j = t1Var.f4043j;
        this.f3996k = t1Var.f4044k;
        this.f3997l = t1Var.f4045l;
        this.f3999n = t1Var.f4047n;
        this.f3998m = t1Var.f4046m;
        this.f4000o = t1Var.f4048o;
        this.f4001p = t1Var.f4049p;
        this.f4002q = t1Var.f4050q;
        this.f4004s = t1Var.f4052s;
        this.f4003r = t1Var.f4051r;
        this.f4005t = t1Var.f4053t;
        this.f4006u = t1Var.f4054u;
        this.v = t1Var.v;
        this.f4007w = t1Var.f4055w;
        this.f4008x = t1Var.f4056x;
        this.f4009y = t1Var.f4057y;
        this.f4010z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.f4058z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
