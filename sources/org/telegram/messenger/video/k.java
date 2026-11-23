package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27499a;
    public final VideoPlayerHolderBase f27500b;
    public final float f27501c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27499a = i7;
        this.f27500b = videoPlayerHolderBase;
        this.f27501c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27499a) {
            case 0:
                this.f27500b.lambda$setSpeed$5(this.f27501c);
                return;
            case 1:
                this.f27500b.lambda$play$7(this.f27501c);
                return;
            default:
                this.f27500b.lambda$setVolume$10(this.f27501c);
                return;
        }
    }
}
