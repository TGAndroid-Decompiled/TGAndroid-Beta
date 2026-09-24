package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f16083a = 0;
    public final boolean f16084b;
    public final boolean f16085c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f16084b = z10;
        this.f16085c = z11;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f16084b, this.f16085c);
                return;
            default:
                String str = (String) this.e;
                f2 f2Var = ((c2) this.d).f20069b;
                f2Var.f20265d0 = false;
                f2Var.f20266e0 = str;
                if (str == null) {
                    f2Var.f20266e0 = "";
                }
                f2Var.f20268f0 = this.f16084b;
                f2Var.f(this.f16085c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.e = str;
        this.f16084b = z10;
        this.f16085c = z11;
    }
}
