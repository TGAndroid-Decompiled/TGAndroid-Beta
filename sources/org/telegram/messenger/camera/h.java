package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17392a;
    public final CameraController f17393b;
    public final CameraSession f17394c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17392a = i10;
        this.f17393b = cameraController;
        this.f17394c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17392a) {
            case 0:
                this.f17393b.lambda$stopPreview$8(this.f17394c);
                return;
            default:
                this.f17393b.lambda$startPreview$7(this.f17394c);
                return;
        }
    }
}
