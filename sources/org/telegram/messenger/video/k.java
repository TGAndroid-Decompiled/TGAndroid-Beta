package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18697a;
    public final VideoPlayerHolderBase f18698b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18697a = i10;
        this.f18698b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18697a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18698b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18698b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18698b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18698b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18698b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18698b);
                return;
        }
    }
}
