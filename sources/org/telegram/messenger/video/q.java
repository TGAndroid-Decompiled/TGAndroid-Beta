package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19313a;
    public final VideoPlayerRewinder f19314b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19313a = i10;
        this.f19314b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19313a) {
            case 0:
                VideoPlayerRewinder.b(this.f19314b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19314b);
                return;
        }
    }
}
