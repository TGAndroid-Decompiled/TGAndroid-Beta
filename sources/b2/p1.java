package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int f2239e;
    public int f2240f;
    public int f2241g;
    public int h;
    public e9.i0 f2246m;
    public e9.i0 f2247n;
    public int f2248o;
    public e9.i0 f2249p;
    public int f2250q;
    public int f2251r;
    public int f2252s;
    public e9.i0 f2253t;
    public o1 f2254u;
    public e9.i0 v;
    public int f2255w;
    public boolean f2256x;
    public int f2257y;
    public boolean f2258z;
    public int f2236a = Integer.MAX_VALUE;
    public int f2237b = Integer.MAX_VALUE;
    public int f2238c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f2242i = Integer.MAX_VALUE;
    public int f2243j = Integer.MAX_VALUE;
    public boolean f2244k = true;
    public boolean f2245l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8957b;
        e9.a1 a1Var = e9.a1.f8920e;
        this.f2246m = a1Var;
        this.f2247n = a1Var;
        this.f2248o = 0;
        this.f2249p = a1Var;
        this.f2250q = 0;
        this.f2251r = Integer.MAX_VALUE;
        this.f2252s = Integer.MAX_VALUE;
        this.f2253t = a1Var;
        this.f2254u = o1.d;
        this.v = a1Var;
        this.f2255w = 0;
        this.f2256x = true;
        this.f2257y = 0;
        this.f2258z = false;
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
        this.D.put(m1Var.f2171a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f2236a = q1Var.f2275a;
        this.f2237b = q1Var.f2276b;
        this.f2238c = q1Var.f2277c;
        this.d = q1Var.d;
        this.f2239e = q1Var.f2278e;
        this.f2240f = q1Var.f2279f;
        this.f2241g = q1Var.f2280g;
        this.h = q1Var.h;
        this.f2242i = q1Var.f2281i;
        this.f2243j = q1Var.f2282j;
        this.f2244k = q1Var.f2283k;
        this.f2245l = q1Var.f2284l;
        this.f2246m = q1Var.f2285m;
        this.f2247n = q1Var.f2286n;
        this.f2248o = q1Var.f2287o;
        this.f2249p = q1Var.f2288p;
        this.f2250q = q1Var.f2289q;
        this.f2251r = q1Var.f2290r;
        this.f2252s = q1Var.f2291s;
        this.f2253t = q1Var.f2292t;
        this.f2254u = q1Var.f2293u;
        this.v = q1Var.v;
        this.f2255w = q1Var.f2294w;
        this.f2256x = q1Var.f2295x;
        this.f2257y = q1Var.f2296y;
        this.f2258z = q1Var.f2297z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
