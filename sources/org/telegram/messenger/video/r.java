package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17849a;
    public final VideoPlayerRewinder f17850b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17849a = i10;
        this.f17850b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17849a) {
            case 0:
                VideoPlayerRewinder.b(this.f17850b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17850b);
                return;
        }
    }
}
