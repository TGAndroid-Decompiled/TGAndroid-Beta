package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27405a;
    public final VideoPlayerHolderBase f27406b;
    public final float f27407c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27405a = i7;
        this.f27406b = videoPlayerHolderBase;
        this.f27407c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27405a) {
            case 0:
                this.f27406b.lambda$setSpeed$5(this.f27407c);
                return;
            case 1:
                this.f27406b.lambda$play$7(this.f27407c);
                return;
            default:
                this.f27406b.lambda$setVolume$10(this.f27407c);
                return;
        }
    }
}
