package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f15850a = 0;
    public final boolean f15851b;
    public final boolean f15852c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.e = obj;
        this.f15851b = z10;
        this.f15852c = z11;
    }

    @Override
    public final void run() {
        switch (this.f15850a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f15851b, this.f15852c);
                return;
            default:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f19825b;
                e2Var.f20010d0 = false;
                e2Var.f20011e0 = str;
                if (str == null) {
                    e2Var.f20011e0 = "";
                }
                e2Var.f20013f0 = this.f15851b;
                e2Var.f(this.f15852c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.e = str;
        this.f15851b = z10;
        this.f15852c = z11;
    }
}
