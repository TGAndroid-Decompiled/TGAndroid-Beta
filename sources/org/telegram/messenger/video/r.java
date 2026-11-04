package org.telegram.messenger.video;
public final class r implements Runnable {
    public final int f25943a;
    public final VideoPlayerRewinder f25944b;

    public r(VideoPlayerRewinder videoPlayerRewinder, int i3) {
        this.f25943a = i3;
        this.f25944b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f25943a) {
            case 0:
                VideoPlayerRewinder.b(this.f25944b);
                return;
            default:
                VideoPlayerRewinder.a(this.f25944b);
                return;
        }
    }
}
