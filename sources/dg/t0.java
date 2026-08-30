package dg;

import org.telegram.ui.ft0;
import org.telegram.ui.mq0;
public final class t0 implements cg.o1 {
    public final mq0 f4788a;
    public final ft0 f4789b;

    public t0(ft0 ft0Var, mq0 mq0Var) {
        this.f4789b = ft0Var;
        this.f4788a = mq0Var;
    }

    @Override
    public final void a() {
        this.f4788a.run();
    }

    @Override
    public final void b() {
        u0 u0Var = this.f4789b.U0;
        if (u0Var != null) {
            u0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ft0 ft0Var = this.f4789b;
        if (ft0Var.f4471h1) {
            ft0Var.f4471h1 = false;
            return;
        }
        ft0Var.f4483q1.b(1);
        ft0Var.x((cg.m) cg.m.f2447a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        ft0 ft0Var = this.f4789b;
        if (ft0Var.P0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            ft0Var.r0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        ft0 ft0Var = this.f4789b;
        ft0Var.C0.f2428a.e();
        ft0Var.f4473i1.setViewHidden(false);
    }

    @Override
    public final void f() {
        ft0 ft0Var = this.f4789b;
        if (ft0Var.P0 != null) {
            ft0Var.r0(null, true);
        }
        ft0Var.f4473i1.setViewHidden(true);
    }
}
