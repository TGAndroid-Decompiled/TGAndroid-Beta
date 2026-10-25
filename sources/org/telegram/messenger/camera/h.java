package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f19792a;
    public final CameraController f19793b;
    public final CameraSession f19794c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f19792a = i10;
        this.f19793b = cameraController;
        this.f19794c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f19792a) {
            case 0:
                this.f19793b.lambda$stopPreview$8(this.f19794c);
                return;
            default:
                this.f19793b.lambda$startPreview$7(this.f19794c);
                return;
        }
    }
}
