package defpackage;

import org.telegram.ui.ActionBar.d;
public final class pz6 {
    public final d a;
    public final uz6 b;

    public pz6(uz6 uz6Var, d dVar) {
        this.b = uz6Var;
        this.a = dVar;
    }

    public final void a(boolean z) {
        uz6 uz6Var = this.b;
        kz6 kz6Var = uz6Var.f;
        boolean z2 = false;
        if (uz6Var.getNeededLayoutManager() != uz6Var.getCurrentLayoutManager() && uz6Var.a()) {
            if (kz6Var.N0 > 0) {
                uz6Var.O = true;
                uz6Var.o(false);
                return;
            }
            uz6Var.b.setLayoutManager(uz6Var.getNeededLayoutManager());
        }
        if (z && !uz6Var.a()) {
            z = false;
        }
        if (!z || kz6Var.K() > 0) {
            z2 = z;
        }
        uz6Var.o(z2);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        long j;
        uz6 uz6Var = this.b;
        vl6 vl6Var = uz6Var.K;
        if (uz6Var.b.getLayoutManager() != uz6Var.d && uz6Var.J) {
            gl.r(vl6Var);
            if (this.a.getFragmentBeginToShow()) {
                j = 0;
            } else {
                j = 100;
            }
            gl.d3(vl6Var, j);
        }
    }
}
