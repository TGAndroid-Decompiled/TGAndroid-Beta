package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f19521a;
    public final VideoPlayerHolderBase f19522b;
    public final float f19523c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19521a = i10;
        this.f19522b = videoPlayerHolderBase;
        this.f19523c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19521a) {
            case 0:
                this.f19522b.lambda$setSpeed$5(this.f19523c);
                return;
            case 1:
                this.f19522b.lambda$play$7(this.f19523c);
                return;
            default:
                this.f19522b.lambda$setVolume$10(this.f19523c);
                return;
        }
    }
}
