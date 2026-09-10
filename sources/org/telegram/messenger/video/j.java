package org.telegram.messenger.video;
public final class j implements Runnable {
    public final int f16644a;
    public final VideoPlayerHolderBase f16645b;

    public j(VideoPlayerHolderBase videoPlayerHolderBase, int i10) {
        this.f16644a = i10;
        this.f16645b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        switch (this.f16644a) {
            case 0:
                VideoPlayerHolderBase.i(this.f16645b);
                return;
            case 1:
                VideoPlayerHolderBase.n(this.f16645b);
                return;
            case 2:
                VideoPlayerHolderBase.f(this.f16645b);
                return;
            case 3:
                VideoPlayerHolderBase.a(this.f16645b);
                return;
            case 4:
                VideoPlayerHolderBase.c(this.f16645b);
                return;
            default:
                VideoPlayerHolderBase.o(this.f16645b);
                return;
        }
    }
}
