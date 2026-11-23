package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27497a;
    public final VideoPlayerHolderBase f27498b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27497a = i7;
        this.f27498b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27497a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27498b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27498b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27498b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27498b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27498b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27498b);
                return;
        }
    }
}
