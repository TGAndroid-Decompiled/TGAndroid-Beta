package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19788a;
    public final VideoPlayerHolderBase f19789b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19788a = i10;
        this.f19789b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19788a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19789b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19789b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19789b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19789b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19789b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19789b);
                return;
        }
    }
}
