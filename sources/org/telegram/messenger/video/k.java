package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f18733a;
    public final VideoPlayerHolderBase f18734b;
    public final float f18735c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f18733a = i10;
        this.f18734b = videoPlayerHolderBase;
        this.f18735c = f7;
    }

    @Override
    public final void run() {
        switch (this.f18733a) {
            case 0:
                this.f18734b.lambda$setSpeed$5(this.f18735c);
                return;
            case 1:
                this.f18734b.lambda$play$7(this.f18735c);
                return;
            default:
                this.f18734b.lambda$setVolume$10(this.f18735c);
                return;
        }
    }
}
