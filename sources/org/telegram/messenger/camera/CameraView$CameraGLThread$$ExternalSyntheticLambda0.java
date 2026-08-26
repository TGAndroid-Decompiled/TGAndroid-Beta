package org.telegram.messenger.camera;

public final class CameraView$CameraGLThread$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final CameraView.CameraGLThread f$0;

    public CameraView$CameraGLThread$$ExternalSyntheticLambda0(CameraView.CameraGLThread cameraGLThread, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onDraw$4();
                break;
            case 1:
                this.f$0.lambda$onDraw$5();
                break;
            case 2:
                this.f$0.lambda$new$0();
                break;
            case 3:
                this.f$0.lambda$new$1();
                break;
            case 4:
                this.f$0.lambda$new$2();
                break;
            default:
                this.f$0.lambda$new$3();
                break;
        }
    }
}
