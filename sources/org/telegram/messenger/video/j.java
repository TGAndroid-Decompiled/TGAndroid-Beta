package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17810a;
    public final VideoPlayerHolderBase f17811b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17810a = i10;
        this.f17811b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17810a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17811b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17811b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17811b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17811b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17811b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17811b);
                return;
        }
    }
}
