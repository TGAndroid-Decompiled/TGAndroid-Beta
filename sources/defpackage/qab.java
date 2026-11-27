package defpackage;

import org.telegram.messenger.camera.CameraController;
public final class qab implements Runnable {
    public final byte a;
    public final sab b;

    public qab(sab sabVar, byte b) {
        this.a = b;
        this.b = sabVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        sab sabVar = this.b;
        switch (b) {
            case 0:
                sbb sbbVar = sabVar.a;
                oy8 oy8Var = sbbVar.D0;
                if (oy8Var != null) {
                    oy8Var.f(false);
                }
                if (sbbVar.R1 && sbbVar.S1 && sbbVar.C0 != null) {
                    sbbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(sbbVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                sabVar.a.I(1, true);
                return;
            case 2:
                sabVar.a.I(1, true);
                return;
            default:
                sabVar.a.I(1, true);
                return;
        }
    }
}
