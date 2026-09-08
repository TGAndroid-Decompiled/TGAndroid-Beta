package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19310a;
    public final VideoPlayerHolderBase f19311b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19310a = i10;
        this.f19311b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19310a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19311b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19311b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19311b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19311b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19311b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19311b);
                return;
        }
    }
}
