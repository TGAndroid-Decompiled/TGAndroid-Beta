package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jj0;
public final class w2 implements Runnable {
    public final int f15273a;
    public final x2 f15274b;
    public final z2 f15275c;

    public w2(x2 x2Var, z2 z2Var, int i7) {
        this.f15273a = i7;
        this.f15274b = x2Var;
        this.f15275c = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f15273a) {
            case 0:
                di.c1 c1Var = this.f15274b.f15324c.d;
                c1Var.getClass();
                z2 z2Var = this.f15275c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    gj0 gj0Var = c1Var.U0;
                    if (gj0Var != null) {
                        gj0Var.b(R, z2Var);
                        return;
                    }
                    hj0 hj0Var = c1Var.V0;
                    if (hj0Var != null) {
                        hj0Var.f(0.0f, 0.0f, R, z2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                di.c1 c1Var2 = this.f15274b.f15324c.d;
                c1Var2.getClass();
                z2 z2Var2 = this.f15275c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    ij0 ij0Var = c1Var2.W0;
                    if (ij0Var != null) {
                        ij0Var.b(R2, z2Var2);
                        return;
                    }
                    jj0 jj0Var = c1Var2.X0;
                    if (jj0Var != null) {
                        jj0Var.mo0f(0.0f, 0.0f, R2, z2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
