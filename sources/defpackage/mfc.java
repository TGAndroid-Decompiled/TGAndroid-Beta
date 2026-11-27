package defpackage;

import org.telegram.messenger.video.VideoPlayerHolderBase;
public final class mfc implements Runnable {
    public final byte a;
    public final VideoPlayerHolderBase b;

    public mfc(VideoPlayerHolderBase videoPlayerHolderBase, byte b) {
        this.a = b;
        this.b = videoPlayerHolderBase;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoPlayerHolderBase videoPlayerHolderBase = this.b;
        switch (b) {
            case 0:
                VideoPlayerHolderBase.k(videoPlayerHolderBase);
                return;
            case 1:
                VideoPlayerHolderBase.j(videoPlayerHolderBase);
                return;
            case 2:
                VideoPlayerHolderBase.h(videoPlayerHolderBase);
                return;
            case 3:
                VideoPlayerHolderBase.g(videoPlayerHolderBase);
                return;
            case 4:
                VideoPlayerHolderBase.a(videoPlayerHolderBase);
                return;
            default:
                VideoPlayerHolderBase.f(videoPlayerHolderBase);
                return;
        }
    }
}
