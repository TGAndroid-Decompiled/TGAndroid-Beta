package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27401a;
    public final VideoPlayerHolderBase f27402b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27401a = i7;
        this.f27402b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27401a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27402b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27402b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27402b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27402b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27402b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27402b);
                return;
        }
    }
}
