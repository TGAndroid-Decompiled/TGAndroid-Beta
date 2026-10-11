package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17577a;
    public final CameraView f17578b;

    public m(CameraView cameraView, int i10) {
        this.f17577a = i10;
        this.f17578b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17577a) {
            case 0:
                this.f17578b.lambda$resetCamera$4();
                return;
            case 1:
                this.f17578b.lambda$new$7();
                return;
            case 2:
                this.f17578b.lambda$toggleDual$2();
                return;
            case 3:
                this.f17578b.lambda$switchCamera$3();
                return;
            case 4:
                this.f17578b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f17578b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f17578b.lambda$enableDualInternal$0();
                return;
        }
    }
}
