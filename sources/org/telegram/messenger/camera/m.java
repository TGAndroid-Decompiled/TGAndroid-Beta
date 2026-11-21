package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f23335a;
    public final CameraView f23336b;

    public m(CameraView cameraView, int i7) {
        this.f23335a = i7;
        this.f23336b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f23335a) {
            case 0:
                this.f23336b.lambda$resetCamera$4();
                return;
            case 1:
                this.f23336b.lambda$new$7();
                return;
            case 2:
                this.f23336b.lambda$toggleDual$2();
                return;
            case 3:
                this.f23336b.lambda$switchCamera$3();
                return;
            case 4:
                this.f23336b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f23336b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f23336b.lambda$enableDualInternal$0();
                return;
        }
    }
}
