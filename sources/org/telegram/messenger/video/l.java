package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19324a;
    public final VideoPlayerHolderBase f19325b;
    public final float f19326c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19324a = i10;
        this.f19325b = videoPlayerHolderBase;
        this.f19326c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19324a) {
            case 0:
                this.f19325b.lambda$setSpeed$5(this.f19326c);
                return;
            case 1:
                this.f19325b.lambda$play$7(this.f19326c);
                return;
            default:
                this.f19325b.lambda$setVolume$10(this.f19326c);
                return;
        }
    }
}
