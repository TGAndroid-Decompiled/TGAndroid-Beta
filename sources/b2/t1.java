package b2;

import java.util.HashMap;
import java.util.HashSet;
public class t1 {
    public boolean A;
    public f9.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int e;
    public int f3443f;
    public int f3444g;
    public int h;
    public f9.i0 f3449m;
    public f9.i0 f3450n;
    public f9.i0 f3451o;
    public int f3452p;
    public f9.i0 f3453q;
    public f9.i0 f3454r;
    public int f3455s;
    public int f3456t;
    public int f3457u;
    public f9.i0 v;
    public s1 f3458w;
    public boolean f3459x;
    public f9.i0 f3460y;
    public int f3461z;
    public int f3440a = Integer.MAX_VALUE;
    public int f3441b = Integer.MAX_VALUE;
    public int f3442c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3445i = Integer.MAX_VALUE;
    public int f3446j = Integer.MAX_VALUE;
    public boolean f3447k = true;
    public boolean f3448l = true;

    public t1() {
        f9.g0 g0Var = f9.i0.f10287b;
        f9.s1 s1Var = f9.s1.e;
        this.f3449m = s1Var;
        this.f3450n = s1Var;
        this.f3451o = s1Var;
        this.f3452p = 0;
        this.f3453q = s1Var;
        this.f3454r = s1Var;
        this.f3455s = 0;
        this.f3456t = Integer.MAX_VALUE;
        this.f3457u = Integer.MAX_VALUE;
        this.v = s1Var;
        this.f3458w = s1.d;
        this.f3459x = false;
        this.f3460y = s1Var;
        this.f3461z = 0;
        this.A = true;
        this.B = s1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static f9.s1 e(String[] strArr) {
        f9.f0 t10 = f9.i0.t();
        for (String str : strArr) {
            str.getClass();
            t10.c(e2.n0.T(str));
        }
        return t10.f();
    }

    public void a(r1 r1Var) {
        this.H.put(r1Var.f3385a, r1Var);
    }

    public u1 b() {
        return new u1(this);
    }

    public t1 c() {
        this.H.clear();
        return this;
    }

    public final void d(u1 u1Var) {
        this.f3440a = u1Var.f3488a;
        this.f3441b = u1Var.f3489b;
        this.f3442c = u1Var.f3490c;
        this.d = u1Var.d;
        this.e = u1Var.e;
        this.f3443f = u1Var.f3491f;
        this.f3444g = u1Var.f3492g;
        this.h = u1Var.h;
        this.f3445i = u1Var.f3493i;
        this.f3446j = u1Var.f3494j;
        this.f3447k = u1Var.f3495k;
        this.f3448l = u1Var.f3496l;
        this.f3450n = u1Var.f3498n;
        this.f3449m = u1Var.f3497m;
        this.f3451o = u1Var.f3499o;
        this.f3452p = u1Var.f3500p;
        this.f3453q = u1Var.f3501q;
        this.f3455s = u1Var.f3503s;
        this.f3454r = u1Var.f3502r;
        this.f3456t = u1Var.f3504t;
        this.f3457u = u1Var.f3505u;
        this.v = u1Var.v;
        this.f3458w = u1Var.f3506w;
        this.f3459x = u1Var.f3507x;
        this.f3460y = u1Var.f3508y;
        this.f3461z = u1Var.A;
        this.A = u1Var.B;
        this.B = u1Var.f3509z;
        this.C = u1Var.C;
        this.D = u1Var.D;
        this.E = u1Var.E;
        this.F = u1Var.F;
        this.G = u1Var.G;
        this.I = new HashSet(u1Var.I);
        this.H = new HashMap(u1Var.H);
    }
}
