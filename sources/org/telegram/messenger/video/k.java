package org.telegram.messenger.video;
public final class k implements Runnable {
    public final int f19808a;
    public final VideoPlayerHolderBase f19809b;
    public final float f19810c;

    public k(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19808a = i10;
        this.f19809b = videoPlayerHolderBase;
        this.f19810c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19808a) {
            case 0:
                this.f19809b.lambda$setSpeed$5(this.f19810c);
                return;
            case 1:
                this.f19809b.lambda$play$7(this.f19810c);
                return;
            default:
                this.f19809b.lambda$setVolume$10(this.f19810c);
                return;
        }
    }
}
