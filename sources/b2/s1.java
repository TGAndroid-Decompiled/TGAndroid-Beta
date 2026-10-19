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
    public int f3987f;
    public int f3988g;
    public int h;
    public e9.n0 f3993m;
    public e9.n0 f3994n;
    public e9.n0 f3995o;
    public int f3996p;
    public e9.n0 f3997q;
    public e9.n0 f3998r;
    public int f3999s;
    public int f4000t;
    public int f4001u;
    public e9.n0 v;
    public r1 f4002w;
    public boolean f4003x;
    public e9.n0 f4004y;
    public int f4005z;
    public int f3984a = Integer.MAX_VALUE;
    public int f3985b = Integer.MAX_VALUE;
    public int f3986c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3989i = Integer.MAX_VALUE;
    public int f3990j = Integer.MAX_VALUE;
    public boolean f3991k = true;
    public boolean f3992l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.f8476b;
        e9.x1 x1Var = e9.x1.e;
        this.f3993m = x1Var;
        this.f3994n = x1Var;
        this.f3995o = x1Var;
        this.f3996p = 0;
        this.f3997q = x1Var;
        this.f3998r = x1Var;
        this.f3999s = 0;
        this.f4000t = Integer.MAX_VALUE;
        this.f4001u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f4002w = r1.d;
        this.f4003x = false;
        this.f4004y = x1Var;
        this.f4005z = 0;
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
        this.H.put(q1Var.f3929a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.f3984a = t1Var.f4032a;
        this.f3985b = t1Var.f4033b;
        this.f3986c = t1Var.f4034c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f3987f = t1Var.f4035f;
        this.f3988g = t1Var.f4036g;
        this.h = t1Var.h;
        this.f3989i = t1Var.f4037i;
        this.f3990j = t1Var.f4038j;
        this.f3991k = t1Var.f4039k;
        this.f3992l = t1Var.f4040l;
        this.f3994n = t1Var.f4042n;
        this.f3993m = t1Var.f4041m;
        this.f3995o = t1Var.f4043o;
        this.f3996p = t1Var.f4044p;
        this.f3997q = t1Var.f4045q;
        this.f3999s = t1Var.f4047s;
        this.f3998r = t1Var.f4046r;
        this.f4000t = t1Var.f4048t;
        this.f4001u = t1Var.f4049u;
        this.v = t1Var.v;
        this.f4002w = t1Var.f4050w;
        this.f4003x = t1Var.f4051x;
        this.f4004y = t1Var.f4052y;
        this.f4005z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.f4053z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
