package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.am0;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.dm0;
public final class m3 implements Runnable {
    public final int f7417a;
    public final n3 f7418b;
    public final q3 f7419c;

    public m3(n3 n3Var, q3 q3Var, int i10) {
        this.f7417a = i10;
        this.f7418b = n3Var;
        this.f7419c = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f7417a) {
            case 0:
                d3 d3Var = this.f7418b.f7451c.d;
                d3Var.getClass();
                q3 q3Var = this.f7419c;
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
                d3 d3Var2 = this.f7418b.f7451c.d;
                d3Var2.getClass();
                q3 q3Var2 = this.f7419c;
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
