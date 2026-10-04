package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int f3433e;
    public int f3434f;
    public int f3435g;
    public int h;
    public e9.i0 f3440m;
    public e9.i0 f3441n;
    public int f3442o;
    public e9.i0 f3443p;
    public int f3444q;
    public int f3445r;
    public int f3446s;
    public e9.i0 f3447t;
    public o1 f3448u;
    public e9.i0 v;
    public int f3449w;
    public boolean f3450x;
    public int f3451y;
    public boolean f3452z;
    public int f3430a = Integer.MAX_VALUE;
    public int f3431b = Integer.MAX_VALUE;
    public int f3432c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3436i = Integer.MAX_VALUE;
    public int f3437j = Integer.MAX_VALUE;
    public boolean f3438k = true;
    public boolean f3439l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8757b;
        e9.a1 a1Var = e9.a1.f8720e;
        this.f3440m = a1Var;
        this.f3441n = a1Var;
        this.f3442o = 0;
        this.f3443p = a1Var;
        this.f3444q = 0;
        this.f3445r = Integer.MAX_VALUE;
        this.f3446s = Integer.MAX_VALUE;
        this.f3447t = a1Var;
        this.f3448u = o1.d;
        this.v = a1Var;
        this.f3449w = 0;
        this.f3450x = true;
        this.f3451y = 0;
        this.f3452z = false;
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
        this.D.put(m1Var.f3365a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3430a = q1Var.f3469a;
        this.f3431b = q1Var.f3470b;
        this.f3432c = q1Var.f3471c;
        this.d = q1Var.d;
        this.f3433e = q1Var.f3472e;
        this.f3434f = q1Var.f3473f;
        this.f3435g = q1Var.f3474g;
        this.h = q1Var.h;
        this.f3436i = q1Var.f3475i;
        this.f3437j = q1Var.f3476j;
        this.f3438k = q1Var.f3477k;
        this.f3439l = q1Var.f3478l;
        this.f3440m = q1Var.f3479m;
        this.f3441n = q1Var.f3480n;
        this.f3442o = q1Var.f3481o;
        this.f3443p = q1Var.f3482p;
        this.f3444q = q1Var.f3483q;
        this.f3445r = q1Var.f3484r;
        this.f3446s = q1Var.f3485s;
        this.f3447t = q1Var.f3486t;
        this.f3448u = q1Var.f3487u;
        this.v = q1Var.v;
        this.f3449w = q1Var.f3488w;
        this.f3450x = q1Var.f3489x;
        this.f3451y = q1Var.f3490y;
        this.f3452z = q1Var.f3491z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
