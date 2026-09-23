package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17561a;
    public final VideoPlayerHolderBase f17562b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17561a = i10;
        this.f17562b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17561a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17562b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17562b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17562b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17562b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17562b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17562b);
                return;
        }
    }
}
