package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f16099a;
    public final CameraView f16100b;

    public m(CameraView cameraView, int i10) {
        this.f16099a = i10;
        this.f16100b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f16099a) {
            case 0:
                this.f16100b.lambda$resetCamera$4();
                return;
            case 1:
                this.f16100b.lambda$new$7();
                return;
            case 2:
                this.f16100b.lambda$toggleDual$2();
                return;
            case 3:
                this.f16100b.lambda$switchCamera$3();
                return;
            case 4:
                this.f16100b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f16100b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f16100b.lambda$enableDualInternal$0();
                return;
        }
    }
}
