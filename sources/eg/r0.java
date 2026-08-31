package eg;

import org.telegram.ui.ht0;
import org.telegram.ui.oq0;
public final class r0 implements dg.n1 {
    public final oq0 f5451a;
    public final ht0 f5452b;

    public r0(ht0 ht0Var, oq0 oq0Var) {
        this.f5452b = ht0Var;
        this.f5451a = oq0Var;
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
        ht0 ht0Var = this.f5452b;
        if (ht0Var.f5114h1) {
            ht0Var.f5114h1 = false;
            return;
        }
        ht0Var.f5126q1.b(1);
        ht0Var.g((dg.m) dg.m.f4581a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z4;
        ht0 ht0Var = this.f5452b;
        if (ht0Var.P0 == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (!z4) {
            ht0Var.r0(null, true);
        }
        return z4;
    }

    @Override
    public final void e() {
        ht0 ht0Var = this.f5452b;
        ht0Var.C0.f4556a.e();
        ht0Var.f5116i1.setViewHidden(false);
    }

    @Override
    public final void f() {
        ht0 ht0Var = this.f5452b;
        if (ht0Var.P0 != null) {
            ht0Var.r0(null, true);
        }
        ht0Var.f5116i1.setViewHidden(true);
    }
}
