package lh;

import org.telegram.messenger.camera.CameraController;

public final class ma implements Runnable {

    public final int f16401a;

    public final oa f16402b;

    public ma(oa oaVar, int i10) {
        this.f16401a = i10;
        this.f16402b = oaVar;
    }

    @Override
    public final void run() {
        switch (this.f16401a) {
            case 0:
                sb sbVar = this.f16402b.f16494a;
                u6 u6Var = sbVar.f16822y0;
                if (u6Var != null) {
                    u6Var.c(false);
                }
                if (sbVar.M1 && sbVar.N1 && sbVar.f16818x0 != null) {
                    sbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(sbVar.f16818x0.getCameraSessionRecording(), false, false);
                    break;
                }
                break;
            case 1:
                this.f16402b.f16494a.K(1, true);
                break;
            case 2:
                this.f16402b.f16494a.K(1, true);
                break;
            default:
                this.f16402b.f16494a.K(1, true);
                break;
        }
    }
}
