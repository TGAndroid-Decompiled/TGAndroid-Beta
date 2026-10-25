package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f21575a;
    public final VideoPlayerHolderBase f21576b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f21575a = i10;
        this.f21576b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f21575a) {
            case 0:
                VideoPlayerHolderBase.i(this.f21576b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f21576b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f21576b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f21576b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f21576b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f21576b);
                return;
        }
    }
}
