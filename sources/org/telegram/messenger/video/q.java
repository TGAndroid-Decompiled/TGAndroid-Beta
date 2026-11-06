package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f26040a;
    public final VideoPlayerRewinder f26041b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f26040a = i7;
        this.f26041b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f26040a) {
            case 0:
                VideoPlayerRewinder.b(this.f26041b);
                return;
            default:
                VideoPlayerRewinder.a(this.f26041b);
                return;
        }
    }
}
