package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f17542a = 0;
    public final boolean f17543b;
    public final boolean f17544c;
    public final Object d;
    public final Object f17545e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17545e = obj;
        this.f17543b = z10;
        this.f17544c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17545e, this.f17543b, this.f17544c);
                return;
            default:
                String str = (String) this.f17545e;
                f2 f2Var = ((c2) this.d).f21861b;
                f2Var.f22073d0 = false;
                f2Var.f22075e0 = str;
                if (str == null) {
                    f2Var.f22075e0 = "";
                }
                f2Var.f22077f0 = this.f17543b;
                f2Var.f(this.f17544c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.f17545e = str;
        this.f17543b = z10;
        this.f17544c = z11;
    }
}
