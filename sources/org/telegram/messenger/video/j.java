package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19260a;
    public final VideoPlayerHolderBase f19261b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19260a = i10;
        this.f19261b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19260a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19261b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19261b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19261b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19261b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19261b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19261b);
                return;
        }
    }
}
