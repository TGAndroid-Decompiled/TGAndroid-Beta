package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f19497a;
    public final VideoPlayerRewinder f19498b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19497a = i10;
        this.f19498b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19497a) {
            case 0:
                VideoPlayerRewinder.b(this.f19498b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19498b);
                return;
        }
    }
}
