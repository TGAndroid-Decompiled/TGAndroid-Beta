package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17402a;
    public final CameraView f17403b;

    public m(CameraView cameraView, int i10) {
        this.f17402a = i10;
        this.f17403b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17402a) {
            case 0:
                this.f17403b.lambda$resetCamera$4();
                return;
            case 1:
                this.f17403b.lambda$new$7();
                return;
            case 2:
                this.f17403b.lambda$toggleDual$2();
                return;
            case 3:
                this.f17403b.lambda$switchCamera$3();
                return;
            case 4:
                this.f17403b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f17403b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f17403b.lambda$enableDualInternal$0();
                return;
        }
    }
}
