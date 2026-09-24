package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17801a;
    public final VideoPlayerHolderBase f17802b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17801a = i10;
        this.f17802b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17801a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17802b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17802b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17802b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17802b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17802b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17802b);
                return;
        }
    }
}
