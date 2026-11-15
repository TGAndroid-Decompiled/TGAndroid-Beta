package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f22829a;
    public final CameraController f22830b;
    public final CameraSession f22831c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f22829a = i7;
        this.f22830b = cameraController;
        this.f22831c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f22829a) {
            case 0:
                this.f22830b.lambda$stopPreview$8(this.f22831c);
                return;
            default:
                this.f22830b.lambda$startPreview$7(this.f22831c);
                return;
        }
    }
}
