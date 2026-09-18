package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f15865a;
    public final CameraView f15866b;

    public m(CameraView cameraView, int i10) {
        this.f15865a = i10;
        this.f15866b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f15865a) {
            case 0:
                this.f15866b.lambda$resetCamera$4();
                return;
            case 1:
                this.f15866b.lambda$new$7();
                return;
            case 2:
                this.f15866b.lambda$toggleDual$2();
                return;
            case 3:
                this.f15866b.lambda$switchCamera$3();
                return;
            case 4:
                this.f15866b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f15866b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f15866b.lambda$enableDualInternal$0();
                return;
        }
    }
}
