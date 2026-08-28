package kh;

import org.telegram.messenger.camera.CameraController;
public final class pa implements Runnable {
    public final int f15846a;
    public final ra f15847b;

    public pa(ra raVar, int i9) {
        this.f15846a = i9;
        this.f15847b = raVar;
    }

    @Override
    public final void run() {
        switch (this.f15846a) {
            case 0:
                wb wbVar = this.f15847b.f15971a;
                v6 v6Var = wbVar.f16326y0;
                if (v6Var != null) {
                    v6Var.c(false);
                }
                if (wbVar.M1 && wbVar.N1 && wbVar.f16322x0 != null) {
                    wbVar.j0(false);
                    CameraController.getInstance().stopVideoRecording(wbVar.f16322x0.getCameraSessionRecording(), false, false);
                    return;
                }
                return;
            case 1:
                this.f15847b.f15971a.K(1, true);
                return;
            case 2:
                this.f15847b.f15971a.K(1, true);
                return;
            default:
                this.f15847b.f15971a.K(1, true);
                return;
        }
    }
}
