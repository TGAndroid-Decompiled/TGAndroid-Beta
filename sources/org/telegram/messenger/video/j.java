package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19869a;
    public final VideoPlayerHolderBase f19870b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19869a = i10;
        this.f19870b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19869a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19870b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19870b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19870b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19870b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19870b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19870b);
                return;
        }
    }
}
