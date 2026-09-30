package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17850a;
    public final VideoPlayerRewinder f17851b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17850a = i10;
        this.f17851b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17850a) {
            case 0:
                VideoPlayerRewinder.b(this.f17851b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17851b);
                return;
        }
    }
}
