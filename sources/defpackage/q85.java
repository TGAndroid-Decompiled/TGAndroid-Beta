package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class q85 extends k69 {
    public final g95 a;

    public q85(g95 g95Var) {
        this.a = g95Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        b59 b59Var;
        g95 g95Var = this.a;
        p85 p85Var = g95Var.J1;
        if (i == 0) {
            int L = gm.L(74.0f);
            p85Var.getChildAt(0);
            if ((g95Var.s2 - L) + g95Var.t0 < a.getCurrentActionBarHeight() && p85Var.canScrollVertically(1) && (b59Var = (b59) p85Var.K(0)) != null) {
                View view = b59Var.a;
                if (view.getTop() > 0) {
                    p85Var.x0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        ig5 ig5Var = g95Var.f2;
        if (ig5Var != null) {
            ig5Var.a();
        }
        ig5 ig5Var2 = g95Var.g2;
        if (ig5Var2 != null) {
            ig5Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        qd2 qd2Var;
        g95 g95Var = this.a;
        if (g95Var.J1.getChildCount() > 0 && (qd2Var = g95Var.T2) != null) {
            if (!qd2Var.u && !qd2Var.t && g95Var.R1.M0() > g95Var.I1.G - 5) {
                g95Var.T2.l(false);
            }
            g95Var.F1();
            g95Var.b.invalidate();
        }
    }
}
