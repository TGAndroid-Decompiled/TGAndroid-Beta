package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18429a;
    public final VideoPlayerHolderBase f18430b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18429a = i10;
        this.f18430b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18429a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18430b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18430b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18430b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18430b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18430b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18430b);
                return;
        }
    }
}
