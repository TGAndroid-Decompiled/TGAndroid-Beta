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
    public int f3180f;
    public int f3181g;
    public int h;
    public e9.i0 f3186m;
    public e9.i0 f3187n;
    public int f3188o;
    public e9.i0 f3189p;
    public int f3190q;
    public int f3191r;
    public int f3192s;
    public e9.i0 f3193t;
    public o1 f3194u;
    public e9.i0 v;
    public int f3195w;
    public boolean f3196x;
    public int f3197y;
    public boolean f3198z;
    public int f3177a = Integer.MAX_VALUE;
    public int f3178b = Integer.MAX_VALUE;
    public int f3179c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3182i = Integer.MAX_VALUE;
    public int f3183j = Integer.MAX_VALUE;
    public boolean f3184k = true;
    public boolean f3185l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8081b;
        e9.a1 a1Var = e9.a1.e;
        this.f3186m = a1Var;
        this.f3187n = a1Var;
        this.f3188o = 0;
        this.f3189p = a1Var;
        this.f3190q = 0;
        this.f3191r = Integer.MAX_VALUE;
        this.f3192s = Integer.MAX_VALUE;
        this.f3193t = a1Var;
        this.f3194u = o1.d;
        this.v = a1Var;
        this.f3195w = 0;
        this.f3196x = true;
        this.f3197y = 0;
        this.f3198z = false;
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
        this.D.put(m1Var.f3115a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3177a = q1Var.f3215a;
        this.f3178b = q1Var.f3216b;
        this.f3179c = q1Var.f3217c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3180f = q1Var.f3218f;
        this.f3181g = q1Var.f3219g;
        this.h = q1Var.h;
        this.f3182i = q1Var.f3220i;
        this.f3183j = q1Var.f3221j;
        this.f3184k = q1Var.f3222k;
        this.f3185l = q1Var.f3223l;
        this.f3186m = q1Var.f3224m;
        this.f3187n = q1Var.f3225n;
        this.f3188o = q1Var.f3226o;
        this.f3189p = q1Var.f3227p;
        this.f3190q = q1Var.f3228q;
        this.f3191r = q1Var.f3229r;
        this.f3192s = q1Var.f3230s;
        this.f3193t = q1Var.f3231t;
        this.f3194u = q1Var.f3232u;
        this.v = q1Var.v;
        this.f3195w = q1Var.f3233w;
        this.f3196x = q1Var.f3234x;
        this.f3197y = q1Var.f3235y;
        this.f3198z = q1Var.f3236z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
