package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f26021a;
    public final VideoPlayerHolderBase f26022b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f26021a = i7;
        this.f26022b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f26021a) {
            case 0:
                VideoPlayerHolderBase.i(this.f26022b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f26022b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f26022b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f26022b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f26022b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f26022b);
                return;
        }
    }
}
