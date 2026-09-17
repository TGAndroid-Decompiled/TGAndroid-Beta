package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f17613a;
    public final VideoPlayerRewinder f17614b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17613a = i10;
        this.f17614b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17613a) {
            case 0:
                VideoPlayerRewinder.b(this.f17614b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17614b);
                return;
        }
    }
}
