package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
import org.telegram.ui.Components.ql0;
public final class n3 implements Runnable {
    public final int f5205a;
    public final o3 f5206b;
    public final r3 f5207c;

    public n3(o3 o3Var, r3 r3Var, int i10) {
        this.f5205a = i10;
        this.f5206b = o3Var;
        this.f5207c = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f5205a) {
            case 0:
                e3 e3Var = this.f5206b.f5245c.d;
                e3Var.getClass();
                r3 r3Var = this.f5207c;
                int R = RecyclerView.R(r3Var);
                if (R != -1) {
                    nl0 nl0Var = e3Var.V0;
                    if (nl0Var != null) {
                        nl0Var.d(R, r3Var);
                        return;
                    }
                    ol0 ol0Var = e3Var.W0;
                    if (ol0Var != null) {
                        ol0Var.c(0.0f, 0.0f, R, r3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                e3 e3Var2 = this.f5206b.f5245c.d;
                e3Var2.getClass();
                r3 r3Var2 = this.f5207c;
                int R2 = RecyclerView.R(r3Var2);
                if (R2 != -1) {
                    pl0 pl0Var = e3Var2.X0;
                    if (pl0Var != null) {
                        pl0Var.d(R2, r3Var2);
                        return;
                    }
                    ql0 ql0Var = e3Var2.Y0;
                    if (ql0Var != null) {
                        ql0Var.mo18c(0.0f, 0.0f, R2, r3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
