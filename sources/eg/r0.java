package eg;

import org.telegram.ui.mt0;
import org.telegram.ui.tq0;
public final class r0 implements dg.n1 {
    public final tq0 f5451a;
    public final mt0 f5452b;

    public r0(mt0 mt0Var, tq0 tq0Var) {
        this.f5452b = mt0Var;
        this.f5451a = tq0Var;
    }

    @Override
    public final void a() {
        this.f5451a.run();
    }

    @Override
    public final void b() {
        s0 s0Var = this.f5452b.U0;
        if (s0Var != null) {
            s0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        mt0 mt0Var = this.f5452b;
        if (mt0Var.f5114h1) {
            mt0Var.f5114h1 = false;
            return;
        }
        mt0Var.f5126q1.b(1);
        mt0Var.g((dg.m) dg.m.f4581a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        mt0 mt0Var = this.f5452b;
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
        mt0 mt0Var = this.f5452b;
        mt0Var.C0.f4556a.e();
        mt0Var.f5116i1.setViewHidden(false);
    }

    @Override
    public final void f() {
        mt0 mt0Var = this.f5452b;
        if (mt0Var.P0 != null) {
            mt0Var.r0(null, true);
        }
        mt0Var.f5116i1.setViewHidden(true);
    }
}
