package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f18431a;
    public final VideoPlayerHolderBase f18432b;
    public final float f18433c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f18431a = i10;
        this.f18432b = videoPlayerHolderBase;
        this.f18433c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18431a) {
            case 0:
                this.f18432b.lambda$setSpeed$5(this.f18433c);
                return;
            case 1:
                this.f18432b.lambda$play$7(this.f18433c);
                return;
            default:
                this.f18432b.lambda$setVolume$10(this.f18433c);
                return;
        }
    }
}
