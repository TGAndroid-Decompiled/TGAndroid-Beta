package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f27043a;
    public final VideoPlayerRewinder f27044b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27043a = i7;
        this.f27044b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27043a) {
            case 0:
                VideoPlayerRewinder.b(this.f27044b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27044b);
                return;
        }
    }
}
