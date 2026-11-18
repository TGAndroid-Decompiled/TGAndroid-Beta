package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27403a;
    public final VideoPlayerHolderBase f27404b;
    public final float f27405c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27403a = i7;
        this.f27404b = videoPlayerHolderBase;
        this.f27405c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27403a) {
            case 0:
                VideoPlayerHolderBase.d(this.f27404b, this.f27405c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f27404b, this.f27405c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f27404b, this.f27405c);
                return;
        }
    }
}
