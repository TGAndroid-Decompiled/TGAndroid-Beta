package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27411a;
    public final VideoPlayerHolderBase f27412b;
    public final float f27413c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27411a = i7;
        this.f27412b = videoPlayerHolderBase;
        this.f27413c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27411a) {
            case 0:
                this.f27412b.lambda$setSpeed$5(this.f27413c);
                return;
            case 1:
                this.f27412b.lambda$play$7(this.f27413c);
                return;
            default:
                this.f27412b.lambda$setVolume$10(this.f27413c);
                return;
        }
    }
}
