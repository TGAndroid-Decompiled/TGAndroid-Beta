package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class s65 extends i49 {
    public final h75 a;

    public s65(h75 h75Var) {
        this.a = h75Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        y29 y29Var;
        h75 h75Var = this.a;
        r65 r65Var = h75Var.J1;
        if (i == 0) {
            int L = gl.L(74.0f);
            r65Var.getChildAt(0);
            if ((h75Var.s2 - L) + h75Var.t0 < a.getCurrentActionBarHeight() && r65Var.canScrollVertically(1) && (y29Var = (y29) r65Var.K(0)) != null) {
                View view = y29Var.a;
                if (view.getTop() > 0) {
                    r65Var.x0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        ke5 ke5Var = h75Var.f2;
        if (ke5Var != null) {
            ke5Var.a();
        }
        ke5 ke5Var2 = h75Var.g2;
        if (ke5Var2 != null) {
            ke5Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        fc2 fc2Var;
        h75 h75Var = this.a;
        if (h75Var.J1.getChildCount() > 0 && (fc2Var = h75Var.T2) != null) {
            if (!fc2Var.u && !fc2Var.t && h75Var.R1.M0() > h75Var.I1.G - 5) {
                h75Var.T2.l(false);
            }
            h75Var.F1();
            h75Var.b.invalidate();
        }
    }
}
