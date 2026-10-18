package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18060a;
    public final CameraView f18061b;

    public m(CameraView cameraView, int i10) {
        this.f18060a = i10;
        this.f18061b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18060a) {
            case 0:
                this.f18061b.lambda$resetCamera$4();
                return;
            case 1:
                this.f18061b.lambda$new$7();
                return;
            case 2:
                this.f18061b.lambda$toggleDual$2();
                return;
            case 3:
                this.f18061b.lambda$switchCamera$3();
                return;
            case 4:
                this.f18061b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f18061b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f18061b.lambda$enableDualInternal$0();
                return;
        }
    }
}
