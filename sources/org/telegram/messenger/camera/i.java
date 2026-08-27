package org.telegram.messenger.camera;

import java.io.File;
import org.telegram.ui.Cells.a2;
import org.telegram.ui.Cells.d2;

public final class i implements Runnable {

    public final int f19923a = 0;

    public final boolean f19924b;

    public final boolean f19925c;
    public final Object d;

    public final Object f19926e;

    public i(CameraController cameraController, Object obj, boolean z10, boolean z11) {
        this.d = cameraController;
        this.f19926e = obj;
        this.f19924b = z10;
        this.f19925c = z11;
    }

    @Override
    public final void run() throws Throwable {
        switch (this.f19923a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.f19926e, this.f19924b, this.f19925c);
                break;
            default:
                a2 a2Var = (a2) this.d;
                String str = (String) this.f19926e;
                d2 d2Var = a2Var.f24055b;
                d2Var.W = false;
                d2Var.f24181a0 = str;
                if (str == null) {
                    d2Var.f24181a0 = "";
                }
                d2Var.f24183b0 = this.f19924b;
                d2Var.f(this.f19925c, true);
                break;
        }
    }

    public i(a2 a2Var, String str, File file, boolean z10, boolean z11) {
        this.d = a2Var;
        this.f19926e = str;
        this.f19924b = z10;
        this.f19925c = z11;
    }
}
