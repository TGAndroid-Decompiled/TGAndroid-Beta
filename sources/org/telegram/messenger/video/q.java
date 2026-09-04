package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19304a;
    public final VideoPlayerRewinder f19305b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19304a = i10;
        this.f19305b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19304a) {
            case 0:
                VideoPlayerRewinder.b(this.f19305b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19305b);
                return;
        }
    }
}
