package defpackage;

import org.telegram.ui.ActionBar.e;
public final class w17 {
    public final e a;
    public final b27 b;

    public w17(b27 b27Var, e eVar) {
        this.b = b27Var;
        this.a = eVar;
    }

    public final void a(boolean z) {
        b27 b27Var = this.b;
        r17 r17Var = b27Var.f;
        boolean z2 = false;
        if (b27Var.getNeededLayoutManager() != b27Var.getCurrentLayoutManager() && b27Var.a()) {
            if (r17Var.N0 > 0) {
                b27Var.O = true;
                b27Var.o(false);
                return;
            }
            b27Var.b.setLayoutManager(b27Var.getNeededLayoutManager());
        }
        if (z && !b27Var.a()) {
            z = false;
        }
        if (!z || r17Var.K() > 0) {
            z2 = z;
        }
        b27Var.o(z2);
    }

    public final void b(boolean z) {
        this.b.l(z);
    }

    public final void c() {
        long j;
        b27 b27Var = this.b;
        z96 z96Var = b27Var.K;
        if (b27Var.b.getLayoutManager() != b27Var.d && b27Var.J) {
            hl.r(z96Var);
            if (this.a.getFragmentBeginToShow()) {
                j = 0;
            } else {
                j = 100;
            }
            hl.d3(z96Var, j);
        }
    }
}
