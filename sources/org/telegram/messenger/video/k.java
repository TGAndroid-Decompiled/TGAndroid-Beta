package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f27375a;
    public final VideoPlayerHolderBase f27376b;
    public final float f27377c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f27375a = i7;
        this.f27376b = videoPlayerHolderBase;
        this.f27377c = f10;
    }

    @Override
    public final void run() {
        switch (this.f27375a) {
            case 0:
                this.f27376b.lambda$setSpeed$5(this.f27377c);
                return;
            case 1:
                this.f27376b.lambda$play$7(this.f27377c);
                return;
            default:
                this.f27376b.lambda$setVolume$10(this.f27377c);
                return;
        }
    }
}
