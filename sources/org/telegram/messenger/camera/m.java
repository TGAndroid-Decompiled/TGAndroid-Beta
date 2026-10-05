package org.telegram.messenger.camera;
public final class m implements Runnable {
    public final int f17552a;
    public final CameraView f17553b;

    public m(CameraView cameraView, int i10) {
        this.f17552a = i10;
        this.f17553b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f17552a) {
            case 0:
                this.f17553b.lambda$resetCamera$4();
                return;
            case 1:
                this.f17553b.lambda$new$7();
                return;
            case 2:
                this.f17553b.lambda$toggleDual$2();
                return;
            case 3:
                this.f17553b.lambda$switchCamera$3();
                return;
            case 4:
                this.f17553b.lambda$onSurfaceTextureDestroyed$5();
                return;
            case 5:
                this.f17553b.onSurfaceTextureUpdatedInternal();
                return;
            default:
                this.f17553b.lambda$enableDualInternal$0();
                return;
        }
    }
}
