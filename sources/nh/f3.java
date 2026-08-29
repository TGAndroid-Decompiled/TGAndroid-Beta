package nh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;
public final class f3 implements Runnable {
    public final int f17629a;
    public final g3 f17630b;
    public final j3 f17631c;

    public f3(g3 g3Var, j3 j3Var, int i10) {
        this.f17629a = i10;
        this.f17630b = g3Var;
        this.f17631c = j3Var;
    }

    @Override
    public final void run() {
        switch (this.f17629a) {
            case 0:
                w2 w2Var = this.f17630b.f17692c.d;
                w2Var.getClass();
                j3 j3Var = this.f17631c;
                int R = RecyclerView.R(j3Var);
                if (R != -1) {
                    zk0 zk0Var = w2Var.R0;
                    if (zk0Var != null) {
                        zk0Var.c(R, j3Var);
                        return;
                    }
                    al0 al0Var = w2Var.S0;
                    if (al0Var != null) {
                        al0Var.b(0.0f, 0.0f, R, j3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                w2 w2Var2 = this.f17630b.f17692c.d;
                w2Var2.getClass();
                j3 j3Var2 = this.f17631c;
                int R2 = RecyclerView.R(j3Var2);
                if (R2 != -1) {
                    bl0 bl0Var = w2Var2.T0;
                    if (bl0Var != null) {
                        bl0Var.c(R2, j3Var2);
                        return;
                    }
                    cl0 cl0Var = w2Var2.U0;
                    if (cl0Var != null) {
                        cl0Var.mo17b(0.0f, 0.0f, R2, j3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
