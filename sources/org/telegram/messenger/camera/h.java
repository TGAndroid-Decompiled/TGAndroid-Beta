package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f23416a;
    public final CameraController f23417b;
    public final CameraSession f23418c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f23416a = i7;
        this.f23417b = cameraController;
        this.f23418c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f23416a) {
            case 0:
                this.f23417b.lambda$stopPreview$8(this.f23418c);
                return;
            default:
                this.f23417b.lambda$startPreview$7(this.f23418c);
                return;
        }
    }
}
