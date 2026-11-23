package jg;

import org.telegram.ui.iu;
import org.telegram.ui.sz;
public final class v implements Runnable {
    public final int f17783a;
    public final h0 f17784b;

    public v(h0 h0Var, int i7) {
        this.f17783a = i7;
        this.f17784b = h0Var;
    }

    @Override
    public final void run() {
        switch (this.f17783a) {
            case 0:
                h0 h0Var = this.f17784b;
                sz szVar = h0Var.B0;
                if (szVar != null) {
                    ((iu) szVar).h(false, null, h0Var.f17595z0, h0Var.A0);
                    return;
                }
                return;
            default:
                e0 e0Var = e0.All;
                h0 h0Var2 = this.f17784b;
                h0Var2.f17564c = e0Var;
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
