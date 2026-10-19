package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19798a;
    public final VideoPlayerHolderBase f19799b;
    public final float f19800c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19798a = i10;
        this.f19799b = videoPlayerHolderBase;
        this.f19800c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19798a) {
            case 0:
                this.f19799b.lambda$setSpeed$5(this.f19800c);
                return;
            case 1:
                this.f19799b.lambda$play$7(this.f19800c);
                return;
            default:
                this.f19799b.lambda$setVolume$10(this.f19800c);
                return;
        }
    }
}
