package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f14879a;
    public final CameraController f14880b;
    public final CameraSession f14881c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f14879a = i10;
        this.f14880b = cameraController;
        this.f14881c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f14879a) {
            case 0:
                this.f14880b.lambda$stopPreview$8(this.f14881c);
                return;
            default:
                this.f14880b.lambda$startPreview$7(this.f14881c);
                return;
        }
    }
}
