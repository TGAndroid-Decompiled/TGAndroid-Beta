package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f18120a;
    public final CameraController f18121b;
    public final CameraSession f18122c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f18120a = i10;
        this.f18121b = cameraController;
        this.f18122c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f18120a) {
            case 0:
                this.f18121b.lambda$stopPreview$8(this.f18122c);
                return;
            default:
                this.f18121b.lambda$startPreview$7(this.f18122c);
                return;
        }
    }
}
