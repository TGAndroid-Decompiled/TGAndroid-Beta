package org.telegram.messenger.camera;

public final class CameraView$$ExternalSyntheticLambda15 implements Runnable {
    public final int $r8$classId = 0;
    public final CameraView f$0;
    public final int f$1;
    public final CameraView.CameraGLThread f$2;

    public CameraView$$ExternalSyntheticLambda15(CameraView cameraView, int i, CameraView.CameraGLThread cameraGLThread) {
        this.f$0 = cameraView;
        this.f$1 = i;
        this.f$2 = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createCamera$9(this.f$1, this.f$2);
                break;
            default:
                this.f$0.lambda$createCamera$12(this.f$2, this.f$1);
                break;
        }
    }

    public CameraView$$ExternalSyntheticLambda15(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i) {
        this.f$0 = cameraView;
        this.f$2 = cameraGLThread;
        this.f$1 = i;
    }
}
