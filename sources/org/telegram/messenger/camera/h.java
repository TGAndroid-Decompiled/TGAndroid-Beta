package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18055a;
    public final CameraController f18056b;
    public final CameraSession f18057c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18055a = i10;
        this.f18056b = cameraController;
        this.f18057c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18055a) {
            case 0:
                this.f18056b.lambda$stopPreview$8(this.f18057c);
                return;
            default:
                this.f18056b.lambda$startPreview$7(this.f18057c);
                return;
        }
    }
}
