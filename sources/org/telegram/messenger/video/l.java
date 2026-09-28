package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17831a;
    public final VideoPlayerHolderBase f17832b;
    public final float f17833c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17831a = i10;
        this.f17832b = videoPlayerHolderBase;
        this.f17833c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17831a) {
            case 0:
                this.f17832b.lambda$setSpeed$5(this.f17833c);
                return;
            case 1:
                this.f17832b.lambda$play$7(this.f17833c);
                return;
            default:
                this.f17832b.lambda$setVolume$10(this.f17833c);
                return;
        }
    }
}
