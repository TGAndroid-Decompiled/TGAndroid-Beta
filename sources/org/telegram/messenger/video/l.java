package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17848a;
    public final VideoPlayerHolderBase f17849b;
    public final float f17850c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17848a = i10;
        this.f17849b = videoPlayerHolderBase;
        this.f17850c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17848a) {
            case 0:
                VideoPlayerHolderBase.d(this.f17849b, this.f17850c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f17849b, this.f17850c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f17849b, this.f17850c);
                return;
        }
    }
}
