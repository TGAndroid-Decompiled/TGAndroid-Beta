package org.telegram.messenger;

import org.telegram.ui.Components.z60;
public final class je implements Runnable {
    public final int f16453a;
    public final float f16454b;
    public final vs f16455c;
    public final Object d;

    public je(vs vsVar, Object obj, float f7, int i10) {
        this.f16453a = i10;
        this.f16455c = vsVar;
        this.d = obj;
        this.f16454b = f7;
    }

    @Override
    public final void run() {
        switch (this.f16453a) {
            case 0:
                MediaController mediaController = (MediaController) this.f16455c;
                kj kjVar = (kj) this.d;
                if (mediaController.f14458i0 != null && mediaController.f14483u0 != null && !mediaController.f14454g0) {
                    if (mediaController.L(kjVar)) {
                        mediaController.i0(mediaController.f14483u0, this.f16454b);
                    }
                    mediaController.f14458i0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.h4 h4Var = (org.telegram.ui.h4) this.f16455c;
                z60 z60Var = (z60) this.d;
                h4Var.f37679h0.M.c(true, 0.0f);
                z60Var.f33039p = new org.telegram.ui.a0(h4Var, this.f16454b, 0);
                z60Var.Z();
                return;
        }
    }
}
