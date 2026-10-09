package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19479a;
    public final VideoPlayerHolderBase f19480b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19479a = i10;
        this.f19480b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19479a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19480b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19480b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19480b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19480b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19480b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19480b);
                return;
        }
    }
}
