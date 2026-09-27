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
    public int f3177f;
    public int f3178g;
    public int h;
    public e9.i0 f3183m;
    public e9.i0 f3184n;
    public int f3185o;
    public e9.i0 f3186p;
    public int f3187q;
    public int f3188r;
    public int f3189s;
    public e9.i0 f3190t;
    public o1 f3191u;
    public e9.i0 v;
    public int f3192w;
    public boolean f3193x;
    public int f3194y;
    public boolean f3195z;
    public int f3174a = Integer.MAX_VALUE;
    public int f3175b = Integer.MAX_VALUE;
    public int f3176c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f3179i = Integer.MAX_VALUE;
    public int f3180j = Integer.MAX_VALUE;
    public boolean f3181k = true;
    public boolean f3182l = true;

    public p1() {
        e9.g0 g0Var = e9.i0.f8068b;
        e9.a1 a1Var = e9.a1.e;
        this.f3183m = a1Var;
        this.f3184n = a1Var;
        this.f3185o = 0;
        this.f3186p = a1Var;
        this.f3187q = 0;
        this.f3188r = Integer.MAX_VALUE;
        this.f3189s = Integer.MAX_VALUE;
        this.f3190t = a1Var;
        this.f3191u = o1.d;
        this.v = a1Var;
        this.f3192w = 0;
        this.f3193x = true;
        this.f3194y = 0;
        this.f3195z = false;
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
        this.D.put(m1Var.f3112a, m1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.D.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f3174a = q1Var.f3212a;
        this.f3175b = q1Var.f3213b;
        this.f3176c = q1Var.f3214c;
        this.d = q1Var.d;
        this.e = q1Var.e;
        this.f3177f = q1Var.f3215f;
        this.f3178g = q1Var.f3216g;
        this.h = q1Var.h;
        this.f3179i = q1Var.f3217i;
        this.f3180j = q1Var.f3218j;
        this.f3181k = q1Var.f3219k;
        this.f3182l = q1Var.f3220l;
        this.f3183m = q1Var.f3221m;
        this.f3184n = q1Var.f3222n;
        this.f3185o = q1Var.f3223o;
        this.f3186p = q1Var.f3224p;
        this.f3187q = q1Var.f3225q;
        this.f3188r = q1Var.f3226r;
        this.f3189s = q1Var.f3227s;
        this.f3190t = q1Var.f3228t;
        this.f3191u = q1Var.f3229u;
        this.v = q1Var.v;
        this.f3192w = q1Var.f3230w;
        this.f3193x = q1Var.f3231x;
        this.f3194y = q1Var.f3232y;
        this.f3195z = q1Var.f3233z;
        this.A = q1Var.A;
        this.B = q1Var.B;
        this.C = q1Var.C;
        this.E = new HashSet(q1Var.E);
        this.D = new HashMap(q1Var.D);
    }
}
