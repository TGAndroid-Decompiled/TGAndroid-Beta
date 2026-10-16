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
    public int f2380f;
    public int f2381g;
    public int h;
    public e9.n0 f2386m;
    public e9.n0 f2387n;
    public e9.n0 f2388o;
    public int f2389p;
    public e9.n0 f2390q;
    public e9.n0 f2391r;
    public int f2392s;
    public int f2393t;
    public int f2394u;
    public e9.n0 v;
    public s1 f2395w;
    public boolean f2396x;
    public e9.n0 f2397y;
    public int f2398z;
    public int f2377a = Integer.MAX_VALUE;
    public int f2378b = Integer.MAX_VALUE;
    public int f2379c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f2382i = Integer.MAX_VALUE;
    public int f2383j = Integer.MAX_VALUE;
    public boolean f2384k = true;
    public boolean f2385l = true;

    public t1() {
        e9.l0 l0Var = e9.n0.f8595b;
        e9.x1 x1Var = e9.x1.e;
        this.f2386m = x1Var;
        this.f2387n = x1Var;
        this.f2388o = x1Var;
        this.f2389p = 0;
        this.f2390q = x1Var;
        this.f2391r = x1Var;
        this.f2392s = 0;
        this.f2393t = Integer.MAX_VALUE;
        this.f2394u = Integer.MAX_VALUE;
        this.v = x1Var;
        this.f2395w = s1.d;
        this.f2396x = false;
        this.f2397y = x1Var;
        this.f2398z = 0;
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
        this.H.put(r1Var.f2322a, r1Var);
    }

    public u1 b() {
        return new u1(this);
    }

    public t1 c() {
        this.H.clear();
        return this;
    }

    public final void d(u1 u1Var) {
        this.f2377a = u1Var.f2425a;
        this.f2378b = u1Var.f2426b;
        this.f2379c = u1Var.f2427c;
        this.d = u1Var.d;
        this.e = u1Var.e;
        this.f2380f = u1Var.f2428f;
        this.f2381g = u1Var.f2429g;
        this.h = u1Var.h;
        this.f2382i = u1Var.f2430i;
        this.f2383j = u1Var.f2431j;
        this.f2384k = u1Var.f2432k;
        this.f2385l = u1Var.f2433l;
        this.f2387n = u1Var.f2435n;
        this.f2386m = u1Var.f2434m;
        this.f2388o = u1Var.f2436o;
        this.f2389p = u1Var.f2437p;
        this.f2390q = u1Var.f2438q;
        this.f2392s = u1Var.f2440s;
        this.f2391r = u1Var.f2439r;
        this.f2393t = u1Var.f2441t;
        this.f2394u = u1Var.f2442u;
        this.v = u1Var.v;
        this.f2395w = u1Var.f2443w;
        this.f2396x = u1Var.f2444x;
        this.f2397y = u1Var.f2445y;
        this.f2398z = u1Var.A;
        this.A = u1Var.B;
        this.B = u1Var.f2446z;
        this.C = u1Var.C;
        this.D = u1Var.D;
        this.E = u1Var.E;
        this.F = u1Var.F;
        this.G = u1Var.G;
        this.I = new HashSet(u1Var.I);
        this.H = new HashMap(u1Var.H);
    }
}
