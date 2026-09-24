package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17806a;
    public final VideoPlayerHolderBase f17807b;
    public final float f17808c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17806a = i10;
        this.f17807b = videoPlayerHolderBase;
        this.f17808c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17806a) {
            case 0:
                this.f17807b.lambda$setSpeed$5(this.f17808c);
                return;
            case 1:
                this.f17807b.lambda$play$7(this.f17808c);
                return;
            default:
                this.f17807b.lambda$setVolume$10(this.f17808c);
                return;
        }
    }
}
