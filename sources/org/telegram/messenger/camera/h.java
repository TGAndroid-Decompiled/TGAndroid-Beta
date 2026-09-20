package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16068a;
    public final CameraController f16069b;
    public final CameraSession f16070c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16068a = i10;
        this.f16069b = cameraController;
        this.f16070c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16068a) {
            case 0:
                this.f16069b.lambda$stopPreview$8(this.f16070c);
                return;
            default:
                this.f16069b.lambda$startPreview$7(this.f16070c);
                return;
        }
    }
}
