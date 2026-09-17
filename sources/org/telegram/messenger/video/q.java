package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19340a;
    public final VideoPlayerRewinder f19341b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19340a = i10;
        this.f19341b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19340a) {
            case 0:
                VideoPlayerRewinder.b(this.f19341b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19341b);
                return;
        }
    }
}
