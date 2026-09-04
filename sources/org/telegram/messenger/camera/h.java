package org.telegram.messenger.camera;
public final class h implements Runnable {
    public final int f17347a;
    public final CameraController f17348b;
    public final CameraSession f17349c;

    public h(CameraController cameraController, CameraSession cameraSession, int i10) {
        this.f17347a = i10;
        this.f17348b = cameraController;
        this.f17349c = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.f17347a) {
            case 0:
                this.f17348b.lambda$stopPreview$8(this.f17349c);
                return;
            default:
                this.f17348b.lambda$startPreview$7(this.f17349c);
                return;
        }
    }
}
