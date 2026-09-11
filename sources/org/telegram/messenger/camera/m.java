package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17375a;
    public final CameraView f17376b;

    public m(CameraView cameraView, int i10) {
        this.f17375a = i10;
        this.f17376b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17375a) {
            case 0:
                this.f17376b.lambda$resetCamera$4();
                return;
            case 1:
                this.f17376b.lambda$new$7();
                return;
            case 2:
                this.f17376b.lambda$toggleDual$2();
                return;
            case 3:
                this.f17376b.lambda$switchCamera$3();
                return;
            case 4:
                this.f17376b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f17376b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f17376b.lambda$enableDualInternal$0();
                return;
        }
    }
}
