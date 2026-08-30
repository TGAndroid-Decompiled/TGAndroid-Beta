package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f16948a = 0;
    public final boolean f16949b;
    public final boolean f16950c;
    public final Object d;
    public final Object e;

    public i(CameraController cameraController, Object obj, boolean z4, boolean z10) {
        this.d = cameraController;
        this.e = obj;
        this.f16949b = z4;
        this.f16950c = z10;
    }

    @Override
    public final void run() {
        switch (this.f16948a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.f16949b, this.f16950c);
                return;
            default:
                String str = (String) this.e;
                e2 e2Var = ((b2) this.d).f20861b;
                e2Var.f20984a0 = false;
                e2Var.f20986b0 = str;
                if (str == null) {
                    e2Var.f20986b0 = "";
                }
                e2Var.f20988c0 = this.f16949b;
                e2Var.f(this.f16950c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z4, boolean z10) {
        this.d = b2Var;
        this.e = str;
        this.f16949b = z4;
        this.f16950c = z10;
    }
}
