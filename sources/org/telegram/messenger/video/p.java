package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f21592a;
    public final VideoPlayerRewinder f21593b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f21592a = i10;
        this.f21593b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f21592a) {
            case 0:
                VideoPlayerRewinder.b(this.f21593b);
                return;
            default:
                VideoPlayerRewinder.a(this.f21593b);
                return;
        }
    }
}
