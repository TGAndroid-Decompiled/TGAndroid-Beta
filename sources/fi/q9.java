package fi;

import org.telegram.messenger.camera.CameraController;
public final class q9 implements Runnable {
    public final int f12683a;
    public final s9 f12684b;

    public q9(s9 s9Var, int i7) {
        this.f12683a = i7;
        this.f12684b = s9Var;
    }

    @Override
    public final void run() {
        switch (this.f12683a) {
            case 0:
                va vaVar = this.f12684b.f12819a;
                c6 c6Var = vaVar.C0;
                if (c6Var != null) {
                    c6Var.c(false);
                }
                if (vaVar.Q1 && vaVar.R1 && vaVar.B0 != null) {
                    vaVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(vaVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f12684b.f12819a.J(1, true);
                return;
            case 2:
                this.f12684b.f12819a.J(1, true);
                return;
            default:
                this.f12684b.f12819a.J(1, true);
                return;
        }
    }
}
