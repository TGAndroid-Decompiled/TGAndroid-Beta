package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17276a;
    public final CameraController f17277b;
    public final CameraSession f17278c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17276a = i10;
        this.f17277b = cameraController;
        this.f17278c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17276a) {
            case 0:
                this.f17277b.lambda$stopPreview$8(this.f17278c);
                return;
            default:
                this.f17277b.lambda$startPreview$7(this.f17278c);
                return;
        }
    }
}
