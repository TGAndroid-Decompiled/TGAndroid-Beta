package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f19485a;
    public final VideoPlayerHolderBase f19486b;
    public final float f19487c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19485a = i10;
        this.f19486b = videoPlayerHolderBase;
        this.f19487c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19485a) {
            case 0:
                this.f19486b.lambda$setSpeed$5(this.f19487c);
                return;
            case 1:
                this.f19486b.lambda$play$7(this.f19487c);
                return;
            default:
                this.f19486b.lambda$setVolume$10(this.f19487c);
                return;
        }
    }
}
