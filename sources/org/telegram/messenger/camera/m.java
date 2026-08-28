package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f19962a;
    public final CameraView f19963b;

    public m(CameraView cameraView, int i9) {
        this.f19962a = i9;
        this.f19963b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f19962a) {
            case 0:
                this.f19963b.lambda$resetCamera$4();
                return;
            case 1:
                this.f19963b.lambda$new$7();
                return;
            case 2:
                this.f19963b.lambda$toggleDual$2();
                return;
            case 3:
                this.f19963b.lambda$switchCamera$3();
                return;
            case 4:
                this.f19963b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f19963b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f19963b.lambda$enableDualInternal$0();
                return;
        }
    }
}
