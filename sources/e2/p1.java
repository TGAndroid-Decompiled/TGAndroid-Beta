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
    public int f10643e;
    public int f10644f;
    public int f10645g;
    public int h;
    public h9.i0 f10650m;
    public h9.i0 f10651n;
    public h9.i0 f10652o;
    public int f10653p;
    public h9.i0 f10654q;
    public h9.i0 f10655r;
    public int f10656s;
    public int f10657t;
    public int f10658u;
    public h9.i0 v;
    public o1 f10659w;
    public boolean f10660x;
    public h9.i0 f10661y;
    public int f10662z;
    public int f10640a = Integer.MAX_VALUE;
    public int f10641b = Integer.MAX_VALUE;
    public int f10642c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int f10646i = Integer.MAX_VALUE;
    public int f10647j = Integer.MAX_VALUE;
    public boolean f10648k = true;
    public boolean f10649l = true;

    public p1() {
        h9.g0 g0Var = h9.i0.f14035b;
        h9.t1 t1Var = h9.t1.f14103e;
        this.f10650m = t1Var;
        this.f10651n = t1Var;
        this.f10652o = t1Var;
        this.f10653p = 0;
        this.f10654q = t1Var;
        this.f10655r = t1Var;
        this.f10656s = 0;
        this.f10657t = Integer.MAX_VALUE;
        this.f10658u = Integer.MAX_VALUE;
        this.v = t1Var;
        this.f10659w = o1.d;
        this.f10660x = false;
        this.f10661y = t1Var;
        this.f10662z = 0;
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
        this.H.put(n1Var.f10584a, n1Var);
    }

    public q1 b() {
        return new q1(this);
    }

    public p1 c() {
        this.H.clear();
        return this;
    }

    public final void d(q1 q1Var) {
        this.f10640a = q1Var.f10690a;
        this.f10641b = q1Var.f10691b;
        this.f10642c = q1Var.f10692c;
        this.d = q1Var.d;
        this.f10643e = q1Var.f10693e;
        this.f10644f = q1Var.f10694f;
        this.f10645g = q1Var.f10695g;
        this.h = q1Var.h;
        this.f10646i = q1Var.f10696i;
        this.f10647j = q1Var.f10697j;
        this.f10648k = q1Var.f10698k;
        this.f10649l = q1Var.f10699l;
        this.f10651n = q1Var.f10701n;
        this.f10650m = q1Var.f10700m;
        this.f10652o = q1Var.f10702o;
        this.f10653p = q1Var.f10703p;
        this.f10654q = q1Var.f10704q;
        this.f10656s = q1Var.f10706s;
        this.f10655r = q1Var.f10705r;
        this.f10657t = q1Var.f10707t;
        this.f10658u = q1Var.f10708u;
        this.v = q1Var.v;
        this.f10659w = q1Var.f10709w;
        this.f10660x = q1Var.f10710x;
        this.f10661y = q1Var.f10711y;
        this.f10662z = q1Var.A;
        this.A = q1Var.B;
        this.B = q1Var.f10712z;
        this.C = q1Var.C;
        this.D = q1Var.D;
        this.E = q1Var.E;
        this.F = q1Var.F;
        this.G = q1Var.G;
        this.I = new HashSet(q1Var.I);
        this.H = new HashMap(q1Var.H);
    }
}
