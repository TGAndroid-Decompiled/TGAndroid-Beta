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
    public int f2376f;
    public int f2377g;
    public int h;
    public e9.n0 f2382m;
    public e9.n0 f2383n;
    public e9.n0 f2384o;
    public int f2385p;
    public e9.n0 f2386q;
    public e9.n0 f2387r;
    public int f2388s;
    public int f2389t;
    public int f2390u;
    public e9.n0 v;
    public s1 f2391w;
    public boolean f2392x;
    public e9.n0 f2393y;
    public int f2394z;
    public int f2373a = Integer.MAX_VALUE;
    public int f2374b = Integer.MAX_VALUE;
    public int f2375c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f2378i = Integer.MAX_VALUE;
    public int f2379j = Integer.MAX_VALUE;
    public boolean f2380k = true;
    public boolean f2381l = true;

    public t1() {
        e9.l0 l0Var = e9.n0.f8592b;
        e9.x1 x1Var = e9.x1.e;
        this.f2382m = x1Var;
        this.f2383n = x1Var;
        this.f2384o = x1Var;
        this.f2385p = 0;
        this.f2386q = x1Var;
        this.f2387r = x1Var;
        this.f2388s = 0;
        this.f2389t = Integer.MAX_VALUE;
        this.f2390u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f2391w = s1.d;
        this.f2392x = false;
        this.f2393y = x1Var;
        this.f2394z = 0;
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

    public void a(r1 r1Var) {
        this.H.put(r1Var.f2318a, r1Var);
    }

    public u1 b() {
        return new u1(this);
    }

    public t1 c() {
        this.H.clear();
        return this;
    }

    public final void d(u1 u1Var) {
        this.f2373a = u1Var.f2421a;
        this.f2374b = u1Var.f2422b;
        this.f2375c = u1Var.f2423c;
        this.d = u1Var.d;
        this.e = u1Var.e;
        this.f2376f = u1Var.f2424f;
        this.f2377g = u1Var.f2425g;
        this.h = u1Var.h;
        this.f2378i = u1Var.f2426i;
        this.f2379j = u1Var.f2427j;
        this.f2380k = u1Var.f2428k;
        this.f2381l = u1Var.f2429l;
        this.f2383n = u1Var.f2431n;
        this.f2382m = u1Var.f2430m;
        this.f2384o = u1Var.f2432o;
        this.f2385p = u1Var.f2433p;
        this.f2386q = u1Var.f2434q;
        this.f2388s = u1Var.f2436s;
        this.f2387r = u1Var.f2435r;
        this.f2389t = u1Var.f2437t;
        this.f2390u = u1Var.f2438u;
        this.v = u1Var.v;
        this.f2391w = u1Var.f2439w;
        this.f2392x = u1Var.f2440x;
        this.f2393y = u1Var.f2441y;
        this.f2394z = u1Var.A;
        this.A = u1Var.B;
        this.B = u1Var.f2442z;
        this.C = u1Var.C;
        this.D = u1Var.D;
        this.E = u1Var.E;
        this.F = u1Var.F;
        this.G = u1Var.G;
        this.I = new HashSet(u1Var.I);
        this.H = new HashMap(u1Var.H);
    }
}
