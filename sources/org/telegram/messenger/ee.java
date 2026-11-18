package org.telegram.messenger;

import org.telegram.ui.Components.y60;
public final class ee implements Runnable {
    public final int f23703a;
    public final float f23704b;
    public final fs f23705c;
    public final Object d;

    public ee(fs fsVar, Object obj, float f10, int i7) {
        this.f23703a = i7;
        this.f23705c = fsVar;
        this.d = obj;
        this.f23704b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23703a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23705c;
                fj fjVar = (fj) this.d;
                if (mediaController.f22719j0 != null && mediaController.f22743v0 != null && !mediaController.f22715h0) {
                    if (mediaController.L(fjVar)) {
                        mediaController.i0(mediaController.f22743v0, this.f23704b);
                    }
                    mediaController.f22719j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23705c;
                y60 y60Var = (y60) this.d;
                g4Var.f47923i0.N.c(true, 0.0f);
                y60Var.f42369p = new org.telegram.ui.a0(g4Var, this.f23704b, 0);
                y60Var.a0();
                return;
        }
    }
}
