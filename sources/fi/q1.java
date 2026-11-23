package fi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.x60;
public final class q1 implements View.OnLongClickListener {
    public final int f12455a;
    public final z3 f12456b;

    public q1(z3 z3Var, int i7) {
        this.f12455a = i7;
        this.f12456b = z3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12455a;
        boolean z10 = false;
        z3 z3Var = this.f12456b;
        switch (i7) {
            case 0:
                if (z3Var.B0(true)) {
                    return false;
                }
                x60 G = x60.G(z3Var.f12878t0.f12007w, z3Var.f12849l0, view);
                G.c(2131232121, gd.N0(2131748617, null), new r1(z3Var, 6), false);
                if (z3Var.f12889v3 > 0) {
                    z10 = true;
                }
                G.l(2131231790, gd.N0(2131748616, null), new r1(z3Var, 7), z10);
                G.W(5);
                G.X = true;
                G.a0();
                return true;
            default:
                z3Var.f12886v0.k(z3Var.B0(false));
                return true;
        }
    }
}
