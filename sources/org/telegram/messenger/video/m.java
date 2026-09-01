package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f20344a;
    public final VideoPlayerHolderBase f20345b;
    public final float f20346c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i10) {
        this.f20344a = i10;
        this.f20345b = videoPlayerHolderBase;
        this.f20346c = f10;
    }

    @Override
    public final void run() {
        switch (this.f20344a) {
            case 0:
                this.f20345b.lambda$setSpeed$5(this.f20346c);
                return;
            case 1:
                this.f20345b.lambda$play$7(this.f20346c);
                return;
            default:
                this.f20345b.lambda$setVolume$10(this.f20346c);
                return;
        }
    }
}
