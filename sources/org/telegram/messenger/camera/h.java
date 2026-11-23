package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23230a;
    public final CameraController f23231b;
    public final CameraSession f23232c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23230a = i7;
        this.f23231b = cameraController;
        this.f23232c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23230a) {
            case 0:
                this.f23231b.lambda$stopPreview$8(this.f23232c);
                return;
            default:
                this.f23231b.lambda$startPreview$7(this.f23232c);
                return;
        }
    }
}
