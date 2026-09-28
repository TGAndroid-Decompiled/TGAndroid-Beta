package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17832a;
    public final VideoPlayerHolderBase f17833b;
    public final float f17834c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17832a = i10;
        this.f17833b = videoPlayerHolderBase;
        this.f17834c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17832a) {
            case 0:
                VideoPlayerHolderBase.d(this.f17833b, this.f17834c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f17833b, this.f17834c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f17833b, this.f17834c);
                return;
        }
    }
}
