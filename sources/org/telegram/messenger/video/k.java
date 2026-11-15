package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27026a;
    public final VideoPlayerHolderBase f27027b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27026a = i7;
        this.f27027b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27026a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27027b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27027b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27027b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27027b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27027b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27027b);
                return;
        }
    }
}
