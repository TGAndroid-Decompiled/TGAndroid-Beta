package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19799a;
    public final VideoPlayerHolderBase f19800b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19799a = i10;
        this.f19800b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19799a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19800b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19800b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19800b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19800b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19800b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19800b);
                return;
        }
    }
}
