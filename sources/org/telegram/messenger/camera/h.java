package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17533a;
    public final CameraController f17534b;
    public final CameraSession f17535c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17533a = i10;
        this.f17534b = cameraController;
        this.f17535c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17533a) {
            case 0:
                this.f17534b.lambda$stopPreview$8(this.f17535c);
                return;
            default:
                this.f17534b.lambda$startPreview$7(this.f17535c);
                return;
        }
    }
}
