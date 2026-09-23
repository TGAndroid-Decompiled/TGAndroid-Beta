package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
public final class n3 implements Runnable {
    public final int f5198a;
    public final o3 f5199b;
    public final r3 f5200c;

    public n3(o3 o3Var, r3 r3Var, int i10) {
        this.f5198a = i10;
        this.f5199b = o3Var;
        this.f5200c = r3Var;
    }

    @Override
    public final void run() {
        switch (this.f5198a) {
            case 0:
                e3 e3Var = this.f5199b.f5238c.d;
                e3Var.getClass();
                r3 r3Var = this.f5200c;
                int R = RecyclerView.R(r3Var);
                if (R != -1) {
                    al0 al0Var = e3Var.V0;
                    if (al0Var != null) {
                        al0Var.d(R, r3Var);
                        return;
                    }
                    bl0 bl0Var = e3Var.W0;
                    if (bl0Var != null) {
                        bl0Var.c(0.0f, 0.0f, R, r3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                e3 e3Var2 = this.f5199b.f5238c.d;
                e3Var2.getClass();
                r3 r3Var2 = this.f5200c;
                int R2 = RecyclerView.R(r3Var2);
                if (R2 != -1) {
                    cl0 cl0Var = e3Var2.X0;
                    if (cl0Var != null) {
                        cl0Var.d(R2, r3Var2);
                        return;
                    }
                    dl0 dl0Var = e3Var2.Y0;
                    if (dl0Var != null) {
                        dl0Var.mo18c(0.0f, 0.0f, R2, r3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
