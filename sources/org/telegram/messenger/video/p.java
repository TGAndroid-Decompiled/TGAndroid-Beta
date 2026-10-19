package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19813a;
    public final VideoPlayerRewinder f19814b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19813a = i10;
        this.f19814b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19813a) {
            case 0:
                VideoPlayerRewinder.b(this.f19814b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19814b);
                return;
        }
    }
}
