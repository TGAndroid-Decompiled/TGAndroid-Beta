package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f26020a;
    public final VideoPlayerHolderBase f26021b;
    public final float f26022c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i7) {
        this.f26020a = i7;
        this.f26021b = videoPlayerHolderBase;
        this.f26022c = f10;
    }

    @Override
    public final void run() {
        switch (this.f26020a) {
            case 0:
                this.f26021b.lambda$setSpeed$5(this.f26022c);
                return;
            case 1:
                this.f26021b.lambda$play$7(this.f26022c);
                return;
            default:
                this.f26021b.lambda$setVolume$10(this.f26022c);
                return;
        }
    }
}
