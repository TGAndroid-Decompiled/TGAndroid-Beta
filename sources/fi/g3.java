package fi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.zl0;
public final class g3 implements Runnable {
    public final int f10897a;
    public final h3 f10898b;
    public final k3 f10899c;

    public g3(h3 h3Var, k3 k3Var, int i10) {
        this.f10897a = i10;
        this.f10898b = h3Var;
        this.f10899c = k3Var;
    }

    @Override
    public final void run() {
        switch (this.f10897a) {
            case 0:
                x2 x2Var = this.f10898b.f10948c.d;
                x2Var.getClass();
                k3 k3Var = this.f10899c;
                int R = RecyclerView.R(k3Var);
                if (R != -1) {
                    zl0 zl0Var = x2Var.T0;
                    if (zl0Var != null) {
                        zl0Var.c(R, k3Var);
                        return;
                    }
                    am0 am0Var = x2Var.U0;
                    if (am0Var != null) {
                        am0Var.e(0.0f, 0.0f, R, k3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                x2 x2Var2 = this.f10898b.f10948c.d;
                x2Var2.getClass();
                k3 k3Var2 = this.f10899c;
                int R2 = RecyclerView.R(k3Var2);
                if (R2 != -1) {
                    bm0 bm0Var = x2Var2.V0;
                    if (bm0Var != null) {
                        bm0Var.c(R2, k3Var2);
                        return;
                    }
                    cm0 cm0Var = x2Var2.W0;
                    if (cm0Var != null) {
                        cm0Var.mo17e(0.0f, 0.0f, R2, k3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
