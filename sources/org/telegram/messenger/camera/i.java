package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f17377a = 0;
    public final boolean f17378b;
    public final boolean f17379c;
    public final Object d;
    public final Object f17380e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17380e = obj;
        this.f17378b = z10;
        this.f17379c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17377a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17380e, this.f17378b, this.f17379c);
                return;
            default:
                String str = (String) this.f17380e;
                e2 e2Var = ((b2) this.d).f21663b;
                e2Var.f21865d0 = false;
                e2Var.f21867e0 = str;
                if (str == null) {
                    e2Var.f21867e0 = "";
                }
                e2Var.f21869f0 = this.f17378b;
                e2Var.f(this.f17379c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.f17380e = str;
        this.f17378b = z10;
        this.f17379c = z11;
    }
}
