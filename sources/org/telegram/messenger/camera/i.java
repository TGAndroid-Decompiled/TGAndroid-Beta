package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f18373a = 0;
    public final boolean f18374b;
    public final boolean f18375c;
    public final Object d;
    public final Object f18376e;

    public i(CameraController cameraController, Object obj, boolean z4, boolean z10) {
        this.d = cameraController;
        this.f18376e = obj;
        this.f18374b = z4;
        this.f18375c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18373a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f18376e, this.f18374b, this.f18375c);
                return;
            default:
                String str = (String) this.f18376e;
                e2 e2Var = ((b2) this.d).f22590b;
                e2Var.f22724a0 = false;
                e2Var.f22726b0 = str;
                if (str == null) {
                    e2Var.f22726b0 = "";
                }
                e2Var.f22728c0 = this.f18374b;
                e2Var.f(this.f18375c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z4, boolean z10) {
        this.d = b2Var;
        this.f18376e = str;
        this.f18374b = z4;
        this.f18375c = z10;
    }
}
