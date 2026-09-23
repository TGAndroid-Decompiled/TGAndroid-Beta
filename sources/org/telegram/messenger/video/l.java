package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17566a;
    public final VideoPlayerHolderBase f17567b;
    public final float f17568c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17566a = i10;
        this.f17567b = videoPlayerHolderBase;
        this.f17568c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17566a) {
            case 0:
                this.f17567b.lambda$setSpeed$5(this.f17568c);
                return;
            case 1:
                this.f17567b.lambda$play$7(this.f17568c);
                return;
            default:
                this.f17567b.lambda$setVolume$10(this.f17568c);
                return;
        }
    }
}
