package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17848a;
    public final VideoPlayerHolderBase f17849b;
    public final float f17850c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17848a = i10;
        this.f17849b = videoPlayerHolderBase;
        this.f17850c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17848a) {
            case 0:
                this.f17849b.lambda$setSpeed$5(this.f17850c);
                return;
            case 1:
                this.f17849b.lambda$play$7(this.f17850c);
                return;
            default:
                this.f17849b.lambda$setVolume$10(this.f17850c);
                return;
        }
    }
}
