package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f15843a;
    public final CameraController f15844b;
    public final CameraSession f15845c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f15843a = i10;
        this.f15844b = cameraController;
        this.f15845c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f15843a) {
            case 0:
                this.f15844b.lambda$stopPreview$8(this.f15845c);
                return;
            default:
                this.f15844b.lambda$startPreview$7(this.f15845c);
                return;
        }
    }
}
