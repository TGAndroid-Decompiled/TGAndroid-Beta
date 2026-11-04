package kg;

import org.telegram.ui.du;
import org.telegram.ui.nz;
public final class u implements Runnable {
    public final int f17199a;
    public final e0 f17200b;

    public u(e0 e0Var, int i3) {
        this.f17199a = i3;
        this.f17200b = e0Var;
    }

    @Override
    public final void run() {
        switch (this.f17199a) {
            case 0:
                e0 e0Var = this.f17200b;
                nz nzVar = e0Var.B0;
                if (nzVar != null) {
                    ((du) nzVar).j(false, null, e0Var.f16989z0, e0Var.A0);
                    return;
                }
                return;
            default:
                b0 b0Var = b0.All;
                e0 e0Var2 = this.f17200b;
                e0Var2.f16958c = b0Var;
                e0Var2.J.clear();
                int i3 = e0Var2.G0;
                if (i3 >= 0 && i3 < e0Var2.b()) {
                    e0Var2.g(e0Var2.G0);
                }
                e0Var2.P();
                return;
        }
    }
}
