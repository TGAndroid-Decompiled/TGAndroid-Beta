package org.telegram.messenger.camera;

public final class Camera2Session$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Camera2Session f$0;

    public Camera2Session$$ExternalSyntheticLambda0(Camera2Session camera2Session, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2Session;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$0();
                break;
            default:
                this.f$0.lambda$checkOpen$2();
                break;
        }
    }
}
