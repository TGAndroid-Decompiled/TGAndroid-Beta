package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17866a;
    public final VideoPlayerRewinder f17867b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17866a = i10;
        this.f17867b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17866a) {
            case 0:
                VideoPlayerRewinder.b(this.f17867b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17867b);
                return;
        }
    }
}
