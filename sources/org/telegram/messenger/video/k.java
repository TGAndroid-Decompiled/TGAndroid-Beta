package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f25921a;
    public final VideoPlayerHolderBase f25922b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i3) {
        this.f25921a = i3;
        this.f25922b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f25921a) {
            case 0:
                VideoPlayerHolderBase.i(this.f25922b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f25922b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f25922b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f25922b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f25922b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f25922b);
                return;
        }
    }
}
