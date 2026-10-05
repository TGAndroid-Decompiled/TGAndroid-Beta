package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19470a;
    public final VideoPlayerHolderBase f19471b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19470a = i10;
        this.f19471b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19470a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19471b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19471b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19471b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19471b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19471b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19471b);
                return;
        }
    }
}
