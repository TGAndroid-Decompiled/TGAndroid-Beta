package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.b2;
import org.telegram.ui.Cells.e2;
public final class i implements Runnable {
    public final int f17368a = 0;
    public final boolean f17369b;
    public final boolean f17370c;
    public final Object d;
    public final Object f17371e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f17371e = obj;
        this.f17369b = z10;
        this.f17370c = z11;
    }

    @Override
    public final void run() {
        switch (this.f17368a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f17371e, this.f17369b, this.f17370c);
                return;
            default:
                String str = (String) this.f17371e;
                e2 e2Var = ((b2) this.d).f21636b;
                e2Var.f21838d0 = false;
                e2Var.f21840e0 = str;
                if (str == null) {
                    e2Var.f21840e0 = "";
                }
                e2Var.f21842f0 = this.f17369b;
                e2Var.f(this.f17370c, true);
                return;
        }
    }

    public i(b2 b2Var, String str, File file, boolean z10, boolean z11) {
        this.d = b2Var;
        this.f17371e = str;
        this.f17369b = z10;
        this.f17370c = z11;
    }
}
