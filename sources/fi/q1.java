package fi;

import android.view.View;
import org.telegram.messenger.gd;
import org.telegram.ui.Components.y60;
public final class q1 implements View.OnLongClickListener {
    public final int f12453a;
    public final z3 f12454b;

    public q1(z3 z3Var, int i7) {
        this.f12453a = i7;
        this.f12454b = z3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12453a;
        boolean z10 = false;
        z3 z3Var = this.f12454b;
        switch (i7) {
            case 0:
                if (z3Var.B0(true)) {
                    return false;
                }
                y60 G = y60.G(z3Var.f12875t0.f12004w, z3Var.f12846l0, view);
                G.c(2131232118, gd.M0(2131748618, null), new r1(z3Var, 6), false);
                if (z3Var.f12886v3 > 0) {
                    z10 = true;
                }
                G.l(2131231787, gd.M0(2131748617, null), new r1(z3Var, 7), z10);
                G.W(5);
                G.X = true;
                G.a0();
                return true;
            default:
                z3Var.f12883v0.k(z3Var.B0(false));
                return true;
        }
    }
}
