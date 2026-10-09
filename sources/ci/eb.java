package ci;

import org.telegram.messenger.camera.CameraController;
public final class eb implements Runnable {
    public final int f5054a;
    public final gb f5055b;

    public eb(gb gbVar, int i10) {
        this.f5054a = i10;
        this.f5055b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f5054a) {
            case 0:
                lc lcVar = this.f5055b.f5132a;
                f7 f7Var = lcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (lcVar.Q1 && lcVar.R1 && lcVar.B0 != null) {
                    lcVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(lcVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f5055b.f5132a.J(1, true);
                return;
            case 2:
                this.f5055b.f5132a.J(1, true);
                return;
            default:
                this.f5055b.f5132a.J(1, true);
                return;
        }
    }
}
