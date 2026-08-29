package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f21882a;
    public final VideoPlayerHolderBase f21883b;
    public final float f21884c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f9, int i10) {
        this.f21882a = i10;
        this.f21883b = videoPlayerHolderBase;
        this.f21884c = f9;
    }

    @Override
    public final void run() {
        switch (this.f21882a) {
            case 0:
                this.f21883b.lambda$setSpeed$5(this.f21884c);
                return;
            case 1:
                this.f21883b.lambda$play$7(this.f21884c);
                return;
            default:
                this.f21883b.lambda$setVolume$10(this.f21884c);
                return;
        }
    }
}
