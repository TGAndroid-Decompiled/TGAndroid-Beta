package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f15856a;
    public final CameraView f15857b;

    public m(CameraView cameraView, int i10) {
        this.f15856a = i10;
        this.f15857b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f15856a) {
            case 0:
                this.f15857b.lambda$resetCamera$4();
                return;
            case 1:
                this.f15857b.lambda$new$7();
                return;
            case 2:
                this.f15857b.lambda$toggleDual$2();
                return;
            case 3:
                this.f15857b.lambda$switchCamera$3();
                return;
            case 4:
                this.f15857b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f15857b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f15857b.lambda$enableDualInternal$0();
                return;
        }
    }
}
