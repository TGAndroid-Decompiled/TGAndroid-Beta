package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f17543a = 0;
    public final boolean f17544b;
    public final boolean f17545c;
    public final Object d;
    public final Object f17546e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17546e = obj;
        this.f17544b = z10;
        this.f17545c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17543a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17546e, this.f17544b, this.f17545c);
                return;
            default:
                String str = (String) this.f17546e;
                f2 f2Var = ((c2) this.d).f21862b;
                f2Var.f22074d0 = false;
                f2Var.f22076e0 = str;
                if (str == null) {
                    f2Var.f22076e0 = "";
                }
                f2Var.f22078f0 = this.f17544b;
                f2Var.f(this.f17545c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.f17546e = str;
        this.f17544b = z10;
        this.f17545c = z11;
    }
}
