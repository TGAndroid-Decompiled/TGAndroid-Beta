package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17365a;
    public final CameraController f17366b;
    public final CameraSession f17367c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17365a = i10;
        this.f17366b = cameraController;
        this.f17367c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17365a) {
            case 0:
                this.f17366b.lambda$stopPreview$8(this.f17367c);
                return;
            default:
                this.f17366b.lambda$startPreview$7(this.f17367c);
                return;
        }
    }
}
