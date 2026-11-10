package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f21814a;
    public final CameraController f21815b;
    public final CameraSession f21816c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f21814a = i7;
        this.f21815b = cameraController;
        this.f21816c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f21814a) {
            case 0:
                this.f21815b.lambda$stopPreview$8(this.f21816c);
                return;
            default:
                this.f21815b.lambda$startPreview$7(this.f21816c);
                return;
        }
    }
}
