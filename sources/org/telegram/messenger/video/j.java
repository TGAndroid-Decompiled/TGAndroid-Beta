package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f17816a;
    public final VideoPlayerHolderBase f17817b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f17816a = i10;
        this.f17817b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f17816a) {
            case 0:
                VideoPlayerHolderBase.i(this.f17817b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f17817b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f17817b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f17817b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f17817b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f17817b);
                return;
        }
    }
}
