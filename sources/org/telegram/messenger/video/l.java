package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f27027a;
    public final VideoPlayerHolderBase f27028b;
    public final float f27029c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27027a = i7;
        this.f27028b = videoPlayerHolderBase;
        this.f27029c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27027a) {
            case 0:
                this.f27028b.lambda$setSpeed$5(this.f27029c);
                return;
            case 1:
                this.f27028b.lambda$play$7(this.f27029c);
                return;
            default:
                this.f27028b.lambda$setVolume$10(this.f27029c);
                return;
        }
    }
}
