package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27431a;
    public final VideoPlayerHolderBase f27432b;
    public final float f27433c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27431a = i7;
        this.f27432b = videoPlayerHolderBase;
        this.f27433c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27431a) {
            case 0:
                this.f27432b.lambda$setSpeed$5(this.f27433c);
                return;
            case 1:
                this.f27432b.lambda$play$7(this.f27433c);
                return;
            default:
                this.f27432b.lambda$setVolume$10(this.f27433c);
                return;
        }
    }
}
