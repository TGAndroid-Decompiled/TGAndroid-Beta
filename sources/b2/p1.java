package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int e;
    public int f1876f;
    public int f1877g;
    public int h;
    public e9.i0 f1882m;
    public e9.i0 f1883n;
    public int f1884o;
    public e9.i0 f1885p;
    public int f1886q;
    public int f1887r;
    public int f1888s;
    public e9.i0 f1889t;
    public o1 f1890u;
    public e9.i0 v;
    public int f1891w;
    public boolean f1892x;
    public int f1893y;
    public boolean f1894z;
    public int f1873a = Integer.MAX_VALUE;
    public int f1874b = Integer.MAX_VALUE;
    public int f1875c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f1878i = Integer.MAX_VALUE;
    public int f1879j = Integer.MAX_VALUE;
    public boolean f1880k = true;
    public boolean f1881l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f7384b;
        e9.a1 a1Var = e9.a1.e;
        this.f1882m = a1Var;
        this.f1883n = a1Var;
        this.f1884o = 0;
        this.f1885p = a1Var;
        this.f1886q = 0;
        this.f1887r = Integer.MAX_VALUE;
        this.f1888s = Integer.MAX_VALUE;
        this.f1889t = a1Var;
        this.f1890u = o1.d;
        this.v = a1Var;
        this.f1891w = 0;
        this.f1892x = true;
        this.f1893y = 0;
        this.f1894z = false;
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
        this.D.put(m1Var.f1811a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f1873a = q1Var.f1911a;
        this.f1874b = q1Var.f1912b;
        this.f1875c = q1Var.f1913c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f1876f = q1Var.f1914f;
        this.f1877g = q1Var.f1915g;
        this.h = q1Var.h;
        this.f1878i = q1Var.f1916i;
        this.f1879j = q1Var.f1917j;
        this.f1880k = q1Var.f1918k;
        this.f1881l = q1Var.f1919l;
        this.f1882m = q1Var.f1920m;
        this.f1883n = q1Var.f1921n;
        this.f1884o = q1Var.f1922o;
        this.f1885p = q1Var.f1923p;
        this.f1886q = q1Var.f1924q;
        this.f1887r = q1Var.f1925r;
        this.f1888s = q1Var.f1926s;
        this.f1889t = q1Var.f1927t;
        this.f1890u = q1Var.f1928u;
        this.v = q1Var.v;
        this.f1891w = q1Var.f1929w;
        this.f1892x = q1Var.f1930x;
        this.f1893y = q1Var.f1931y;
        this.f1894z = q1Var.f1932z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
