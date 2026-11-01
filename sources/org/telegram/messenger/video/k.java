package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18724a;
    public final VideoPlayerHolderBase f18725b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18724a = i10;
        this.f18725b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18724a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18725b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18725b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18725b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18725b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18725b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18725b);
                return;
        }
    }
}
