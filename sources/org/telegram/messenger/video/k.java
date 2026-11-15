package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27025a;
    public final VideoPlayerHolderBase f27026b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27025a = i7;
        this.f27026b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27025a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27026b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27026b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27026b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27026b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27026b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27026b);
                return;
        }
    }
}
