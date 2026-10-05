package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17542a;
    public final CameraController f17543b;
    public final CameraSession f17544c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17542a = i10;
        this.f17543b = cameraController;
        this.f17544c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17542a) {
            case 0:
                this.f17543b.lambda$stopPreview$8(this.f17544c);
                return;
            default:
                this.f17543b.lambda$startPreview$7(this.f17544c);
                return;
        }
    }
}
