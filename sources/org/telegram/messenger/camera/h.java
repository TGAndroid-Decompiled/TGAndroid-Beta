package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18368a;
    public final CameraController f18369b;
    public final CameraSession f18370c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18368a = i10;
        this.f18369b = cameraController;
        this.f18370c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18368a) {
            case 0:
                this.f18369b.lambda$stopPreview$8(this.f18370c);
                return;
            default:
                this.f18369b.lambda$startPreview$7(this.f18370c);
                return;
        }
    }
}
