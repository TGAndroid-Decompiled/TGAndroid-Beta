package org.telegram.messenger;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.ui.t60;
import org.telegram.ui.u60;
public final class we extends TimerTask {
    public final int f19037a;
    public final Object f19038b;
    public final Object f19039c;

    public we(int i10, Object obj, Object obj2) {
        this.f19037a = i10;
        this.f19039c = obj;
        this.f19038b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f19037a) {
            case 0:
                synchronized (((MediaController) this.f19039c).f14486v1) {
                    i0.g3(new t6(23, this, (kj) this.f19038b));
                }
                return;
            case 1:
                try {
                    ((Timer) ((org.telegram.ui.Components.pj) this.f19039c).h).cancel();
                    ((org.telegram.ui.Components.pj) this.f19039c).h = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
                Utilities.f14523g.c(new org.telegram.ui.Components.voip.u(2, (org.telegram.ui.Components.pj) this.f19039c, (String) this.f19038b));
                return;
            case 2:
                u60 u60Var = (u60) this.f19039c;
                try {
                    u60Var.f41836f.cancel();
                    u60Var.f41836f = null;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                i0.g3(new t60(this, (String) this.f19038b, 0));
                return;
            default:
                zf.f1 f1Var = (zf.f1) this.f19039c;
                try {
                    f1Var.f55504n.cancel();
                    f1Var.f55504n = null;
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                f1Var.getClass();
                i0.g3(new xh.e3(7, f1Var, (String) this.f19038b));
                return;
        }
    }
}
