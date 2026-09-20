package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f17821a;
    public final VideoPlayerRewinder f17822b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f17821a = i10;
        this.f17822b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f17821a) {
            case 0:
                VideoPlayerRewinder.b(this.f17822b);
                return;
            default:
                VideoPlayerRewinder.a(this.f17822b);
                return;
        }
    }
}
