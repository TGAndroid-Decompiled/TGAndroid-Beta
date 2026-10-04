package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f19477a;
    public final VideoPlayerHolderBase f19478b;
    public final float f19479c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f19477a = i10;
        this.f19478b = videoPlayerHolderBase;
        this.f19479c = f7;
    }

    @Override
    public final void run() {
        switch (this.f19477a) {
            case 0:
                this.f19478b.lambda$setSpeed$5(this.f19479c);
                return;
            case 1:
                this.f19478b.lambda$play$7(this.f19479c);
                return;
            default:
                this.f19478b.lambda$setVolume$10(this.f19479c);
                return;
        }
    }
}
