package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f18058a;
    public final CameraView f18059b;

    public m(CameraView cameraView, int i10) {
        this.f18058a = i10;
        this.f18059b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f18058a) {
            case 0:
                this.f18059b.lambda$resetCamera$4();
                return;
            case 1:
                this.f18059b.lambda$new$7();
                return;
            case 2:
                this.f18059b.lambda$toggleDual$2();
                return;
            case 3:
                this.f18059b.lambda$switchCamera$3();
                return;
            case 4:
                this.f18059b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f18059b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f18059b.lambda$enableDualInternal$0();
                return;
        }
    }
}
