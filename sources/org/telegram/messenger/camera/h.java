package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18049a;
    public final CameraController f18050b;
    public final CameraSession f18051c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18049a = i10;
        this.f18050b = cameraController;
        this.f18051c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18049a) {
            case 0:
                this.f18050b.lambda$stopPreview$8(this.f18051c);
                return;
            default:
                this.f18050b.lambda$startPreview$7(this.f18051c);
                return;
        }
    }
}
