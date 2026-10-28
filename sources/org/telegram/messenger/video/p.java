package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f21578a;
    public final VideoPlayerRewinder f21579b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f21578a = i10;
        this.f21579b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f21578a) {
            case 0:
                VideoPlayerRewinder.b(this.f21579b);
                return;
            default:
                VideoPlayerRewinder.a(this.f21579b);
                return;
        }
    }
}
