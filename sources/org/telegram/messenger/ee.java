package org.telegram.messenger;

import org.telegram.ui.Components.x60;
public final class ee implements Runnable {
    public final int f23805a;
    public final float f23806b;
    public final fs f23807c;
    public final Object d;

    public ee(fs fsVar, Object obj, float f10, int i7) {
        this.f23805a = i7;
        this.f23807c = fsVar;
        this.d = obj;
        this.f23806b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23805a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23807c;
                fj fjVar = (fj) this.d;
                if (mediaController.f22814j0 != null && mediaController.f22838v0 != null && !mediaController.f22810h0) {
                    if (mediaController.L(fjVar)) {
                        mediaController.i0(mediaController.f22838v0, this.f23806b);
                    }
                    mediaController.f22814j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23807c;
                x60 x60Var = (x60) this.d;
                g4Var.f48072i0.N.c(true, 0.0f);
                x60Var.f41886p = new org.telegram.ui.a0(g4Var, this.f23806b, 0);
                x60Var.a0();
                return;
        }
    }
}
