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
    public int f3182f;
    public int f3183g;
    public int h;
    public e9.i0 f3188m;
    public e9.i0 f3189n;
    public int f3190o;
    public e9.i0 f3191p;
    public int f3192q;
    public int f3193r;
    public int f3194s;
    public e9.i0 f3195t;
    public o1 f3196u;
    public e9.i0 v;
    public int f3197w;
    public boolean f3198x;
    public int f3199y;
    public boolean f3200z;
    public int f3179a = Integer.MAX_VALUE;
    public int f3180b = Integer.MAX_VALUE;
    public int f3181c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3184i = Integer.MAX_VALUE;
    public int f3185j = Integer.MAX_VALUE;
    public boolean f3186k = true;
    public boolean f3187l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8083b;
        e9.a1 a1Var = e9.a1.e;
        this.f3188m = a1Var;
        this.f3189n = a1Var;
        this.f3190o = 0;
        this.f3191p = a1Var;
        this.f3192q = 0;
        this.f3193r = Integer.MAX_VALUE;
        this.f3194s = Integer.MAX_VALUE;
        this.f3195t = a1Var;
        this.f3196u = o1.d;
        this.v = a1Var;
        this.f3197w = 0;
        this.f3198x = true;
        this.f3199y = 0;
        this.f3200z = false;
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
        this.D.put(m1Var.f3117a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3179a = q1Var.f3217a;
        this.f3180b = q1Var.f3218b;
        this.f3181c = q1Var.f3219c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3182f = q1Var.f3220f;
        this.f3183g = q1Var.f3221g;
        this.h = q1Var.h;
        this.f3184i = q1Var.f3222i;
        this.f3185j = q1Var.f3223j;
        this.f3186k = q1Var.f3224k;
        this.f3187l = q1Var.f3225l;
        this.f3188m = q1Var.f3226m;
        this.f3189n = q1Var.f3227n;
        this.f3190o = q1Var.f3228o;
        this.f3191p = q1Var.f3229p;
        this.f3192q = q1Var.f3230q;
        this.f3193r = q1Var.f3231r;
        this.f3194s = q1Var.f3232s;
        this.f3195t = q1Var.f3233t;
        this.f3196u = q1Var.f3234u;
        this.v = q1Var.v;
        this.f3197w = q1Var.f3235w;
        this.f3198x = q1Var.f3236x;
        this.f3199y = q1Var.f3237y;
        this.f3200z = q1Var.f3238z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
