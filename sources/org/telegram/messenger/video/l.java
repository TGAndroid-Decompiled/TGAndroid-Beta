package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f18571a;
    public final VideoPlayerHolderBase f18572b;
    public final float f18573c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f18571a = i10;
        this.f18572b = videoPlayerHolderBase;
        this.f18573c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18571a) {
            case 0:
                VideoPlayerHolderBase.d(this.f18572b, this.f18573c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f18572b, this.f18573c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f18572b, this.f18573c);
                return;
        }
    }
}
