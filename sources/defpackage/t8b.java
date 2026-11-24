package defpackage;

import org.telegram.messenger.camera.CameraController;
public final class t8b implements Runnable {
    public final byte a;
    public final v8b b;

    public t8b(v8b v8bVar, byte b) {
        this.a = b;
        this.b = v8bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        v8b v8bVar = this.b;
        switch (b) {
            case 0:
                v9b v9bVar = v8bVar.a;
                ex8 ex8Var = v9bVar.D0;
                if (ex8Var != null) {
                    ex8Var.f(false);
                }
                if (v9bVar.R1 && v9bVar.S1 && v9bVar.C0 != null) {
                    v9bVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(v9bVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                v8bVar.a.I(1, true);
                return;
            case 2:
                v8bVar.a.I(1, true);
                return;
            default:
                v8bVar.a.I(1, true);
                return;
        }
    }
}
