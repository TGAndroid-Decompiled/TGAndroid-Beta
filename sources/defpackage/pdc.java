package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class pdc implements Runnable {
    public final byte a;
    public final VideoPlayerHolderBase b;

    public pdc(VideoPlayerHolderBase videoPlayerHolderBase, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                VideoPlayerHolderBase.i(videoPlayerHolderBase);
                return;
            case 1:
                VideoPlayerHolderBase.n(videoPlayerHolderBase);
                return;
            case 2:
                VideoPlayerHolderBase.f(videoPlayerHolderBase);
                return;
            case 3:
                VideoPlayerHolderBase.a(videoPlayerHolderBase);
                return;
            case 4:
                VideoPlayerHolderBase.c(videoPlayerHolderBase);
                return;
            default:
                VideoPlayerHolderBase.o(videoPlayerHolderBase);
                return;
        }
    }
}
