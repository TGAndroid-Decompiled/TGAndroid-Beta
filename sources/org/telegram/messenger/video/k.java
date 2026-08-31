package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f20339a;
    public final VideoPlayerHolderBase f20340b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f20339a = i10;
        this.f20340b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f20339a) {
            case 0:
                VideoPlayerHolderBase.i(this.f20340b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f20340b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f20340b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f20340b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f20340b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f20340b);
                return;
        }
    }
}
