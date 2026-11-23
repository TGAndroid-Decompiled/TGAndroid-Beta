package org.telegram.messenger;

import org.telegram.ui.Components.a70;
public final class fe implements Runnable {
    public final int f23909a;
    public final float f23910b;
    public final gs f23911c;
    public final Object d;

    public fe(gs gsVar, Object obj, float f10, int i7) {
        this.f23909a = i7;
        this.f23911c = gsVar;
        this.d = obj;
        this.f23910b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23909a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23911c;
                gj gjVar = (gj) this.d;
                if (mediaController.f22747j0 != null && mediaController.f22771v0 != null && !mediaController.f22743h0) {
                    if (mediaController.L(gjVar)) {
                        mediaController.i0(mediaController.f22771v0, this.f23910b);
                    }
                    mediaController.f22747j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23911c;
                a70 a70Var = (a70) this.d;
                g4Var.f47961i0.N.c(true, 0.0f);
                a70Var.f33391p = new org.telegram.ui.a0(g4Var, this.f23910b, 0);
                a70Var.a0();
                return;
        }
    }
}
