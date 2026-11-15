package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f22833a;
    public final CameraController f22834b;
    public final CameraSession f22835c;

    public h(CameraController cameraController, CameraSession cameraSession, int i7) {
        this.f22833a = i7;
        this.f22834b = cameraController;
        this.f22835c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f22833a) {
            case 0:
                this.f22834b.lambda$stopPreview$8(this.f22835c);
                return;
            default:
                this.f22834b.lambda$startPreview$7(this.f22835c);
                return;
        }
    }
}
