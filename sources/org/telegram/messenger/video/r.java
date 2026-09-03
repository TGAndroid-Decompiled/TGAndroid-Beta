package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f20362a;
    public final VideoPlayerRewinder f20363b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f20362a = i10;
        this.f20363b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f20362a) {
            case 0:
                VideoPlayerRewinder.b(this.f20363b);
                return;
            default:
                VideoPlayerRewinder.a(this.f20363b);
                return;
        }
    }
}
