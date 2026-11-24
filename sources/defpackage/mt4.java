package defpackage;

import androidx.recyclerview.widget.RecyclerView;
public final class mt4 implements Runnable {
    public final byte a;
    public final nt4 b;
    public final pt4 c;

    public mt4(nt4 nt4Var, pt4 pt4Var, byte b) {
        this.a = b;
        this.b = nt4Var;
        this.c = pt4Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pt4 pt4Var = this.c;
        nt4 nt4Var = this.b;
        switch (b) {
            case 0:
                fv fvVar = nt4Var.c.d;
                fvVar.getClass();
                int R = RecyclerView.R(pt4Var);
                if (R != -1) {
                    f59 f59Var = fvVar.U0;
                    if (f59Var != null) {
                        f59Var.g(R, pt4Var);
                        return;
                    }
                    g59 g59Var = fvVar.V0;
                    if (g59Var != null) {
                        g59Var.d(0.0f, 0.0f, R, pt4Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                fv fvVar2 = nt4Var.c.d;
                fvVar2.getClass();
                int R2 = RecyclerView.R(pt4Var);
                if (R2 != -1) {
                    h59 h59Var = fvVar2.W0;
                    if (h59Var != null) {
                        h59Var.g(R2, pt4Var);
                        return;
                    }
                    i59 i59Var = fvVar2.X0;
                    if (i59Var != null) {
                        i59Var.mo14d(0.0f, 0.0f, R2, pt4Var);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
