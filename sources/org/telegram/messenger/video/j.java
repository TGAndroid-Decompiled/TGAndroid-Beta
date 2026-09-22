package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17581a;
    public final VideoPlayerHolderBase f17582b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17581a = i10;
        this.f17582b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17581a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17582b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17582b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17582b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17582b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17582b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17582b);
                return;
        }
    }
}
