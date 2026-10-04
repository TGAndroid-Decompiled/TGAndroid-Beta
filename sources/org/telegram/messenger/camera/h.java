package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17537a;
    public final CameraController f17538b;
    public final CameraSession f17539c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17537a = i10;
        this.f17538b = cameraController;
        this.f17539c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17537a) {
            case 0:
                this.f17538b.lambda$stopPreview$8(this.f17539c);
                return;
            default:
                this.f17538b.lambda$startPreview$7(this.f17539c);
                return;
        }
    }
}
