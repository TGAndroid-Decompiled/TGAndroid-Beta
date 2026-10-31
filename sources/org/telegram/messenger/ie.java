package org.telegram.messenger;

import org.telegram.ui.Components.z60;
public final class ie implements Runnable {
    public final int f16118a;
    public final float f16119b;
    public final us f16120c;
    public final Object d;

    public ie(us usVar, Object obj, float f7, int i10) {
        this.f16118a = i10;
        this.f16120c = usVar;
        this.d = obj;
        this.f16119b = f7;
    }

    @Override
    public final void run() {
        switch (this.f16118a) {
            case 0:
                MediaController mediaController = (MediaController) this.f16120c;
                jj jjVar = (jj) this.d;
                if (mediaController.f14457i0 != null && mediaController.f14482u0 != null && !mediaController.f14453g0) {
                    if (mediaController.L(jjVar)) {
                        mediaController.i0(mediaController.f14482u0, this.f16119b);
                    }
                    mediaController.f14457i0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f16120c;
                z60 z60Var = (z60) this.d;
                h4Var.f37734h0.M.c(true, 0.0f);
                z60Var.f32936p = new org.telegram.ui.a0(h4Var, this.f16119b, 0);
                z60Var.Z();
                return;
        }
    }
}
