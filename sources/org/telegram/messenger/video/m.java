package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f19488a;
    public final VideoPlayerHolderBase f19489b;
    public final float f19490c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19488a = i10;
        this.f19489b = videoPlayerHolderBase;
        this.f19490c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19488a) {
            case 0:
                this.f19489b.lambda$setSpeed$5(this.f19490c);
                return;
            case 1:
                this.f19489b.lambda$play$7(this.f19490c);
                return;
            default:
                this.f19489b.lambda$setVolume$10(this.f19490c);
                return;
        }
    }
}
