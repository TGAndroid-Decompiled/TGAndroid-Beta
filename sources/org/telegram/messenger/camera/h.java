package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18115a;
    public final CameraController f18116b;
    public final CameraSession f18117c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18115a = i10;
        this.f18116b = cameraController;
        this.f18117c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18115a) {
            case 0:
                this.f18116b.lambda$stopPreview$8(this.f18117c);
                return;
            default:
                this.f18116b.lambda$startPreview$7(this.f18117c);
                return;
        }
    }
}
