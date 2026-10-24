package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19878a;
    public final VideoPlayerHolderBase f19879b;
    public final float f19880c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19878a = i10;
        this.f19879b = videoPlayerHolderBase;
        this.f19880c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19878a) {
            case 0:
                VideoPlayerHolderBase.d(this.f19879b, this.f19880c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f19879b, this.f19880c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f19879b, this.f19880c);
                return;
        }
    }
}
