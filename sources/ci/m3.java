package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.fm0;
import org.telegram.ui.Components.gm0;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
public final class m3 implements Runnable {
    public final int f5590a;
    public final n3 f5591b;
    public final q3 f5592c;

    public m3(n3 n3Var, q3 q3Var, int i10) {
        this.f5590a = i10;
        this.f5591b = n3Var;
        this.f5592c = q3Var;
    }

    @Override
    public final void run() {
        switch (this.f5590a) {
            case 0:
                d3 d3Var = this.f5591b.f5632c.d;
                d3Var.getClass();
                q3 q3Var = this.f5592c;
                int R = RecyclerView.R(q3Var);
                if (R != -1) {
                    fm0 fm0Var = d3Var.T0;
                    if (fm0Var != null) {
                        fm0Var.d(R, q3Var);
                        return;
                    }
                    gm0 gm0Var = d3Var.U0;
                    if (gm0Var != null) {
                        gm0Var.c(0.0f, 0.0f, R, q3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                d3 d3Var2 = this.f5591b.f5632c.d;
                d3Var2.getClass();
                q3 q3Var2 = this.f5592c;
                int R2 = RecyclerView.R(q3Var2);
                if (R2 != -1) {
                    hm0 hm0Var = d3Var2.V0;
                    if (hm0Var != null) {
                        hm0Var.d(R2, q3Var2);
                        return;
                    }
                    im0 im0Var = d3Var2.W0;
                    if (im0Var != null) {
                        im0Var.mo17c(0.0f, 0.0f, R2, q3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
