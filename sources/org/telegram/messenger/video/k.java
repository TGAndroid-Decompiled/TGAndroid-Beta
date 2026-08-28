package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f21813a;
    public final VideoPlayerHolderBase f21814b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i9) {
        this.f21813a = i9;
        this.f21814b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f21813a) {
            case 0:
                VideoPlayerHolderBase.i(this.f21814b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f21814b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f21814b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f21814b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f21814b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f21814b);
                return;
        }
    }
}
