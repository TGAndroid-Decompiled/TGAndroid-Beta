package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f14942a;
    public final CameraController f14943b;
    public final CameraSession f14944c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f14942a = i10;
        this.f14943b = cameraController;
        this.f14944c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f14942a) {
            case 0:
                this.f14943b.lambda$stopPreview$8(this.f14944c);
                return;
            default:
                this.f14943b.lambda$startPreview$7(this.f14944c);
                return;
        }
    }
}
