package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19480a;
    public final VideoPlayerHolderBase f19481b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19480a = i10;
        this.f19481b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19480a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19481b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19481b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19481b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19481b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19481b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19481b);
                return;
        }
    }
}
