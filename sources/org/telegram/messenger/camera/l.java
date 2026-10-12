package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f16974a;
    public final CameraView f16975b;

    public l(CameraView cameraView, int i10) {
        this.f16974a = i10;
        this.f16975b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16974a) {
            case 0:
                this.f16975b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16975b.lambda$new$7();
                return;
            case 2:
                this.f16975b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16975b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16975b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16975b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16975b.lambda$enableDualInternal$0();
                return;
        }
    }
}
