package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19813a;
    public final VideoPlayerHolderBase f19814b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19813a = i10;
        this.f19814b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19813a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19814b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19814b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19814b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19814b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19814b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19814b);
                return;
        }
    }
}
