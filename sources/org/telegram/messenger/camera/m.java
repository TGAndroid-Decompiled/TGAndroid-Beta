package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f16954a;
    public final CameraView f16955b;

    public m(CameraView cameraView, int i10) {
        this.f16954a = i10;
        this.f16955b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16954a) {
            case 0:
                this.f16955b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16955b.lambda$new$7();
                return;
            case 2:
                this.f16955b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16955b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16955b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16955b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16955b.lambda$enableDualInternal$0();
                return;
        }
    }
}
