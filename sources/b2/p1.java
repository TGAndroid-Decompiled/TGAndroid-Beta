package b2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public HashMap D;
    public HashSet E;
    public int f3512e;
    public int f3513f;
    public int f3514g;
    public int h;
    public e9.i0 f3519m;
    public e9.i0 f3520n;
    public int f3521o;
    public e9.i0 f3522p;
    public int f3523q;
    public int f3524r;
    public int f3525s;
    public e9.i0 f3526t;
    public o1 f3527u;
    public e9.i0 v;
    public int f3528w;
    public boolean f3529x;
    public int f3530y;
    public boolean f3531z;
    public int f3509a = Integer.MAX_VALUE;
    public int f3510b = Integer.MAX_VALUE;
    public int f3511c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3515i = Integer.MAX_VALUE;
    public int f3516j = Integer.MAX_VALUE;
    public boolean f3517k = true;
    public boolean f3518l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8751b;
        e9.a1 a1Var = e9.a1.f8714e;
        this.f3519m = a1Var;
        this.f3520n = a1Var;
        this.f3521o = 0;
        this.f3522p = a1Var;
        this.f3523q = 0;
        this.f3524r = Integer.MAX_VALUE;
        this.f3525s = Integer.MAX_VALUE;
        this.f3526t = a1Var;
        this.f3527u = o1.d;
        this.v = a1Var;
        this.f3528w = 0;
        this.f3529x = true;
        this.f3530y = 0;
        this.f3531z = false;
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
        this.D.put(m1Var.f3444a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3509a = q1Var.f3548a;
        this.f3510b = q1Var.f3549b;
        this.f3511c = q1Var.f3550c;
        this.d = q1Var.d;
        this.f3512e = q1Var.f3551e;
        this.f3513f = q1Var.f3552f;
        this.f3514g = q1Var.f3553g;
        this.h = q1Var.h;
        this.f3515i = q1Var.f3554i;
        this.f3516j = q1Var.f3555j;
        this.f3517k = q1Var.f3556k;
        this.f3518l = q1Var.f3557l;
        this.f3519m = q1Var.f3558m;
        this.f3520n = q1Var.f3559n;
        this.f3521o = q1Var.f3560o;
        this.f3522p = q1Var.f3561p;
        this.f3523q = q1Var.f3562q;
        this.f3524r = q1Var.f3563r;
        this.f3525s = q1Var.f3564s;
        this.f3526t = q1Var.f3565t;
        this.f3527u = q1Var.f3566u;
        this.v = q1Var.v;
        this.f3528w = q1Var.f3567w;
        this.f3529x = q1Var.f3568x;
        this.f3530y = q1Var.f3569y;
        this.f3531z = q1Var.f3570z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
