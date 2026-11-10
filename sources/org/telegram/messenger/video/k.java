package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f26027a;
    public final VideoPlayerHolderBase f26028b;
    public final float f26029c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f26027a = i7;
        this.f26028b = videoPlayerHolderBase;
        this.f26029c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26027a) {
            case 0:
                this.f26028b.lambda$setSpeed$5(this.f26029c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f26028b, this.f26029c);
                return;
            default:
                this.f26028b.lambda$setVolume$10(this.f26029c);
                return;
        }
    }
}
