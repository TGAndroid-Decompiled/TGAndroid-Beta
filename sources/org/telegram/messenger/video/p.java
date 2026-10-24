package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19893a;
    public final VideoPlayerRewinder f19894b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19893a = i10;
        this.f19894b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19893a) {
            case 0:
                VideoPlayerRewinder.b(this.f19894b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19894b);
                return;
        }
    }
}
