package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f21818a;
    public final VideoPlayerHolderBase f21819b;
    public final float f21820c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i9) {
        this.f21818a = i9;
        this.f21819b = videoPlayerHolderBase;
        this.f21820c = f10;
    }

    @Override
    public final void run() {
        switch (this.f21818a) {
            case 0:
                VideoPlayerHolderBase.d(this.f21819b, this.f21820c);
                return;
            case 1:
                VideoPlayerHolderBase.m(this.f21819b, this.f21820c);
                return;
            default:
                VideoPlayerHolderBase.b(this.f21819b, this.f21820c);
                return;
        }
    }
}
