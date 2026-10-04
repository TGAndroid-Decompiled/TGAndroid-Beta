package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17540a;
    public final CameraController f17541b;
    public final CameraSession f17542c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17540a = i10;
        this.f17541b = cameraController;
        this.f17542c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17540a) {
            case 0:
                this.f17541b.lambda$stopPreview$8(this.f17542c);
                return;
            default:
                this.f17541b.lambda$startPreview$7(this.f17542c);
                return;
        }
    }
}
