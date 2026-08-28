package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f19955a = 0;
    public final boolean f19956b;
    public final boolean f19957c;
    public final Object d;
    public final Object f19958e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f19958e = obj;
        this.f19956b = z10;
        this.f19957c = z11;
    }

    @Override
    public final void run() {
        switch (this.f19955a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f19958e, this.f19956b, this.f19957c);
                return;
            default:
                String str = (String) this.f19958e;
                e2 e2Var = ((b2) this.d).f24125b;
                e2Var.W = false;
                e2Var.f24271a0 = str;
                if (str == null) {
                    e2Var.f24271a0 = "";
                }
                e2Var.f24273b0 = this.f19956b;
                e2Var.f(this.f19957c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.f19958e = str;
        this.f19956b = z10;
        this.f19957c = z11;
    }
}
