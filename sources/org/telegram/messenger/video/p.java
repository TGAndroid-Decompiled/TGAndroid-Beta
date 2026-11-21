package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27447a;
    public final VideoPlayerRewinder f27448b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27447a = i7;
        this.f27448b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27447a) {
            case 0:
                VideoPlayerRewinder.b(this.f27448b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27448b);
                return;
        }
    }
}
