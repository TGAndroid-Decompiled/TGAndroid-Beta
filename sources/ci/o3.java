package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;
public final class o3 implements Runnable {
    public final int f5118a;
    public final p3 f5119b;
    public final s3 f5120c;

    public o3(p3 p3Var, s3 s3Var, int i10) {
        this.f5118a = i10;
        this.f5119b = p3Var;
        this.f5120c = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f5118a) {
            case 0:
                f3 f3Var = this.f5119b.f5299c.d;
                f3Var.getClass();
                s3 s3Var = this.f5120c;
                int R = RecyclerView.R(s3Var);
                if (R != -1) {
                    zk0 zk0Var = f3Var.V0;
                    if (zk0Var != null) {
                        zk0Var.d(R, s3Var);
                        return;
                    }
                    al0 al0Var = f3Var.W0;
                    if (al0Var != null) {
                        al0Var.c(0.0f, 0.0f, R, s3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f5119b.f5299c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.f5120c;
                int R2 = RecyclerView.R(s3Var2);
                if (R2 != -1) {
                    bl0 bl0Var = f3Var2.X0;
                    if (bl0Var != null) {
                        bl0Var.d(R2, s3Var2);
                        return;
                    }
                    cl0 cl0Var = f3Var2.Y0;
                    if (cl0Var != null) {
                        cl0Var.mo18c(0.0f, 0.0f, R2, s3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
