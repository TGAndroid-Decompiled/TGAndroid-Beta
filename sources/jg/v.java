package jg;

import org.telegram.ui.hu;
import org.telegram.ui.qz;
public final class v implements Runnable {
    public final int f17304a;
    public final h0 f17305b;

    public v(h0 h0Var, int i7) {
        this.f17304a = i7;
        this.f17305b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f17304a) {
            case 0:
                h0 h0Var = this.f17305b;
                qz qzVar = h0Var.B0;
                if (qzVar != null) {
                    ((hu) qzVar).j(false, null, h0Var.f17116z0, h0Var.A0);
                    return;
                }
                return;
            default:
                e0 e0Var = e0.All;
                h0 h0Var2 = this.f17305b;
                h0Var2.f17085c = e0Var;
                h0Var2.J.clear();
                int i7 = h0Var2.G0;
                if (i7 >= 0 && i7 < h0Var2.b()) {
                    h0Var2.g(h0Var2.G0);
                }
                h0Var2.P();
                return;
        }
    }
}
