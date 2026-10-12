package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f16968a;
    public final CameraController f16969b;
    public final CameraSession f16970c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f16968a = i10;
        this.f16969b = cameraController;
        this.f16970c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f16968a) {
            case 0:
                this.f16969b.lambda$stopPreview$8(this.f16970c);
                return;
            default:
                this.f16969b.lambda$startPreview$7(this.f16970c);
                return;
        }
    }
}
