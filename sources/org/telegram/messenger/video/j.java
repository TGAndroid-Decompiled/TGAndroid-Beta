package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19319a;
    public final VideoPlayerHolderBase f19320b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19319a = i10;
        this.f19320b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19319a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19320b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19320b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19320b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19320b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19320b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19320b);
                return;
        }
    }
}
