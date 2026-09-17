package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int f2266e;
    public int f2267f;
    public int f2268g;
    public int h;
    public e9.i0 f2273m;
    public e9.i0 f2274n;
    public int f2275o;
    public e9.i0 f2276p;
    public int f2277q;
    public int f2278r;
    public int f2279s;
    public e9.i0 f2280t;
    public o1 f2281u;
    public e9.i0 v;
    public int f2282w;
    public boolean f2283x;
    public int f2284y;
    public boolean f2285z;
    public int f2263a = Integer.MAX_VALUE;
    public int f2264b = Integer.MAX_VALUE;
    public int f2265c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f2269i = Integer.MAX_VALUE;
    public int f2270j = Integer.MAX_VALUE;
    public boolean f2271k = true;
    public boolean f2272l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8985b;
        e9.a1 a1Var = e9.a1.f8948e;
        this.f2273m = a1Var;
        this.f2274n = a1Var;
        this.f2275o = 0;
        this.f2276p = a1Var;
        this.f2277q = 0;
        this.f2278r = Integer.MAX_VALUE;
        this.f2279s = Integer.MAX_VALUE;
        this.f2280t = a1Var;
        this.f2281u = o1.d;
        this.v = a1Var;
        this.f2282w = 0;
        this.f2283x = true;
        this.f2284y = 0;
        this.f2285z = false;
        this.A = false;
        this.B = false;
        this.C = false;
        this.D = new HashMap();
        this.E = new HashSet();
    }

    public static e9.a1 e(String[] strArr) {
        e9.f0 u10 = e9.i0.u();
        for (String str : strArr) {
            str.getClass();
            u10.b(e2.d0.R(str));
        }
        return u10.i();
    }

    public void a(m1 m1Var) {
        this.D.put(m1Var.f2198a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f2263a = q1Var.f2302a;
        this.f2264b = q1Var.f2303b;
        this.f2265c = q1Var.f2304c;
        this.d = q1Var.d;
        this.f2266e = q1Var.f2305e;
        this.f2267f = q1Var.f2306f;
        this.f2268g = q1Var.f2307g;
        this.h = q1Var.h;
        this.f2269i = q1Var.f2308i;
        this.f2270j = q1Var.f2309j;
        this.f2271k = q1Var.f2310k;
        this.f2272l = q1Var.f2311l;
        this.f2273m = q1Var.f2312m;
        this.f2274n = q1Var.f2313n;
        this.f2275o = q1Var.f2314o;
        this.f2276p = q1Var.f2315p;
        this.f2277q = q1Var.f2316q;
        this.f2278r = q1Var.f2317r;
        this.f2279s = q1Var.f2318s;
        this.f2280t = q1Var.f2319t;
        this.f2281u = q1Var.f2320u;
        this.v = q1Var.v;
        this.f2282w = q1Var.f2321w;
        this.f2283x = q1Var.f2322x;
        this.f2284y = q1Var.f2323y;
        this.f2285z = q1Var.f2324z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
