package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19265a;
    public final VideoPlayerHolderBase f19266b;
    public final float f19267c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19265a = i10;
        this.f19266b = videoPlayerHolderBase;
        this.f19267c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19265a) {
            case 0:
                this.f19266b.lambda$setSpeed$5(this.f19267c);
                return;
            case 1:
                this.f19266b.lambda$play$7(this.f19267c);
                return;
            default:
                this.f19266b.lambda$setVolume$10(this.f19267c);
                return;
        }
    }
}
