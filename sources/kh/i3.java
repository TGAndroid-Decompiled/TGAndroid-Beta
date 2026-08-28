package kh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.pk0;
public final class i3 implements Runnable {
    public final int f15419a;
    public final j3 f15420b;
    public final m3 f15421c;

    public i3(j3 j3Var, m3 m3Var, int i9) {
        this.f15419a = i9;
        this.f15420b = j3Var;
        this.f15421c = m3Var;
    }

    @Override
    public final void run() {
        switch (this.f15419a) {
            case 0:
                z2 z2Var = this.f15420b.f15460c.d;
                z2Var.getClass();
                m3 m3Var = this.f15421c;
                int R = RecyclerView.R(m3Var);
                if (R != -1) {
                    mk0 mk0Var = z2Var.R0;
                    if (mk0Var != null) {
                        mk0Var.a(R, m3Var);
                        return;
                    }
                    nk0 nk0Var = z2Var.S0;
                    if (nk0Var != null) {
                        nk0Var.c(0.0f, 0.0f, R, m3Var);
                        return;
                    }
                    return;
                }
                return;
            default:
                z2 z2Var2 = this.f15420b.f15460c.d;
                z2Var2.getClass();
                m3 m3Var2 = this.f15421c;
                int R2 = RecyclerView.R(m3Var2);
                if (R2 != -1) {
                    ok0 ok0Var = z2Var2.T0;
                    if (ok0Var != null) {
                        ok0Var.a(R2, m3Var2);
                        return;
                    }
                    pk0 pk0Var = z2Var2.U0;
                    if (pk0Var != null) {
                        pk0Var.mo5c(0.0f, 0.0f, R2, m3Var2);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
