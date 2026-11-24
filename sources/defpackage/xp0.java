package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
public final class xp0 {
    public final RectF a = new RectF();
    public final ln b;
    public final ln c;
    public final ln d;
    public final ln e;
    public final km f;
    public final km g;
    public final ln h;
    public final ln i;
    public final u51 j;
    public final Paint k;
    public final ho l;
    public int m;
    public final fg0 n;
    public final wi2 o;
    public final ef1 p;

    public xp0(zp0 zp0Var) {
        d53 d53Var = d53.h;
        this.b = new ln(zp0Var, 0L, 320L, d53Var);
        this.c = new ln(zp0Var, 0L, 320L, d53Var);
        this.d = new ln(zp0Var, 0L, 320L, d53Var);
        this.e = new ln(zp0Var, 0L, 320L, d53Var);
        this.f = new km(zp0Var, 320L, d53Var, 0);
        this.g = new km(zp0Var, 320L, d53Var, 0);
        this.h = new ln(zp0Var, 0L, 320L, d53Var);
        this.i = new ln(zp0Var, 0L, 320L, d53Var);
        this.j = new u51(zp0Var);
        this.k = new Paint(1);
        ho hoVar = new ho(true, false, true);
        this.l = hoVar;
        fg0 Y = cmb.Y(0, 9, 9);
        this.n = Y;
        wi2 wi2Var = new wi2(-1);
        this.o = wi2Var;
        ef1 ef1Var = new ef1();
        this.p = ef1Var;
        hoVar.b = 17;
        hoVar.w(gm.L(14.0f));
        hoVar.x(gm.o());
        hoVar.N = gm.q.x << 2;
        hoVar.q(true);
        hoVar.setCallback(zp0Var);
        wi2Var.setCallback(zp0Var);
        Y.setCallback(zp0Var);
        ef1Var.l = true;
        ef1Var.m = 2.0f;
    }
}
