package di;

import org.telegram.messenger.camera.CameraController;
public final class hb implements Runnable {
    public final int f7347a;
    public final jb f7348b;

    public hb(jb jbVar, int i10) {
        this.f7347a = i10;
        this.f7348b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f7347a) {
            case 0:
                pc pcVar = this.f7348b.f7443a;
                h7 h7Var = pcVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (pcVar.Q1 && pcVar.R1 && pcVar.B0 != null) {
                    pcVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(pcVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f7348b.f7443a.K(1, true);
                return;
            case 2:
                this.f7348b.f7443a.K(1, true);
                return;
            default:
                this.f7348b.f7443a.K(1, true);
                return;
        }
    }
}
