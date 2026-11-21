package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23325a;
    public final CameraController f23326b;
    public final CameraSession f23327c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23325a = i7;
        this.f23326b = cameraController;
        this.f23327c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23325a) {
            case 0:
                this.f23326b.lambda$stopPreview$8(this.f23327c);
                return;
            default:
                this.f23326b.lambda$startPreview$7(this.f23327c);
                return;
        }
    }
}
