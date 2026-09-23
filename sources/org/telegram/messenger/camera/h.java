package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f15837a;
    public final CameraController f15838b;
    public final CameraSession f15839c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f15837a = i10;
        this.f15838b = cameraController;
        this.f15839c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f15837a) {
            case 0:
                this.f15838b.lambda$stopPreview$8(this.f15839c);
                return;
            default:
                this.f15838b.lambda$startPreview$7(this.f15839c);
                return;
        }
    }
}
