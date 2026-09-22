package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17586a;
    public final VideoPlayerHolderBase f17587b;
    public final float f17588c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17586a = i10;
        this.f17587b = videoPlayerHolderBase;
        this.f17588c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17586a) {
            case 0:
                VideoPlayerHolderBase.d(this.f17587b, this.f17588c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f17587b, this.f17588c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f17587b, this.f17588c);
                return;
        }
    }
}
