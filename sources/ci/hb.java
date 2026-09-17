package ci;

import org.telegram.messenger.camera.CameraController;
public final class hb implements Runnable {
    public final int f4768a;
    public final jb f4769b;

    public hb(jb jbVar, int i10) {
        this.f4768a = i10;
        this.f4769b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f4768a) {
            case 0:
                oc ocVar = this.f4769b.f4859a;
                h7 h7Var = ocVar.C0;
                if (h7Var != null) {
                    h7Var.c(false);
                }
                if (ocVar.Q1 && ocVar.R1 && ocVar.B0 != null) {
                    ocVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(ocVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f4769b.f4859a.K(1, true);
                return;
            case 2:
                this.f4769b.f4859a.K(1, true);
                return;
            default:
                this.f4769b.f4859a.K(1, true);
                return;
        }
    }
}
