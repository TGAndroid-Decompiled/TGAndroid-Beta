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
    public int f3183f;
    public int f3184g;
    public int h;
    public e9.i0 f3189m;
    public e9.i0 f3190n;
    public int f3191o;
    public e9.i0 f3192p;
    public int f3193q;
    public int f3194r;
    public int f3195s;
    public e9.i0 f3196t;
    public o1 f3197u;
    public e9.i0 v;
    public int f3198w;
    public boolean f3199x;
    public int f3200y;
    public boolean f3201z;
    public int f3180a = Integer.MAX_VALUE;
    public int f3181b = Integer.MAX_VALUE;
    public int f3182c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3185i = Integer.MAX_VALUE;
    public int f3186j = Integer.MAX_VALUE;
    public boolean f3187k = true;
    public boolean f3188l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8083b;
        e9.a1 a1Var = e9.a1.e;
        this.f3189m = a1Var;
        this.f3190n = a1Var;
        this.f3191o = 0;
        this.f3192p = a1Var;
        this.f3193q = 0;
        this.f3194r = Integer.MAX_VALUE;
        this.f3195s = Integer.MAX_VALUE;
        this.f3196t = a1Var;
        this.f3197u = o1.d;
        this.v = a1Var;
        this.f3198w = 0;
        this.f3199x = true;
        this.f3200y = 0;
        this.f3201z = false;
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
        this.D.put(m1Var.f3118a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3180a = q1Var.f3218a;
        this.f3181b = q1Var.f3219b;
        this.f3182c = q1Var.f3220c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3183f = q1Var.f3221f;
        this.f3184g = q1Var.f3222g;
        this.h = q1Var.h;
        this.f3185i = q1Var.f3223i;
        this.f3186j = q1Var.f3224j;
        this.f3187k = q1Var.f3225k;
        this.f3188l = q1Var.f3226l;
        this.f3189m = q1Var.f3227m;
        this.f3190n = q1Var.f3228n;
        this.f3191o = q1Var.f3229o;
        this.f3192p = q1Var.f3230p;
        this.f3193q = q1Var.f3231q;
        this.f3194r = q1Var.f3232r;
        this.f3195s = q1Var.f3233s;
        this.f3196t = q1Var.f3234t;
        this.f3197u = q1Var.f3235u;
        this.v = q1Var.v;
        this.f3198w = q1Var.f3236w;
        this.f3199x = q1Var.f3237x;
        this.f3200y = q1Var.f3238y;
        this.f3201z = q1Var.f3239z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
