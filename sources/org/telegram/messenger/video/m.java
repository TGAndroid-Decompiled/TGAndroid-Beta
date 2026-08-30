package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f18720a;
    public final VideoPlayerHolderBase f18721b;
    public final float f18722c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i10) {
        this.f18720a = i10;
        this.f18721b = videoPlayerHolderBase;
        this.f18722c = f10;
    }

    @Override
    public final void run() {
        switch (this.f18720a) {
            case 0:
                this.f18721b.lambda$setSpeed$5(this.f18722c);
                return;
            case 1:
                this.f18721b.lambda$play$7(this.f18722c);
                return;
            default:
                this.f18721b.lambda$setVolume$10(this.f18722c);
                return;
        }
    }
}
