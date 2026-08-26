package org.telegram.messenger;

public final class MediaController$$ExternalSyntheticLambda61 implements Runnable {
    public final int $r8$classId;
    public final MediaController f$0;
    public final boolean f$1;

    public MediaController$$ExternalSyntheticLambda61(MediaController mediaController, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = mediaController;
        this.f$1 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$toggleRecordingPause$28(this.f$1);
                break;
            default:
                this.f$0.lambda$toggleRecordingPause$32(this.f$1);
                break;
        }
    }
}
