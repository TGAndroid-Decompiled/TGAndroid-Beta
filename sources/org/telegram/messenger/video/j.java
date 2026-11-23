package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27409a;
    public final VideoPlayerHolderBase f27410b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27409a = i7;
        this.f27410b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27409a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27410b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27410b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27410b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27410b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27410b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27410b);
                return;
        }
    }
}
