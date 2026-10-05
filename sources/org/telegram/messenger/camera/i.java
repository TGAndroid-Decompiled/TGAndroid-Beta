package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f17545a = 0;
    public final boolean f17546b;
    public final boolean f17547c;
    public final Object d;
    public final Object f17548e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17548e = obj;
        this.f17546b = z10;
        this.f17547c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17545a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17548e, this.f17546b, this.f17547c);
                return;
            default:
                String str = (String) this.f17548e;
                f2 f2Var = ((c2) this.d).f21870b;
                f2Var.f22082d0 = false;
                f2Var.f22084e0 = str;
                if (str == null) {
                    f2Var.f22084e0 = "";
                }
                f2Var.f22086f0 = this.f17546b;
                f2Var.f(this.f17547c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.f17548e = str;
        this.f17546b = z10;
        this.f17547c = z11;
    }
}
