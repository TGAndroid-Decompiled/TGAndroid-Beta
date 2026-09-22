package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.pl0;
public final class o3 implements Runnable {
    public final int f5122a;
    public final p3 f5123b;
    public final s3 f5124c;

    public o3(p3 p3Var, s3 s3Var, int i10) {
        this.f5122a = i10;
        this.f5123b = p3Var;
        this.f5124c = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f5122a) {
            case 0:
                f3 f3Var = this.f5123b.f5303c.d;
                f3Var.getClass();
                s3 s3Var = this.f5124c;
                int S = RecyclerView.S(s3Var);
                if (S != -1) {
                    ml0 ml0Var = f3Var.V0;
                    if (ml0Var != null) {
                        ml0Var.d(S, s3Var);
                        return;
                    }
                    nl0 nl0Var = f3Var.W0;
                    if (nl0Var != null) {
                        nl0Var.c(0.0f, 0.0f, S, s3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f5123b.f5303c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.f5124c;
                int S2 = RecyclerView.S(s3Var2);
                if (S2 != -1) {
                    ol0 ol0Var = f3Var2.X0;
                    if (ol0Var != null) {
                        ol0Var.d(S2, s3Var2);
                        return;
                    }
                    pl0 pl0Var = f3Var2.Y0;
                    if (pl0Var != null) {
                        pl0Var.mo18c(0.0f, 0.0f, S2, s3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
