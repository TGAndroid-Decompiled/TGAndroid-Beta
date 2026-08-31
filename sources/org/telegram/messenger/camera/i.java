package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f18371a = 0;
    public final boolean f18372b;
    public final boolean f18373c;
    public final Object d;
    public final Object f18374e;

    public i(CameraController cameraController, Object obj, boolean z4, boolean z10) {
        this.d = cameraController;
        this.f18374e = obj;
        this.f18372b = z4;
        this.f18373c = z10;
    }

    @Override
    public final void run() {
        switch (this.f18371a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f18374e, this.f18372b, this.f18373c);
                return;
            default:
                String str = (String) this.f18374e;
                e2 e2Var = ((b2) this.d).f22588b;
                e2Var.f22722a0 = false;
                e2Var.f22724b0 = str;
                if (str == null) {
                    e2Var.f22724b0 = "";
                }
                e2Var.f22726c0 = this.f18372b;
                e2Var.f(this.f18373c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z4, boolean z10) {
        this.d = b2Var;
        this.f18374e = str;
        this.f18372b = z4;
        this.f18373c = z10;
    }
}
