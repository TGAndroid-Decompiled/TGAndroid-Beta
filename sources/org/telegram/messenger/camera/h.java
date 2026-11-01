package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f15106a;
    public final CameraController f15107b;
    public final CameraSession f15108c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f15106a = i10;
        this.f15107b = cameraController;
        this.f15108c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f15106a) {
            case 0:
                this.f15107b.lambda$stopPreview$8(this.f15108c);
                return;
            default:
                this.f15107b.lambda$startPreview$7(this.f15108c);
                return;
        }
    }
}
