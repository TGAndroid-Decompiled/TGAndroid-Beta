package org.telegram.messenger.camera;

public final class CameraView$$ExternalSyntheticLambda10 implements Runnable {
    public final int $r8$classId;
    public final CameraView f$0;

    public CameraView$$ExternalSyntheticLambda10(CameraView cameraView, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraView;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$switchCamera$3();
                break;
            case 1:
                this.f$0.lambda$onSurfaceTextureDestroyed$5();
                break;
            case 2:
                this.f$0.onSurfaceTextureUpdatedInternal();
                break;
            case 3:
                this.f$0.lambda$enableDualInternal$0();
                break;
            case 4:
                this.f$0.lambda$resetCamera$4();
                break;
            case 5:
                this.f$0.lambda$new$7();
                break;
            default:
                this.f$0.lambda$toggleDual$2();
                break;
        }
    }
}
