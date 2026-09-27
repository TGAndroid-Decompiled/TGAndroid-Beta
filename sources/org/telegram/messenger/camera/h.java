package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16089a;
    public final CameraController f16090b;
    public final CameraSession f16091c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16089a = i10;
        this.f16090b = cameraController;
        this.f16091c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16089a) {
            case 0:
                this.f16090b.lambda$stopPreview$8(this.f16091c);
                return;
            default:
                this.f16090b.lambda$startPreview$7(this.f16091c);
                return;
        }
    }
}
