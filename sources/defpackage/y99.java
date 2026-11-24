package defpackage;

import android.content.Context;
public final class y99 implements z99 {
    public final bo1 a;
    public final c41 b;
    public final Context c;
    public final q63 d;
    public final ecc e;

    public y99(bo1 bo1Var, c41 c41Var, Context context, q63 q63Var, ecc eccVar) {
        this.a = bo1Var;
        this.b = c41Var;
        this.c = context;
        this.d = q63Var;
        this.e = eccVar;
    }

    @Override
    public final void d() {
        gm.d3(new w99(this.a, this.b, this.c, this.d, (byte) 2), 200L);
    }

    @Override
    public final void f() {
        gm.d3(new ey8(this.a, this.b, (byte) 15), 200L);
    }

    @Override
    public final void i() {
        this.e.run();
    }
}
