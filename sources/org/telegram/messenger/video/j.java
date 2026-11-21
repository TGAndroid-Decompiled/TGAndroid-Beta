package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f27429a;
    public final VideoPlayerHolderBase f27430b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f27429a = i7;
        this.f27430b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f27429a) {
            case 0:
                VideoPlayerHolderBase.i(this.f27430b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f27430b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f27430b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f27430b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f27430b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f27430b);
                return;
        }
    }
}
