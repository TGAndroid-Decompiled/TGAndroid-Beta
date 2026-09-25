package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16095a;
    public final CameraController f16096b;
    public final CameraSession f16097c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16095a = i10;
        this.f16096b = cameraController;
        this.f16097c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16095a) {
            case 0:
                this.f16096b.lambda$stopPreview$8(this.f16097c);
                return;
            default:
                this.f16096b.lambda$startPreview$7(this.f16097c);
                return;
        }
    }
}
