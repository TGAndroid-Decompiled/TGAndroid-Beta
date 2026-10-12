package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int f3510e;
    public int f3511f;
    public int f3512g;
    public int h;
    public e9.i0 f3517m;
    public e9.i0 f3518n;
    public int f3519o;
    public e9.i0 f3520p;
    public int f3521q;
    public int f3522r;
    public int f3523s;
    public e9.i0 f3524t;
    public o1 f3525u;
    public e9.i0 v;
    public int f3526w;
    public boolean f3527x;
    public int f3528y;
    public boolean f3529z;
    public int f3507a = Integer.MAX_VALUE;
    public int f3508b = Integer.MAX_VALUE;
    public int f3509c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3513i = Integer.MAX_VALUE;
    public int f3514j = Integer.MAX_VALUE;
    public boolean f3515k = true;
    public boolean f3516l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8749b;
        e9.a1 a1Var = e9.a1.f8712e;
        this.f3517m = a1Var;
        this.f3518n = a1Var;
        this.f3519o = 0;
        this.f3520p = a1Var;
        this.f3521q = 0;
        this.f3522r = Integer.MAX_VALUE;
        this.f3523s = Integer.MAX_VALUE;
        this.f3524t = a1Var;
        this.f3525u = o1.d;
        this.v = a1Var;
        this.f3526w = 0;
        this.f3527x = true;
        this.f3528y = 0;
        this.f3529z = false;
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
            u10.b(e2.d0.Q(str));
        }
        return u10.i();
    }

    public void a(m1 m1Var) {
        this.D.put(m1Var.f3442a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3507a = q1Var.f3546a;
        this.f3508b = q1Var.f3547b;
        this.f3509c = q1Var.f3548c;
        this.d = q1Var.d;
        this.f3510e = q1Var.f3549e;
        this.f3511f = q1Var.f3550f;
        this.f3512g = q1Var.f3551g;
        this.h = q1Var.h;
        this.f3513i = q1Var.f3552i;
        this.f3514j = q1Var.f3553j;
        this.f3515k = q1Var.f3554k;
        this.f3516l = q1Var.f3555l;
        this.f3517m = q1Var.f3556m;
        this.f3518n = q1Var.f3557n;
        this.f3519o = q1Var.f3558o;
        this.f3520p = q1Var.f3559p;
        this.f3521q = q1Var.f3560q;
        this.f3522r = q1Var.f3561r;
        this.f3523s = q1Var.f3562s;
        this.f3524t = q1Var.f3563t;
        this.f3525u = q1Var.f3564u;
        this.v = q1Var.v;
        this.f3526w = q1Var.f3565w;
        this.f3527x = q1Var.f3566x;
        this.f3528y = q1Var.f3567y;
        this.f3529z = q1Var.f3568z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
