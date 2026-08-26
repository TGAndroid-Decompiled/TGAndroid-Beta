package org.telegram.messenger.video;

public final class VideoPlayerHolderBase$$ExternalSyntheticLambda5 implements Runnable {
    public final int $r8$classId;
    public final VideoPlayerHolderBase f$0;
    public final float f$1;

    public VideoPlayerHolderBase$$ExternalSyntheticLambda5(VideoPlayerHolderBase videoPlayerHolderBase, float f, int i) {
        this.$r8$classId = i;
        this.f$0 = videoPlayerHolderBase;
        this.f$1 = f;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setVolume$10(this.f$1);
                break;
            case 1:
                this.f$0.lambda$setSpeed$5(this.f$1);
                break;
            default:
                this.f$0.lambda$play$7(this.f$1);
                break;
        }
    }
}
