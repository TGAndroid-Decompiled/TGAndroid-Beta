package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16080a;
    public final CameraController f16081b;
    public final CameraSession f16082c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16080a = i10;
        this.f16081b = cameraController;
        this.f16082c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16080a) {
            case 0:
                this.f16081b.lambda$stopPreview$8(this.f16082c);
                return;
            default:
                this.f16081b.lambda$startPreview$7(this.f16082c);
                return;
        }
    }
}
