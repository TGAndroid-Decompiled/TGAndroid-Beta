package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17843a;
    public final VideoPlayerHolderBase f17844b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17843a = i10;
        this.f17844b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17843a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17844b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17844b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17844b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17844b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17844b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17844b);
                return;
        }
    }
}
