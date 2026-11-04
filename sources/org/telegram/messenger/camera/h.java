package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f21971a;
    public final CameraController f21972b;
    public final CameraSession f21973c;

    public h(CameraController cameraController, CameraSession cameraSession, int i3) {
        this.f21971a = i3;
        this.f21972b = cameraController;
        this.f21973c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f21971a) {
            case 0:
                this.f21972b.lambda$stopPreview$8(this.f21973c);
                return;
            default:
                this.f21972b.lambda$startPreview$7(this.f21973c);
                return;
        }
    }
}
