package jg;

import org.telegram.ui.ju;
import org.telegram.ui.tz;
public final class v implements Runnable {
    public final int f17712a;
    public final h0 f17713b;

    public v(h0 h0Var, int i7) {
        this.f17712a = i7;
        this.f17713b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f17712a) {
            case 0:
                h0 h0Var = this.f17713b;
                tz tzVar = h0Var.B0;
                if (tzVar != null) {
                    ((ju) tzVar).j(false, null, h0Var.f17524z0, h0Var.A0);
                    return;
                }
                return;
            default:
                e0 e0Var = e0.All;
                h0 h0Var2 = this.f17713b;
                h0Var2.f17493c = e0Var;
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
