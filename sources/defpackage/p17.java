package defpackage;

import org.telegram.ui.ActionBar.d;
public final class p17 {
    public final d a;
    public final u17 b;

    public p17(u17 u17Var, d dVar) {
        this.b = u17Var;
        this.a = dVar;
    }

    public final void a(boolean z) {
        u17 u17Var = this.b;
        k17 k17Var = u17Var.f;
        boolean z2 = false;
        if (u17Var.getNeededLayoutManager() != u17Var.getCurrentLayoutManager() && u17Var.a()) {
            if (k17Var.N0 > 0) {
                u17Var.O = true;
                u17Var.o(false);
                return;
            }
            u17Var.b.setLayoutManager(u17Var.getNeededLayoutManager());
        }
        if (z && !u17Var.a()) {
            z = false;
        }
        if (!z || k17Var.K() > 0) {
            z2 = z;
        }
        u17Var.o(z2);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        long j;
        u17 u17Var = this.b;
        pg6 pg6Var = u17Var.K;
        if (u17Var.b.getLayoutManager() != u17Var.d && u17Var.J) {
            gm.r(pg6Var);
            if (this.a.getFragmentBeginToShow()) {
                j = 0;
            } else {
                j = 100;
            }
            gm.d3(pg6Var, j);
        }
    }
}
