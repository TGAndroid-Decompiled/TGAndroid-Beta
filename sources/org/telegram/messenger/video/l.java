package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17821a;
    public final VideoPlayerHolderBase f17822b;
    public final float f17823c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17821a = i10;
        this.f17822b = videoPlayerHolderBase;
        this.f17823c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                this.f17822b.lambda$setSpeed$5(this.f17823c);
                return;
            case 1:
                this.f17822b.lambda$play$7(this.f17823c);
                return;
            default:
                this.f17822b.lambda$setVolume$10(this.f17823c);
                return;
        }
    }
}
