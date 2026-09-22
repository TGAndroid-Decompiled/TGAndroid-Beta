package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17836a;
    public final VideoPlayerRewinder f17837b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17836a = i10;
        this.f17837b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17836a) {
            case 0:
                VideoPlayerRewinder.b(this.f17837b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17837b);
                return;
        }
    }
}
