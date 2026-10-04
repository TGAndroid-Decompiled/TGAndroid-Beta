package ci;

import org.telegram.messenger.camera.CameraController;
public final class db implements Runnable {
    public final int f4930a;
    public final fb f4931b;

    public db(fb fbVar, int i10) {
        this.f4930a = i10;
        this.f4931b = fbVar;
    }

    @Override
    public final void run() {
        switch (this.f4930a) {
            case 0:
                kc kcVar = this.f4931b.f5090a;
                f7 f7Var = kcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (kcVar.Q1 && kcVar.R1 && kcVar.B0 != null) {
                    kcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(kcVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f4931b.f5090a.K(1, true);
                return;
            case 2:
                this.f4931b.f5090a.K(1, true);
                return;
            default:
                this.f4931b.f5090a.K(1, true);
                return;
        }
    }
}
