package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16090a;
    public final CameraController f16091b;
    public final CameraSession f16092c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16090a = i10;
        this.f16091b = cameraController;
        this.f16092c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16090a) {
            case 0:
                this.f16091b.lambda$stopPreview$8(this.f16092c);
                return;
            default:
                this.f16091b.lambda$startPreview$7(this.f16092c);
                return;
        }
    }
}
