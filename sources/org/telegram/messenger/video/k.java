package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f26023a;
    public final VideoPlayerHolderBase f26024b;
    public final float f26025c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f26023a = i7;
        this.f26024b = videoPlayerHolderBase;
        this.f26025c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26023a) {
            case 0:
                VideoPlayerHolderBase.d(this.f26024b, this.f26025c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f26024b, this.f26025c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f26024b, this.f26025c);
                return;
        }
    }
}
