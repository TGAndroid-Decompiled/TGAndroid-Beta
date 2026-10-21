package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19790a;
    public final VideoPlayerHolderBase f19791b;
    public final float f19792c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19790a = i10;
        this.f19791b = videoPlayerHolderBase;
        this.f19792c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19790a) {
            case 0:
                this.f19791b.lambda$setSpeed$5(this.f19792c);
                return;
            case 1:
                this.f19791b.lambda$play$7(this.f19792c);
                return;
            default:
                this.f19791b.lambda$setVolume$10(this.f19792c);
                return;
        }
    }
}
