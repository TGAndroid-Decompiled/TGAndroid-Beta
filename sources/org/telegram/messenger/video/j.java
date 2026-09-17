package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19292a;
    public final VideoPlayerHolderBase f19293b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19292a = i10;
        this.f19293b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19292a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19293b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19293b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19293b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19293b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19293b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19293b);
                return;
        }
    }
}
