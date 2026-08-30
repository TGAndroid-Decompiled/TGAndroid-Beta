package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18715a;
    public final VideoPlayerHolderBase f18716b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f18715a = i10;
        this.f18716b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f18715a) {
            case 0:
                VideoPlayerHolderBase.i(this.f18716b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f18716b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f18716b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f18716b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f18716b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f18716b);
                return;
        }
    }
}
