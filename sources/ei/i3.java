package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.zl0;
public final class i3 implements Runnable {
    public final int f9201a;
    public final j3 f9202b;
    public final m3 f9203c;

    public i3(j3 j3Var, m3 m3Var, int i10) {
        this.f9201a = i10;
        this.f9202b = j3Var;
        this.f9203c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f9201a) {
            case 0:
                z2 z2Var = this.f9202b.f9254c.d;
                z2Var.getClass();
                m3 m3Var = this.f9203c;
                int R = RecyclerView.R(m3Var);
                if (R != -1) {
                    zl0 zl0Var = z2Var.T0;
                    if (zl0Var != null) {
                        zl0Var.d(R, m3Var);
                        return;
                    }
                    am0 am0Var = z2Var.U0;
                    if (am0Var != null) {
                        am0Var.c(0.0f, 0.0f, R, m3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f9202b.f9254c.d;
                z2Var2.getClass();
                m3 m3Var2 = this.f9203c;
                int R2 = RecyclerView.R(m3Var2);
                if (R2 != -1) {
                    bm0 bm0Var = z2Var2.V0;
                    if (bm0Var != null) {
                        bm0Var.d(R2, m3Var2);
                        return;
                    }
                    cm0 cm0Var = z2Var2.W0;
                    if (cm0Var != null) {
                        cm0Var.mo17c(0.0f, 0.0f, R2, m3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
