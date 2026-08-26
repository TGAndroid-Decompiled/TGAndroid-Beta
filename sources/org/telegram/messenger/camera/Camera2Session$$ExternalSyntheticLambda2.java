package org.telegram.messenger.camera;

public final class Camera2Session$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final Camera2Session f$0;
    public final Runnable f$1;

    public Camera2Session$$ExternalSyntheticLambda2(Camera2Session camera2Session, Runnable runnable, int i) {
        this.$r8$classId = i;
        this.f$0 = camera2Session;
        this.f$1 = runnable;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$destroy$4(this.f$1);
                break;
            default:
                this.f$0.lambda$destroy$3(this.f$1);
                break;
        }
    }
}
