package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19496a;
    public final VideoPlayerRewinder f19497b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19496a = i10;
        this.f19497b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19496a) {
            case 0:
                VideoPlayerRewinder.b(this.f19497b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19497b);
                return;
        }
    }
}
