package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23297a;
    public final CameraController f23298b;
    public final CameraSession f23299c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23297a = i7;
        this.f23298b = cameraController;
        this.f23299c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23297a) {
            case 0:
                this.f23298b.lambda$stopPreview$8(this.f23299c);
                return;
            default:
                this.f23298b.lambda$startPreview$7(this.f23299c);
                return;
        }
    }
}
