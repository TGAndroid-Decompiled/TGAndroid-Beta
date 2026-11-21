package hi;

import org.telegram.messenger.camera.CameraController;
public final class n9 implements Runnable {
    public final int f15130a;
    public final p9 f15131b;

    public n9(p9 p9Var, int i7) {
        this.f15130a = i7;
        this.f15131b = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f15130a) {
            case 0:
                sa saVar = this.f15131b.f15279a;
                z5 z5Var = saVar.D0;
                if (z5Var != null) {
                    z5Var.c(false);
                }
                if (saVar.R1 && saVar.S1 && saVar.C0 != null) {
                    saVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(saVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f15131b.f15279a.J(1, true);
                return;
            case 2:
                this.f15131b.f15279a.J(1, true);
                return;
            default:
                this.f15131b.f15279a.J(1, true);
                return;
        }
    }
}
