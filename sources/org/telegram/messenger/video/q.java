package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f21898a;
    public final VideoPlayerRewinder f21899b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f21898a = i10;
        this.f21899b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f21898a) {
            case 0:
                VideoPlayerRewinder.b(this.f21899b);
                return;
            default:
                VideoPlayerRewinder.a(this.f21899b);
                return;
        }
    }
}
