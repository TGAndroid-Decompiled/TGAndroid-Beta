package org.telegram.messenger.video;

public final class VideoPlayerHolderBase$$ExternalSyntheticLambda0 implements Runnable {
    public final int $r8$classId;
    public final VideoPlayerHolderBase f$0;

    public VideoPlayerHolderBase$$ExternalSyntheticLambda0(VideoPlayerHolderBase videoPlayerHolderBase, int i) {
        this.$r8$classId = i;
        this.f$0 = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$new$13();
                break;
            case 1:
                this.f$0.lambda$start$1();
                break;
            case 2:
                this.f$0.lambda$new$14();
                break;
            case 3:
                this.f$0.lambda$play$6();
                break;
            case 4:
                this.f$0.lambda$pause$4();
                break;
            default:
                this.f$0.lambda$loopBack$9();
                break;
        }
    }
}
