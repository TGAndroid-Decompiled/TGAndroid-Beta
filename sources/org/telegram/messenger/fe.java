package org.telegram.messenger;

import org.telegram.ui.Components.a70;
public final class fe implements Runnable {
    public final int f23873a;
    public final float f23874b;
    public final gs f23875c;
    public final Object d;

    public fe(gs gsVar, Object obj, float f10, int i7) {
        this.f23873a = i7;
        this.f23875c = gsVar;
        this.d = obj;
        this.f23874b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23873a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23875c;
                gj gjVar = (gj) this.d;
                if (mediaController.f22711j0 != null && mediaController.f22735v0 != null && !mediaController.f22707h0) {
                    if (mediaController.L(gjVar)) {
                        mediaController.i0(mediaController.f22735v0, this.f23874b);
                    }
                    mediaController.f22711j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23875c;
                a70 a70Var = (a70) this.d;
                g4Var.f47908i0.N.c(true, 0.0f);
                a70Var.f33357p = new org.telegram.ui.a0(g4Var, this.f23874b, 0);
                a70Var.a0();
                return;
        }
    }
}
