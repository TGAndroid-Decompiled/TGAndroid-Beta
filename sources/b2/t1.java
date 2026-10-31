package b2;

import java.util.HashMap;
import java.util.HashSet;
public class t1 {
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
    public int f2280f;
    public int f2281g;
    public int h;
    public e9.n0 f2286m;
    public e9.n0 f2287n;
    public e9.n0 f2288o;
    public int f2289p;
    public e9.n0 f2290q;
    public e9.n0 f2291r;
    public int f2292s;
    public int f2293t;
    public int f2294u;
    public e9.n0 v;
    public s1 f2295w;
    public boolean f2296x;
    public e9.n0 f2297y;
    public int f2298z;
    public int f2277a = Integer.MAX_VALUE;
    public int f2278b = Integer.MAX_VALUE;
    public int f2279c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f2282i = Integer.MAX_VALUE;
    public int f2283j = Integer.MAX_VALUE;
    public boolean f2284k = true;
    public boolean f2285l = true;

    public t1() {
        e9.l0 l0Var = e9.n0.f6390b;
        e9.x1 x1Var = e9.x1.e;
        this.f2286m = x1Var;
        this.f2287n = x1Var;
        this.f2288o = x1Var;
        this.f2289p = 0;
        this.f2290q = x1Var;
        this.f2291r = x1Var;
        this.f2292s = 0;
        this.f2293t = Integer.MAX_VALUE;
        this.f2294u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f2295w = s1.d;
        this.f2296x = false;
        this.f2297y = x1Var;
        this.f2298z = 0;
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
            t10.c(e2.l0.T(str));
        }
        return t10.f();
    }

    public void a(q1 q1Var) {
        this.H.put(q1Var.f2196a, q1Var);
    }

    public u1 b() {
        return new u1(this);
    }

    public t1 c() {
        this.H.clear();
        return this;
    }

    public final void d(u1 u1Var) {
        this.f2277a = u1Var.f2325a;
        this.f2278b = u1Var.f2326b;
        this.f2279c = u1Var.f2327c;
        this.d = u1Var.d;
        this.e = u1Var.e;
        this.f2280f = u1Var.f2328f;
        this.f2281g = u1Var.f2329g;
        this.h = u1Var.h;
        this.f2282i = u1Var.f2330i;
        this.f2283j = u1Var.f2331j;
        this.f2284k = u1Var.f2332k;
        this.f2285l = u1Var.f2333l;
        this.f2287n = u1Var.f2335n;
        this.f2286m = u1Var.f2334m;
        this.f2288o = u1Var.f2336o;
        this.f2289p = u1Var.f2337p;
        this.f2290q = u1Var.f2338q;
        this.f2292s = u1Var.f2340s;
        this.f2291r = u1Var.f2339r;
        this.f2293t = u1Var.f2341t;
        this.f2294u = u1Var.f2342u;
        this.v = u1Var.v;
        this.f2295w = u1Var.f2343w;
        this.f2296x = u1Var.f2344x;
        this.f2297y = u1Var.f2345y;
        this.f2298z = u1Var.A;
        this.A = u1Var.B;
        this.B = u1Var.f2346z;
        this.C = u1Var.C;
        this.D = u1Var.D;
        this.E = u1Var.E;
        this.F = u1Var.F;
        this.G = u1Var.G;
        this.I = new HashSet(u1Var.I);
        this.H = new HashMap(u1Var.H);
    }
}
