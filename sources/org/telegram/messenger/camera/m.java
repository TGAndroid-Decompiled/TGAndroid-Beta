package org.telegram.messenger.camera;

public final class m implements Runnable {

    public final int f19930a;

    public final CameraView f19931b;

    public m(CameraView cameraView, int i10) {
        this.f19930a = i10;
        this.f19931b = cameraView;
    }

    @Override
    public final void run() {
        switch (this.f19930a) {
            case 0:
                this.f19931b.lambda$resetCamera$4();
                break;
            case 1:
                this.f19931b.lambda$new$7();
                break;
            case 2:
                this.f19931b.lambda$toggleDual$2();
                break;
            case 3:
                this.f19931b.lambda$switchCamera$3();
                break;
            case 4:
                this.f19931b.lambda$onSurfaceTextureDestroyed$5();
                break;
            case 5:
                this.f19931b.onSurfaceTextureUpdatedInternal();
                break;
            default:
                this.f19931b.lambda$enableDualInternal$0();
                break;
        }
    }
}
