package org.telegram.messenger;

import java.util.Timer;
import java.util.TimerTask;
import org.telegram.ui.u60;
import org.telegram.ui.v60;
public final class ve extends TimerTask {
    public final int f18515a;
    public final Object f18516b;
    public final Object f18517c;

    public ve(int i10, Object obj, Object obj2) {
        this.f18515a = i10;
        this.f18517c = obj;
        this.f18516b = obj2;
    }

    @Override
    public final void run() {
        switch (this.f18515a) {
            case 0:
                synchronized (((MediaController) this.f18517c).f14485v1) {
                    i0.g3(new t6(23, this, (jj) this.f18516b));
                }
                return;
            case 1:
                try {
                    ((Timer) ((org.telegram.ui.Components.pj) this.f18517c).h).cancel();
                    ((org.telegram.ui.Components.pj) this.f18517c).h = null;
                } catch (Exception e) {
                    f8.g(e, true);
                }
                Utilities.f14522g.c(new org.telegram.ui.xs(1, (org.telegram.ui.Components.pj) this.f18517c, (String) this.f18516b));
                return;
            case 2:
                v60 v60Var = (v60) this.f18517c;
                try {
                    v60Var.f42637f.cancel();
                    v60Var.f42637f = null;
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
                i0.g3(new u60(this, (String) this.f18516b, 0));
                return;
            default:
                zf.f1 f1Var = (zf.f1) this.f18517c;
                try {
                    f1Var.f55486n.cancel();
                    f1Var.f55486n = null;
                } catch (Exception e10) {
                    f8.g(e10, true);
                }
                f1Var.getClass();
                i0.g3(new yh.o(6, f1Var, (String) this.f18516b));
                return;
        }
    }
}
