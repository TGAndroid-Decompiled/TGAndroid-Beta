package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f18446a;
    public final VideoPlayerRewinder f18447b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f18446a = i10;
        this.f18447b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f18446a) {
            case 0:
                VideoPlayerRewinder.b(this.f18447b);
                return;
            default:
                VideoPlayerRewinder.a(this.f18447b);
                return;
        }
    }
}
