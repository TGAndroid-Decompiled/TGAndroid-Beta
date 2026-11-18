package org.telegram.messenger;

import org.telegram.ui.Components.y60;
public final class ee implements Runnable {
    public final int f23700a;
    public final float f23701b;
    public final fs f23702c;
    public final Object d;

    public ee(fs fsVar, Object obj, float f10, int i7) {
        this.f23700a = i7;
        this.f23702c = fsVar;
        this.d = obj;
        this.f23701b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23700a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23702c;
                fj fjVar = (fj) this.d;
                if (mediaController.f22716j0 != null && mediaController.f22740v0 != null && !mediaController.f22712h0) {
                    if (mediaController.L(fjVar)) {
                        mediaController.i0(mediaController.f22740v0, this.f23701b);
                    }
                    mediaController.f22716j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23702c;
                y60 y60Var = (y60) this.d;
                g4Var.f47887i0.N.c(true, 0.0f);
                y60Var.f42369p = new org.telegram.ui.a0(g4Var, this.f23701b, 0);
                y60Var.a0();
                return;
        }
    }
}
