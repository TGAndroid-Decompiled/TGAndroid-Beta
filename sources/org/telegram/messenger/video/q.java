package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f17604a;
    public final VideoPlayerRewinder f17605b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17604a = i10;
        this.f17605b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17604a) {
            case 0:
                VideoPlayerRewinder.b(this.f17605b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17605b);
                return;
        }
    }
}
