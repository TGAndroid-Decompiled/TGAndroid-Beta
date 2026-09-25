package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f16104a;
    public final CameraView f16105b;

    public m(CameraView cameraView, int i10) {
        this.f16104a = i10;
        this.f16105b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16104a) {
            case 0:
                this.f16105b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16105b.lambda$new$7();
                return;
            case 2:
                this.f16105b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16105b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16105b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16105b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16105b.lambda$enableDualInternal$0();
                return;
        }
    }
}
