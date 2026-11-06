package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f26010a;
    public final VideoPlayerHolderBase f26011b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i7) {
        this.f26010a = i7;
        this.f26011b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f26010a) {
            case 0:
                VideoPlayerHolderBase.i(this.f26011b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f26011b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f26011b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f26011b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f26011b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f26011b);
                return;
        }
    }
}
