package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19516a;
    public final VideoPlayerHolderBase f19517b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19516a = i10;
        this.f19517b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19516a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19517b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19517b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19517b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19517b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19517b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19517b);
                return;
        }
    }
}
