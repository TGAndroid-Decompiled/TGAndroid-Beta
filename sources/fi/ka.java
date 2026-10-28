package fi;

import org.telegram.messenger.camera.CameraController;
public final class ka implements Runnable {
    public final int f11132a;
    public final ma f11133b;

    public ka(ma maVar, int i10) {
        this.f11132a = i10;
        this.f11133b = maVar;
    }

    @Override
    public final void run() {
        switch (this.f11132a) {
            case 0:
                sb sbVar = this.f11133b.f11269a;
                s6 s6Var = sbVar.C0;
                if (s6Var != null) {
                    s6Var.c(false);
                }
                if (sbVar.Q1 && sbVar.R1 && sbVar.B0 != null) {
                    sbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(sbVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f11133b.f11269a.J(1, true);
                return;
            case 2:
                this.f11133b.f11269a.J(1, true);
                return;
            default:
                this.f11133b.f11269a.J(1, true);
                return;
        }
    }
}
