package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17531a;
    public final CameraController f17532b;
    public final CameraSession f17533c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17531a = i10;
        this.f17532b = cameraController;
        this.f17533c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17531a) {
            case 0:
                this.f17532b.lambda$stopPreview$8(this.f17533c);
                return;
            default:
                this.f17532b.lambda$startPreview$7(this.f17533c);
                return;
        }
    }
}
