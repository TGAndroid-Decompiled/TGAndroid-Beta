package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f21561a;
    public final VideoPlayerHolderBase f21562b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f21561a = i10;
        this.f21562b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f21561a) {
            case 0:
                VideoPlayerHolderBase.i(this.f21562b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f21562b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f21562b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f21562b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f21562b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f21562b);
                return;
        }
    }
}
