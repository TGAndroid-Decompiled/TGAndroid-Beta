package hi;

import org.telegram.messenger.camera.CameraController;
public final class n9 implements Runnable {
    public final int f15133a;
    public final p9 f15134b;

    public n9(p9 p9Var, int i7) {
        this.f15133a = i7;
        this.f15134b = p9Var;
    }

    @Override
    public final void run() {
        switch (this.f15133a) {
            case 0:
                sa saVar = this.f15134b.f15282a;
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
                this.f15134b.f15282a.J(1, true);
                return;
            case 2:
                this.f15134b.f15282a.J(1, true);
                return;
            default:
                this.f15134b.f15282a.J(1, true);
                return;
        }
    }
}
