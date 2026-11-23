package fi;

import android.view.View;
import org.telegram.messenger.hd;
import org.telegram.ui.Components.a70;
public final class q1 implements View.OnLongClickListener {
    public final int f12445a;
    public final z3 f12446b;

    public q1(z3 z3Var, int i7) {
        this.f12445a = i7;
        this.f12446b = z3Var;
    }

    @Override
    public final boolean onLongClick(View view) {
        int i7 = this.f12445a;
        boolean z10 = false;
        z3 z3Var = this.f12446b;
        switch (i7) {
            case 0:
                if (z3Var.B0(true)) {
                    return false;
                }
                a70 G = a70.G(z3Var.f12867t0.f11996w, z3Var.f12838l0, view);
                G.c(2131232118, hd.N0(2131748617, null), new r1(z3Var, 6), false);
                if (z3Var.f12878v3 > 0) {
                    z10 = true;
                }
                G.l(2131231787, hd.N0(2131748616, null), new r1(z3Var, 7), z10);
                G.W(5);
                G.X = true;
                G.a0();
                return true;
            default:
                z3Var.f12875v0.k(z3Var.B0(false));
                return true;
        }
    }
}
