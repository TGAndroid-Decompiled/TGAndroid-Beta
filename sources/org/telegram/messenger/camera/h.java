package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16083a;
    public final CameraController f16084b;
    public final CameraSession f16085c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16083a = i10;
        this.f16084b = cameraController;
        this.f16085c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16083a) {
            case 0:
                this.f16084b.lambda$stopPreview$8(this.f16085c);
                return;
            default:
                this.f16084b.lambda$startPreview$7(this.f16085c);
                return;
        }
    }
}
