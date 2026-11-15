package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f27028a;
    public final VideoPlayerHolderBase f27029b;
    public final float f27030c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27028a = i7;
        this.f27029b = videoPlayerHolderBase;
        this.f27030c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27028a) {
            case 0:
                this.f27029b.lambda$setSpeed$5(this.f27030c);
                return;
            case 1:
                this.f27029b.lambda$play$7(this.f27030c);
                return;
            default:
                this.f27029b.lambda$setVolume$10(this.f27030c);
                return;
        }
    }
}
