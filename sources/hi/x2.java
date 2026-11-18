package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
public final class x2 implements Runnable {
    public final int f15712a;
    public final y2 f15713b;
    public final a3 f15714c;

    public x2(y2 y2Var, a3 a3Var, int i7) {
        this.f15712a = i7;
        this.f15713b = y2Var;
        this.f15714c = a3Var;
    }

    @Override
    public final void run() {
        switch (this.f15712a) {
            case 0:
                di.b1 b1Var = this.f15713b.f15762c.d;
                b1Var.getClass();
                a3 a3Var = this.f15714c;
                int R = RecyclerView.R(a3Var);
                if (R != -1) {
                    oj0 oj0Var = b1Var.U0;
                    if (oj0Var != null) {
                        oj0Var.c(R, a3Var);
                        return;
                    }
                    pj0 pj0Var = b1Var.V0;
                    if (pj0Var != null) {
                        pj0Var.f(0.0f, 0.0f, R, a3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                di.b1 b1Var2 = this.f15713b.f15762c.d;
                b1Var2.getClass();
                a3 a3Var2 = this.f15714c;
                int R2 = RecyclerView.R(a3Var2);
                if (R2 != -1) {
                    qj0 qj0Var = b1Var2.W0;
                    if (qj0Var != null) {
                        qj0Var.c(R2, a3Var2);
                        return;
                    }
                    rj0 rj0Var = b1Var2.X0;
                    if (rj0Var != null) {
                        rj0Var.mo23f(0.0f, 0.0f, R2, a3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
