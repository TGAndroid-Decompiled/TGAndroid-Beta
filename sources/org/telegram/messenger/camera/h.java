package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18057a;
    public final CameraController f18058b;
    public final CameraSession f18059c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18057a = i10;
        this.f18058b = cameraController;
        this.f18059c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18057a) {
            case 0:
                this.f18058b.lambda$stopPreview$8(this.f18059c);
                return;
            default:
                this.f18058b.lambda$startPreview$7(this.f18059c);
                return;
        }
    }
}
