package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f16671a;
    public final CameraView f16672b;

    public l(CameraView cameraView, int i10) {
        this.f16671a = i10;
        this.f16672b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16671a) {
            case 0:
                this.f16672b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16672b.lambda$new$7();
                return;
            case 2:
                this.f16672b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16672b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16672b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16672b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16672b.lambda$enableDualInternal$0();
                return;
        }
    }
}
