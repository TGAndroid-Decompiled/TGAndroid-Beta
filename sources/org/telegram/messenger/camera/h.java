package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16035a;
    public final CameraController f16036b;
    public final CameraSession f16037c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16035a = i10;
        this.f16036b = cameraController;
        this.f16037c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16035a) {
            case 0:
                this.f16036b.lambda$stopPreview$8(this.f16037c);
                return;
            default:
                this.f16036b.lambda$startPreview$7(this.f16037c);
                return;
        }
    }
}
