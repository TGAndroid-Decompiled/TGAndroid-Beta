package defpackage;

import org.telegram.messenger.camera.CameraController;
public final class pab implements Runnable {
    public final byte a;
    public final rab b;

    public pab(rab rabVar, byte b) {
        this.a = b;
        this.b = rabVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        rab rabVar = this.b;
        switch (b) {
            case 0:
                rbb rbbVar = rabVar.a;
                oy8 oy8Var = rbbVar.D0;
                if (oy8Var != null) {
                    oy8Var.f(false);
                }
                if (rbbVar.R1 && rbbVar.S1 && rbbVar.C0 != null) {
                    rbbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(rbbVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                rabVar.a.I(1, true);
                return;
            case 2:
                rabVar.a.I(1, true);
                return;
            default:
                rabVar.a.I(1, true);
                return;
        }
    }
}
