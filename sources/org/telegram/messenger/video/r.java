package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f18735a;
    public final VideoPlayerRewinder f18736b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18735a = i10;
        this.f18736b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18735a) {
            case 0:
                VideoPlayerRewinder.b(this.f18736b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18736b);
                return;
        }
    }
}
