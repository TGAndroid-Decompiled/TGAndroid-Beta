package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f16649a;
    public final VideoPlayerHolderBase f16650b;
    public final float f16651c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f16649a = i10;
        this.f16650b = videoPlayerHolderBase;
        this.f16651c = f7;
    }

    @Override
    public final void run() {
        switch (this.f16649a) {
            case 0:
                this.f16650b.lambda$setSpeed$5(this.f16651c);
                return;
            case 1:
                this.f16650b.lambda$play$7(this.f16651c);
                return;
            default:
                this.f16650b.lambda$setVolume$10(this.f16651c);
                return;
        }
    }
}
