package d2;

import java.util.HashMap;
import java.util.HashSet;
public class r1 {
    public boolean A;
    public g9.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int f8343e;
    public int f8344f;
    public int f8345g;
    public int h;
    public g9.i0 f8350m;
    public g9.i0 f8351n;
    public g9.i0 f8352o;
    public int f8353p;
    public g9.i0 f8354q;
    public g9.i0 f8355r;
    public int f8356s;
    public int f8357t;
    public int f8358u;
    public g9.i0 v;
    public q1 f8359w;
    public boolean f8360x;
    public g9.i0 f8361y;
    public int f8362z;
    public int f8340a = Integer.MAX_VALUE;
    public int f8341b = Integer.MAX_VALUE;
    public int f8342c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f8346i = Integer.MAX_VALUE;
    public int f8347j = Integer.MAX_VALUE;
    public boolean f8348k = true;
    public boolean f8349l = true;

    public r1() {
        g9.g0 g0Var = g9.i0.f12083b;
        g9.s1 s1Var = g9.s1.f12146e;
        this.f8350m = s1Var;
        this.f8351n = s1Var;
        this.f8352o = s1Var;
        this.f8353p = 0;
        this.f8354q = s1Var;
        this.f8355r = s1Var;
        this.f8356s = 0;
        this.f8357t = Integer.MAX_VALUE;
        this.f8358u = Integer.MAX_VALUE;
        this.v = s1Var;
        this.f8359w = q1.d;
        this.f8360x = false;
        this.f8361y = s1Var;
        this.f8362z = 0;
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

    public static g9.s1 e(String[] strArr) {
        g9.f0 p10 = g9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(g2.n0.T(str));
        }
        return p10.f();
    }

    public void a(p1 p1Var) {
        this.H.put(p1Var.f8284a, p1Var);
    }

    public s1 b() {
        return new s1(this);
    }

    public r1 c() {
        this.H.clear();
        return this;
    }

    public final void d(s1 s1Var) {
        this.f8340a = s1Var.f8389a;
        this.f8341b = s1Var.f8390b;
        this.f8342c = s1Var.f8391c;
        this.d = s1Var.d;
        this.f8343e = s1Var.f8392e;
        this.f8344f = s1Var.f8393f;
        this.f8345g = s1Var.f8394g;
        this.h = s1Var.h;
        this.f8346i = s1Var.f8395i;
        this.f8347j = s1Var.f8396j;
        this.f8348k = s1Var.f8397k;
        this.f8349l = s1Var.f8398l;
        this.f8351n = s1Var.f8400n;
        this.f8350m = s1Var.f8399m;
        this.f8352o = s1Var.f8401o;
        this.f8353p = s1Var.f8402p;
        this.f8354q = s1Var.f8403q;
        this.f8356s = s1Var.f8405s;
        this.f8355r = s1Var.f8404r;
        this.f8357t = s1Var.f8406t;
        this.f8358u = s1Var.f8407u;
        this.v = s1Var.v;
        this.f8359w = s1Var.f8408w;
        this.f8360x = s1Var.f8409x;
        this.f8361y = s1Var.f8410y;
        this.f8362z = s1Var.A;
        this.A = s1Var.B;
        this.B = s1Var.f8411z;
        this.C = s1Var.C;
        this.D = s1Var.D;
        this.E = s1Var.E;
        this.F = s1Var.F;
        this.G = s1Var.G;
        this.I = new HashSet(s1Var.I);
        this.H = new HashMap(s1Var.H);
    }
}
