package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f17601a;
    public final VideoPlayerRewinder f17602b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17601a = i10;
        this.f17602b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17601a) {
            case 0:
                VideoPlayerRewinder.b(this.f17602b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17602b);
                return;
        }
    }
}
