package defpackage;

import org.telegram.messenger.camera.CameraController;
public final class r6b implements Runnable {
    public final byte a;
    public final t6b b;

    public r6b(t6b t6bVar, byte b) {
        this.a = b;
        this.b = t6bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        t6b t6bVar = this.b;
        switch (b) {
            case 0:
                t7b t7bVar = t6bVar.a;
                dv8 dv8Var = t7bVar.D0;
                if (dv8Var != null) {
                    dv8Var.f(false);
                }
                if (t7bVar.R1 && t7bVar.S1 && t7bVar.C0 != null) {
                    t7bVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(t7bVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                t6bVar.a.I(1, true);
                return;
            case 2:
                t6bVar.a.I(1, true);
                return;
            default:
                t6bVar.a.I(1, true);
                return;
        }
    }
}
