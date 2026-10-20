package ei;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.xl0;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
public final class i3 implements Runnable {
    public final int f9190a;
    public final j3 f9191b;
    public final m3 f9192c;

    public i3(j3 j3Var, m3 m3Var, int i10) {
        this.f9190a = i10;
        this.f9191b = j3Var;
        this.f9192c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f9190a) {
            case 0:
                z2 z2Var = this.f9191b.f9243c.d;
                z2Var.getClass();
                m3 m3Var = this.f9192c;
                int R = RecyclerView.R(m3Var);
                if (R != -1) {
                    xl0 xl0Var = z2Var.T0;
                    if (xl0Var != null) {
                        xl0Var.a(R, m3Var);
                        return;
                    }
                    yl0 yl0Var = z2Var.U0;
                    if (yl0Var != null) {
                        yl0Var.d(0.0f, 0.0f, R, m3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f9191b.f9243c.d;
                z2Var2.getClass();
                m3 m3Var2 = this.f9192c;
                int R2 = RecyclerView.R(m3Var2);
                if (R2 != -1) {
                    zl0 zl0Var = z2Var2.V0;
                    if (zl0Var != null) {
                        zl0Var.a(R2, m3Var2);
                        return;
                    }
                    am0 am0Var = z2Var2.W0;
                    if (am0Var != null) {
                        am0Var.mo17d(0.0f, 0.0f, R2, m3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
