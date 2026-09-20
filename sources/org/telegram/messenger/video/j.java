package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17798a;
    public final VideoPlayerHolderBase f17799b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17798a = i10;
        this.f17799b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17798a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17799b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17799b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17799b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17799b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17799b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17799b);
                return;
        }
    }
}
