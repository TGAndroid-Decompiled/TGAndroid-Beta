package org.telegram.messenger.video;

public final class VideoPlayerHolderBase$2$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VideoPlayerHolderBase.AnonymousClass2 f$0;

    public VideoPlayerHolderBase$2$$ExternalSyntheticLambda0(VideoPlayerHolderBase.AnonymousClass2 anonymousClass2, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass2;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$onRenderedFirstFrame$2();
                break;
            default:
                this.f$0.lambda$onError$1();
                break;
        }
    }
}
