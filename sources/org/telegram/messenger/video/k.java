package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f26012a;
    public final VideoPlayerHolderBase f26013b;
    public final float f26014c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f26012a = i7;
        this.f26013b = videoPlayerHolderBase;
        this.f26014c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26012a) {
            case 0:
                VideoPlayerHolderBase.d(this.f26013b, this.f26014c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f26013b, this.f26014c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f26013b, this.f26014c);
                return;
        }
    }
}
