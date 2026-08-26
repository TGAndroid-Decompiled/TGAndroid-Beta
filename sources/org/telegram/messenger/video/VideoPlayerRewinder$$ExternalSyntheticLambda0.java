package org.telegram.messenger.video;

public final class VideoPlayerRewinder$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VideoPlayerRewinder f$0;

    public VideoPlayerRewinder$$ExternalSyntheticLambda0(VideoPlayerRewinder videoPlayerRewinder, int i) {
        this.$r8$classId = i;
        this.f$0 = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$updateRewindSpeed$0();
                break;
            default:
                this.f$0.lambda$cancelRewind$1();
                break;
        }
    }
}
