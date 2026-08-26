package org.telegram.messenger.camera;

public final class CameraView$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final CameraView f$0;
    public final CameraView.CameraGLThread f$1;

    public CameraView$$ExternalSyntheticLambda7(CameraView cameraView, CameraView.CameraGLThread cameraGLThread, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraView;
        this.f$1 = cameraGLThread;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createCamera$10(this.f$1);
                break;
            default:
                this.f$0.lambda$createCamera$8(this.f$1);
                break;
        }
    }
}
