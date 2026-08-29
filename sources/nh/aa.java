package nh;

import org.telegram.messenger.camera.CameraController;
public final class aa implements Runnable {
    public final int f17396a;
    public final ca f17397b;

    public aa(ca caVar, int i10) {
        this.f17396a = i10;
        this.f17397b = caVar;
    }

    @Override
    public final void run() {
        switch (this.f17396a) {
            case 0:
                gb gbVar = this.f17397b.f17486a;
                j6 j6Var = gbVar.f17816y0;
                if (j6Var != null) {
                    j6Var.c(false);
                }
                if (gbVar.M1 && gbVar.N1 && gbVar.f17812x0 != null) {
                    gbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(gbVar.f17812x0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f17397b.f17486a.K(1, true);
                return;
            case 2:
                this.f17397b.f17486a.K(1, true);
                return;
            default:
                this.f17397b.f17486a.K(1, true);
                return;
        }
    }
}
