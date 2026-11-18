package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27421a;
    public final VideoPlayerRewinder f27422b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27421a = i7;
        this.f27422b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27421a) {
            case 0:
                VideoPlayerRewinder.b(this.f27422b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27422b);
                return;
        }
    }
}
