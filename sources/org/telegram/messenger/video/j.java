package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27373a;
    public final VideoPlayerHolderBase f27374b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27373a = i7;
        this.f27374b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27373a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27374b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27374b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27374b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27374b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27374b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27374b);
                return;
        }
    }
}
