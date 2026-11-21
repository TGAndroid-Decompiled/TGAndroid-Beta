package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class w2 implements Runnable {
    public final int f15690a;
    public final x2 f15691b;
    public final z2 f15692c;

    public w2(x2 x2Var, z2 z2Var, int i7) {
        this.f15690a = i7;
        this.f15691b = x2Var;
        this.f15692c = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f15690a) {
            case 0:
                di.b1 b1Var = this.f15691b.f15740c.d;
                b1Var.getClass();
                z2 z2Var = this.f15692c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    qj0 qj0Var = b1Var.U0;
                    if (qj0Var != null) {
                        qj0Var.c(R, z2Var);
                        return;
                    }
                    rj0 rj0Var = b1Var.V0;
                    if (rj0Var != null) {
                        rj0Var.f(0.0f, 0.0f, R, z2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                di.b1 b1Var2 = this.f15691b.f15740c.d;
                b1Var2.getClass();
                z2 z2Var2 = this.f15692c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    sj0 sj0Var = b1Var2.W0;
                    if (sj0Var != null) {
                        sj0Var.c(R2, z2Var2);
                        return;
                    }
                    tj0 tj0Var = b1Var2.X0;
                    if (tj0Var != null) {
                        tj0Var.mo23f(0.0f, 0.0f, R2, z2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
