package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19806a;
    public final VideoPlayerHolderBase f19807b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19806a = i10;
        this.f19807b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19806a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19807b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19807b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19807b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19807b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19807b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19807b);
                return;
        }
    }
}
