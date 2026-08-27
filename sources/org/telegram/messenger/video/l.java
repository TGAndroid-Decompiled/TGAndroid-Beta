package org.telegram.messenger.video;

public final class l implements Runnable {

    public final int f21854a;

    public final VideoPlayerHolderBase f21855b;

    public final float f21856c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i10) {
        this.f21854a = i10;
        this.f21855b = videoPlayerHolderBase;
        this.f21856c = f10;
    }

    @Override
    public final void run() {
        switch (this.f21854a) {
            case 0:
                this.f21855b.lambda$setSpeed$5(this.f21856c);
                break;
            case 1:
                this.f21855b.lambda$play$7(this.f21856c);
                break;
            default:
                this.f21855b.lambda$setVolume$10(this.f21856c);
                break;
        }
    }
}
