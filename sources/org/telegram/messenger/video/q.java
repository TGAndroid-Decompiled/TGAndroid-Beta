package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f27044a;
    public final VideoPlayerRewinder f27045b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27044a = i7;
        this.f27045b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27044a) {
            case 0:
                VideoPlayerRewinder.b(this.f27045b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27045b);
                return;
        }
    }
}
