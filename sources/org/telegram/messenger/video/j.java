package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f26025a;
    public final VideoPlayerHolderBase f26026b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f26025a = i7;
        this.f26026b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f26025a) {
            case 0:
                VideoPlayerHolderBase.i(this.f26026b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f26026b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f26026b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f26026b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f26026b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f26026b);
                return;
        }
    }
}
