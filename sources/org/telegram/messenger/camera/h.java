package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f21774a;
    public final CameraController f21775b;
    public final CameraSession f21776c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f21774a = i7;
        this.f21775b = cameraController;
        this.f21776c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f21774a) {
            case 0:
                this.f21775b.lambda$stopPreview$8(this.f21776c);
                return;
            default:
                this.f21775b.lambda$startPreview$7(this.f21776c);
                return;
        }
    }
}
