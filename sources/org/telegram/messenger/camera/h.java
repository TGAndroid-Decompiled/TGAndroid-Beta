package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f15856a;
    public final CameraController f15857b;
    public final CameraSession f15858c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f15856a = i10;
        this.f15857b = cameraController;
        this.f15858c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f15856a) {
            case 0:
                this.f15857b.lambda$stopPreview$8(this.f15858c);
                return;
            default:
                this.f15857b.lambda$startPreview$7(this.f15858c);
                return;
        }
    }
}
