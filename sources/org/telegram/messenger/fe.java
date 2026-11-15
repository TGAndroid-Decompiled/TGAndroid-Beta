package org.telegram.messenger;

import org.telegram.ui.Components.m60;
public final class fe implements Runnable {
    public final int f23484a;
    public final float f23485b;
    public final is f23486c;
    public final Object d;

    public fe(is isVar, Object obj, float f10, int i7) {
        this.f23484a = i7;
        this.f23486c = isVar;
        this.d = obj;
        this.f23485b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23484a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23486c;
                gj gjVar = (gj) this.d;
                if (mediaController.f22353j0 != null && mediaController.f22377v0 != null && !mediaController.f22349h0) {
                    if (mediaController.L(gjVar)) {
                        mediaController.i0(mediaController.f22377v0, this.f23485b);
                    }
                    mediaController.f22353j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23486c;
                m60 m60Var = (m60) this.d;
                g4Var.f47324i0.N.c(true, 0.0f);
                m60Var.f37106p = new org.telegram.ui.a0(g4Var, this.f23485b, 0);
                m60Var.Z();
                return;
        }
    }
}
