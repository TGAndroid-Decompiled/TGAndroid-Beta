package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f21810a;
    public final CameraController f21811b;
    public final CameraSession f21812c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f21810a = i7;
        this.f21811b = cameraController;
        this.f21812c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f21810a) {
            case 0:
                this.f21811b.lambda$stopPreview$8(this.f21812c);
                return;
            default:
                this.f21811b.lambda$startPreview$7(this.f21812c);
                return;
        }
    }
}
