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
    public int f3989f;
    public int f3990g;
    public int h;
    public e9.n0 f3995m;
    public e9.n0 f3996n;
    public e9.n0 f3997o;
    public int f3998p;
    public e9.n0 f3999q;
    public e9.n0 f4000r;
    public int f4001s;
    public int f4002t;
    public int f4003u;
    public e9.n0 v;
    public r1 f4004w;
    public boolean f4005x;
    public e9.n0 f4006y;
    public int f4007z;
    public int f3986a = Integer.MAX_VALUE;
    public int f3987b = Integer.MAX_VALUE;
    public int f3988c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3991i = Integer.MAX_VALUE;
    public int f3992j = Integer.MAX_VALUE;
    public boolean f3993k = true;
    public boolean f3994l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.f8475b;
        e9.x1 x1Var = e9.x1.e;
        this.f3995m = x1Var;
        this.f3996n = x1Var;
        this.f3997o = x1Var;
        this.f3998p = 0;
        this.f3999q = x1Var;
        this.f4000r = x1Var;
        this.f4001s = 0;
        this.f4002t = Integer.MAX_VALUE;
        this.f4003u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f4004w = r1.d;
        this.f4005x = false;
        this.f4006y = x1Var;
        this.f4007z = 0;
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
        this.H.put(q1Var.f3931a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.f3986a = t1Var.f4034a;
        this.f3987b = t1Var.f4035b;
        this.f3988c = t1Var.f4036c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f3989f = t1Var.f4037f;
        this.f3990g = t1Var.f4038g;
        this.h = t1Var.h;
        this.f3991i = t1Var.f4039i;
        this.f3992j = t1Var.f4040j;
        this.f3993k = t1Var.f4041k;
        this.f3994l = t1Var.f4042l;
        this.f3996n = t1Var.f4044n;
        this.f3995m = t1Var.f4043m;
        this.f3997o = t1Var.f4045o;
        this.f3998p = t1Var.f4046p;
        this.f3999q = t1Var.f4047q;
        this.f4001s = t1Var.f4049s;
        this.f4000r = t1Var.f4048r;
        this.f4002t = t1Var.f4050t;
        this.f4003u = t1Var.f4051u;
        this.v = t1Var.v;
        this.f4004w = t1Var.f4052w;
        this.f4005x = t1Var.f4053x;
        this.f4006y = t1Var.f4054y;
        this.f4007z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.f4055z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
