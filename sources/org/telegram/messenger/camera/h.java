package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16945a;
    public final CameraController f16946b;
    public final CameraSession f16947c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16945a = i10;
        this.f16946b = cameraController;
        this.f16947c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16945a) {
            case 0:
                this.f16946b.lambda$stopPreview$8(this.f16947c);
                return;
            default:
                this.f16946b.lambda$startPreview$7(this.f16947c);
                return;
        }
    }
}
