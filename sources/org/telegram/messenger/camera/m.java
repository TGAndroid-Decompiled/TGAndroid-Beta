package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f16939a;
    public final CameraView f16940b;

    public m(CameraView cameraView, int i10) {
        this.f16939a = i10;
        this.f16940b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16939a) {
            case 0:
                this.f16940b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16940b.lambda$new$7();
                return;
            case 2:
                this.f16940b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16940b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16940b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16940b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16940b.lambda$enableDualInternal$0();
                return;
        }
    }
}
