package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f25923a;
    public final VideoPlayerHolderBase f25924b;
    public final float f25925c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i3) {
        this.f25923a = i3;
        this.f25924b = videoPlayerHolderBase;
        this.f25925c = f10;
    }

    @Override
    public final void run() {
        switch (this.f25923a) {
            case 0:
                VideoPlayerHolderBase.d(this.f25924b, this.f25925c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f25924b, this.f25925c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f25924b, this.f25925c);
                return;
        }
    }
}
