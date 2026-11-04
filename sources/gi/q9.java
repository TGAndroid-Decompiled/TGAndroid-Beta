package gi;

import org.telegram.messenger.camera.CameraController;
public final class q9 implements Runnable {
    public final int f13450a;
    public final s9 f13451b;

    public q9(s9 s9Var, int i3) {
        this.f13450a = i3;
        this.f13451b = s9Var;
    }

    @Override
    public final void run() {
        switch (this.f13450a) {
            case 0:
                va vaVar = this.f13451b.f13580a;
                c6 c6Var = vaVar.D0;
                if (c6Var != null) {
                    c6Var.c(false);
                }
                if (vaVar.R1 && vaVar.S1 && vaVar.C0 != null) {
                    vaVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(vaVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f13451b.f13580a.J(1, true);
                return;
            case 2:
                this.f13451b.f13580a.J(1, true);
                return;
            default:
                this.f13451b.f13580a.J(1, true);
                return;
        }
    }
}
