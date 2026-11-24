package defpackage;

import org.telegram.messenger.video.VideoPlayerRewinder;
public final class rbc implements Runnable {
    public final byte a;
    public final VideoPlayerRewinder b;

    public rbc(VideoPlayerRewinder videoPlayerRewinder, byte b) {
        this.a = b;
        this.b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        byte b = this.a;
        VideoPlayerRewinder videoPlayerRewinder = this.b;
        switch (b) {
            case 0:
                VideoPlayerRewinder.b(videoPlayerRewinder);
                return;
            default:
                VideoPlayerRewinder.a(videoPlayerRewinder);
                return;
        }
    }
}
