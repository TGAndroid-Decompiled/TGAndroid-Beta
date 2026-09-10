package bi;

import org.telegram.messenger.camera.CameraController;
public final class qc implements Runnable {
    public final int f3477a;
    public final sc f3478b;

    public qc(sc scVar, int i10) {
        this.f3477a = i10;
        this.f3478b = scVar;
    }

    @Override
    public final void run() {
        switch (this.f3477a) {
            case 0:
                ce ceVar = this.f3478b.f3660a;
                i8 i8Var = ceVar.C0;
                if (i8Var != null) {
                    i8Var.c(false);
                }
                if (ceVar.Q1 && ceVar.R1 && ceVar.B0 != null) {
                    ceVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(ceVar.B0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f3478b.f3660a.K(1, true);
                return;
            case 2:
                this.f3478b.f3660a.K(1, true);
                return;
            default:
                this.f3478b.f3660a.K(1, true);
                return;
        }
    }
}
