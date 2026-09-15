package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17584a;
    public final VideoPlayerHolderBase f17585b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17584a = i10;
        this.f17585b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17584a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17585b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17585b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17585b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17585b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17585b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17585b);
                return;
        }
    }
}
