package jg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.ui.Components.h01;
public final class k2 implements Runnable {
    public final int f10079a;
    public final v2 f10080b;

    public k2(v2 v2Var, int i10) {
        this.f10079a = i10;
        this.f10080b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f10079a) {
            case 0:
                v2 v2Var = this.f10080b;
                t2 t2Var = v2Var.W;
                if (t2Var != null) {
                    if (t2Var.f10283r != null) {
                        MediaController.B().i(v2Var.W.f10283r);
                        b8.G(v2Var.f10308a).b(v2Var.W.f10270b, false);
                        v2Var.W.getClass();
                    }
                    v2Var.W.a();
                    v2Var.W = null;
                }
                v2Var.f10314d0.a();
                v2Var.f10314d0 = null;
                return;
            default:
                v2 v2Var2 = this.f10080b;
                h01 h01Var = v2Var2.S;
                if (h01Var != null) {
                    v2Var2.S = null;
                    v2Var2.removeView(h01Var);
                    return;
                }
                return;
        }
    }
}
