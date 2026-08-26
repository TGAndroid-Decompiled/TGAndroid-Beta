package org.telegram.messenger.camera;

public final class Camera2Session$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final Camera2Session.AnonymousClass2 f$0;

    public Camera2Session$2$$ExternalSyntheticLambda0(Camera2Session.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onConfigured$0();
                break;
            default:
                this.f$0.lambda$onConfigureFailed$1();
                break;
        }
    }
}
