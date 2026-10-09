package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f19484a;
    public final VideoPlayerHolderBase f19485b;
    public final float f19486c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19484a = i10;
        this.f19485b = videoPlayerHolderBase;
        this.f19486c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19484a) {
            case 0:
                this.f19485b.lambda$setSpeed$5(this.f19486c);
                return;
            case 1:
                this.f19485b.lambda$play$7(this.f19486c);
                return;
            default:
                this.f19485b.lambda$setVolume$10(this.f19486c);
                return;
        }
    }
}
