package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19796a;
    public final VideoPlayerHolderBase f19797b;
    public final float f19798c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19796a = i10;
        this.f19797b = videoPlayerHolderBase;
        this.f19798c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19796a) {
            case 0:
                this.f19797b.lambda$setSpeed$5(this.f19798c);
                return;
            case 1:
                this.f19797b.lambda$play$7(this.f19798c);
                return;
            default:
                this.f19797b.lambda$setVolume$10(this.f19798c);
                return;
        }
    }
}
