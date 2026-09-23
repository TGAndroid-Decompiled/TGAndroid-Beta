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
    public int f3175f;
    public int f3176g;
    public int h;
    public e9.i0 f3181m;
    public e9.i0 f3182n;
    public int f3183o;
    public e9.i0 f3184p;
    public int f3185q;
    public int f3186r;
    public int f3187s;
    public e9.i0 f3188t;
    public o1 f3189u;
    public e9.i0 v;
    public int f3190w;
    public boolean f3191x;
    public int f3192y;
    public boolean f3193z;
    public int f3172a = Integer.MAX_VALUE;
    public int f3173b = Integer.MAX_VALUE;
    public int f3174c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3177i = Integer.MAX_VALUE;
    public int f3178j = Integer.MAX_VALUE;
    public boolean f3179k = true;
    public boolean f3180l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8067b;
        e9.a1 a1Var = e9.a1.e;
        this.f3181m = a1Var;
        this.f3182n = a1Var;
        this.f3183o = 0;
        this.f3184p = a1Var;
        this.f3185q = 0;
        this.f3186r = Integer.MAX_VALUE;
        this.f3187s = Integer.MAX_VALUE;
        this.f3188t = a1Var;
        this.f3189u = o1.d;
        this.v = a1Var;
        this.f3190w = 0;
        this.f3191x = true;
        this.f3192y = 0;
        this.f3193z = false;
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
        this.D.put(m1Var.f3110a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3172a = q1Var.f3210a;
        this.f3173b = q1Var.f3211b;
        this.f3174c = q1Var.f3212c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3175f = q1Var.f3213f;
        this.f3176g = q1Var.f3214g;
        this.h = q1Var.h;
        this.f3177i = q1Var.f3215i;
        this.f3178j = q1Var.f3216j;
        this.f3179k = q1Var.f3217k;
        this.f3180l = q1Var.f3218l;
        this.f3181m = q1Var.f3219m;
        this.f3182n = q1Var.f3220n;
        this.f3183o = q1Var.f3221o;
        this.f3184p = q1Var.f3222p;
        this.f3185q = q1Var.f3223q;
        this.f3186r = q1Var.f3224r;
        this.f3187s = q1Var.f3225s;
        this.f3188t = q1Var.f3226t;
        this.f3189u = q1Var.f3227u;
        this.v = q1Var.v;
        this.f3190w = q1Var.f3228w;
        this.f3191x = q1Var.f3229x;
        this.f3192y = q1Var.f3230y;
        this.f3193z = q1Var.f3231z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
