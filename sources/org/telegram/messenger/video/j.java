package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17827a;
    public final VideoPlayerHolderBase f17828b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17827a = i10;
        this.f17828b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17827a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17828b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17828b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17828b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17828b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17828b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17828b);
                return;
        }
    }
}
