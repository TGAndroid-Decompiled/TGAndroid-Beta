package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
public final class u85 extends v79 {
    public final j95 a;

    public u85(j95 j95Var) {
        this.a = j95Var;
    }

    @Override
    public final void a(RecyclerView recyclerView, int i) {
        n69 n69Var;
        j95 j95Var = this.a;
        t85 t85Var = j95Var.J1;
        if (i == 0) {
            int L = hl.L(74.0f);
            t85Var.getChildAt(0);
            if ((j95Var.s2 - L) + j95Var.t0 < a.getCurrentActionBarHeight() && t85Var.canScrollVertically(1) && (n69Var = (n69) t85Var.L(0)) != null) {
                View view = n69Var.a;
                if (view.getTop() > 0) {
                    t85Var.y0(0, view.getTop(), null);
                    return;
                }
                return;
            }
            return;
        }
        lg5 lg5Var = j95Var.f2;
        if (lg5Var != null) {
            lg5Var.a();
        }
        lg5 lg5Var2 = j95Var.g2;
        if (lg5Var2 != null) {
            lg5Var2.a();
        }
    }

    @Override
    public final void b(RecyclerView recyclerView, int i, int i2) {
        vc2 vc2Var;
        j95 j95Var = this.a;
        if (j95Var.J1.getChildCount() > 0 && (vc2Var = j95Var.T2) != null) {
            if (!vc2Var.u && !vc2Var.t && j95Var.R1.M0() > j95Var.I1.G - 5) {
                j95Var.T2.l(false);
            }
            j95Var.G1();
            j95Var.b.invalidate();
        }
    }
}
