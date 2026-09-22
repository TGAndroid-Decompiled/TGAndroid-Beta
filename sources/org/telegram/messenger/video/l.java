package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17818a;
    public final VideoPlayerHolderBase f17819b;
    public final float f17820c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17818a = i10;
        this.f17819b = videoPlayerHolderBase;
        this.f17820c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17818a) {
            case 0:
                this.f17819b.lambda$setSpeed$5(this.f17820c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f17819b, this.f17820c);
                return;
            default:
                this.f17819b.lambda$setVolume$10(this.f17820c);
                return;
        }
    }
}
