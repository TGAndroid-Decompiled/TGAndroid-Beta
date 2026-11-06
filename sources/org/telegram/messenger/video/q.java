package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f26032a;
    public final VideoPlayerRewinder f26033b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f26032a = i7;
        this.f26033b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f26032a) {
            case 0:
                VideoPlayerRewinder.b(this.f26033b);
                return;
            default:
                VideoPlayerRewinder.a(this.f26033b);
                return;
        }
    }
}
