package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19315a;
    public final VideoPlayerHolderBase f19316b;
    public final float f19317c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19315a = i10;
        this.f19316b = videoPlayerHolderBase;
        this.f19317c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19315a) {
            case 0:
                this.f19316b.lambda$setSpeed$5(this.f19317c);
                return;
            case 1:
                this.f19316b.lambda$play$7(this.f19317c);
                return;
            default:
                this.f19316b.lambda$setVolume$10(this.f19317c);
                return;
        }
    }
}
