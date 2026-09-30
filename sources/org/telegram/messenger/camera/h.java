package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16106a;
    public final CameraController f16107b;
    public final CameraSession f16108c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16106a = i10;
        this.f16107b = cameraController;
        this.f16108c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16106a) {
            case 0:
                this.f16107b.lambda$stopPreview$8(this.f16108c);
                return;
            default:
                this.f16107b.lambda$startPreview$7(this.f16108c);
                return;
        }
    }
}
