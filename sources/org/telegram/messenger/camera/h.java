package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17567a;
    public final CameraController f17568b;
    public final CameraSession f17569c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17567a = i10;
        this.f17568b = cameraController;
        this.f17569c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17567a) {
            case 0:
                this.f17568b.lambda$stopPreview$8(this.f17569c);
                return;
            default:
                this.f17568b.lambda$startPreview$7(this.f17569c);
                return;
        }
    }
}
