package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f20341a;
    public final VideoPlayerHolderBase f20342b;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f20341a = i10;
        this.f20342b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f20341a) {
            case 0:
                VideoPlayerHolderBase.i(this.f20342b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f20342b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f20342b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f20342b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f20342b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f20342b);
                return;
        }
    }
}
