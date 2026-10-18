package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19801a;
    public final VideoPlayerHolderBase f19802b;
    public final float f19803c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19801a = i10;
        this.f19802b = videoPlayerHolderBase;
        this.f19803c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19801a) {
            case 0:
                this.f19802b.lambda$setSpeed$5(this.f19803c);
                return;
            case 1:
                this.f19802b.lambda$play$7(this.f19803c);
                return;
            default:
                this.f19802b.lambda$setVolume$10(this.f19803c);
                return;
        }
    }
}
