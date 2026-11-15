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
    public int f10296e;
    public int f10297f;
    public int f10298g;
    public int h;
    public h9.i0 f10303m;
    public h9.i0 f10304n;
    public h9.i0 f10305o;
    public int f10306p;
    public h9.i0 f10307q;
    public h9.i0 f10308r;
    public int f10309s;
    public int f10310t;
    public int f10311u;
    public h9.i0 v;
    public o1 f10312w;
    public boolean f10313x;
    public h9.i0 f10314y;
    public int f10315z;
    public int f10293a = Integer.MAX_VALUE;
    public int f10294b = Integer.MAX_VALUE;
    public int f10295c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10299i = Integer.MAX_VALUE;
    public int f10300j = Integer.MAX_VALUE;
    public boolean f10301k = true;
    public boolean f10302l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f13686b;
        h9.s1 s1Var = h9.s1.f13749e;
        this.f10303m = s1Var;
        this.f10304n = s1Var;
        this.f10305o = s1Var;
        this.f10306p = 0;
        this.f10307q = s1Var;
        this.f10308r = s1Var;
        this.f10309s = 0;
        this.f10310t = Integer.MAX_VALUE;
        this.f10311u = Integer.MAX_VALUE;
        this.v = s1Var;
        this.f10312w = o1.d;
        this.f10313x = false;
        this.f10314y = s1Var;
        this.f10315z = 0;
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
        this.H.put(n1Var.f10237a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10293a = q1Var.f10343a;
        this.f10294b = q1Var.f10344b;
        this.f10295c = q1Var.f10345c;
        this.d = q1Var.d;
        this.f10296e = q1Var.f10346e;
        this.f10297f = q1Var.f10347f;
        this.f10298g = q1Var.f10348g;
        this.h = q1Var.h;
        this.f10299i = q1Var.f10349i;
        this.f10300j = q1Var.f10350j;
        this.f10301k = q1Var.f10351k;
        this.f10302l = q1Var.f10352l;
        this.f10304n = q1Var.f10354n;
        this.f10303m = q1Var.f10353m;
        this.f10305o = q1Var.f10355o;
        this.f10306p = q1Var.f10356p;
        this.f10307q = q1Var.f10357q;
        this.f10309s = q1Var.f10359s;
        this.f10308r = q1Var.f10358r;
        this.f10310t = q1Var.f10360t;
        this.f10311u = q1Var.f10361u;
        this.v = q1Var.v;
        this.f10312w = q1Var.f10362w;
        this.f10313x = q1Var.f10363x;
        this.f10314y = q1Var.f10364y;
        this.f10315z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10365z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
