package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18051a;
    public final CameraController f18052b;
    public final CameraSession f18053c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18051a = i10;
        this.f18052b = cameraController;
        this.f18053c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18051a) {
            case 0:
                this.f18052b.lambda$stopPreview$8(this.f18053c);
                return;
            default:
                this.f18052b.lambda$startPreview$7(this.f18053c);
                return;
        }
    }
}
