package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17589a;
    public final VideoPlayerHolderBase f17590b;
    public final float f17591c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17589a = i10;
        this.f17590b = videoPlayerHolderBase;
        this.f17591c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17589a) {
            case 0:
                this.f17590b.lambda$setSpeed$5(this.f17591c);
                return;
            case 1:
                this.f17590b.lambda$play$7(this.f17591c);
                return;
            default:
                this.f17590b.lambda$setVolume$10(this.f17591c);
                return;
        }
    }
}
