package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f21768a;
    public final CameraController f21769b;
    public final CameraSession f21770c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f21768a = i7;
        this.f21769b = cameraController;
        this.f21770c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f21768a) {
            case 0:
                this.f21769b.lambda$stopPreview$8(this.f21770c);
                return;
            default:
                this.f21769b.lambda$startPreview$7(this.f21770c);
                return;
        }
    }
}
