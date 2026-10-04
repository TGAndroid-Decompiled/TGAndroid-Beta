package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19478a;
    public final VideoPlayerHolderBase f19479b;
    public final float f19480c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19478a = i10;
        this.f19479b = videoPlayerHolderBase;
        this.f19480c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19478a) {
            case 0:
                this.f19479b.lambda$setSpeed$5(this.f19480c);
                return;
            case 1:
                this.f19479b.lambda$play$7(this.f19480c);
                return;
            default:
                this.f19479b.lambda$setVolume$10(this.f19480c);
                return;
        }
    }
}
