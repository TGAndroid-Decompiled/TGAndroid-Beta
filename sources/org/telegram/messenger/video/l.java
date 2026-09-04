package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19288a;
    public final VideoPlayerHolderBase f19289b;
    public final float f19290c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19288a = i10;
        this.f19289b = videoPlayerHolderBase;
        this.f19290c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19288a) {
            case 0:
                this.f19289b.lambda$setSpeed$5(this.f19290c);
                return;
            case 1:
                this.f19289b.lambda$play$7(this.f19290c);
                return;
            default:
                this.f19289b.lambda$setVolume$10(this.f19290c);
                return;
        }
    }
}
