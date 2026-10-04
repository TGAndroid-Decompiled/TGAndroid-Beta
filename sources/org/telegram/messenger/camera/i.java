package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.c2;
import org.telegram.ui.Cells.f2;
public final class i implements Runnable {
    public final int f17540a = 0;
    public final boolean f17541b;
    public final boolean f17542c;
    public final Object d;
    public final Object f17543e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17543e = obj;
        this.f17541b = z10;
        this.f17542c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17540a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17543e, this.f17541b, this.f17542c);
                return;
            default:
                String str = (String) this.f17543e;
                f2 f2Var = ((c2) this.d).f21866b;
                f2Var.f22078d0 = false;
                f2Var.f22080e0 = str;
                if (str == null) {
                    f2Var.f22080e0 = "";
                }
                f2Var.f22082f0 = this.f17541b;
                f2Var.f(this.f17542c, true);
                return;
        }
    }

    public i(c2 c2Var, String str, File file, boolean z10, boolean z11) {
        this.d = c2Var;
        this.f17543e = str;
        this.f17541b = z10;
        this.f17542c = z11;
    }
}
