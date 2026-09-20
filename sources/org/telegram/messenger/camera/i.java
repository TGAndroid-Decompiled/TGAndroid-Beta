package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f16071a = 0;
    public final boolean f16072b;
    public final boolean f16073c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f16072b = z10;
        this.f16073c = z11;
    }

    @Override
    public final void run() {
        switch (this.f16071a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f16072b, this.f16073c);
                return;
            default:
                String str = (String) this.e;
                f2 f2Var = ((c2) this.d).f20082b;
                f2Var.f20256d0 = false;
                f2Var.f20257e0 = str;
                if (str == null) {
                    f2Var.f20257e0 = "";
                }
                f2Var.f20259f0 = this.f16072b;
                f2Var.f(this.f16073c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.e = str;
        this.f16072b = z10;
        this.f16073c = z11;
    }
}
