package org.telegram.messenger;

import org.telegram.ui.Components.f60;
public final class ce implements Runnable {
    public final int f22011a;
    public final float f22012b;
    public final cs f22013c;
    public final Object d;

    public ce(cs csVar, Object obj, float f10, int i3) {
        this.f22011a = i3;
        this.f22013c = csVar;
        this.d = obj;
        this.f22012b = f10;
    }

    @Override
    public final void run() {
        switch (this.f22011a) {
            case 0:
                MediaController mediaController = (MediaController) this.f22013c;
                zi ziVar = (zi) this.d;
                if (mediaController.f21324j0 != null && mediaController.f21348v0 != null && !mediaController.f21320h0) {
                    if (mediaController.L(ziVar)) {
                        mediaController.i0(mediaController.f21348v0, this.f22012b);
                    }
                    mediaController.f21324j0.h0();
                    return;
                }
                return;
            default:
                org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f22013c;
                f60 f60Var = (f60) this.d;
                i4Var.f46088i0.N.c(true, 0.0f);
                f60Var.f33742p = new org.telegram.ui.c0(i4Var, this.f22012b, 0);
                f60Var.Z();
                return;
        }
    }
}
