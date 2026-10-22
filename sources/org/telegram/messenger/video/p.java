package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f19830a;
    public final VideoPlayerRewinder f19831b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19830a = i10;
        this.f19831b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19830a) {
            case 0:
                VideoPlayerRewinder.b(this.f19831b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19831b);
                return;
        }
    }
}
