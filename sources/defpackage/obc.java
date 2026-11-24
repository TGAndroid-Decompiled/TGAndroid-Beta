package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class obc implements Runnable {
    public final byte a;
    public final VideoPlayerHolderBase b;
    public final float c;

    public obc(VideoPlayerHolderBase videoPlayerHolderBase, float f, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
        this.c = f;
    }

    @Override
    public final void run() {
        byte b = this.a;
        float f = this.c;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                videoPlayerHolderBase.lambda$setSpeed$5(f);
                return;
            case 1:
                videoPlayerHolderBase.lambda$play$7(f);
                return;
            default:
                videoPlayerHolderBase.lambda$setVolume$10(f);
                return;
        }
    }
}
