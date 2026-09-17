package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f17395a = 0;
    public final boolean f17396b;
    public final boolean f17397c;
    public final Object d;
    public final Object f17398e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17398e = obj;
        this.f17396b = z10;
        this.f17397c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17395a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17398e, this.f17396b, this.f17397c);
                return;
            default:
                String str = (String) this.f17398e;
                e2 e2Var = ((b2) this.d).f21664b;
                e2Var.f21866d0 = false;
                e2Var.f21868e0 = str;
                if (str == null) {
                    e2Var.f21868e0 = "";
                }
                e2Var.f21870f0 = this.f17396b;
                e2Var.f(this.f17397c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.f17398e = str;
        this.f17396b = z10;
        this.f17397c = z11;
    }
}
