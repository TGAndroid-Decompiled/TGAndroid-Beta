package org.telegram.messenger;

import org.telegram.ui.Components.k60;
public final class ie implements Runnable {
    public final int f23191a;
    public final float f23192b;
    public final ls f23193c;
    public final Object d;

    public ie(ls lsVar, Object obj, float f10, int i7) {
        this.f23191a = i7;
        this.f23193c = lsVar;
        this.d = obj;
        this.f23192b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23191a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23193c;
                ij ijVar = (ij) this.d;
                if (mediaController.f21276i0 != null && mediaController.f21300u0 != null && !mediaController.f21272g0) {
                    if (mediaController.L(ijVar)) {
                        mediaController.i0(mediaController.f21300u0, this.f23192b);
                    }
                    mediaController.f21276i0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23193c;
                k60 k60Var = (k60) this.d;
                g4Var.f45959h0.M.c(true, 0.0f);
                k60Var.f35214p = new org.telegram.ui.b0(g4Var, this.f23192b, 0);
                k60Var.Z();
                return;
        }
    }
}
