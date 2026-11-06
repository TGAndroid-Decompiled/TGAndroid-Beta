package jg;

import org.telegram.ui.fu;
import org.telegram.ui.pz;
public final class w implements Runnable {
    public final int f16965a;
    public final h0 f16966b;

    public w(h0 h0Var, int i7) {
        this.f16965a = i7;
        this.f16966b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f16965a) {
            case 0:
                h0 h0Var = this.f16966b;
                pz pzVar = h0Var.A0;
                if (pzVar != null) {
                    ((fu) pzVar).j(false, null, h0Var.f16766y0, h0Var.f16767z0);
                    return;
                }
                return;
            default:
                e0 e0Var = e0.All;
                h0 h0Var2 = this.f16966b;
                h0Var2.f16736c = e0Var;
                h0Var2.I.clear();
                int i7 = h0Var2.F0;
                if (i7 >= 0 && i7 < h0Var2.b()) {
                    h0Var2.g(h0Var2.F0);
                }
                h0Var2.P();
                return;
        }
    }
}
