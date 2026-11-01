package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f18726a;
    public final VideoPlayerHolderBase f18727b;
    public final float f18728c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f18726a = i10;
        this.f18727b = videoPlayerHolderBase;
        this.f18728c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18726a) {
            case 0:
                VideoPlayerHolderBase.d(this.f18727b, this.f18728c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f18727b, this.f18728c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f18727b, this.f18728c);
                return;
        }
    }
}
