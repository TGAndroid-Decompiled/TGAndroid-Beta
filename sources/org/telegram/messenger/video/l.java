package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19475a;
    public final VideoPlayerHolderBase f19476b;
    public final float f19477c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19475a = i10;
        this.f19476b = videoPlayerHolderBase;
        this.f19477c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19475a) {
            case 0:
                this.f19476b.lambda$setSpeed$5(this.f19477c);
                return;
            case 1:
                this.f19476b.lambda$play$7(this.f19477c);
                return;
            default:
                this.f19476b.lambda$setVolume$10(this.f19477c);
                return;
        }
    }
}
