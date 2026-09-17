package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.dl0;
public final class o3 implements Runnable {
    public final int f5123a;
    public final p3 f5124b;
    public final s3 f5125c;

    public o3(p3 p3Var, s3 s3Var, int i10) {
        this.f5123a = i10;
        this.f5124b = p3Var;
        this.f5125c = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f5123a) {
            case 0:
                f3 f3Var = this.f5124b.f5304c.d;
                f3Var.getClass();
                s3 s3Var = this.f5125c;
                int S = RecyclerView.S(s3Var);
                if (S != -1) {
                    al0 al0Var = f3Var.V0;
                    if (al0Var != null) {
                        al0Var.d(S, s3Var);
                        return;
                    }
                    bl0 bl0Var = f3Var.W0;
                    if (bl0Var != null) {
                        bl0Var.c(0.0f, 0.0f, S, s3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f5124b.f5304c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.f5125c;
                int S2 = RecyclerView.S(s3Var2);
                if (S2 != -1) {
                    cl0 cl0Var = f3Var2.X0;
                    if (cl0Var != null) {
                        cl0Var.d(S2, s3Var2);
                        return;
                    }
                    dl0 dl0Var = f3Var2.Y0;
                    if (dl0Var != null) {
                        dl0Var.mo18c(0.0f, 0.0f, S2, s3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
