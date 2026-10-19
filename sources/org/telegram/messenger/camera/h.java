package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18061a;
    public final CameraController f18062b;
    public final CameraSession f18063c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18061a = i10;
        this.f18062b = cameraController;
        this.f18063c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18061a) {
            case 0:
                this.f18062b.lambda$stopPreview$8(this.f18063c);
                return;
            default:
                this.f18062b.lambda$startPreview$7(this.f18063c);
                return;
        }
    }
}
