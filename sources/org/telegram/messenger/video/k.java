package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19871a;
    public final VideoPlayerHolderBase f19872b;
    public final float f19873c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19871a = i10;
        this.f19872b = videoPlayerHolderBase;
        this.f19873c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19871a) {
            case 0:
                VideoPlayerHolderBase.d(this.f19872b, this.f19873c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f19872b, this.f19873c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f19872b, this.f19873c);
                return;
        }
    }
}
