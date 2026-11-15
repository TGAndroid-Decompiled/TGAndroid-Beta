package org.telegram.messenger.camera;
public final class l implements Runnable {
    public final int f22839a;
    public final CameraView f22840b;

    public l(CameraView cameraView, int i7) {
        this.f22839a = i7;
        this.f22840b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f22839a) {
            case 0:
                this.f22840b.lambda$resetCamera$4();
                return;
            case 1:
                this.f22840b.lambda$new$7();
                return;
            case 2:
                this.f22840b.lambda$toggleDual$2();
                return;
            case 3:
                this.f22840b.lambda$switchCamera$3();
                return;
            case 4:
                this.f22840b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f22840b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f22840b.lambda$enableDualInternal$0();
                return;
        }
    }
}
