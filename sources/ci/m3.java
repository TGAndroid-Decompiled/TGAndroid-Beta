package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
public final class m3 implements Runnable {
    public final int f5588a;
    public final n3 f5589b;
    public final q3 f5590c;

    public m3(n3 n3Var, q3 q3Var, int i10) {
        this.f5588a = i10;
        this.f5589b = n3Var;
        this.f5590c = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f5588a) {
            case 0:
                d3 d3Var = this.f5589b.f5630c.d;
                d3Var.getClass();
                q3 q3Var = this.f5590c;
                int R = RecyclerView.R(q3Var);
                if (R != -1) {
                    km0 km0Var = d3Var.T0;
                    if (km0Var != null) {
                        km0Var.d(R, q3Var);
                        return;
                    }
                    lm0 lm0Var = d3Var.U0;
                    if (lm0Var != null) {
                        lm0Var.c(0.0f, 0.0f, R, q3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                d3 d3Var2 = this.f5589b.f5630c.d;
                d3Var2.getClass();
                q3 q3Var2 = this.f5590c;
                int R2 = RecyclerView.R(q3Var2);
                if (R2 != -1) {
                    mm0 mm0Var = d3Var2.V0;
                    if (mm0Var != null) {
                        mm0Var.d(R2, q3Var2);
                        return;
                    }
                    nm0 nm0Var = d3Var2.W0;
                    if (nm0Var != null) {
                        nm0Var.mo17c(0.0f, 0.0f, R2, q3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
