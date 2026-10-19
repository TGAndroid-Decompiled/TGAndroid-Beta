package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f19794a;
    public final VideoPlayerHolderBase f19795b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f19794a = i10;
        this.f19795b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f19794a) {
            case 0:
                VideoPlayerHolderBase.i(this.f19795b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f19795b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f19795b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f19795b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f19795b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f19795b);
                return;
        }
    }
}
