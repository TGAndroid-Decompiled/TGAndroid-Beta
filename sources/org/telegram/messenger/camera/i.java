package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;
public final class i implements Runnable {
    public final int f19911a = 0;
    public final boolean f19912b;
    public final boolean f19913c;
    public final Object d;
    public final Object f19914e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f19914e = obj;
        this.f19912b = z10;
        this.f19913c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19911a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f19914e, this.f19912b, this.f19913c);
                return;
            default:
                String str = (String) this.f19914e;
                d2 d2Var = ((a2) this.d).f24068b;
                d2Var.W = false;
                d2Var.f24203a0 = str;
                if (str == null) {
                    d2Var.f24203a0 = "";
                }
                d2Var.f24205b0 = this.f19912b;
                d2Var.f(this.f19913c, true);
                return;
        }
    }

    public i(a2 a2Var, String str, File file, boolean z10, boolean z11) {
        this.d = a2Var;
        this.f19914e = str;
        this.f19912b = z10;
        this.f19913c = z11;
    }
}
