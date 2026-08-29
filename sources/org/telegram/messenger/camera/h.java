package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f19908a;
    public final CameraController f19909b;
    public final CameraSession f19910c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f19908a = i10;
        this.f19909b = cameraController;
        this.f19910c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f19908a) {
            case 0:
                this.f19909b.lambda$stopPreview$8(this.f19910c);
                return;
            default:
                this.f19909b.lambda$startPreview$7(this.f19910c);
                return;
        }
    }
}
