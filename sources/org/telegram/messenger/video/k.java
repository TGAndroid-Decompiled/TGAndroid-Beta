package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f21577a;
    public final VideoPlayerHolderBase f21578b;
    public final float f21579c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f21577a = i10;
        this.f21578b = videoPlayerHolderBase;
        this.f21579c = f7;
    }

    @Override
    public final void run() {
        switch (this.f21577a) {
            case 0:
                VideoPlayerHolderBase.d(this.f21578b, this.f21579c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f21578b, this.f21579c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f21578b, this.f21579c);
                return;
        }
    }
}
