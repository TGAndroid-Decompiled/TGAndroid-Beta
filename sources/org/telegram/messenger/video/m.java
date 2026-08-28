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
                this.f21819b.lambda$setSpeed$5(this.f21820c);
                return;
            case 1:
                this.f21819b.lambda$play$7(this.f21820c);
                return;
            default:
                this.f21819b.lambda$setVolume$10(this.f21820c);
                return;
        }
    }
}
