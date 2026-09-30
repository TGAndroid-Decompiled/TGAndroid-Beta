package ci;

import org.telegram.messenger.camera.CameraController;
public final class eb implements Runnable {
    public final int f4668a;
    public final gb f4669b;

    public eb(gb gbVar, int i10) {
        this.f4668a = i10;
        this.f4669b = gbVar;
    }

    @Override
    public final void run() {
        switch (this.f4668a) {
            case 0:
                lc lcVar = this.f4669b.f4742a;
                f7 f7Var = lcVar.C0;
                if (f7Var != null) {
                    f7Var.c(false);
                }
                if (lcVar.Q1 && lcVar.R1 && lcVar.B0 != null) {
                    lcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(lcVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f4669b.f4742a.K(1, true);
                return;
            case 2:
                this.f4669b.f4742a.K(1, true);
                return;
            default:
                this.f4669b.f4742a.K(1, true);
                return;
        }
    }
}
