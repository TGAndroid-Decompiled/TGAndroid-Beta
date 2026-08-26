package org.telegram.messenger.camera;

public final class CameraController$$ExternalSyntheticLambda9 implements Runnable {
    public final int $r8$classId;
    public final CameraController f$0;
    public final CameraSession f$1;

    public CameraController$$ExternalSyntheticLambda9(CameraController cameraController, CameraSession cameraSession, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraController;
        this.f$1 = cameraSession;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startPreview$7(this.f$1);
                break;
            default:
                this.f$0.lambda$stopPreview$8(this.f$1);
                break;
        }
    }
}
