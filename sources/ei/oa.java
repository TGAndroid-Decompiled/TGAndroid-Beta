package ei;

import org.telegram.messenger.camera.CameraController;
public final class oa implements Runnable {
    public final int f9571a;
    public final qa f9572b;

    public oa(qa qaVar, int i10) {
        this.f9571a = i10;
        this.f9572b = qaVar;
    }

    @Override
    public final void run() {
        switch (this.f9571a) {
            case 0:
                vb vbVar = this.f9572b.f9665a;
                v6 v6Var = vbVar.C0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (vbVar.Q1 && vbVar.R1 && vbVar.B0 != null) {
                    vbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(vbVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f9572b.f9665a.J(1, true);
                return;
            case 2:
                this.f9572b.f9665a.J(1, true);
                return;
            default:
                this.f9572b.f9665a.J(1, true);
                return;
        }
    }
}
