package hi;

import org.telegram.messenger.camera.CameraController;
public final class o9 implements Runnable {
    public final int f15155a;
    public final q9 f15156b;

    public o9(q9 q9Var, int i7) {
        this.f15155a = i7;
        this.f15156b = q9Var;
    }

    @Override
    public final void run() {
        switch (this.f15155a) {
            case 0:
                ta taVar = this.f15156b.f15255a;
                a6 a6Var = taVar.D0;
                if (a6Var != null) {
                    a6Var.c(false);
                }
                if (taVar.R1 && taVar.S1 && taVar.C0 != null) {
                    taVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(taVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f15156b.f15255a.J(1, true);
                return;
            case 2:
                this.f15156b.f15255a.J(1, true);
                return;
            default:
                this.f15156b.f15255a.J(1, true);
                return;
        }
    }
}
