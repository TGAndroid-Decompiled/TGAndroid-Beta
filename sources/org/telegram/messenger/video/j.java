package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19283a;
    public final VideoPlayerHolderBase f19284b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19283a = i10;
        this.f19284b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19283a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19284b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19284b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19284b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19284b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19284b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19284b);
                return;
        }
    }
}
