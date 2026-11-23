package hi;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.sj0;
import org.telegram.ui.Components.tj0;
public final class f3 implements Runnable {
    public final int f14429a;
    public final g3 f14430b;
    public final i3 f14431c;

    public f3(g3 g3Var, i3 i3Var, int i7) {
        this.f14429a = i7;
        this.f14430b = g3Var;
        this.f14431c = i3Var;
    }

    @Override
    public final void run() {
        switch (this.f14429a) {
            case 0:
                di.b1 b1Var = this.f14430b.f14527c.d;
                b1Var.getClass();
                i3 i3Var = this.f14431c;
                int R = RecyclerView.R(i3Var);
                if (R != -1) {
                    qj0 qj0Var = b1Var.U0;
                    if (qj0Var != null) {
                        qj0Var.b(R, i3Var);
                        return;
                    }
                    rj0 rj0Var = b1Var.V0;
                    if (rj0Var != null) {
                        rj0Var.g(0.0f, 0.0f, R, i3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                di.b1 b1Var2 = this.f14430b.f14527c.d;
                b1Var2.getClass();
                i3 i3Var2 = this.f14431c;
                int R2 = RecyclerView.R(i3Var2);
                if (R2 != -1) {
                    sj0 sj0Var = b1Var2.W0;
                    if (sj0Var != null) {
                        sj0Var.b(R2, i3Var2);
                        return;
                    }
                    tj0 tj0Var = b1Var2.X0;
                    if (tj0Var != null) {
                        tj0Var.mo24g(0.0f, 0.0f, R2, i3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
