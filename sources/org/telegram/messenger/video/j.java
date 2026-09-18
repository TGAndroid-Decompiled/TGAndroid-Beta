package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17767a;
    public final VideoPlayerHolderBase f17768b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17767a = i10;
        this.f17768b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17767a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17768b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17768b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17768b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17768b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17768b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17768b);
                return;
        }
    }
}
