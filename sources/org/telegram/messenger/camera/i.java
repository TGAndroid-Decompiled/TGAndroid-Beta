package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f14882a = 0;
    public final boolean f14883b;
    public final boolean f14884c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f14883b = z10;
        this.f14884c = z11;
    }

    @Override
    public final void run() {
        switch (this.f14882a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f14883b, this.f14884c);
                return;
            default:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f18909b;
                e2Var.f19053d0 = false;
                e2Var.f19054e0 = str;
                if (str == null) {
                    e2Var.f19054e0 = "";
                }
                e2Var.f19056f0 = this.f14883b;
                e2Var.f(this.f14884c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.e = str;
        this.f14883b = z10;
        this.f14884c = z11;
    }
}
