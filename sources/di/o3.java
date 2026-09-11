package di;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.cl0;
import org.telegram.ui.Components.zk0;
public final class o3 implements Runnable {
    public final int f7726a;
    public final p3 f7727b;
    public final s3 f7728c;

    public o3(p3 p3Var, s3 s3Var, int i10) {
        this.f7726a = i10;
        this.f7727b = p3Var;
        this.f7728c = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f7726a) {
            case 0:
                f3 f3Var = this.f7727b.f7823c.d;
                f3Var.getClass();
                s3 s3Var = this.f7728c;
                int R = RecyclerView.R(s3Var);
                if (R != -1) {
                    zk0 zk0Var = f3Var.V0;
                    if (zk0Var != null) {
                        zk0Var.a(R, s3Var);
                        return;
                    }
                    al0 al0Var = f3Var.W0;
                    if (al0Var != null) {
                        al0Var.d(0.0f, 0.0f, R, s3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f7727b.f7823c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.f7728c;
                int R2 = RecyclerView.R(s3Var2);
                if (R2 != -1) {
                    bl0 bl0Var = f3Var2.X0;
                    if (bl0Var != null) {
                        bl0Var.a(R2, s3Var2);
                        return;
                    }
                    cl0 cl0Var = f3Var2.Y0;
                    if (cl0Var != null) {
                        cl0Var.mo18d(0.0f, 0.0f, R2, s3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
