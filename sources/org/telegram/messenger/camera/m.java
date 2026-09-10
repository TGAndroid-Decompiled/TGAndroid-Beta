package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f14888a;
    public final CameraView f14889b;

    public m(CameraView cameraView, int i10) {
        this.f14888a = i10;
        this.f14889b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f14888a) {
            case 0:
                this.f14889b.lambda$resetCamera$4();
                return;
            case 1:
                this.f14889b.lambda$new$7();
                return;
            case 2:
                this.f14889b.lambda$toggleDual$2();
                return;
            case 3:
                this.f14889b.lambda$switchCamera$3();
                return;
            case 4:
                this.f14889b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f14889b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f14889b.lambda$enableDualInternal$0();
                return;
        }
    }
}
