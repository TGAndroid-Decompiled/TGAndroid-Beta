package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f26018a;
    public final VideoPlayerHolderBase f26019b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f26018a = i7;
        this.f26019b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f26018a) {
            case 0:
                VideoPlayerHolderBase.i(this.f26019b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f26019b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f26019b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f26019b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f26019b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f26019b);
                return;
        }
    }
}
