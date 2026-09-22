package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17813a;
    public final VideoPlayerHolderBase f17814b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17813a = i10;
        this.f17814b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17813a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17814b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17814b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17814b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17814b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17814b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17814b);
                return;
        }
    }
}
