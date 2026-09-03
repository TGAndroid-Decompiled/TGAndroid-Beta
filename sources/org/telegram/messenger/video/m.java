package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f18702a;
    public final VideoPlayerHolderBase f18703b;
    public final float f18704c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i10) {
        this.f18702a = i10;
        this.f18703b = videoPlayerHolderBase;
        this.f18704c = f10;
    }

    @Override
    public final void run() {
        switch (this.f18702a) {
            case 0:
                this.f18703b.lambda$setSpeed$5(this.f18704c);
                return;
            case 1:
                this.f18703b.lambda$play$7(this.f18704c);
                return;
            default:
                this.f18703b.lambda$setVolume$10(this.f18704c);
                return;
        }
    }
}
