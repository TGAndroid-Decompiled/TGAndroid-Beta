package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19793a;
    public final VideoPlayerHolderBase f19794b;
    public final float f19795c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19793a = i10;
        this.f19794b = videoPlayerHolderBase;
        this.f19795c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19793a) {
            case 0:
                this.f19794b.lambda$setSpeed$5(this.f19795c);
                return;
            case 1:
                this.f19794b.lambda$play$7(this.f19795c);
                return;
            default:
                this.f19794b.lambda$setVolume$10(this.f19795c);
                return;
        }
    }
}
