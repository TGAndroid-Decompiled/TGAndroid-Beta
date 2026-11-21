package org.telegram.messenger;

import org.telegram.ui.Components.a70;
public final class ee implements Runnable {
    public final int f23728a;
    public final float f23729b;
    public final fs f23730c;
    public final Object d;

    public ee(fs fsVar, Object obj, float f10, int i7) {
        this.f23728a = i7;
        this.f23730c = fsVar;
        this.d = obj;
        this.f23729b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23728a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23730c;
                fj fjVar = (fj) this.d;
                if (mediaController.f22744j0 != null && mediaController.f22768v0 != null && !mediaController.f22740h0) {
                    if (mediaController.L(fjVar)) {
                        mediaController.i0(mediaController.f22768v0, this.f23729b);
                    }
                    mediaController.f22744j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23730c;
                a70 a70Var = (a70) this.d;
                g4Var.f47957i0.N.c(true, 0.0f);
                a70Var.f33378p = new org.telegram.ui.a0(g4Var, this.f23729b, 0);
                a70Var.a0();
                return;
        }
    }
}
