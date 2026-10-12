package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17277a;
    public final CameraController f17278b;
    public final CameraSession f17279c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17277a = i10;
        this.f17278b = cameraController;
        this.f17279c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17277a) {
            case 0:
                this.f17278b.lambda$stopPreview$8(this.f17279c);
                return;
            default:
                this.f17278b.lambda$startPreview$7(this.f17279c);
                return;
        }
    }
}
