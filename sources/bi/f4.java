package bi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
public final class f4 implements Runnable {
    public final int f2700a;
    public final g4 f2701b;
    public final j4 f2702c;

    public f4(g4 g4Var, j4 j4Var, int i10) {
        this.f2700a = i10;
        this.f2701b = g4Var;
        this.f2702c = j4Var;
    }

    @Override
    public final void run() {
        switch (this.f2700a) {
            case 0:
                w3 w3Var = this.f2701b.f2742c.d;
                w3Var.getClass();
                j4 j4Var = this.f2702c;
                int R = RecyclerView.R(j4Var);
                if (R != -1) {
                    jl0 jl0Var = w3Var.V0;
                    if (jl0Var != null) {
                        jl0Var.d(R, j4Var);
                        return;
                    }
                    kl0 kl0Var = w3Var.W0;
                    if (kl0Var != null) {
                        kl0Var.c(0.0f, 0.0f, R, j4Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                w3 w3Var2 = this.f2701b.f2742c.d;
                w3Var2.getClass();
                j4 j4Var2 = this.f2702c;
                int R2 = RecyclerView.R(j4Var2);
                if (R2 != -1) {
                    ll0 ll0Var = w3Var2.X0;
                    if (ll0Var != null) {
                        ll0Var.d(R2, j4Var2);
                        return;
                    }
                    ml0 ml0Var = w3Var2.Y0;
                    if (ml0Var != null) {
                        ml0Var.mo18c(0.0f, 0.0f, R2, j4Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
