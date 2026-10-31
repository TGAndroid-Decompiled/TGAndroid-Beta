package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f18589a;
    public final VideoPlayerRewinder f18590b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18589a = i10;
        this.f18590b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18589a) {
            case 0:
                VideoPlayerRewinder.b(this.f18590b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18590b);
                return;
        }
    }
}
