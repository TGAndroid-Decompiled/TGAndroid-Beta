package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17826a;
    public final VideoPlayerHolderBase f17827b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17826a = i10;
        this.f17827b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17826a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17827b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17827b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17827b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17827b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17827b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17827b);
                return;
        }
    }
}
