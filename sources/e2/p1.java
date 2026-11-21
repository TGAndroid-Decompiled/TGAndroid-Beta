package e2;

import java.util.HashMap;
import java.util.HashSet;
public class p1 {
    public boolean A;
    public h9.i0 B;
    public int C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public HashMap H;
    public HashSet I;
    public int f10640e;
    public int f10641f;
    public int f10642g;
    public int h;
    public h9.i0 f10647m;
    public h9.i0 f10648n;
    public h9.i0 f10649o;
    public int f10650p;
    public h9.i0 f10651q;
    public h9.i0 f10652r;
    public int f10653s;
    public int f10654t;
    public int f10655u;
    public h9.i0 v;
    public o1 f10656w;
    public boolean f10657x;
    public h9.i0 f10658y;
    public int f10659z;
    public int f10637a = Integer.MAX_VALUE;
    public int f10638b = Integer.MAX_VALUE;
    public int f10639c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10643i = Integer.MAX_VALUE;
    public int f10644j = Integer.MAX_VALUE;
    public boolean f10645k = true;
    public boolean f10646l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14032b;
        h9.t1 t1Var = h9.t1.f14100e;
        this.f10647m = t1Var;
        this.f10648n = t1Var;
        this.f10649o = t1Var;
        this.f10650p = 0;
        this.f10651q = t1Var;
        this.f10652r = t1Var;
        this.f10653s = 0;
        this.f10654t = Integer.MAX_VALUE;
        this.f10655u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10656w = o1.d;
        this.f10657x = false;
        this.f10658y = t1Var;
        this.f10659z = 0;
        this.A = true;
        this.B = t1Var;
        this.C = 0;
        this.D = false;
        this.E = false;
        this.F = false;
        this.G = false;
        this.H = new HashMap();
        this.I = new HashSet();
    }

    public static h9.t1 e(String[] strArr) {
        h9.f0 p10 = h9.i0.p();
        for (String str : strArr) {
            str.getClass();
            p10.c(h2.l0.T(str));
        }
        return p10.f();
    }

    public void a(n1 n1Var) {
        this.H.put(n1Var.f10581a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10637a = q1Var.f10687a;
        this.f10638b = q1Var.f10688b;
        this.f10639c = q1Var.f10689c;
        this.d = q1Var.d;
        this.f10640e = q1Var.f10690e;
        this.f10641f = q1Var.f10691f;
        this.f10642g = q1Var.f10692g;
        this.h = q1Var.h;
        this.f10643i = q1Var.f10693i;
        this.f10644j = q1Var.f10694j;
        this.f10645k = q1Var.f10695k;
        this.f10646l = q1Var.f10696l;
        this.f10648n = q1Var.f10698n;
        this.f10647m = q1Var.f10697m;
        this.f10649o = q1Var.f10699o;
        this.f10650p = q1Var.f10700p;
        this.f10651q = q1Var.f10701q;
        this.f10653s = q1Var.f10703s;
        this.f10652r = q1Var.f10702r;
        this.f10654t = q1Var.f10704t;
        this.f10655u = q1Var.f10705u;
        this.v = q1Var.v;
        this.f10656w = q1Var.f10706w;
        this.f10657x = q1Var.f10707x;
        this.f10658y = q1Var.f10708y;
        this.f10659z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10709z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
