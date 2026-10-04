package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19473a;
    public final VideoPlayerHolderBase f19474b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19473a = i10;
        this.f19474b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19473a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19474b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19474b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19474b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19474b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19474b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19474b);
                return;
        }
    }
}
