package org.telegram.messenger.video;
public final class m implements Runnable {
    public final int f20346a;
    public final VideoPlayerHolderBase f20347b;
    public final float f20348c;

    public m(VideoPlayerHolderBase videoPlayerHolderBase, float f10, int i10) {
        this.f20346a = i10;
        this.f20347b = videoPlayerHolderBase;
        this.f20348c = f10;
    }

    @Override
    public final void run() {
        switch (this.f20346a) {
            case 0:
                this.f20347b.lambda$setSpeed$5(this.f20348c);
                return;
            case 1:
                this.f20347b.lambda$play$7(this.f20348c);
                return;
            default:
                this.f20347b.lambda$setVolume$10(this.f20348c);
                return;
        }
    }
}
