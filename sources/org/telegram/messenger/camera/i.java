package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f15846a = 0;
    public final boolean f15847b;
    public final boolean f15848c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f15847b = z10;
        this.f15848c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15846a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f15847b, this.f15848c);
                return;
            default:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f19813b;
                e2Var.f19989d0 = false;
                e2Var.f19990e0 = str;
                if (str == null) {
                    e2Var.f19990e0 = "";
                }
                e2Var.f19992f0 = this.f15847b;
                e2Var.f(this.f15848c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.e = str;
        this.f15847b = z10;
        this.f15848c = z11;
    }
}
