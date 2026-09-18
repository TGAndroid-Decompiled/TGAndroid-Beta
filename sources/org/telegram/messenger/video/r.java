package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17790a;
    public final VideoPlayerRewinder f17791b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17790a = i10;
        this.f17791b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17790a) {
            case 0:
                VideoPlayerRewinder.b(this.f17791b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17791b);
                return;
        }
    }
}
