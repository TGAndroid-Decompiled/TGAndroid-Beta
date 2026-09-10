package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f16664a;
    public final VideoPlayerRewinder f16665b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f16664a = i10;
        this.f16665b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f16664a) {
            case 0:
                VideoPlayerRewinder.b(this.f16665b);
                return;
            default:
                VideoPlayerRewinder.a(this.f16665b);
                return;
        }
    }
}
