package org.telegram.messenger.camera;

public final class h implements Runnable {

    public final int f19920a;

    public final CameraController f19921b;

    public final CameraSession f19922c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f19920a = i10;
        this.f19921b = cameraController;
        this.f19922c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f19920a) {
            case 0:
                this.f19921b.lambda$stopPreview$8(this.f19922c);
                break;
            default:
                this.f19921b.lambda$startPreview$7(this.f19922c);
                break;
        }
    }
}
