package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f27515a;
    public final VideoPlayerRewinder f27516b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i7) {
        this.f27515a = i7;
        this.f27516b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f27515a) {
            case 0:
                VideoPlayerRewinder.b(this.f27516b);
                return;
            default:
                VideoPlayerRewinder.a(this.f27516b);
                return;
        }
    }
}
