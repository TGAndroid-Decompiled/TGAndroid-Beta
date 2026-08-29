package bg;

import org.telegram.ui.gq0;
import org.telegram.ui.ws0;
public final class u0 implements ag.s1 {
    public final gq0 f2540a;
    public final ws0 f2541b;

    public u0(ws0 ws0Var, gq0 gq0Var) {
        this.f2541b = ws0Var;
        this.f2540a = gq0Var;
    }

    @Override
    public final void a() {
        this.f2540a.run();
    }

    @Override
    public final void b() {
        v0 v0Var = this.f2541b.T0;
        if (v0Var != null) {
            v0Var.invalidate();
        }
    }

    @Override
    public final void c() {
        ws0 ws0Var = this.f2541b;
        if (ws0Var.f2235g1) {
            ws0Var.f2235g1 = false;
            return;
        }
        ws0Var.f2247p1.b(1);
        ws0Var.q((ag.m) ag.m.f584a.get(0));
    }

    @Override
    public final boolean d() {
        boolean z10;
        ws0 ws0Var = this.f2541b;
        if (ws0Var.O0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            ws0Var.r0(null, true);
        }
        return z10;
    }

    @Override
    public final void e() {
        ws0 ws0Var = this.f2541b;
        ws0Var.B0.f617a.e();
        ws0Var.f2237h1.setViewHidden(false);
    }

    @Override
    public final void f() {
        ws0 ws0Var = this.f2541b;
        if (ws0Var.O0 != null) {
            ws0Var.r0(null, true);
        }
        ws0Var.f2237h1.setViewHidden(true);
    }
}
