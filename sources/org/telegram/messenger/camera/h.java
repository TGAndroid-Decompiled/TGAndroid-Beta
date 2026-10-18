package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18064a;
    public final CameraController f18065b;
    public final CameraSession f18066c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18064a = i10;
        this.f18065b = cameraController;
        this.f18066c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18064a) {
            case 0:
                this.f18065b.lambda$stopPreview$8(this.f18066c);
                return;
            default:
                this.f18065b.lambda$startPreview$7(this.f18066c);
                return;
        }
    }
}
