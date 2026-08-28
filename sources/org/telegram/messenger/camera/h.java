package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f19952a;
    public final CameraController f19953b;
    public final CameraSession f19954c;

    public h(CameraController cameraController, CameraSession cameraSession, int i9) {
        this.f19952a = i9;
        this.f19953b = cameraController;
        this.f19954c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f19952a) {
            case 0:
                this.f19953b.lambda$stopPreview$8(this.f19954c);
                return;
            default:
                this.f19953b.lambda$startPreview$7(this.f19954c);
                return;
        }
    }
}
