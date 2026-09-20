package ci;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.ml0;
public final class o3 implements Runnable {
    public final int f5124a;
    public final p3 f5125b;
    public final s3 f5126c;

    public o3(p3 p3Var, s3 s3Var, int i10) {
        this.f5124a = i10;
        this.f5125b = p3Var;
        this.f5126c = s3Var;
    }

    @Override
    public final void run() {
        switch (this.f5124a) {
            case 0:
                f3 f3Var = this.f5125b.f5305c.d;
                f3Var.getClass();
                s3 s3Var = this.f5126c;
                int S = RecyclerView.S(s3Var);
                if (S != -1) {
                    jl0 jl0Var = f3Var.V0;
                    if (jl0Var != null) {
                        jl0Var.d(S, s3Var);
                        return;
                    }
                    kl0 kl0Var = f3Var.W0;
                    if (kl0Var != null) {
                        kl0Var.c(0.0f, 0.0f, S, s3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f5125b.f5305c.d;
                f3Var2.getClass();
                s3 s3Var2 = this.f5126c;
                int S2 = RecyclerView.S(s3Var2);
                if (S2 != -1) {
                    ll0 ll0Var = f3Var2.X0;
                    if (ll0Var != null) {
                        ll0Var.d(S2, s3Var2);
                        return;
                    }
                    ml0 ml0Var = f3Var2.Y0;
                    if (ml0Var != null) {
                        ml0Var.mo18c(0.0f, 0.0f, S2, s3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
