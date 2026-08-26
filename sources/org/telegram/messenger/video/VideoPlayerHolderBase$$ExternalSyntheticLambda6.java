package org.telegram.messenger.video;

public final class VideoPlayerHolderBase$$ExternalSyntheticLambda6 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public VideoPlayerHolderBase$$ExternalSyntheticLambda6(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((VideoPlayerHolderBase) this.f$0).lambda$seekTo$11(this.f$1);
                break;
            default:
                ((VideoPlayerHolderBase.AnonymousClass2) this.f$0).lambda$onError$0(this.f$1);
                break;
        }
    }
}
