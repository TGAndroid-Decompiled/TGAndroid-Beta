package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f20360a;
    public final VideoPlayerRewinder f20361b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f20360a = i10;
        this.f20361b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f20360a) {
            case 0:
                VideoPlayerRewinder.b(this.f20361b);
                return;
            default:
                VideoPlayerRewinder.a(this.f20361b);
                return;
        }
    }
}
