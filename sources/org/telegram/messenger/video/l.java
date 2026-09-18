package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17598a;
    public final VideoPlayerHolderBase f17599b;
    public final float f17600c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17598a = i10;
        this.f17599b = videoPlayerHolderBase;
        this.f17600c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17598a) {
            case 0:
                this.f17599b.lambda$setSpeed$5(this.f17600c);
                return;
            case 1:
                this.f17599b.lambda$play$7(this.f17600c);
                return;
            default:
                this.f17599b.lambda$setVolume$10(this.f17600c);
                return;
        }
    }
}
