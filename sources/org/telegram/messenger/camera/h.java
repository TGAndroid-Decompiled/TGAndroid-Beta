package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23300a;
    public final CameraController f23301b;
    public final CameraSession f23302c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23300a = i7;
        this.f23301b = cameraController;
        this.f23302c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23300a) {
            case 0:
                this.f23301b.lambda$stopPreview$8(this.f23302c);
                return;
            default:
                this.f23301b.lambda$startPreview$7(this.f23302c);
                return;
        }
    }
}
