package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.dj0;
import org.telegram.ui.Components.ej0;
public final class y2 implements Runnable {
    public final int f13155a;
    public final z2 f13156b;
    public final b3 f13157c;

    public y2(z2 z2Var, b3 b3Var, int i7) {
        this.f13155a = i7;
        this.f13156b = z2Var;
        this.f13157c = b3Var;
    }

    @Override
    public final void run() {
        switch (this.f13155a) {
            case 0:
                bi.q1 q1Var = this.f13156b.f13244c.d;
                q1Var.getClass();
                b3 b3Var = this.f13157c;
                int R = RecyclerView.R(b3Var);
                if (R != -1) {
                    bj0 bj0Var = q1Var.T0;
                    if (bj0Var != null) {
                        bj0Var.c(R, b3Var);
                        return;
                    }
                    cj0 cj0Var = q1Var.U0;
                    if (cj0Var != null) {
                        cj0Var.f(0.0f, 0.0f, R, b3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                bi.q1 q1Var2 = this.f13156b.f13244c.d;
                q1Var2.getClass();
                b3 b3Var2 = this.f13157c;
                int R2 = RecyclerView.R(b3Var2);
                if (R2 != -1) {
                    dj0 dj0Var = q1Var2.V0;
                    if (dj0Var != null) {
                        dj0Var.c(R2, b3Var2);
                        return;
                    }
                    ej0 ej0Var = q1Var2.W0;
                    if (ej0Var != null) {
                        ej0Var.mo19f(0.0f, 0.0f, R2, b3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
