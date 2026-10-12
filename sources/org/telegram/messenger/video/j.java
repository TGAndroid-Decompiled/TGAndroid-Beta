package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f18731a;
    public final VideoPlayerHolderBase f18732b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18731a = i10;
        this.f18732b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18731a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18732b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18732b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18732b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18732b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18732b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18732b);
                return;
        }
    }
}
