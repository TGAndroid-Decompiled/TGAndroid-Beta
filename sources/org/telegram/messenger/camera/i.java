package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f15859a = 0;
    public final boolean f15860b;
    public final boolean f15861c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f15860b = z10;
        this.f15861c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15859a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f15860b, this.f15861c);
                return;
            default:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f19836b;
                e2Var.f20021d0 = false;
                e2Var.f20022e0 = str;
                if (str == null) {
                    e2Var.f20022e0 = "";
                }
                e2Var.f20024f0 = this.f15860b;
                e2Var.f(this.f15861c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.e = str;
        this.f15860b = z10;
        this.f15861c = z11;
    }
}
