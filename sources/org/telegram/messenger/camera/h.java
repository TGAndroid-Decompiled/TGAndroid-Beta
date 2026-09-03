package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18370a;
    public final CameraController f18371b;
    public final CameraSession f18372c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18370a = i10;
        this.f18371b = cameraController;
        this.f18372c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18370a) {
            case 0:
                this.f18371b.lambda$stopPreview$8(this.f18372c);
                return;
            default:
                this.f18371b.lambda$startPreview$7(this.f18372c);
                return;
        }
    }
}
