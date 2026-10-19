package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18054a;
    public final CameraController f18055b;
    public final CameraSession f18056c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18054a = i10;
        this.f18055b = cameraController;
        this.f18056c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18054a) {
            case 0:
                this.f18055b.lambda$stopPreview$8(this.f18056c);
                return;
            default:
                this.f18055b.lambda$startPreview$7(this.f18056c);
                return;
        }
    }
}
