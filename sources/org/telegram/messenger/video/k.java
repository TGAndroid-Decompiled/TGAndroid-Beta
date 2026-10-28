package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f21563a;
    public final VideoPlayerHolderBase f21564b;
    public final float f21565c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f21563a = i10;
        this.f21564b = videoPlayerHolderBase;
        this.f21565c = f7;
    }

    @Override
    public final void run() {
        switch (this.f21563a) {
            case 0:
                VideoPlayerHolderBase.d(this.f21564b, this.f21565c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f21564b, this.f21565c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f21564b, this.f21565c);
                return;
        }
    }
}
