package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f17581a;
    public final VideoPlayerRewinder f17582b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17581a = i10;
        this.f17582b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17581a) {
            case 0:
                VideoPlayerRewinder.b(this.f17582b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17582b);
                return;
        }
    }
}
