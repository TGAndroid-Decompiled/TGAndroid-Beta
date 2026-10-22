package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19815a;
    public final VideoPlayerHolderBase f19816b;
    public final float f19817c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19815a = i10;
        this.f19816b = videoPlayerHolderBase;
        this.f19817c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19815a) {
            case 0:
                this.f19816b.lambda$setSpeed$5(this.f19817c);
                return;
            case 1:
                this.f19816b.lambda$play$7(this.f19817c);
                return;
            default:
                this.f19816b.lambda$setVolume$10(this.f19817c);
                return;
        }
    }
}
