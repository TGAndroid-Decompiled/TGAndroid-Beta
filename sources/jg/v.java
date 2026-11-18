package jg;

import org.telegram.ui.ju;
import org.telegram.ui.tz;
public final class v implements Runnable {
    public final int f17687a;
    public final h0 f17688b;

    public v(h0 h0Var, int i7) {
        this.f17687a = i7;
        this.f17688b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f17687a) {
            case 0:
                h0 h0Var = this.f17688b;
                tz tzVar = h0Var.B0;
                if (tzVar != null) {
                    ((ju) tzVar).j(false, null, h0Var.f17499z0, h0Var.A0);
                    return;
                }
                return;
            default:
                e0 e0Var = e0.All;
                h0 h0Var2 = this.f17688b;
                h0Var2.f17468c = e0Var;
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
