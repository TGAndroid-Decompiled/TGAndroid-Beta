package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19465a;
    public final VideoPlayerHolderBase f19466b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19465a = i10;
        this.f19466b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19465a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19466b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19466b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19466b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19466b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19466b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19466b);
                return;
        }
    }
}
