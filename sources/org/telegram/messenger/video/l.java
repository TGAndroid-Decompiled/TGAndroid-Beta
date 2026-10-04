package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19470a;
    public final VideoPlayerHolderBase f19471b;
    public final float f19472c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19470a = i10;
        this.f19471b = videoPlayerHolderBase;
        this.f19472c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                this.f19471b.lambda$setSpeed$5(this.f19472c);
                return;
            case 1:
                this.f19471b.lambda$play$7(this.f19472c);
                return;
            default:
                this.f19471b.lambda$setVolume$10(this.f19472c);
                return;
        }
    }
}
