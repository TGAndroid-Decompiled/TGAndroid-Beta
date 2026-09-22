package ci;

import org.telegram.messenger.camera.CameraController;
public final class hb implements Runnable {
    public final int f4767a;
    public final jb f4768b;

    public hb(jb jbVar, int i10) {
        this.f4767a = i10;
        this.f4768b = jbVar;
    }

    @Override
    public final void run() {
        switch (this.f4767a) {
            case 0:
                oc ocVar = this.f4768b.f4858a;
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
                this.f4768b.f4858a.K(1, true);
                return;
            case 2:
                this.f4768b.f4858a.K(1, true);
                return;
            default:
                this.f4768b.f4858a.K(1, true);
                return;
        }
    }
}
