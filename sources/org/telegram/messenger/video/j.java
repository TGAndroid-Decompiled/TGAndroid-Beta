package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19472a;
    public final VideoPlayerHolderBase f19473b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19472a = i10;
        this.f19473b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19472a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19473b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19473b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19473b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19473b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19473b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19473b);
                return;
        }
    }
}
