package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27403a;
    public final VideoPlayerHolderBase f27404b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27403a = i7;
        this.f27404b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27403a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27404b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27404b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27404b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27404b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27404b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27404b);
                return;
        }
    }
}
