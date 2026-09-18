package org.telegram.messenger.video;
public final class l implements Runnable {
    public final int f17772a;
    public final VideoPlayerHolderBase f17773b;
    public final float f17774c;

    public l(VideoPlayerHolderBase videoPlayerHolderBase, float f7, int i10) {
        this.f17772a = i10;
        this.f17773b = videoPlayerHolderBase;
        this.f17774c = f7;
    }

    @Override
    public final void run() {
        switch (this.f17772a) {
            case 0:
                this.f17773b.lambda$setSpeed$5(this.f17774c);
                return;
            case 1:
                this.f17773b.lambda$play$7(this.f17774c);
                return;
            default:
                this.f17773b.lambda$setVolume$10(this.f17774c);
                return;
        }
    }
}
