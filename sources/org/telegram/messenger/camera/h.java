package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f15847a;
    public final CameraController f15848b;
    public final CameraSession f15849c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f15847a = i10;
        this.f15848b = cameraController;
        this.f15849c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f15847a) {
            case 0:
                this.f15848b.lambda$stopPreview$8(this.f15849c);
                return;
            default:
                this.f15848b.lambda$startPreview$7(this.f15849c);
                return;
        }
    }
}
