package org.telegram.messenger;

import org.telegram.ui.Components.k60;
public final class ie implements Runnable {
    public final int f23162a;
    public final float f23163b;
    public final ls f23164c;
    public final Object d;

    public ie(ls lsVar, Object obj, float f10, int i7) {
        this.f23162a = i7;
        this.f23164c = lsVar;
        this.d = obj;
        this.f23163b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23162a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23164c;
                ij ijVar = (ij) this.d;
                if (mediaController.f21268i0 != null && mediaController.f21292u0 != null && !mediaController.f21264g0) {
                    if (mediaController.L(ijVar)) {
                        mediaController.i0(mediaController.f21292u0, this.f23163b);
                    }
                    mediaController.f21268i0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23164c;
                k60 k60Var = (k60) this.d;
                g4Var.f45831h0.M.c(true, 0.0f);
                k60Var.f35175p = new org.telegram.ui.b0(g4Var, this.f23163b, 0);
                k60Var.Z();
                return;
        }
    }
}
