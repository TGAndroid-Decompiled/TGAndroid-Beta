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
    public int f3988f;
    public int f3989g;
    public int h;
    public e9.n0 f3994m;
    public e9.n0 f3995n;
    public e9.n0 f3996o;
    public int f3997p;
    public e9.n0 f3998q;
    public e9.n0 f3999r;
    public int f4000s;
    public int f4001t;
    public int f4002u;
    public e9.n0 v;
    public r1 f4003w;
    public boolean f4004x;
    public e9.n0 f4005y;
    public int f4006z;
    public int f3985a = Integer.MAX_VALUE;
    public int f3986b = Integer.MAX_VALUE;
    public int f3987c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3990i = Integer.MAX_VALUE;
    public int f3991j = Integer.MAX_VALUE;
    public boolean f3992k = true;
    public boolean f3993l = true;

    public s1() {
        e9.l0 l0Var = e9.n0.f8476b;
        e9.x1 x1Var = e9.x1.e;
        this.f3994m = x1Var;
        this.f3995n = x1Var;
        this.f3996o = x1Var;
        this.f3997p = 0;
        this.f3998q = x1Var;
        this.f3999r = x1Var;
        this.f4000s = 0;
        this.f4001t = Integer.MAX_VALUE;
        this.f4002u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f4003w = r1.d;
        this.f4004x = false;
        this.f4005y = x1Var;
        this.f4006z = 0;
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
        this.H.put(q1Var.f3930a, q1Var);
    }

    public t1 b() {
        return new t1(this);
    }

    public s1 c() {
        this.H.clear();
        return this;
    }

    public final void d(t1 t1Var) {
        this.f3985a = t1Var.f4033a;
        this.f3986b = t1Var.f4034b;
        this.f3987c = t1Var.f4035c;
        this.d = t1Var.d;
        this.e = t1Var.e;
        this.f3988f = t1Var.f4036f;
        this.f3989g = t1Var.f4037g;
        this.h = t1Var.h;
        this.f3990i = t1Var.f4038i;
        this.f3991j = t1Var.f4039j;
        this.f3992k = t1Var.f4040k;
        this.f3993l = t1Var.f4041l;
        this.f3995n = t1Var.f4043n;
        this.f3994m = t1Var.f4042m;
        this.f3996o = t1Var.f4044o;
        this.f3997p = t1Var.f4045p;
        this.f3998q = t1Var.f4046q;
        this.f4000s = t1Var.f4048s;
        this.f3999r = t1Var.f4047r;
        this.f4001t = t1Var.f4049t;
        this.f4002u = t1Var.f4050u;
        this.v = t1Var.v;
        this.f4003w = t1Var.f4051w;
        this.f4004x = t1Var.f4052x;
        this.f4005y = t1Var.f4053y;
        this.f4006z = t1Var.A;
        this.A = t1Var.B;
        this.B = t1Var.f4054z;
        this.C = t1Var.C;
        this.D = t1Var.D;
        this.E = t1Var.E;
        this.F = t1Var.F;
        this.G = t1Var.G;
        this.I = new HashSet(t1Var.I);
        this.H = new HashMap(t1Var.H);
    }
}
