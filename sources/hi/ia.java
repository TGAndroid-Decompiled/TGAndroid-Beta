package hi;

import org.telegram.messenger.camera.CameraController;
public final class ia implements Runnable {
    public final int f14706a;
    public final ka f14707b;

    public ia(ka kaVar, int i7) {
        this.f14706a = i7;
        this.f14707b = kaVar;
    }

    @Override
    public final void run() {
        switch (this.f14706a) {
            case 0:
                nb nbVar = this.f14707b.f14800a;
                j6 j6Var = nbVar.D0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (nbVar.R1 && nbVar.S1 && nbVar.C0 != null) {
                    nbVar.i0(false);
                    CameraController.getInstance().stopVideoRecording(nbVar.C0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f14707b.f14800a.J(1, true);
                return;
            case 2:
                this.f14707b.f14800a.J(1, true);
                return;
            default:
                this.f14707b.f14800a.J(1, true);
                return;
        }
    }
}
