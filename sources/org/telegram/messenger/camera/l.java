package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f19798a;
    public final CameraView f19799b;

    public l(CameraView cameraView, int i10) {
        this.f19798a = i10;
        this.f19799b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f19798a) {
            case 0:
                this.f19799b.lambda$resetCamera$4();
                return;
            case 1:
                this.f19799b.lambda$new$7();
                return;
            case 2:
                this.f19799b.lambda$toggleDual$2();
                return;
            case 3:
                this.f19799b.lambda$switchCamera$3();
                return;
            case 4:
                this.f19799b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f19799b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f19799b.lambda$enableDualInternal$0();
                return;
        }
    }
}
