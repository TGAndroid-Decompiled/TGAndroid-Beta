package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;
public final class i implements Runnable {
    public final int f16933a = 0;
    public final boolean f16934b;
    public final boolean f16935c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z4, boolean z10) {
        this.d = cameraController;
        this.e = obj;
        this.f16934b = z4;
        this.f16935c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16933a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f16934b, this.f16935c);
                return;
            default:
                String str = (String) this.e;
                d2 d2Var = ((a2) this.d).f20792b;
                d2Var.f20901a0 = false;
                d2Var.f20903b0 = str;
                if (str == null) {
                    d2Var.f20903b0 = "";
                }
                d2Var.f20905c0 = this.f16934b;
                d2Var.f(this.f16935c, true);
                return;
        }
    }

    public i(a2 a2Var, String str, File file, boolean z4, boolean z10) {
        this.d = a2Var;
        this.e = str;
        this.f16934b = z4;
        this.f16935c = z10;
    }
}
