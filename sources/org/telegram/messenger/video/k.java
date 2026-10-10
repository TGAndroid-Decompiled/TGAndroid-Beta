package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19483a;
    public final VideoPlayerHolderBase f19484b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19483a = i10;
        this.f19484b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19483a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19484b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19484b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19484b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19484b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19484b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19484b);
                return;
        }
    }
}
