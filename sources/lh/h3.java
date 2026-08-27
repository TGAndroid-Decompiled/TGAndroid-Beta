package lh;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.rk0;
import org.telegram.ui.Components.sk0;

public final class h3 implements Runnable {

    public final int f16056a;

    public final i3 f16057b;

    public final l3 f16058c;

    public h3(i3 i3Var, l3 l3Var, int i10) {
        this.f16056a = i10;
        this.f16057b = i3Var;
        this.f16058c = l3Var;
    }

    @Override
    public final void run() {
        switch (this.f16056a) {
            case 0:
                y2 y2Var = this.f16057b.f16106c.d;
                y2Var.getClass();
                l3 l3Var = this.f16058c;
                int iR = RecyclerView.R(l3Var);
                if (iR != -1) {
                    pk0 pk0Var = y2Var.R0;
                    if (pk0Var == null) {
                        qk0 qk0Var = y2Var.S0;
                        if (qk0Var != null) {
                            qk0Var.c(0.0f, 0.0f, iR, l3Var);
                        }
                    } else {
                        pk0Var.a(iR, l3Var);
                    }
                }
                break;
            default:
                y2 y2Var2 = this.f16057b.f16106c.d;
                y2Var2.getClass();
                l3 l3Var2 = this.f16058c;
                int iR2 = RecyclerView.R(l3Var2);
                if (iR2 != -1) {
                    rk0 rk0Var = y2Var2.T0;
                    if (rk0Var == null) {
                        sk0 sk0Var = y2Var2.U0;
                        if (sk0Var != null) {
                            sk0Var.mo5c(0.0f, 0.0f, iR2, l3Var2);
                        }
                    } else {
                        rk0Var.a(iR2, l3Var2);
                    }
                }
                break;
        }
    }
}
