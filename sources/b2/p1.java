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
    public int f3178f;
    public int f3179g;
    public int h;
    public e9.i0 f3184m;
    public e9.i0 f3185n;
    public int f3186o;
    public e9.i0 f3187p;
    public int f3188q;
    public int f3189r;
    public int f3190s;
    public e9.i0 f3191t;
    public o1 f3192u;
    public e9.i0 v;
    public int f3193w;
    public boolean f3194x;
    public int f3195y;
    public boolean f3196z;
    public int f3175a = Integer.MAX_VALUE;
    public int f3176b = Integer.MAX_VALUE;
    public int f3177c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3180i = Integer.MAX_VALUE;
    public int f3181j = Integer.MAX_VALUE;
    public boolean f3182k = true;
    public boolean f3183l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8079b;
        e9.a1 a1Var = e9.a1.e;
        this.f3184m = a1Var;
        this.f3185n = a1Var;
        this.f3186o = 0;
        this.f3187p = a1Var;
        this.f3188q = 0;
        this.f3189r = Integer.MAX_VALUE;
        this.f3190s = Integer.MAX_VALUE;
        this.f3191t = a1Var;
        this.f3192u = o1.d;
        this.v = a1Var;
        this.f3193w = 0;
        this.f3194x = true;
        this.f3195y = 0;
        this.f3196z = false;
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
        this.D.put(m1Var.f3113a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3175a = q1Var.f3213a;
        this.f3176b = q1Var.f3214b;
        this.f3177c = q1Var.f3215c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3178f = q1Var.f3216f;
        this.f3179g = q1Var.f3217g;
        this.h = q1Var.h;
        this.f3180i = q1Var.f3218i;
        this.f3181j = q1Var.f3219j;
        this.f3182k = q1Var.f3220k;
        this.f3183l = q1Var.f3221l;
        this.f3184m = q1Var.f3222m;
        this.f3185n = q1Var.f3223n;
        this.f3186o = q1Var.f3224o;
        this.f3187p = q1Var.f3225p;
        this.f3188q = q1Var.f3226q;
        this.f3189r = q1Var.f3227r;
        this.f3190s = q1Var.f3228s;
        this.f3191t = q1Var.f3229t;
        this.f3192u = q1Var.f3230u;
        this.v = q1Var.v;
        this.f3193w = q1Var.f3231w;
        this.f3194x = q1Var.f3232x;
        this.f3195y = q1Var.f3233y;
        this.f3196z = q1Var.f3234z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
