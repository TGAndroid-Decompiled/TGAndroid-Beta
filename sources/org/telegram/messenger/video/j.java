package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f21877a;
    public final VideoPlayerHolderBase f21878b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f21877a = i10;
        this.f21878b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f21877a) {
            case 0:
                VideoPlayerHolderBase.i(this.f21878b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f21878b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f21878b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f21878b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f21878b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f21878b);
                return;
        }
    }
}
