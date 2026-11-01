package jg;

import org.telegram.messenger.MediaController;
import org.telegram.messenger.b8;
import org.telegram.ui.Components.i01;
public final class k2 implements Runnable {
    public final int f10080a;
    public final v2 f10081b;

    public k2(v2 v2Var, int i10) {
        this.f10080a = i10;
        this.f10081b = v2Var;
    }

    @Override
    public final void run() {
        switch (this.f10080a) {
            case 0:
                v2 v2Var = this.f10081b;
                t2 t2Var = v2Var.W;
                if (t2Var != null) {
                    if (t2Var.f10284r != null) {
                        MediaController.B().i(v2Var.W.f10284r);
                        b8.G(v2Var.f10309a).b(v2Var.W.f10271b, false);
                        v2Var.W.getClass();
                    }
                    v2Var.W.a();
                    v2Var.W = null;
                }
                v2Var.f10315d0.a();
                v2Var.f10315d0 = null;
                return;
            default:
                v2 v2Var2 = this.f10081b;
                i01 i01Var = v2Var2.S;
                if (i01Var != null) {
                    v2Var2.S = null;
                    v2Var2.removeView(i01Var);
                    return;
                }
                return;
        }
    }
}
