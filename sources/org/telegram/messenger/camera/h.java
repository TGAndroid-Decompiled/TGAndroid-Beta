package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17529a;
    public final CameraController f17530b;
    public final CameraSession f17531c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17529a = i10;
        this.f17530b = cameraController;
        this.f17531c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17529a) {
            case 0:
                this.f17530b.lambda$stopPreview$8(this.f17531c);
                return;
            default:
                this.f17530b.lambda$startPreview$7(this.f17531c);
                return;
        }
    }
}
