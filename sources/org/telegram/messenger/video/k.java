package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18569a;
    public final VideoPlayerHolderBase f18570b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18569a = i10;
        this.f18570b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18569a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18570b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18570b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18570b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18570b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18570b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18570b);
                return;
        }
    }
}
