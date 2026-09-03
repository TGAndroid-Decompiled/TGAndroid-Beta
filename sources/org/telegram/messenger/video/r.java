package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f18717a;
    public final VideoPlayerRewinder f18718b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18717a = i10;
        this.f18718b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18717a) {
            case 0:
                VideoPlayerRewinder.b(this.f18718b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18718b);
                return;
        }
    }
}
