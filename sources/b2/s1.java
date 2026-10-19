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
    public int f3985f;
    public int f3986g;
    public int h;
    public e9.n0 f3991m;
    public e9.n0 f3992n;
    public e9.n0 f3993o;
    public int f3994p;
    public e9.n0 f3995q;
    public e9.n0 f3996r;
    public int f3997s;
    public int f3998t;
    public int f3999u;
    public e9.n0 v;
    public r1 f4000w;
    public boolean f4001x;
    public e9.n0 f4002y;
    public int f4003z;
    public int f3982a = Integer.MAX_VALUE;
    public int f3983b = Integer.MAX_VALUE;
    public int f3984c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3987i = Integer.MAX_VALUE;
    public int f3988j = Integer.MAX_VALUE;
    public boolean f3989k = true;
    public boolean f3990l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.f8474b;
        e9.x1 x1Var = e9.x1.e;
        this.f3991m = x1Var;
        this.f3992n = x1Var;
        this.f3993o = x1Var;
        this.f3994p = 0;
        this.f3995q = x1Var;
        this.f3996r = x1Var;
        this.f3997s = 0;
        this.f3998t = Integer.MAX_VALUE;
        this.f3999u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f4000w = r1.d;
        this.f4001x = false;
        this.f4002y = x1Var;
        this.f4003z = 0;
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
        this.H.put(q1Var.f3927a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.f3982a = t1Var.f4030a;
        this.f3983b = t1Var.f4031b;
        this.f3984c = t1Var.f4032c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f3985f = t1Var.f4033f;
        this.f3986g = t1Var.f4034g;
        this.h = t1Var.h;
        this.f3987i = t1Var.f4035i;
        this.f3988j = t1Var.f4036j;
        this.f3989k = t1Var.f4037k;
        this.f3990l = t1Var.f4038l;
        this.f3992n = t1Var.f4040n;
        this.f3991m = t1Var.f4039m;
        this.f3993o = t1Var.f4041o;
        this.f3994p = t1Var.f4042p;
        this.f3995q = t1Var.f4043q;
        this.f3997s = t1Var.f4045s;
        this.f3996r = t1Var.f4044r;
        this.f3998t = t1Var.f4046t;
        this.f3999u = t1Var.f4047u;
        this.v = t1Var.v;
        this.f4000w = t1Var.f4048w;
        this.f4001x = t1Var.f4049x;
        this.f4002y = t1Var.f4050y;
        this.f4003z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.f4051z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
