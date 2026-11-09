package fi;

import org.telegram.messenger.camera.CameraController;
public final class p9 implements Runnable {
    public final int f12620a;
    public final r9 f12621b;

    public p9(r9 r9Var, int i7) {
        this.f12620a = i7;
        this.f12621b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f12620a) {
            case 0:
                va vaVar = this.f12621b.f12758a;
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
                this.f12621b.f12758a.J(1, true);
                return;
            case 2:
                this.f12621b.f12758a.J(1, true);
                return;
            default:
                this.f12621b.f12758a.J(1, true);
                return;
        }
    }
}
