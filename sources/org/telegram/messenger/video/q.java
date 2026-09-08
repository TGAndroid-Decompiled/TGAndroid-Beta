package org.telegram.messenger.video;
public final class q implements Runnable {
    public final int f19331a;
    public final VideoPlayerRewinder f19332b;

    public q(VideoPlayerRewinder videoPlayerRewinder, int i10) {
        this.f19331a = i10;
        this.f19332b = videoPlayerRewinder;
    }

    @Override
    public final void run() {
        switch (this.f19331a) {
            case 0:
                VideoPlayerRewinder.b(this.f19332b);
                return;
            default:
                VideoPlayerRewinder.a(this.f19332b);
                return;
        }
    }
}
