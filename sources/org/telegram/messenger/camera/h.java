package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16665a;
    public final CameraController f16666b;
    public final CameraSession f16667c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16665a = i10;
        this.f16666b = cameraController;
        this.f16667c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16665a) {
            case 0:
                this.f16666b.lambda$stopPreview$8(this.f16667c);
                return;
            default:
                this.f16666b.lambda$startPreview$7(this.f16667c);
                return;
        }
    }
}
