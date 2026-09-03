package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16930a;
    public final CameraController f16931b;
    public final CameraSession f16932c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16930a = i10;
        this.f16931b = cameraController;
        this.f16932c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16930a) {
            case 0:
                this.f16931b.lambda$stopPreview$8(this.f16932c);
                return;
            default:
                this.f16931b.lambda$startPreview$7(this.f16932c);
                return;
        }
    }
}
