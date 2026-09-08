package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17374a;
    public final CameraController f17375b;
    public final CameraSession f17376c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17374a = i10;
        this.f17375b = cameraController;
        this.f17376c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17374a) {
            case 0:
                this.f17375b.lambda$stopPreview$8(this.f17376c);
                return;
            default:
                this.f17375b.lambda$startPreview$7(this.f17376c);
                return;
        }
    }
}
