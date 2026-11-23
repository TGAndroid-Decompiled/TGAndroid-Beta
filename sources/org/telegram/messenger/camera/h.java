package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23266a;
    public final CameraController f23267b;
    public final CameraSession f23268c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23266a = i7;
        this.f23267b = cameraController;
        this.f23268c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23266a) {
            case 0:
                this.f23267b.lambda$stopPreview$8(this.f23268c);
                return;
            default:
                this.f23267b.lambda$startPreview$7(this.f23268c);
                return;
        }
    }
}
