package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17539a;
    public final CameraView f17540b;

    public m(CameraView cameraView, int i10) {
        this.f17539a = i10;
        this.f17540b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17539a) {
            case 0:
                this.f17540b.lambda$resetCamera$4();
                return;
            case 1:
                this.f17540b.lambda$new$7();
                return;
            case 2:
                this.f17540b.lambda$toggleDual$2();
                return;
            case 3:
                this.f17540b.lambda$switchCamera$3();
                return;
            case 4:
                this.f17540b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f17540b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f17540b.lambda$enableDualInternal$0();
                return;
        }
    }
}
