package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19297a;
    public final VideoPlayerHolderBase f19298b;
    public final float f19299c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19297a = i10;
        this.f19298b = videoPlayerHolderBase;
        this.f19299c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19297a) {
            case 0:
                this.f19298b.lambda$setSpeed$5(this.f19299c);
                return;
            case 1:
                this.f19298b.lambda$play$7(this.f19299c);
                return;
            default:
                this.f19298b.lambda$setVolume$10(this.f19299c);
                return;
        }
    }
}
