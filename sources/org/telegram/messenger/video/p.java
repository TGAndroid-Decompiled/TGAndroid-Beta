package org.telegram.messenger.video;
public final class p implements Runnable {
    public final int f18748a;
    public final VideoPlayerRewinder f18749b;

    public p(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18748a = i10;
        this.f18749b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18748a) {
            case 0:
                VideoPlayerRewinder.b(this.f18749b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18749b);
                return;
        }
    }
}
