package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19791a;
    public final VideoPlayerHolderBase f19792b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19791a = i10;
        this.f19792b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19791a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19792b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19792b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19792b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19792b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19792b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19792b);
                return;
        }
    }
}
