package dg;

import org.telegram.ui.mt0;
import org.telegram.ui.tq0;
public final class t0 implements cg.o1 {
    public final tq0 f4794a;
    public final mt0 f4795b;

    public t0(mt0 mt0Var, tq0 tq0Var) {
        this.f4795b = mt0Var;
        this.f4794a = tq0Var;
    }

    @Override
    public final void a() {
        this.f4794a.run();
    }

    @Override
    public final void b() {
        u0 u0Var = this.f4795b.U0;
        if (u0Var != null) {
            u0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        mt0 mt0Var = this.f4795b;
        if (mt0Var.f4477h1) {
            mt0Var.f4477h1 = false;
            return;
        }
        mt0Var.f4489q1.b(1);
        mt0Var.x((cg.m) cg.m.f2430a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        mt0 mt0Var = this.f4795b;
        if (mt0Var.P0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            mt0Var.r0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        mt0 mt0Var = this.f4795b;
        mt0Var.C0.f2411a.g();
        mt0Var.f4479i1.setViewHidden(false);
    }

    @Override
    public final void f() {
        mt0 mt0Var = this.f4795b;
        if (mt0Var.P0 != null) {
            mt0Var.r0(null, true);
        }
        mt0Var.f4479i1.setViewHidden(true);
    }
}
