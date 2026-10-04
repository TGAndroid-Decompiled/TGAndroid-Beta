package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17539a;
    public final CameraController f17540b;
    public final CameraSession f17541c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17539a = i10;
        this.f17540b = cameraController;
        this.f17541c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                this.f17540b.lambda$stopPreview$8(this.f17541c);
                return;
            default:
                this.f17540b.lambda$startPreview$7(this.f17541c);
                return;
        }
    }
}
