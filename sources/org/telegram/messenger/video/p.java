package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27391a;
    public final VideoPlayerRewinder f27392b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27391a = i7;
        this.f27392b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27391a) {
            case 0:
                VideoPlayerRewinder.b(this.f27392b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27392b);
                return;
        }
    }
}
