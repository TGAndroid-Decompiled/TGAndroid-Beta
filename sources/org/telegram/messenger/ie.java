package org.telegram.messenger;

import org.telegram.ui.Components.k60;
public final class ie implements Runnable {
    public final int f23187a;
    public final float f23188b;
    public final ls f23189c;
    public final Object d;

    public ie(ls lsVar, Object obj, float f10, int i7) {
        this.f23187a = i7;
        this.f23189c = lsVar;
        this.d = obj;
        this.f23188b = f10;
    }

    @Override
    public final void run() {
        switch (this.f23187a) {
            case 0:
                MediaController mediaController = (MediaController) this.f23189c;
                ij ijVar = (ij) this.d;
                if (mediaController.f21271i0 != null && mediaController.f21295u0 != null && !mediaController.f21267g0) {
                    if (mediaController.L(ijVar)) {
                        mediaController.i0(mediaController.f21295u0, this.f23188b);
                    }
                    mediaController.f21271i0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f23189c;
                k60 k60Var = (k60) this.d;
                g4Var.f45807h0.M.c(true, 0.0f);
                k60Var.f35226p = new org.telegram.ui.b0(g4Var, this.f23188b, 0);
                k60Var.Z();
                return;
        }
    }
}
