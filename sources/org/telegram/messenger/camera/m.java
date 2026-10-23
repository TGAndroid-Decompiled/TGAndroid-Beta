package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18066a;
    public final CameraView f18067b;

    public m(CameraView cameraView, int i10) {
        this.f18066a = i10;
        this.f18067b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18066a) {
            case 0:
                this.f18067b.lambda$resetCamera$4();
                return;
            case 1:
                this.f18067b.lambda$new$7();
                return;
            case 2:
                this.f18067b.lambda$toggleDual$2();
                return;
            case 3:
                this.f18067b.lambda$switchCamera$3();
                return;
            case 4:
                this.f18067b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f18067b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f18067b.lambda$enableDualInternal$0();
                return;
        }
    }
}
