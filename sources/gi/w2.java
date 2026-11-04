package gi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.fj0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ij0;
public final class w2 implements Runnable {
    public final int f13790a;
    public final x2 f13791b;
    public final z2 f13792c;

    public w2(x2 x2Var, z2 z2Var, int i3) {
        this.f13790a = i3;
        this.f13791b = x2Var;
        this.f13792c = z2Var;
    }

    @Override
    public final void run() {
        switch (this.f13790a) {
            case 0:
                ci.j1 j1Var = this.f13791b.f13824c.d;
                j1Var.getClass();
                z2 z2Var = this.f13792c;
                int R = RecyclerView.R(z2Var);
                if (R != -1) {
                    fj0 fj0Var = j1Var.U0;
                    if (fj0Var != null) {
                        fj0Var.f(R, z2Var);
                        return;
                    }
                    gj0 gj0Var = j1Var.V0;
                    if (gj0Var != null) {
                        gj0Var.b(0.0f, 0.0f, R, z2Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                ci.j1 j1Var2 = this.f13791b.f13824c.d;
                j1Var2.getClass();
                z2 z2Var2 = this.f13792c;
                int R2 = RecyclerView.R(z2Var2);
                if (R2 != -1) {
                    hj0 hj0Var = j1Var2.W0;
                    if (hj0Var != null) {
                        hj0Var.f(R2, z2Var2);
                        return;
                    }
                    ij0 ij0Var = j1Var2.X0;
                    if (ij0Var != null) {
                        ij0Var.mo20b(0.0f, 0.0f, R2, z2Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
