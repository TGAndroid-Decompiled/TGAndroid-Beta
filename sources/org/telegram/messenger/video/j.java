package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19796a;
    public final VideoPlayerHolderBase f19797b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19796a = i10;
        this.f19797b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19796a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19797b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19797b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19797b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19797b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19797b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19797b);
                return;
        }
    }
}
