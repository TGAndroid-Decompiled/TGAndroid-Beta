package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18378a;
    public final CameraView f18379b;

    public m(CameraView cameraView, int i10) {
        this.f18378a = i10;
        this.f18379b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18378a) {
            case 0:
                this.f18379b.lambda$resetCamera$4();
                return;
            case 1:
                this.f18379b.lambda$new$7();
                return;
            case 2:
                this.f18379b.lambda$toggleDual$2();
                return;
            case 3:
                this.f18379b.lambda$switchCamera$3();
                return;
            case 4:
                this.f18379b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f18379b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f18379b.lambda$enableDualInternal$0();
                return;
        }
    }
}
