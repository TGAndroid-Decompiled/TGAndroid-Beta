package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17593a;
    public final VideoPlayerHolderBase f17594b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17593a = i10;
        this.f17594b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17593a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17594b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17594b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17594b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17594b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17594b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17594b);
                return;
        }
    }
}
