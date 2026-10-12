package di;

import org.telegram.messenger.camera.CameraController;
public final class db implements Runnable {
    public final int f6846a;
    public final fb f6847b;

    public db(fb fbVar, int i10) {
        this.f6846a = i10;
        this.f6847b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f6846a) {
            case 0:
                kc kcVar = this.f6847b.f6954a;
                e7 e7Var = kcVar.C0;
                if (e7Var != null) {
                    e7Var.c(false);
                }
                if (kcVar.Q1 && kcVar.R1 && kcVar.B0 != null) {
                    kcVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(kcVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f6847b.f6954a.J(1, true);
                return;
            case 2:
                this.f6847b.f6954a.J(1, true);
                return;
            default:
                this.f6847b.f6954a.J(1, true);
                return;
        }
    }
}
