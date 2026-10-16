package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;
public final class m3 implements Runnable {
    public final int f7420a;
    public final n3 f7421b;
    public final q3 f7422c;

    public m3(n3 n3Var, q3 q3Var, int i10) {
        this.f7420a = i10;
        this.f7421b = n3Var;
        this.f7422c = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f7420a) {
            case 0:
                d3 d3Var = this.f7421b.f7454c.d;
                d3Var.getClass();
                q3 q3Var = this.f7422c;
                int R = RecyclerView.R(q3Var);
                if (R != -1) {
                    am0 am0Var = d3Var.T0;
                    if (am0Var != null) {
                        am0Var.a(R, q3Var);
                        return;
                    }
                    bm0 bm0Var = d3Var.U0;
                    if (bm0Var != null) {
                        bm0Var.d(0.0f, 0.0f, R, q3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                d3 d3Var2 = this.f7421b.f7454c.d;
                d3Var2.getClass();
                q3 q3Var2 = this.f7422c;
                int R2 = RecyclerView.R(q3Var2);
                if (R2 != -1) {
                    cm0 cm0Var = d3Var2.V0;
                    if (cm0Var != null) {
                        cm0Var.a(R2, q3Var2);
                        return;
                    }
                    dm0 dm0Var = d3Var2.W0;
                    if (dm0Var != null) {
                        dm0Var.mo17d(0.0f, 0.0f, R2, q3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
